//6096101 Dylan Souvage Assignment 5
import java.util.Scanner;

public class FractionProgram {
  public static void main(String[] args) {
    long num1,num2;
    long denom1,denom2;
    Scanner kbd;
    char input;
    Fraction f1,f2;
    double d1;
    num2 = 0;
    denom2 = 0;
    
    kbd = new Scanner (System.in);
    
    System.out.println("First Fraction (Numerator then Denominator)");
    num1 = kbd.nextLong();
    denom1 = kbd.nextLong();
    
    //creates both fractions but the value for the second fraction is empty
    //until user has inputted the values in the loop
    f1 = new Fraction(num1, denom1);
    f2 = new Fraction(num1, num2);
    
    do {
      
      System.out.println("Which operation would you like?:");
      System.out.println("q to exit, +-*/, p to print, d to convert to double");
      input = kbd.next().charAt(0);
      
      //decides which method to run via user inputted char
      
      switch ( input ) {
        //returns the sum of two fractions
        case '+':
          System.out.println("Second Fraction");
          
          num2 = kbd.nextLong();
          denom2 = kbd.nextLong();
          f2 = new Fraction(num2,denom2);
          
          System.out.println("Add:");
          
          f1.fractionPrint(f1.sum(f1,f2));
          
          break;
          //returns the difference of two fractions
        case '-':   
          System.out.println("Second Fraction");
          
          num2 = kbd.nextLong();
          denom2 = kbd.nextLong();
          f2 = new Fraction(num2,denom2);
          
          System.out.println("Minus:");
          
          f1.fractionPrint(f1.minus(f1,f2));
          
          break;
          //returns the division of two fractions
        case '/':
          System.out.println("Second Fraction");
          
          num2 = kbd.nextLong();
          denom2 = kbd.nextLong();
          f2 = new Fraction(num2,denom2);
          
          System.out.println("Divide:");
          
          f1.fractionPrint(f1.divide(f1,f2));
          
          break;
          //returns the product of two fractions
        case '*':
          System.out.println("Second Fraction");
          
          num2 = kbd.nextLong();
          denom2 = kbd.nextLong();
          f2 = new Fraction(num2,denom2);
          
          System.out.println("Multiply:");
          
          f1.fractionPrint(f1.product(f1,f2));    
          
          break;
          //prints the users first fraction
        case 'p':
          System.out.println("Current Fraction:");
          
          f1.fractionPrint(f1);
          
          break;
          //prints the users first fraction as a double
        case 'd':
          System.out.println("Current Fraction as a double:");
          
          d1 = f1.toDouble(f1);
          
          System.out.println(d1);
          
          break;          
          //ends the program          
        case 'q':
          return;
          //loops the switch
        default:
          break;
      }
      
    }  while (input != 'q');
  }
}