
package hackelite;

import java.util.Scanner;

public class HackElite {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value");
        int n = scn.nextInt();
        
     if(1<=n && n<=1000){
           int a = n/10;
            System.out.println("10 "+a);
            int b = n%10;
            
            int c = b/5;
            System.out.println("5 "+c);
            int d = b%5;
            
            int e = d/2;
            System.out.println("2 " +e);
            int f = d%2;
            
            int g = f/1;
            System.out.println("1 "+g);
    }   
 }
}
