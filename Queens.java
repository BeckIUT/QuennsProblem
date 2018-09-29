/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queens;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Пользователь
 */
public class Queens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter dimension!"));
        ChessBoard board = new ChessBoard(size);
        board.setSize(600, 600);
        board.setVisible(true);
        board.setLocation(200, 100);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setResizable(false);
    }
    
}
