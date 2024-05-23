import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class OpenFile {

    public static void main(String[] args) {

        File file;
        Scanner inputFile;
        String fileName;

        fileName = JOptionPane.showInputDialog("Enter "+ "the name of the file");

        try {
            file = new File(fileName);
            JOptionPane.showMessageDialog(null, "The file was found,Yippy Skippy, dispalayed in Try");




        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The file was NOT FOUND - This is in CATCH");

        }

    }
}
