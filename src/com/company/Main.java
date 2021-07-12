package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //Asking user for first parameter
        System.out.println("How many feet?");
        Double feet = scanner.nextDouble();
        scanner.nextLine();

        //Asking user for second parameter
        System.out.println("How many inches?");
        Double inches = scanner.nextDouble();
        scanner.nextLine();

        //Calling the method
        calcFeetAndInchesToCentimeters(feet, inches);

        //Example of method overloading
        System.out.println("Bonus: Here is an example of method overloading if you look at the code");
        calcFeetAndInchesToCentimeters(100);
    }

    //Method used to convert feet/inches to centimeters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet <0) || ((inches <0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    //overloading the method #methodception
    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches < 0){
            return-1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}