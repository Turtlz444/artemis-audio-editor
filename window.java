import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

class Main {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("Artemis DAW.png");
        JFrame frame = new JFrame("DAW Frame");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setTitle("Artemis DAW");
        frame.getContentPane().setBackground(Color.decode("#151515"));
        frame.setIconImage(img.getImage());
    }
}