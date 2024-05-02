public class GallonsLitters {

    public static void main(String[]args) {

        double Gall, Lit;
        int counter;
        counter = 0 ;

        for(Gall = 1; Gall <= 100; Gall = Gall+4) {

        Lit =(Gall * 3.7854);
        System.out.printf("%.2f litres = %.1f Gallons", Lit, Gall);
            System.out.println();

        counter ++;
        if (counter ==5) {
            System.out.println();
            counter = 0 ;

        }

        }// end of loop
        System.out.println("All done!");
    }
}

//