package frames;
import cardLogic.DeckOfCards;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.border.Border;
/**
 * class where is the gaming frame loaded and some game logic made
 */
public class LaunchPage implements ActionListener {

     private int counterClick = 0;
     JLabel thirdCard = new JLabel(); //label for third players cards
     JLabel fourthCard = new JLabel();//label for fourth players cards
     JLabel fifthCard = new JLabel();//label for fifth players cards
     JLabel label = new JLabel(); //label that displays dealers score
     JLabel label2 = new JLabel();//label that displays players score
     JLabel firstDealerCard  = new JLabel(); //label for first dealers card
     JLabel secondDealerCard  = new JLabel();  //label for second dealers card
     JLabel thirdDealerCard  = new JLabel(); //label for third dealers card
     JLabel fourthDealerCard  = new JLabel(); //label for fourth dealers card
     JLabel fifthDealerCard  = new JLabel(); //label for fifth dealers card
     JFrame frame = new JFrame();
     JButton button = new JButton();
     JButton button2 = new JButton();
     JButton button3 = new JButton();
     DeckOfCards cards = new DeckOfCards();
     Color darkGreen = new Color(0, 100, 0);
     ImageIcon logo = new ImageIcon(LaunchPage.class.getResource("/pngwing.com.png")); //icon of the window
    /**
     * constructor where is the main logic stored
     */
    public  LaunchPage() throws IOException, InterruptedException {

        Border emptyBorder = BorderFactory.createEmptyBorder(0, 10, 0, 0); //space between cards

        //panel that separates buttons from game area
        JPanel panel = new JPanel();
        panel.setBackground(darkGreen);
        panel.setBounds(0,400,900,45);

        //panel for game area
        JPanel panel2 = new JPanel();
        panel2.setBackground(darkGreen);
        panel2.setBounds(0,0,900,450);

        //panel for buttons
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLACK);
        panel3.setBounds(0,400,900,300);

        /**
         * panels where are the players cards shown
         */
        // region panels for your cards

        JPanel panelYourCard1 = new JPanel(new BorderLayout());
        panelYourCard1.setBackground(darkGreen);                                //first panel for your card
        panelYourCard1.setBounds(350,250,80,110);

        JPanel panelYourCard2 = new JPanel(new BorderLayout());
        panelYourCard2.setBackground(darkGreen);                                //second panel for your card
        panelYourCard2.setBounds(460,250,80,110);

        JPanel panelYourCard3 = new JPanel(new BorderLayout());
        panelYourCard3.setBackground(darkGreen);                                //third panel for your card
        panelYourCard3.setBounds(570,250,80,110);

        JPanel panelYourCard4 = new JPanel(new BorderLayout());
        panelYourCard4.setBackground(darkGreen);                                //fourth panel for your card
        panelYourCard4.setBounds(240,250,80,110);

        JPanel panelYourCard5 = new JPanel(new BorderLayout());
        panelYourCard5.setBackground(darkGreen);                                //fifth panel for your card
        panelYourCard5.setBounds(680,250,80,110);

        //endregion

        // region panels for dealers cards

        JPanel panelDealerCard1 = new JPanel();
        panelDealerCard1.setBackground(darkGreen);
        panelDealerCard1.setBounds(410,75,80,110);

        JPanel panelDealerCard2 = new JPanel();
        panelDealerCard2.setBackground(darkGreen);
        panelDealerCard2.setBounds(520,75,80,110);

        JPanel panelDealerCard3 = new JPanel();
        panelDealerCard3.setBackground(darkGreen);
        panelDealerCard3.setBounds(630,75,80,110);

        JPanel panelDealerCard4 = new JPanel();
        panelDealerCard4.setBackground(darkGreen);
        panelDealerCard4.setBounds(300,75,80,110);

        JPanel panelDealerCard5 = new JPanel();
        panelDealerCard5.setBackground(darkGreen);
        panelDealerCard5.setBounds(190,75,80,110);

        //endregion

        //label 1 - dealers score
        label.setText("Dealer´s Score:"  + cards.getDealerCount());
        label.setForeground(Color.WHITE);                               //label that show score of dealer
        label.setFont(new Font("Arial", Font.BOLD,20));

        //label 2 - your score
        label2.setText("Your Score:" + cards.getPlayerCount());//
        label2.setForeground(Color.WHITE);                             //label that show score of player
        label2.setFont(new Font("Arial", Font.BOLD,20));

       //region labels for dealers card

        ImageIcon dealersCard = new ImageIcon(cards.ShufflingDealerCards().getFilePath());
        label.setText("Dealer´s Score:"  + cards.getDealerCount());
        firstDealerCard.setIcon(dealersCard);
        firstDealerCard.setBorder(emptyBorder);

        //endregion
        // region labels for your cards

        ImageIcon playersCardImage = new ImageIcon(cards.ShufflingPlayerCards().getFilePath()); //shuffling card and finding its filepath
        label2.setText("Your Score:" + cards.getPlayerCount());
        JLabel firstCard = new JLabel();
        firstCard.setIcon(playersCardImage);
        firstCard.setBorder(emptyBorder);

        ImageIcon playersCard2Image = new ImageIcon(cards.ShufflingPlayerCards().getFilePath());
        label2.setText("Your Score:" + cards.getPlayerCount());
        JLabel secondCard = new JLabel();
        secondCard.setIcon(playersCard2Image);
        secondCard.setBorder(emptyBorder);

        //endregion

        //button that perform hit action
        button.setBounds(0,480,450,150);
        button.addActionListener(this);
        button.setText("Hit");
        button.setFont(new Font("Arial",Font.BOLD, 45));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        button.setBorderPainted(false);
        button.setFocusable(false);

        //button that performs stand action
        button2.setBounds(450,480,450,150);
        button2.addActionListener(this);
        button2.setText("Stand");
        button2.setFont(new Font("Arial",Font.BOLD, 45));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBorderPainted(false);
        button2.setFocusable(false);

        //button that returns to the menu
        button3.setBounds(0,0,120,75);
        button3.addActionListener(this);
        button3.setText("RETURN");
        button3.setFont(new Font("Arial",Font.BOLD, 20));
        button3.setForeground(Color.WHITE);
        button3.setBackground(darkGreen);
        button3.setBorderPainted(false);
        button3.setFocusable(false);

        //frame
        frame.setTitle("Blackjack Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(900,700);
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.add(button3);
        frame.add(button);
        frame.add(button2);
        frame.add(panelDealerCard1);
        frame.add(panelDealerCard2);
        frame.add(panelDealerCard3);
        frame.add(panelDealerCard4);
        frame.add(panelDealerCard5);
        frame.add(panelYourCard1);
        frame.add(panelYourCard2);
        frame.add(panelYourCard3);
        frame.add(panelYourCard4);
        frame.add(panelYourCard5);
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        frame.setIconImage(logo.getImage());
        frame.add(label);
        panelYourCard1.add(firstCard);
        panelYourCard2.add(secondCard);
        panelYourCard3.add(thirdCard);
        panelYourCard4.add(fourthCard);
        panelYourCard5.add(fifthCard);
        panelDealerCard1.add(firstDealerCard);
        panelDealerCard2.add(secondDealerCard);
        panelDealerCard3.add(thirdDealerCard);
        panelDealerCard4.add(fourthDealerCard);
        panelDealerCard5.add(fifthDealerCard);
        panel2.add(label);
        panel.add(label2);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) { //hit button
            /**
             * each click will add one card and adds score to the previous two card
             */
             counterClick += 1;
            if (counterClick == 1) {
                ImageIcon playersCard3Image = new ImageIcon(cards.ShufflingPlayerCards().getFilePath());
                label2.setText("Your Score:" + cards.getPlayerCount());
                thirdCard.setIcon(playersCard3Image);
            } else if (counterClick == 2) {
                ImageIcon playersCard4Image = new ImageIcon(cards.ShufflingPlayerCards().getFilePath());
                label2.setText("Your Score:" + cards.getPlayerCount());
                fourthCard.setIcon(playersCard4Image);
            } else if (counterClick == 3) {
                ImageIcon playersCard5Image = new ImageIcon(cards.ShufflingPlayerCards().getFilePath());
                label2.setText("Your Score:" + cards.getPlayerCount());
                fifthCard.setIcon(playersCard5Image);
                /**
                 * if player has more than 21 you lose
                 * if player has 21 you win
                 * if player has same as dealer you tie
                 */
            } if (cards.getPlayerCount() > 21) {
                JOptionPane.showMessageDialog(null, "YOU LOSE ☠, RETURN");
                button.setEnabled(false);
                button2.setEnabled(false);
            }else if(cards.getPlayerCount() == 21){
                JOptionPane.showMessageDialog(null, "YOU WIN 🎉, RETURN");
                button.setEnabled(false);
                button2.setEnabled(false);
            }else if(cards.getPlayerCount() == cards.getDealerCount()){
                JOptionPane.showMessageDialog(null, "YOU TIE ⚔, RETURN");
                button.setEnabled(false);
                button2.setEnabled(false);
            }
            } else if (e.getSource() == button2) { //stand button
            /**
             * while dealers score is smaller than 17 he keeps on hitting cards
             */
                      int counter = 0; //parameter that count how many card should be displayed under 17
                      while(cards.getDealerCount() < 17){
                          if(counter == 0) {
                              ImageIcon dealersCard2 = new ImageIcon(cards.ShufflingDealerCards().getFilePath());
                              label.setText("Dealer´s Score:" + cards.getDealerCount());
                              secondDealerCard.setIcon(dealersCard2);
                          }else if(counter == 1) {
                              ImageIcon dealersCard3 = new ImageIcon(cards.ShufflingDealerCards().getFilePath());
                              label.setText("Dealer´s Score:" + cards.getDealerCount());
                              thirdDealerCard.setIcon(dealersCard3);
                          }else if(counter ==2){
                              ImageIcon dealersCard4 = new ImageIcon(cards.ShufflingDealerCards().getFilePath());
                              label.setText("Dealer´s Score:" + cards.getDealerCount());
                              fourthDealerCard.setIcon(dealersCard4);
                          }else if(counter == 3){
                              ImageIcon dealersCard5 = new ImageIcon(cards.ShufflingDealerCards().getFilePath());
                              label.setText("Dealer´s Score:" + cards.getDealerCount());
                              fifthCard.setIcon(dealersCard5);
                          }counter += 1; }
            /**
             * if dealer has more tha 21 you win
             * if dealer has more than player you lose
             * if dealer has less than player you win
             * if dealer and player are equal the tie
             */
            if (cards.getDealerCount() > 21) {
                JOptionPane.showMessageDialog(null, "YOU WIN 🎉, RETURN");
                button.setEnabled(false);
                button2.setEnabled(false);
             }else if(cards.getDealerCount() > cards.getPlayerCount()){
                JOptionPane.showMessageDialog(null, "YOU LOSE ☠, RETURN");
                button.setEnabled(false);
                button2.setEnabled(false);
            }else if(cards.getDealerCount() < cards.getPlayerCount()){
                JOptionPane.showMessageDialog(null, "YOU WIN 🎉, RETURN");
                button.setEnabled(false);
                button2.setEnabled(false);
            }else if(cards.getPlayerCount() == cards.getDealerCount()){
                JOptionPane.showMessageDialog(null, "YOU TIE ⚔, RETURN");
                button.setEnabled(false);
                button2.setEnabled(false);
            }
        }else if(e.getSource() == button3){
            StartingPage s = new StartingPage();  //button that returns to the menu
            frame.dispose();
        }
    }
}