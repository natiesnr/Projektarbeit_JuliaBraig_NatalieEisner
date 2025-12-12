package PassTheTest;

import javax.swing.*;

public class Startseite extends JFrame {
    private JLabel ueberschriftLabel;
    private JPanel hauptPanel;
    private JButton faecherbutton1;
    private JButton organizerbutton;
    private JButton notenbutton1;
    private JTextField modusTextField;

    public Startseite() {
        setTitle("Startseite");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 700);
        setContentPane(hauptPanel);
        setVisible(true);

    }

}

