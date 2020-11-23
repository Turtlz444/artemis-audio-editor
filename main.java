//awt
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;

//swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Box;
import javax.swing.JButton;

//io
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//main
class Main {
    public static void main(String[] args) throws IOException {

//window setup
        ImageIcon img = new ImageIcon("Artemis DAW.png");
        JFrame frame = new JFrame("DAW Frame");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setTitle("Artemis Audio Editor");
        frame.getContentPane().setBackground(Color.decode("#151515"));
        frame.setIconImage(img.getImage());

//styling setup
        Font prim = new Font("PTSans-Regular.ttf", Font.BOLD, 18); //Headers
        Font sec = new Font("AzoSans-Italic.ttf", Font.ITALIC, 18); //Subheaders
        Font tert = new Font("AzoSans-Regular.ttf", Font.PLAIN, 12); //Regular text

//header setup
        Box tabs = Box.createHorizontalBox();
        tabs.add(new JButton("File")).setFont(tert);
        tabs.add(new JButton("Edit")).setFont(tert);
        tabs.add(new JButton("View")).setFont(tert);
        tabs.add(new JButton("Help")).setFont(tert);
        tabs.setBackground(Color.WHITE);
        frame.add(tabs, BorderLayout.BEFORE_FIRST_LINE);
    }
}