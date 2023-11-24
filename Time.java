import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Input dates and times
        String inputDateTime1 = "2023-01-01 12:00:00";
        String inputDateTime2 = "2023-01-02 14:30:00";

        LocalDateTime dateTime1 = LocalDateTime.parse(inputDateTime1, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(inputDateTime2, formatter);

        System.out.println("List of times between " + dateTime1 + " and " + dateTime2 + ":");
        listTimes(dateTime1, dateTime2);
    }

    public static void listTimes(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        LocalDateTime currentDateTime = startDateTime;

        while (currentDateTime.isBefore(endDateTime) || currentDateTime.isEqual(endDateTime)) {
            System.out.println("Minutes: " + currentDateTime.getMinute());
            System.out.println("Hours: " + currentDateTime.getHour());
            System.out.println("Days: " + currentDateTime.getDayOfMonth());
            System.out.println("Months: " + currentDateTime.getMonth());
            System.out.println("Years: " + currentDateTime.getYear());
            System.out.println("-----------------------");

            // Move to the next minute
            currentDateTime = currentDateTime.plusMinutes(1);
        }
    }
}