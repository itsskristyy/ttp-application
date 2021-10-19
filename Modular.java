import java.util.*;
import java.io.*;
public class Modular{
    
    public static int computeMod (int x, int y){
        int calculate = x%y;
        return calculate; 
    }
    
    public static void main(String[] args) throws Exception{
        try{
            Scanner scanner = new Scanner(System.in);
            int x =0;
            int y= 0;
            System.out.println("Hello, what do you need help with?");
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("Modular Arithmetic")){
                System.out.println("Modular arithmetic is a system of arithmetic for integers, which considers the remainder.");
                System.out.println("Here you will learn how to solve and get the answer to your problem. ");
                
                System.out.println("Enter two numbers");
                x = scanner.nextInt();
                y = scanner.nextInt();
                
                System.out.println("Your equation is " + x + " mod " + y + " = " + computeMod(x,y));
                
                System.out.println("You are able to find " + x + " mod " + y + " by dividing the first number (" + x + ") with the second number (" + y + ")");
                System.out.println("Then you subtract your total by the numbers before the decimal point and finally multiply by your second number (" + y + ") and thats your remainder/mod which in this case is " + computeMod(x,y));
            }
            
            
            else{
                throw new Exception("Sorry I can't help with that. Try again.");
            }
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }  
}
