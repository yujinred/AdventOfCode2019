package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Long.parseLong;

/**
 * PACKAGE_NAME is used for --
 * © 2019 NetSuite Inc.
 *
 * @author ezhang
 * @since 02-Dec-2019
 */
public class Puzzle1 {
    private static void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("resources/Day1/Puzzle1Input.txt"));
            String line = reader.readLine();

            long totalFuelReq = 0;

            while (line != null) {
                long number = convertStringToLong(line);
                long moduleFuelReq = Math.floorDiv(number, 3) - 2;
                totalFuelReq += moduleFuelReq;
                line = reader.readLine();
            }

            System.out.println(totalFuelReq);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long convertStringToLong(String number) {
        return parseLong(number);
    }

    public static void main(String[] args) {
        run();
    }
}
