package Day2;

import java.util.ArrayList;
import java.util.List;

/**
 * Day2 is used for --
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
        List<Integer> defaultData = IntCodeProgram.retrieveComputerData();
        List<Integer> trialData = new ArrayList<>(defaultData);
        for (int i = 0; i < 99; i++) {
            for (int j = 0; j < 99; j++) {
                trialData.set(1, i);
                trialData.set(2, j);
                try {
                    IntCodeProgram.processData(trialData);
                } catch (RuntimeException ignored) {

                }
                if (trialData.get(0) == 19690720) {
                    System.out.println("verb = " + j);
                    break;
                }
                trialData = new ArrayList<>(defaultData);
            }
            if (trialData.get(0) == 19690720) {
                System.out.println("noun = " + i);
                break;
            }
        }

    }
}
