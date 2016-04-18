/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package candygame;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


/**
 *
 * @author Hanlin,Shen
 */
public class CandyGame {

    public static void main(String[] args) {

  //---cate a ArrayList for numberOfCandy----------------------------
        ArrayList<Integer> list = new ArrayList();     
        boolean wrongInput = false;
  //---give value to ArrayList numberOfCandy------------------------- 
       while(!wrongInput){
            
           list.clear();
           String input = JOptionPane.showInputDialog("Enter the number of the candy ");     
           StringTokenizer num = new StringTokenizer(input);
           
           while (num.hasMoreElements()) {
             int n = Integer.parseInt(num.nextToken());                        
             list.add(n);
           }
           
           if(wrongInput(list))
               wrongInput = true;
       }
                             
     
  //-------------------Result-------------------------------------
          GameRule game = new GameRule (list);
           while(!game.over()){
            game.move();
            System.out.println(game.toString());              
            }
           
         }
    
    //----------------If u enter a odd number--------------
      public static boolean wrongInput(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)% 2 == 1) {
           JOptionPane.showMessageDialog(null,"please enter a even number");
                return false;
            }
        }
        return true;
  
      }
}


