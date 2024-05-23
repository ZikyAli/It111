public class VariableScopeGlobal {

    final static String txt = "This is a Global variable of the VariableScopeGlobal class";

    public static void main(String[] args) {

        String txt = "This is my local variable in the main method!!";
        System.out.println(txt);

        System.out.println(VariableScopeGlobal.txt);

        sub();
    }

    public static void sub() {


        String txt = "This is my local variable in the sub method!!";
        System.out.println(txt);
    }
}