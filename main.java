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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//main
class Main {
    public static void main(String[] args) throws IOException {

//open files
        FileWriter songInfo = new FileWriter("info.json");
        int i = 3;

//window setup
        ImageIcon img = new ImageIcon("Artemis DAW.png");
        JFrame frame = new JFrame("DAW Frame");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setTitle("Artemis DAW");
        frame.getContentPane().setBackground(Color.decode("#151515"));
        frame.setIconImage(img.getImage());

//titles setup
        JLabel title = new JLabel("My Label");
        Font titleFont = new Font("PTSans-Regular.ttf", Font.PLAIN, 28);
        title.setText("<html>hi</html>");
        title.setFont(titleFont);
        title.setForeground(Color.white);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.TOP);
        frame.add(title);

//close files
        songInfo.close();
    }
}