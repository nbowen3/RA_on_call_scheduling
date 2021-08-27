import java.util.Set;

public class Person {

    // The name of the person.
    private String name;

    // Days of the week the person cannot perform duty.
    private Set<String> days;

    // Specific dates the person cannot perform duties.
    private Set<String> dates;

    // Constructor to create a Person.
    public Person (String name, Set<String> days, Set<String> dates) {
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
        return !days.contains(day);
    }

    // Checks a specific date to see if the person can perform duty on that date.
    public boolean checkDate(String date) {
        return !dates.contains(date);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", dates=" + dates +
                '}';
    }
}
