package package_person;

public class person {
    // This file lacks a main method
    //We will start typing fields (variables)

    String name;
    char gender;
    int age;
    String car;
    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Customer name: " +name);
        System.out.println("Gender: " +gender);
        System.out.println("Age: " +age);
        System.out.println( "Car: " +car);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);

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

    public double assumeGender(double adjustedRate) {
     if (gender == 'M' && age <= 25) {
         adjustedRate = 100.00;

     } else {
         adjustedRate = 0;

     }
     return adjustedRate;
    }
}
