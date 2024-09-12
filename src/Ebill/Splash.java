package New_Origin;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;

    Splash() {

        setLocationRelativeTo(null);

        ImageIcon gif = new ImageIcon(ClassLoader.getSystemResource("icon/india.gif"));
        Image gif2 = gif.getImage().getScaledInstance(710, 550, Image.SCALE_DEFAULT);
        JLabel img = new JLabel(new ImageIcon(gif2));
        add(img);

        t = new Thread(this);
        t.start();

        setBounds(500, 200, 800, 560);
        setVisible(true);
    }

    public void run() {
        try {
            Thread.sleep(3000);
            new Login();
            setVisible(false);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}