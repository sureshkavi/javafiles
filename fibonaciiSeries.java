/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suresh;


public class fibonaciiSeries {


    public static void main(String[] args) {

        int n = 10, t1 = 4, t2 = 5;
        System.out.println("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.println(t1 + "  ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}    

