
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;


public class Board1 extends javax.swing.JFrame {

     // Numero maximo de casillas
 public static final int squareCount = 36;
 
 public Board1(String title) {
 
 // Color de las casillas
 Color blackColor = Color.BLACK;
 Color whiteColor = Color.WHITE;
 
 JButton chessButton = null;
 
 for (int i = 1; i <= squareCount; i++) {
 
 if (i % 2 == 0) { // agrega un color por casillas pares e impares
 
 chessButton = new JButton();
 chessButton.setBackground(blackColor);
 add(chessButton);
 } else {
 
 chessButton = new JButton();
 chessButton.setBackground(whiteColor);
 add(chessButton);
 }
 
 if (i % 6 == 0) { // Cuando termina con una fila, cambia con otro color
 
 Color temp = blackColor;
 blackColor = whiteColor;
 whiteColor = temp;
 }
 
 }
 
 this.setTitle(title); // Setting the title of board
 this.setLayout(new GridLayout(6, 16)); // GridLayout arregla los elementos 6 X 16
 this.setSize(650, 650); // tamaño de la ventana
 this.setVisible(true);
 }

    Board1() {
        
        initComponents();
     setLocationRelativeTo(null);
      setVisible(true);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        String title = "My Chess Board";
 
        Board1 chessBoard = new Board1(title); // Creating the instance of chess board
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
