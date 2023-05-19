package frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
/**
 * class where the menu is made you can go straight to the game or read the rules
 */
public class StartingPage implements ActionListener {


    JFrame frame = new JFrame();
    JButton button = new JButton(); //button for continue
    JButton button2 = new JButton();//button for rules
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();


    ImageIcon logo = new ImageIcon("Zaverecny_Projekt/src/images/pngwing.com.png"); //icon of the window
    ImageIcon imageBlackJack = new ImageIcon("Zaverecny_Projekt/src/images/blackjackcasino.png"); //image of blackjack casino
    ImageIcon imageGoBig = new ImageIcon("Zaverecny_Projekt/src/images/gobig.png"); //image of go big or go home


    JLabel labelImage = new JLabel();
    JLabel labelImage2 = new JLabel();


    Color darkGreen = new Color(0, 100, 0); //color used for background



    /**
     * constructor where the frame is made
     */
    public StartingPage()  {

        /**
         *  panel where button are
         */
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 500, 900, 300);


        /**
         *  green panel above panel with buttons
         */
        panel2.setBackground(darkGreen);
        panel2.setBounds(0, 0, 900, 500);


        /**
         * panel for "blackjackcasino" image
         */
        panel3.setBackground(darkGreen);
        panel3.setBounds(195, 125, 500, 300);

        /**
         *   panel for "go big or go home" image
         */
        panel4.setBackground(darkGreen);
        panel4.setBounds(225, 360, 430, 100);


        /**
         *  label where the image "blackjack casino" is stored
         */

        labelImage.setIcon(imageBlackJack);

        /**
         * label where "go big or go home" image is stored
         */
        labelImage2.setIcon(imageGoBig);


        /**
         * button for opening of the launchPage
         */
        button.setBounds(100, 500, 300, 170);
        button.addActionListener(this);
        button.setText("Continue");
        button.setFont(new Font("Arial", Font.BOLD, 35));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        button.setBorderPainted(false);
        button.setFocusable(false);

        /**
         * button for rules
         */
        button2.setBounds(475, 500, 300, 170);
        button2.addActionListener(this);
        button2.setText("Rules");
        button2.setFont(new Font("Arial", Font.BOLD, 35));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBorderPainted(false);
        button2.setFocusable(false);

        /**
         *  frame
         */

        frame.setTitle("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(900, 700);
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.add(button);
        frame.setIconImage(logo.getImage());
        frame.add(button2);
        panel3.add(labelImage);
        panel4.add(labelImage2);
        frame.add(panel4);
        frame.add(panel3);
        frame.add(panel2);
        frame.add(panel);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * button that opens the frame where the game is
         */
        if (e.getSource() == button) {

            try {
                LaunchPage launch = new LaunchPage();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
            /**
             * button that opens the frame where the rules are
             */
        } else if (e.getSource() == button2) {
            Rules r = new Rules();
            frame.dispose();
        }

    }
}

