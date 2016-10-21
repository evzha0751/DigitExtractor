
package pkg161017.digitextractor;

import java.util.*;
public class DigitExtractor {

    public static void main(String[] args) {
        
        int number;
        String x;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        number=input.nextInt();
        
        do{
        Num num1=new Num(number);
        x=num1.toString();
        }while(x.intern()!="q");
    }
    
}
