import java.io.*;  // import all 'io' files/package/libraries
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner; // import 'Scanner' class of 'utility' package
import java.util.jar.Manifest;
import java.util.Random;  

public class Main {
    public static void main(String[] args){
        // This is Single line comment of Java Program 

        /* 
            This is 
            Multi-line 
            comment
            by writing comment 
            between pair of 
            astrics(*) & forward slash 
            for starting and closing 
        */

        System.out.print("I love Paratha !\n"); // 'print' - printing string with next line character  
        System.out.println("its Very spicy .");  // 'println' - printing   
        System.out.println("It is best when hot .");
        
        // Variable - a reausable container for a value 
        //            a variable behaves as if it was the value it contains .

        // Types :
        // Primitive = simple value stored directly in memeory (stack)
        // Reference = memory address (stack) that points to the(heap)

        // Prinitive   vs   Reference
        // ---------        ---------
        // int              String 
        // double           array  
        // char             object 
        // boolean

        //  2 Steps to creating a variable 
        //    1. Declaration    ex. int a ;
        //    2. Assignment     ex. int a = 12;  // 12 is int val
    
        // To use value of any value-assignend variable , 
        // just write variable Name where you want to use  }


        // Types of variabe declaration (Datatypes)
        int age = 21;
        int month = 12, year = 24 ;
        System.out.println("My age was " + age + "on month " + month + " Of " + year );
            // Writing variable in quote readed as string by compiler . ex : "age" => printed as 'age' not its value 
        
        // ***Note : remember decimal value generally considered 'double'
        //           Until we write 'f' after decimal value for 'float' variable
    /* Example to remeber : */ float CGPA = 9.78f ;    
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
        // String('S' is capital in keyword) 
        // --- series/set/group of characters 
        String firstName = "Rushikesh" , midName = "Keshav" , lastName = "Kale";

        System.out.println("My Name : " + firstName + " " + midName + " " + lastName );
        System.out.println("Present Status : " + isPresent);
        
        // this main() method is static, so all variable compile as static
        isPresentNow(true);  // This is compiled as 'static' Function call declaration

    }
    
    static void isPresentNow(boolean p){  // Without 'static' at start this is compiled as 'non-static' 
    // Cannot make a static reference (i.e. isPresentNow(true);  from main())
    // to the non-static method isPresentNow(boolean)

    // In Java, you cannot call a non-static method from a static context without creating an instance of the class.
    // second alternative was : to creat instance in main() then use nonstatic method
    /*  Rough_Practice obj = new Rough_Practice();
        obj.isPresentNow(true);
    */
        boolean isPresent = p ;
        if (isPresent)/* implies (isPresent == true = [ > 0 ] )) */
        {   System.out.println("He is Present");    }
        else { System.out.println(""); }
    }
}
