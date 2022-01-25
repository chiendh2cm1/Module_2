package com.codegym;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            result.addAll(Arrays.asList(splitData));
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code = " + country.get(1)
                        + " , name =" + country.get(2)
                        + "]");
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line = "";
            br = new BufferedReader(new FileReader("src/com/codegym/country.csv"));
            while ((line = br.readLine()) != null){
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br !=null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
