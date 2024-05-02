public class celsiusFarConverter {

    public static void main(String[]args) {

        int cel, far;

        for(cel = 0; cel <= 100; cel = cel+2) {
            far = (cel * 9/5) + 32;
            System.out.println(cel + " Degrees Celcius is Equal to " +far+ "Degrees Farenheit");


        }// end for loop
        System.out.println("ALL DONE!");
    }
}
