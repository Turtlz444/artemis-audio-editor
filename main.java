//awt
import java.awt.Color;
import java.awt.Font;

//swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

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

//titles setup
        Font main = new Font("PTSans-Regular.ttf", Font.PLAIN, 18);
        JLabel title = new JLabel("Title");
        title.setText("<html>Title</html>");
        title.setFont(main);
        title.setForeground(Color.white);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.TOP);
        frame.add(title);
//subtext setup
        Font sub = new Font("AzoSans-Regular.ttf", Font.PLAIN, 12);
        JLabel subtext = new JLabel("Subtext");
        subtext.setText("<html><br/><br/>Subtext</html>");
        subtext.setFont(sub);
        subtext.setForeground(Color.white);
        subtext.setHorizontalAlignment(SwingConstants.LEFT);
        subtext.setVerticalAlignment(SwingConstants.TOP);
        frame.add(subtext);
    }
}