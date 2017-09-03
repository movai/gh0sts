import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
 
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class Board extends JFrame {
 
 // The overall box count in chess board
 public static final int squareCount = 36;
 
 public Board(String title) {
 
 // Color of chess board this you can change accordingly like red or white
 Color blackColor = Color.BLACK;
 Color whiteColor = Color.WHITE;
 
 JButton chessButton = null;
 
 for (int i = 1; i <= squareCount; i++) {
 
 if (i % 2 == 0) { // Adding color based on the odd and even initially.
 
 chessButton = new JButton();
 chessButton.setBackground(blackColor);
 add(chessButton);
 } else {
 
 chessButton = new JButton();
 chessButton.setBackground(whiteColor);
 add(chessButton);
 }
 
 if (i % 6 == 0) { // swapping the color when adding the next row 
 
 Color temp = blackColor;
 blackColor = whiteColor;
 whiteColor = temp;
 }
 
 }
 
 this.setTitle(title); // Setting the title of board
 this.setLayout(new GridLayout(6, 16)); // GridLayout will arrange elements in Grid Manager 6 X 16
 this.setSize(650, 650); // Size of the chess board
 this.setVisible(true);
 
 }
 
 public static void main(String[] args) {
 
 String title = "My Chess Board";
 
 Board chessBoard = new Board(title); // Creating the instance of chess board
 }

    Board() {
       setVisible(true);
    }
}
