package package_person_homework;

public class person {

        // This file lacks a main method
        //We will start typing fields (variables)

        String name;
        int age;
        int car;
        boolean violations;
        double creditScore;

        public void display() {
            System.out.println("Your name: " +name);
            System.out.println("Your age: " +age);
            System.out.println("Your car: " +car);
            System.out.println("Your violations: " +violations);
            System.out.println("Your Credit Score: " +creditScore);

        }
        //our logic is regarding violations and credit score

        public double getRate(double monthlyRate) {
            if (violations == true && creditScore <= 700) {
                monthlyRate = 500.00;

            } else {
                monthlyRate = 100.00;

            }
            return monthlyRate;
        }

        public double vehicleYear(double adjustedRate) {
            if (car >= 2015) {
                adjustedRate = 600.00;

            } else {
                adjustedRate = 150.00;

            }
            return adjustedRate;
        }
    }

