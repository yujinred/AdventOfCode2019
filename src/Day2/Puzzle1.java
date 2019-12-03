package Day2;

import java.util.Arrays;
import java.util.List;

import static Day2.IntCodeProgram.*;

/**
 * Day2 is used for --
 * © 2019 NetSuite Inc.
 *
 * @author ezhang
 * @since 02-Dec-2019
 */
public class Puzzle1 {
    public static void main(String[] args) {
        run();

    }

    public static void test() {
        List<Integer> data = Arrays.asList(1,1,1,4,99,5,6,0,99);
        processData(data);
        dumpComputerData(data);
    }

    private static void run() {
        List<Integer> computerData = retrieveComputerData();
        computerData.set(1, 12);
        computerData.set(2, 2);
        processData(computerData);
        printOutPut(computerData);
    }

}

