/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queens;
import java.awt.Color;
import javax.swing.*;
import java.awt.GridLayout;
/**
 *
 * @author Пользователь
 */
public class ChessBoard extends JFrame{
    private int size;
    private JPanel cells[][];
    private JLabel label[][];
    private final Icon icon = new ImageIcon(getClass().getResource("Queen1.jpg"));
    private int even_positions[];
    private int odd_positions[];
    private int even_counter = 0;
    private int odd_counter = 0;
    
    ChessBoard(){}
    ChessBoard(int dimension){
        super("Queen's Puzzle");
        size = dimension;
        setLayout(new GridLayout(dimension,dimension));
        
        cells = new JPanel[size][size];
        label = new JLabel[size][size];
        even_positions = new int[size];
        odd_positions = new int[size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                cells[i][j] = new JPanel();
                label[i][j] = new JLabel(icon);
                label[i][j].setVisible(false);
                if((i+j) % 2 == 0)
                    cells[i][j].setBackground(Color.white);
                else
                    cells[i][j].setBackground(Color.black);
                
                cells[i][j].add(label[i][j]);
                add(cells[i][j]);
            }
        }
        
        if(size%6 != 2 && size%6 !=3)
        {
            for(int i = 1; i <= size; i++)
            {
                if(i%2 == 0)
                {
                    even_positions[even_counter] = i;
                    even_counter++;
                   
                }
                else
                {
                   odd_positions[odd_counter] = i;
                   odd_counter++;
                }
            }
        }
        else
            if(size%6==2){
                for(int i=1;i<=size;i++)
                {
                    if(i%2==0)
                    {
                        even_positions[even_counter]=i;
                        even_counter++;
                    }
                    else
                        if(i%2 == 1 && i!=5)
                        {
                            odd_positions[odd_counter] = i;
                            odd_counter++;
                        }
                }
                odd_positions[0] = 3;
                odd_positions[1] = 1;
                odd_positions[odd_counter] = 5;
                odd_counter++;
            }else
                if(size%6 == 3)
                {
                    for(int i = 1; i <= size; i++)
                    {
                        if(i%2 == 0 && i!=2)
                        {
                            even_positions[even_counter] = i;
                            even_counter++;
                        }
                        else
                            if(i%2 == 1 && i!=1 && i!=3)
                            {
                                odd_positions[odd_counter] = i;
                                odd_counter++;
                            }
                    }
                    even_positions[even_counter] = 2;
                    even_counter++;
                    odd_positions[odd_counter] = 1;
                    odd_counter++;
                    odd_positions[odd_counter] = 3;
                    odd_counter++;
                }
        int eCounter = 0;
        int oCounter = 0;
        
        for(int i = 0; i <  size; i++)
        {
            if(eCounter < even_counter)
            {
                label[size - even_positions[eCounter]][i].setVisible(true);
                cells[size - even_positions[eCounter]][i].setBackground(Color.red);
                eCounter++;
            }
            else
            {
                label[size - odd_positions[oCounter]][i].setVisible(true);
                cells[size - odd_positions[oCounter]][i].setBackground(Color.red);
                oCounter++;                
            }
        }
    }

    void setResizeable(boolean b) {
        
    }
}
