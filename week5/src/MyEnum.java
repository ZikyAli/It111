import java.util.Scanner;

public class MyEnum {

  enum WhoWins {Home, Visitor,Neither}


    public static void main(String[]args ) {

      WhoWins who;

      int seahawks, brancos;

      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the final score for the seahawks");
      seahawks = input.nextInt();

      System.out.println("Please enter the final score for the brancos");
      brancos = input.nextInt();

      if (seahawks > brancos) {
        who = WhoWins.Home;
        System.out.println(who + " team won!");
        System.out.print("Seahawks win by ");
        System.out.print(seahawks - brancos+ " points");


      } else if (brancos > seahawks) {
        who = WhoWins.Visitor;
        System.out.println(who + " team won!");
        System.out.print("brancos win by ");
        System.out.print(brancos - seahawks+ " points");


      } else {
        who = WhoWins.Neither;
        System.out.println(who + " team won!");
        System.out.println("it is a tie!");
      }
    }
  }
