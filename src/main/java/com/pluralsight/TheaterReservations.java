package com.pluralsight;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Welcome to Theater Reservations! Please enter your name: ");
        String name = myScanner.nextLine();
        System.out.print("Please enter your booking date, (MM/dd/yyyy): ");
        String bookingDate = myScanner.nextLine();
        System.out.print("How many ticket(s) would you like?: ");
        int tickets = myScanner.nextInt();

        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

        ;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(bookingDate, formatter);
        System.out.println(tickets +" tickets reserved for " + date + " under " + lastName + ", " + firstName);
        myScanner.close();
    }
}

