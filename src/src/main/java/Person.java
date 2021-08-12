import java.util.List;

public class Person {

    // The name of the person.
    private String name;

    // Days of the week the person cannot perform duty.
    private List<String> days;

    // Specific dates the person cannot perform duties.
    private List<String> dates;

    // Constructor to create a Person.
    public Person (String name, List<String> days, List<String> dates) {
        this.name = name;
        this.days = days;
        this.dates = dates;
    }

    // Returns the name of the person.
    public String getName() {
        return name;
    }

    // Checks a day to see if the person can perform duty on that day.
    public boolean checkDay(String day) {
        for (String currDay : days) {
            if (currDay.equalsIgnoreCase(day)) {
                return false;
            }
        }
        return true;
    }

    // Checks a specific date to see if the person can perform duty on that date.
    public boolean checkDate(String date) {
        for (String currDate : dates) {
            if (currDate.equalsIgnoreCase(date)) {
                return false;
            }
        }
        return true;
    }
}
