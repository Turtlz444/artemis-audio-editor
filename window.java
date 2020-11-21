import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

class Main {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("Artemis DAW.png");
        JFrame frame = new JFrame("DAW Frame");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setTitle("Artemis DAW");
        frame.getContentPane().setBackground(Color.decode("#151515"));
        frame.setIconImage(img.getImage());
        JLabel title = new JLabel("My Label");
        Font titleFont = new Font("PTSans-Regular.ttf", Font.PLAIN, 28);
        title.setText("<html>hi</html>");
        title.setFont(titleFont);
        title.setForeground(Color.white);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.TOP);
        frame.add(title);
    }
}