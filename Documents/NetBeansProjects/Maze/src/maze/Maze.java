/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Maze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, tamp, sum=1, gjl=1;
        Scanner kyb = new Scanner(System.in);
        System.out.println("Panjang Sisi Labirin : ");
        n=kyb.nextInt();
        tamp=n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (sum==1) {
                    if(j==2){
                        System.out.print(" ");
                    }else{
                        System.out.print("@");
                    }
                        
                }else if(sum==n){
                    if (j==tamp) {
                        System.out.print(" ");
                    }else{
                        System.out.print("@");
                    }
                }else if(sum%2==0){
                    if(j==1 || j==n){
                        System.out.print("@");
                    }else{
                        System.out.print(" ");
                    }
                }else if(sum%2==1){
                    if(gjl%2==1){
                        if(j==2){
                            System.out.print(" ");
                        }else{
                            System.out.print("@");
                        }
                        gjl++;
                    }else if(gjl%2==0){
                        if(j==tamp){
                            System.out.print(" ");
                        }else{
                            System.out.print("@");
                        }
                        gjl++;
                    }
                }else{
                    System.out.print("@");
                }
                
            }
            System.out.println("");
            sum++;
            
        }
       
    }
    
    
}
