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
import java.util.Scanner;
public class Fibonaciiuptoseries {
    


    public static void main(String[] args) {
               Scanner Sc=new Scanner(System.in);
                  int t2 = 1,start,End;
            
                 start = Sc.nextInt();
                   End = Sc.nextInt();
                
        
      System.out.println("Upto " + End + ": ");
        while (start <= End)
        {
            System.out.println(start + "  ");

            int sum = start + t2;
            start = t2;
            t2 = sum;
        }
    }
}
