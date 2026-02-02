package com.json.IPLcensoranalyzer;

public class CensorUtil {

    // Mask team name: keep first word
    public static String maskTeamName(String team) {
        if (team == null || !team.contains(" "))
            return "***";
        return team.split(" ")[0] + " ***";
    }

    // Redact player name
    public static String redactPlayer() {
        return "REDACTED";
    }
}