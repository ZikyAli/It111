import java.util.Scanner;

public class MyConstants {

    public static void main(String[] args) {

        final int TOUCHDOWN = 6;
        final int CONVERSION = 3;
        final int FIELDGOAL = 1;

        int td, con, fg;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of touchdown!");
        td = input.nextInt() * TOUCHDOWN;
        System.out.println("Please enter the number of CONVERSION!");
        con = input.nextInt() * CONVERSION;
        System.out.println("Please enter the number of FIELD GOAL!");
        fg = input.nextInt() * FIELDGOAL;
        System.out.println();

        System.out.println(td);
        System.out.println(con);
        System.out.println(fg);
        System.out.println();

        System.out.print("Our total score is ");
        System.out.println(td + con + fg);


    }
}
