package org.example;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

//        Prompt the user to input a number of their choice
        System.out.println("Using digits, can you guess what number I am thinking of? ");

//               Collect user input
        Scanner reader = new Scanner(System.in); // this creates a scanner object
        Integer secretnumber = Integer.valueOf(reader.nextLine()); // this reads the user input

//        if number = 7, print "Well done!"
//        if number > 7, print "That's too low, try again!"
//        otherwise print "That's too high, try again!"

        if (secretnumber == 7){

            System.out.println("Well done!");

        } else if (secretnumber < 7){

            System.out.println("That's too low, try again!");

        }

        else {

            System.out.println("That's too high, try again!");

        }

        }
    }

