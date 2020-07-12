package com.test.transactions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Print the price column values from Sacramentorealestatetransactions file
 */
public class b {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("/home/yasodhara/Downloads/Sacramentorealestatetransactions.csv");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        while((line = reader.readLine()) != null) {
            String[] transactionData = line.split(",");
            String priceList= transactionData[9];

            String[] transactionIds = priceList.split("/n");

            for (String price : transactionIds) {
                System.out.println(price);
            }

        }
    }
}
