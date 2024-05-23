import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

        public static void main(String[] args) {

            final int WINDOW_WIDTH = 450;
            final int WINDOW_HEIGHT = 450;

            JFrame window = new JFrame();
            JLabel myLabel1,myLabel2;
            JTextField TextField1, TextField2;

            //JFrame window = new JFrame();
            //set window tittle

            window.setTitle("ShowWindow2");
            //set window size
            window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
            //set window location
            window.setLocation(400,200);
            //set window Bg color
            window.getContentPane().setBackground(Color.red);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            myLabel1 = new JLabel("My First Big Label!!");
            myLabel1.setBounds(30,50,400,30);
            TextField1 = new JTextField();
            TextField1.setBounds(30,80,200,30);
            window.add(myLabel1);
            window.add(TextField1);

            myLabel2 = new JLabel("My Second Big Label!");
            myLabel2.setBounds(30,130,300,30);
            TextField2 = new JTextField();
            TextField2.setBounds(30,160,200,30);
            window.add(myLabel2);
            window.add(TextField2);

            myLabel1.setFont(new Font("Times", Font.PLAIN, 15));
            myLabel2.setFont(new Font("Times", Font.BOLD, 14));

            window.setLayout(null);


            window.setVisible(true);
         }
    }