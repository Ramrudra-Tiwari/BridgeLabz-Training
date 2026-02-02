package com.json.IPLcensoranalyzer;

public class IPLCensorApp {

    public static void main(String[] args) throws Exception {

        // JSON
        JsonProcessor.processJson(
            "DataFiles/ipl_matches.json",
            "DataFiles/censored_matches.json"
        );

        // CSV
        CsvProcessor.processCsv(
            "DataFiles/ipl_matches.csv",
            "DataFiles/censored_matches.csv"
        );

        System.out.println("IPL Data Censored Successfully!");
    }
}