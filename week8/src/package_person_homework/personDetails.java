package package_person_homework;

public class personDetails {

    public static void main(String[] args) {

        package_person_homework.person firstPerson;
        person secondPerson;
        //creating an object from my person class

        firstPerson = new person();
        secondPerson = new person();

        // we will be entering the info, assigning the values to our fields

        firstPerson.name= "Cathy Jones";
        firstPerson.age = 35;
        firstPerson.car = 2012;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendal Black";
        secondPerson.age = 20;
        secondPerson.car = 2022;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double adjustedRate = 0;

//        System.out.println(firstPerson.name);
//        System.out.println(firstPerson.gender);
//        System.out.println(firstPerson.age);
//        System.out.println(firstPerson.car);
//        System.out.println(firstPerson.violations);
//        System.out.println(firstPerson.creditScore);
//        System.out.println();
//
//        System.out.println(secondPerson.name);
//        System.out.println(secondPerson.gender);
//        System.out.println(secondPerson.age);
//        System.out.println(secondPerson.car);
//        System.out.println(secondPerson.violations);
//        System.out.println(secondPerson.creditScore);

       firstPerson.display();
        System.out.println(firstPerson.vehicleYear(adjustedRate) + " Dollars");

        System.out.println();

       secondPerson.display();
        System.out.println(secondPerson.vehicleYear(adjustedRate) + " Dollars");

    }
}

