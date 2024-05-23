import java.io.PrintStream;
import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {


        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday Only!");

        specials = input.next();


        String coffee;
        double price;
        int order;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday ) {
            System.out.println("Please enter a weekday, not a weekend!");
            specials = input.next();
        }


        switch (specials) {

            case "Monday":
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ "s would you like to order?");
                specials = input.next();
                System.out.println("Looks like you don't like " +coffee+ "s  soo sad!!!");
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0) {
                    System.out.println("Looks like you dont like " +coffee+ "s! So sad!!!");
                } else if (order ==1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.println(order + " " +coffee+ "s have been ordered totalling $");
                    System.out.printf("%.2f dollars", order*price);
                }
                break;


            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order ==1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.println(order + " " +coffee+ "s have been ordered totalling $");
                    System.out.printf("%.2f dollars", order*price);
                }
                break;


            case "Wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0) {
                    System.out.println("Looks like you dont like " +coffee+ "s! So sad!!!");
                } else if (order ==1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.println(order + " " +coffee+ "s have been ordered totalling $");
                    System.out.printf("%.2f dollars", order*price);
                }
                break;


            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order ==1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.println(order + " " +coffee+ "s have been ordered totalling $");
                    System.out.printf("%.2f dollars", order*price);
                }
                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0) {
                    System.out.println("Looks like you dont like " +coffee+ "s! So sad!!!");
                } else if (order ==1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.println(order + " " +coffee+ "s have been ordered totalling $");
                    System.out.printf("%.2f dollars", order*price);
                }
                break;

            default:
                System.out.println("Please Enter a Valid day or Check Your Spelling!!");


        }

    }
}
