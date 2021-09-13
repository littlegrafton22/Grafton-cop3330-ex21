/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;
public class Assignment_1_Exercise_21 {
    public String getMonth(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "error";
        };

    }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            Assignment_1_Exercise_21 ntn = new Assignment_1_Exercise_21();
            System.out.print("Please enter the number of month: ");
            int month = sc.nextInt();
            String result = ntn.getMonth(month);
            if(month>0 && month<12)
                System.out.print("The name of month is "+result);
            else
                System.out.print(result+" :please enter correct month number");

        }
    }

