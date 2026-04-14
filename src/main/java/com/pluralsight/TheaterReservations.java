package com.pluralsight;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Theater Reservations! Please enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Please enter your DOB, (MM/dd/yyyy): ");
        String dateOfBirth = myScanner.nextLine();
        System.out.println("How many ticket(s) would you like?: ");
        int tickets = myScanner.nextInt();

        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

        System.out.println(lastName + ", " + firstName);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateOfBirth, formatter);
        System.out.println(date);

    }
}
