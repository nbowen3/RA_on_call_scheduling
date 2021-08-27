import java.io.*;
import java.util.*;

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


        BufferedReader inputBuffer;
        try {
            inputBuffer = new BufferedReader(new FileReader(inputFileName));

            List<Person> people = new ArrayList<>();

            String line;
            while ((line = inputBuffer.readLine()) != null) {
                String[] params = line.replaceAll("\\s", "").split("\\|");

                people.add(getPerson(params));
            }

            for (Person p : people) {
                System.out.println(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Input file was not found.");
            return;
        }
    }

    // Class to get a person given an array of params in the form
    // element 0 is name, element 1 is days, element 2 is dates
    private static Person getPerson(String[] params) {
        String name = params[0];

        Set<String> days = new HashSet<>();
        String[] tempDays = params[1].split(",");
        Collections.addAll(days, tempDays);

        Set<String> dates = new HashSet<>();
        String[] tempDates = params[2].split(",");
        Collections.addAll(dates, tempDates);

        return new Person(name, days, dates);
    }
}
