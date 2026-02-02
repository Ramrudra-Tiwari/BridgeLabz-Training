package com.json.IPLcensoranalyzer;

import java.io.*;
import java.io.File;
import java.util.Iterator;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

public class JsonProcessor {

    public static void processJson(String input, String output) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode matches = (ArrayNode) mapper.readTree(new File(input));

        for (JsonNode match : matches) {
            ObjectNode obj = (ObjectNode) match;

            // Mask teams
            String team1 = obj.get("team1").asText();
            String team2 = obj.get("team2").asText();

            obj.put("team1", CensorUtil.maskTeamName(team1));
            obj.put("team2", CensorUtil.maskTeamName(team2));
            obj.put("winner", CensorUtil.maskTeamName(obj.get("winner").asText()));

            // player
            obj.put("player_of_match", CensorUtil.redactPlayer());

            // Mask score keys
            ObjectNode score = (ObjectNode) obj.get("score");
            ObjectNode newScore = mapper.createObjectNode();

            Iterator<String> fields = score.fieldNames();
            while (fields.hasNext()) {
                String key = fields.next();
                newScore.put(
                    CensorUtil.maskTeamName(key),
                    score.get(key).asInt()
                );
            }

            obj.set("score", newScore);
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(output), matches);
    }
}