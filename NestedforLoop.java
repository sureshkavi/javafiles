/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suresh;

/**
 *
 * @author rabbit
 */
public class NestedforLoop {
   
  public static void main(String[] args) {  
      //nested for loop used under some codition break/continue statement
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break aa;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  
}  
}  

