package package_person_input;

import java.util.SplittableRandom;

public class Person {
    //no main method
    //creating our fields

    String name;
    char  gender;
    int age;
    double baselineRate;

    String zipCode;
    int cityCode;

    boolean violations;

    boolean violationDui;
    boolean violationRedLight;
    boolean violationSpeeding;

    double creditScore;

    //creating a method so that we print everything out.

    public void display() {
        System.out.println("This is the Information that you have provided");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println("Baseline rate: " +baselineRate);
        System.out.println("Don't forget that your total rate may change due to violations, age and credit score");
        System.out.println("violations: " +violations);
        System.out.println("DUI violations: " +violationDui);
        System.out.println("Red Light violations: " +violationRedLight);
        System.out.println("Speeding violations: " +violationSpeeding);
        System.out.println("Credit Score: " +creditScore);

    }
       //create a method - violations and credit score
       // violations or credit score

    public double getRate(double monthlyRate) {
        if (violations == true || creditScore <=700) {
            monthlyRate = 300.00;

        }else {
            monthlyRate = 0;
        }
        return monthlyRate;
    }
    // new method for age
    //if young or older, you pay more

    public double ageCategory(double adjustedRate) {
        if (age <= 25 || age >= 65) {
            adjustedRate = 300.00;

        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    //

    public int identifyRegion(int states) {
        String zip2;
        zip2 = zipCode.substring(0, 2);
        cityCode = Integer.parseInt(zip2);

        if (cityCode >= 90 && cityCode <97) {
            System.out.println("You entered" + zipCode+ " and you are from California");

        } else if (cityCode >= 97 && cityCode <98) {
            System.out.println("You entered" + zipCode+ " and you are from Oregon");
        } else if (cityCode >= 98 && cityCode <=99) {
            System.out.println("You entered" + zipCode+ " and you are from Washington");
        } else {
            System.out.println("You are not from PNW, please contact our national office");
        }
        return states;
    }

    // method to charge a surcharge to people who live in california, coz there are so many cars, population.

    public double californiaRegion(double surchage) {
        if(cityCode >= 90 && cityCode <97) {
            surchage = 200;

        } else {
            surchage = 0;

        }
        return surchage;
    }
}
