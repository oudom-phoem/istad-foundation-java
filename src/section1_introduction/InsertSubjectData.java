package section1_introduction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InsertSubjectData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Subject name: ");
        String subjectName = scanner.nextLine();

        System.out.print("Subject time: ");
        int subjectTime = scanner.nextInt();

        System.out.print("Subject level (A, B, C, D): ");
        char subjectLevel = scanner.next().charAt(0);

        scanner.nextLine(); // Clear the buffer

        System.out.print("Subject teacher's name: ");
        String subjectTeacherName = scanner.nextLine();

        // Get the current date
        LocalDate dateStartSubject = LocalDate.now();

        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = dateStartSubject.format(formatter);

        // Print the table with formatted date
        System.out.printf("\n| %-15s | %-10s | %-10s | %-10s | %-10s |%n", "Name", "Time", "Level", "Teacher", "Date");
        System.out.printf("| %-15s | %-10d | %-10c | %-10s | %-10s |%n", subjectName, subjectTime, subjectLevel, subjectTeacherName, formattedDate);

        scanner.close();
    }
}

