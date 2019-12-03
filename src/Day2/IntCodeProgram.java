package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Day2 is used for --
 * © 2019 NetSuite Inc.
 *
 * @author ezhang
 * @since 02-Dec-2019
 */
public class IntCodeProgram {


    public static void processData(List<Integer> computerData) {
        int counter = 0;
        int opCode = computerData.get(counter);
        while (opCode != OpCode.END.value) {
            counter++;
            int pos1 = computerData.get(counter);
            counter++;
            int pos2 = computerData.get(counter);
            counter++;
            int pos3 = computerData.get(counter);
            if (opCode == OpCode.ADD.value) {
                computerData.set(pos3, computerData.get(pos1) + computerData.get(pos2));
            } else if (opCode == OpCode.MULTIPLE.value) {
                computerData.set(pos3, computerData.get(pos1) * computerData.get(pos2));
            } else {
                throw new RuntimeException("Invalid OpCode");
            }
            counter++;
            opCode = computerData.get(counter);
        }
    }

    public static List<Integer> retrieveComputerData() {
        List<Integer> computerData = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("resources/Day2/Puzzle2Input.txt")));
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                computerData.add(Integer.parseInt(scanner.next()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return computerData;
    }

    public static void dumpComputerData(List<Integer> data) {
        for (int token : data) {
            System.out.print(token + " ");
        }
    }

    public static void printOutPut(List<Integer> data) {
        System.out.println(data.get(0));
    }
}
