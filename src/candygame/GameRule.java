/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package candygame;

import java.util.ArrayList;

/**
 *
 * @author Hanlin,Shen
 */
public class GameRule {

    private ArrayList<Integer> list2;//halfCandy
    private ArrayList<Integer> list1; //numberOfCandy
    //---Constructor---------------------------------------

    public GameRule(ArrayList<Integer> list) {
        list1 = new ArrayList();
        list2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i));
            list2.add(list.get(i));
        }
    }
    /**
     * ////////////////game move/////////////////////////////////////////
     */
    public void move() {
        
        for (int j = 0; j < list1.size(); j++) 
        {
                list1.set(j, list1.get(j)/2);
                list2.set(j, list1.get(j));
        }
        
        
        for (int i = 0; i < list1.size(); i++) {
    //-------when the number is not the last one-----------------------
            if (i != list1.size() - 1) 
            {
                list1.set(i + 1, list2.get(i) + list2.get(i + 1));
    //-------when the number is  odd-----------------------------------
                if (list1.get(i + 1) % 2 == 1) {
                    list1.set(i + 1, list1.get(i + 1) + 1);
                }
    //-------when the number is  the last one--------------------------
            } 
            else 
            {
                list1.set(0, list2.get(0) + list2.get(i));
                if (list1.get(0) % 2 == 1) 
                {
                    list1.set(0, list1.get(0) + 1);

                }
            }
           
            
        }            

    }
      
      
    ///////////////////////////////////////////////////////////////////////
    //---------GameOver rule----------------------------------------------- 

    public boolean over() {

        for (int i = 0; i < list1.size() - 1; i++) {

            if (list1.get(i) != list1.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
      //---------------------------------------------------------

    
    //---------------------------------------------------------
    
    @Override
   public String toString(){
       String output = "";
       
         for (int i = 0; i < list1.size(); i++) {
              output += list1.get(i) + " ";
            }
        
       return output;
       
   } 
}
