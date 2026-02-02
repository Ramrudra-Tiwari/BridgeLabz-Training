package com.json.IPLcensoranalyzer;

import java.io.*;

public class CsvProcessor {

    public static void processCsv(String input, String output) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        String header = reader.readLine();
        writer.write(header);
        writer.newLine();

        String line;
        while ((line = reader.readLine()) != null) {

            if (line.trim().isEmpty()) continue;   // skip empty lines

            String[] data = line.split(",");

            // safety check
            if (data.length < 7) {
                continue; // or log error
            }

            data[1] = CensorUtil.maskTeamName(data[1]); // team1
            data[2] = CensorUtil.maskTeamName(data[2]); // team2
            data[5] = CensorUtil.maskTeamName(data[5]); // winner
            data[6] = CensorUtil.redactPlayer();        // player

            writer.write(String.join(",", data));
            writer.newLine();
        }


        reader.close();
        writer.close();
    }
}