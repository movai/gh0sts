
import java.awt.Color;
import java.awt.Graphics;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel{

    public void paint (Graphics g) {
        g.fillRect(100,100, 400, 400);
        for(int i =100; i<=400; i+=100){
            for(int j =100; j <=400; j+=100){
                g.clearRect(100,100,50,50);
            }
            
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.getContentPane().add(new Board());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }




    
}
