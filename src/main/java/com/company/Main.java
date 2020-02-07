package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String csvFile = "src/main/resources/SEOExample.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] info = line.split(cvsSplitBy);

//Name,Date,EntryPoint,Region,Location,Accepted,Enrolled,SearchTerms,Engine,Reason
                System.out.println("Name: " + info[0]);
                System.out.println("Date: " + info[1]);
                System.out.println("EntryPoint: " + info[2]);
                System.out.println("Region: " + info[3]);
                System.out.println("Location: " + info[4]);
                System.out.println("Accepted: " + info[5]);
                System.out.println("Enrolled: " + info[6]);
                System.out.println("SearchTerms: " + info[7]);
                System.out.println("Engine: " + info[8]);
                System.out.println("Reason: " + info[9]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}