import java.util.Scanner;
public class GradeAveraging {

    public static void main(String[] args) {

        int counter = 1;
        int grade;
        double total = 0;
        double avarage;


        Scanner input = new Scanner(System.in);

        while(counter <= 5) {
            System.out.println("Please enter your " +counter+ " numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        }

       counter -=1;
        String message;
        char letterGrade;

        avarage = total /counter;
        System.out.println("You have earned an average grade of " +avarage+ " after providing us with " +counter+ " grades");

        if(avarage >= 90 && avarage <=100) {
            letterGrade = 'A';
            message = "Excellent work";

        } else if (avarage >= 80 && avarage < 90) {
            letterGrade = 'B';
            message = "Solid work!";

        } else if (avarage >= 70 && avarage < 80) {
            letterGrade = 'C';
            message = "More Studying necessary!";

        } else if (avarage >= 65 && avarage < 70) {
            letterGrade = 'D';
            message = "Squeaking by!";
            
        } else {


            letterGrade = 'F';
            message = "Not a passing grade";

        }
        System.out.println("You have earned the following letter grade " +letterGrade+ ", and here is the message; " +message);


        }
    }

