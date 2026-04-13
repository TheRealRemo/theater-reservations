package com.pluralsight;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Theater Reservations! Please enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Please enter your DOB, (MM/DD/YYYY): ");
        String dateOfBirth = myScanner.nextLine();
        System.out.println("How many ticket(s) would you like?: ");
        int tickets = myScanner.nextInt();


    }
}
