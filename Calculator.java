//Name: Rayan Bouamrane
//Student Number: 260788250
    
public class Calculator
{
  
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Calculator program!");
    
    if (args.length < 3)
    {
      System.out.println("You need to enter three arguments to this program. Try typing 'run Calculator 5 5 1' in Dr. Java, or 'java Calculator 5 5 1' on the command line.");
      return;
    }
    
    int a = getIntegerNumber(args[0]);
    int b = getIntegerNumber(args[1]);
    double c = getDoubleNumber(args[2]);
    
    System.out.println("The first argument a is: " + a);
    System.out.println("The second argument b is: " + b);
    System.out.println("The third argument c is: " + c);
    
    //========================
    //Enter your code below
    int sum = a + b;                                          //sum of arguments a and b
    System.out.println("Sum of a and b: " + sum);             //print concatenation of text and int sum
    int product = a*b;                                        //product of arguments a and b
    System.out.println("Product of a and b: " + product);     //print concatenation...
    int divide_b = a/b;                                       //divides a and b, outputs integer value
    System.out.println("Dividing a by b: " + divide_b); 
    double divide_c = a/c;                                    //divides a and c, outputs double value as c is a double
    System.out.println("Dividing a by c: " + divide_c);       
    boolean larger = a>b;                                     //boolean on if a is strictly larger than b is declared
    System.out.println("Is a larger than b: " + larger);  
    int remainder = a%2;                                      /*even numbers are divisible by 2, % operator finds 
                                                               remainder of dividing a/2 */
    boolean odd = remainder!=0;                               //if remainder = 0, number is even, if !=0, number is odd                           
    System.out.println("Is a odd: " + odd);      
    
    //Enter your code above
    //========================
 }

 public static int getIntegerNumber(String arg)
 {
  try
  {
   return Integer.parseInt(arg);
  }catch(NumberFormatException e)
  {
   System.out.println("ERROR: " + e.getMessage() + " This argument must be an integer!");
  }
     
     //error, return 1
  return 1;
 }

 public static double getDoubleNumber(String arg)
 {
  try
  {
   return Double.parseDouble(arg);
  }catch(NumberFormatException e)
  {
   System.out.println("ERROR: " + e.getMessage() + " This argument must be a double!");
  }
     
     //error, return 1.0
  return 1.0;
 }
}
