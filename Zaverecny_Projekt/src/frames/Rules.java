package frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * class where rules of the game are explained
 */
public class Rules implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    Color darkGreen = new Color(0, 100, 0);

    Color yellow = new Color(254, 255, 0);
    JButton backButton = new JButton();

    ImageIcon logo = new ImageIcon(Rules.class.getResource("/pngwing.com.png")); //icon of the window

    /**
     * text that displays rules through html
     */
    String s = "<html>1.You must have higher score than a dealer to win.<br><br>2.Dealer can´t hit on 17 or higher.<br><br>3.There is a tie when you have same score as dealer.<br><br>4.You are dealt two cards and each card has value.<br><br>5.If you have higher score than 21, you lost.<br><br>6.If you have 21 you win.<br><br>7.Press return and continue to play the next hand.";

    /**
     * method where is the frame made
     */
    Rules(){

        /**
         *  panel for darkgreen background
         */

        panel.setBackground(darkGreen);
        panel.setBounds(-150,0,900,700);


        /**
         * label for the html text
         */
        label.setText(s);
        label.setForeground(yellow);
        label.setFont(new Font("Arial", Font.BOLD,20));


        /**
         * button for returning to the menu
         */
        backButton.setBounds(270,350,120,75);
        backButton.addActionListener(this);
        backButton.setText("RETURN");
        backButton.setFont(new Font("Arial",Font.BOLD, 20));
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(darkGreen);
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);


        /**
         * frame
         */
        frame.setTitle("Rules");
        frame.setIconImage(logo.getImage());
        frame.add(backButton);
        frame.add(label);
        frame.add(panel);
        panel.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(700, 500);
        frame.getContentPane().setBackground(darkGreen);
        frame.setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
/**
 * button that if clicked, returns to the menu
  */
        if(e.getSource() == backButton) {
            StartingPage s = new StartingPage();
            frame.dispose();
        }
    }
}
