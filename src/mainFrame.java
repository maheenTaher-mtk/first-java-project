import javax.swing.JFrame;
import javax.swing.WindowConstants;

// import javax class package

public class mainFrame extends JFrame {
    public void init() {
        setTitle("Pop Up Window! :)");
        setSize(600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}