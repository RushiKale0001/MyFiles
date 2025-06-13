import java.io.*;  // import all 'io' files/package/libraries
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner; // import 'Scanner' class of 'utility' package
import java.util.jar.Manifest;
import java.util.Random;  

public class Main {
    public static void main(String[] args){

        System.out.print("I love Paratha !\n"); // 'print' - printing string with next line character  
        System.out.println("its Very spicy .");  // 'println' - printing   
        System.out.println("It is best when hot .");

        // Types of variabe declaration (Datatypes)
        int age = 21;
        int month = 12, year = 24 ;
        System.out.println("My age was " + age + "on month " + month + " Of " + year );
            // Writing variable in quote readed as string by compiler . ex : "age" => printed as 'age' not its value 
        

        float CGPA = 9.78f ;    
        System.out.println("Float : " + CGPA);

        double price1 = 15.5 , price2 = 12 ;
        System.out.print("First Medcine price : " + price1 + "\nSecond Medcine price :" + price2);

        char symbol = '$', Alphabet = 'A', charDigit = '4';
        
        boolean isPresent = true ;
        boolean onSale = false ;
        if (isPresent)/* implies (isPresent == true = [ > 0 ] )) */
            {System.out.println("Its on sale");}
        else 
            {System.out.println("Its Not on sale");}

           /// Reference variable
        
        
        String firstName = "Rushikesh" , midName = "Keshav" , lastName = "Kale"; // String('S' is capital in keyword)     :- series/set/group of characters 

        System.out.println("My Name : " + firstName + " " + midName + " " + lastName );
        System.out.println("Present Status : " + isPresent);
        
        
        isPresentNow(true);  // This is compiled as 'static' Function call declaration

    }
    
    static void isPresentNow(boolean p){  
        boolean isPresent = p ;
        if (isPresent)/* implies (isPresent == true = [ > 0 ] )) */
        {   System.out.println("He is Present");    }
        else { System.out.println(""); }
    }
}
