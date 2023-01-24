package org.example;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    @Test
    public void day1() {

        int counterContains = 0;
        int counterTotaal = 0;

        try {
            InputStream inputStream = new FileInputStream("src/main/resources/input.txt");
            Scanner sc = new Scanner(inputStream);

            while (sc.hasNext()) {
                counterTotaal++;

                String[] arrSplit = sc.nextLine().split(",");
                String[] arrSplit2 = arrSplit[0].split("-");
                String[] arrSplit3 = arrSplit[1].split(("-"));

                int array1getal1 = Integer.parseInt(arrSplit2[0]);
                int array2getal1 = Integer.parseInt(arrSplit3[0]);
                int array1getal2 = Integer.parseInt(arrSplit2[1]);
                int array2getal2 = Integer.parseInt(arrSplit3[1]);

                if (array1getal1 >= array2getal1 &&
                        array1getal2 <= array2getal2) {
                    counterContains++;
                } else if (array2getal1 >= array1getal1 &&
                        array2getal2 <= array1getal2) {
                    counterContains++;
                }
            }
            System.out.println(counterContains);
            System.out.println(counterTotaal);

        } catch (FileNotFoundException e) {

            LOGGER.warn("Kan bestand niet vinden in pad: " + e.getMessage());
        }
    }

    @Test
    public void day2() {

        int counterOverlap = 0;
        int counterTotaal = 0;

        try {
            InputStream inputStream = new FileInputStream("src/main/resources/input.txt");
            Scanner sc = new Scanner(inputStream);

            while (sc.hasNext()) {
                counterTotaal++;

                String[] arrSplit = sc.nextLine().split(",");
                String[] arrSplit2 = arrSplit[0].split("-");
                String[] arrSplit3 = arrSplit[1].split(("-"));

                int array1getal1 = Integer.parseInt(arrSplit2[0]);
                int array2getal1 = Integer.parseInt(arrSplit3[0]);
                int array1getal2 = Integer.parseInt(arrSplit2[1]);
                int array2getal2 = Integer.parseInt(arrSplit3[1]);

                if (((array1getal1 >= array2getal1 &&
                        array1getal1 <= array2getal2) ||
                        (array1getal2 >= array2getal1 &&
                                array1getal2 <= array2getal2))
                        ||
                        ((array2getal1 >= array1getal1 &&
                                array2getal1 <= array1getal2) ||
                                (array2getal2 >= array1getal1 &&
                                        array2getal2 <= array1getal2))) {
                    counterOverlap++;
                }
            }
            System.out.println(counterTotaal);
            System.out.println(counterOverlap);

        } catch (FileNotFoundException e) {

            LOGGER.warn("Kan bestand niet vinden in pad: " + e.getMessage());
        }
    }
}
