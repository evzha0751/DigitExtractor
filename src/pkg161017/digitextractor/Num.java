

package pkg161017.digitextractor;

import java.util.*;
public class Num {
    private String x,num;
    Scanner input=new Scanner(System.in);
    
    /**
     * Display the value of the number that user wants
     * pre: the value of number
     * post: the value of the number on the ones, tens,
     *       hundreds place or whole number
     */
    public Num(int number){
        System.out.println("show (W)hole number."
                + "\nshow (O)nes place number."
                + "\nshow (T)ens place number."
                + "\nshow (H)undres place number."
                + "\n(Q)uit"
                + "\nEnter your choice:");
        
        x=input.next();
        
        if(x.intern()=="w"){
            System.out.println("The whole number is: "+number);
        }else if(x.intern()=="o"){
            System.out.println("The ones place digit is : "+number%10);
        }else if(x.intern()=="t"){
            System.out.println("The tens place digit is : "+(number%100)/10);
        }else if(x.intern()=="h"){
            System.out.println("The hundreds place digit is : "+number/100);
        }else if(x.intern()=="q"){
        }
        
        System.out.println(" ");
    }
    
    /**
     * Return the value of x
     * pre: none
     * post: if x=="q", end the program.
     */
    public String toString(){
        return(x);
    }
    
    
    
}
