package package_person_input;

import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args) {

       //creating our object - customer

        Person customer;
        customer = new Person();
        // need to enter additional variables

        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        customer.name = input.next();

        System.out.println("Please enter your age");
        customer.age = input.nextInt();

        System.out.println("Please enter your gender by entering F or M or N");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your zipcode (Only 5 numbers please)");
        customer.zipCode = input.next();

        System.out.println("Any traffic violations? Please enter true for yes, and false for no");
        customer.violations = input.nextBoolean();
        // add an if else statement
        if (customer.violations == true) {
            System.out.println("Please type true if you had a DUI, or false if not");
            customer.violationDui = input.nextBoolean();
            System.out.println("Please type true if you had a red light violation of false if not");
            customer.violationRedLight = input.nextBoolean();
            System.out.println("Have you received any speeding tickets? Please type true for yes, or false for no tickets");
            customer.violationSpeeding = input.nextBoolean();
        }

        System.out.println("Please type in your credit score");
        customer.creditScore = input.nextDouble();

        }
    }