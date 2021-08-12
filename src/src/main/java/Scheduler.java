import java.io.*;
import java.util.Scanner;

public class Scheduler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type an input file name then hit enter:");
        String inputFileName = input.nextLine();

        System.out.println("Please type an output file name then hit enter or just hit enter for default name of output.txt:");
        String temp = input.nextLine();
        String outputFileName = temp.length() > 0 ? temp : "output.txt";

        System.out.println("Please type an start date for scheduling in the form MM/DD/YYYY");
        String startDate = input.nextLine();

        System.out.println("Please type an end date for scheduling in the form MM/DD/YYYY");
        String endDate = input.nextLine();

        /*
        BufferedReader input;
        try {
            input = new BufferedReader(new FileReader(inputFileName));

            String line;
            while ((line = input.readLine()) != null) {
                String[] params = line.replaceAll("\\s", "").split("|");

                for (String p : params) {
                    System.out.println(p);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Input file was not found.");
            return;
        }
        */

    }
}
