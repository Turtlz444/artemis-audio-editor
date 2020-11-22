//awt
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;

//swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.JButton;

//io
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//json

//main
class Main {
    public static void main(String[] args) throws IOException {

//window setup
        ImageIcon img = new ImageIcon("Artemis DAW.png");
        JFrame frame = new JFrame("DAW Frame");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setTitle("Artemis DAW");
        frame.getContentPane().setBackground(Color.decode("#151515"));
        frame.setIconImage(img.getImage());

//styling setup
        Font main = new Font("PTSans-Regular.ttf", Font.PLAIN, 18);
        Font sub = new Font("AzoSans-Regular.ttf", Font.PLAIN, 12);

//header setup
        Box tabs = Box.createHorizontalBox();
        tabs.add(new JButton("File")).setFont(sub);
        tabs.add(new JButton("Edit")).setFont(sub);
        tabs.setBackground(Color.WHITE);
        frame.add(tabs, BorderLayout.BEFORE_FIRST_LINE);
    }
}