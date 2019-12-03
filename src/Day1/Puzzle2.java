package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Day1 is used for --
 * © 2019 NetSuite Inc.
 *
 * @author ezhang
 * @since 02-Dec-2019
 */
public class Puzzle2 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("resources/Day1/Puzzle1Input.txt"));
            String line = reader.readLine();

            long totalFuelReq = 0;

            while (line != null) {
                long number = Long.parseLong(line);
                long moduleFuelReq = getModuleFuelReq(number);
                totalFuelReq += moduleFuelReq;
                line = reader.readLine();
            }

            System.out.println(totalFuelReq);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long getModuleFuelReq(long mass) {
        long fuelReq = Math.floorDiv(mass, 3) - 2;
        if (fuelReq <= 0) return 0L;

        return fuelReq + getModuleFuelReq(fuelReq);
    }
}
