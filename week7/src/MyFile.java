import java.io.File;

public class MyFile {

    public static void main(String[] args) {

        //create a file object

        File dir = new File("NewFolder");

        //create an if else state to tell us if dir exists or no

        if(dir.exists()) {
            System.out.println("Yippy Skippy, We have a directory");
        } else {
            System.out.println("We are lost in space, don't know where the directory is?");

        }
    }
}
