//Name: Rayan Bouamrane
//Student Number: 260788250

public class LemonadeStand {
  
  public static void main (String[] args) //Main method just for testing created methods
  {    
    int numSales = 17; 
    double price = 4.45;
    //printTotalSales(numSales,price); // 2a
    
    int a = 6;
    int b = 4;
    divide(a,b); //2b
    
    int x = 67;
    int y = 5;
    System.out.println("Maximum value is " + getMaximum (x,y)+"."); //2c
    
    int numDays = 7;
    standStats(numDays,numSales,price); //2d
  }
    
  public static void printTotalSales (int numSales, double price)  //2a
  {
    double revenue = numSales*price; //Double declared and initiialized which stores the product of numSales and price.
    
    if(numSales==1){System.out.println("We sold " + numSales + " unit for $"+ price +".");}
    else{System.out.println("We sold " + numSales + " units for $"+ price +" each, which totals $" + revenue+".");}
    //A different message is printed if 1 unit or multiple units are sold, as this makes the messages 
    //grammatically correct
    
  }
  public static int divide (int a, int b){ //2b
    if (b == 0){ //Test for second variable being zero occurs first, so that division does not occur in that case
      System.out.println("MATH ERROR DIVISION BY ZERO"); //and error message is printed instead.
      return (0);}
    else{        //If b is not equal to zero, division is carried out, int c is returned, nothing is printed.
      int c = a/b;
      return (c);}
  }
  public static int getMaximum (int x, int y){//2c
    if (x == y){ //If numbers are equal, x is returned
      return x;}
    else if (x>y){ //If x is greater than y, x will be returned 
      return x;}
    else{
      return y;} //If y is neither smaller than or equal to x, it must neccessarily be larger, thus in all
    //other cases, y is larger than x, and is returned.
  }
  public static void standStats (int numDays, int numSales, double price){
    printTotalSales(numSales, price); //Method printTotalSales is called with parameters numSales and price.
    int salesPerDay = divide (numSales, numDays); //Integer salesPerDay is assigned the value of the divide 
    //method with parameters numSales and numDays.
    String sale_s = "sales"; //These operations change the Strings that are printed if numSales or numDays are
    if (numSales == 1){      //singualar
      sale_s = "sale";}
    String day_s = "days";
    if (numDays == 1){
      day_s = "day";}
    
    if (salesPerDay ==1){
      System.out.println("With "+numSales+" "+sale_s+" over "+numDays+" "+day_s+
                         ", "+salesPerDay+" sale was made per day.");
    }
    else{
      System.out.println("With "+numSales+" "+sale_s+" over "+numDays+" "
                           +day_s+", the sales per day were "+salesPerDay+".");}
    //Two different messages based on if the salesPerDay is equal to 1, as "the sales per day were ..." 
    //would not be fitting in that case.
    
    int targetSales = getMaximum(salesPerDay, 10); //targetSales is assigned the maximum of salesPerDay and 10.
    System.out.println("The target sales are now: "+targetSales+"."); 
    
  }
}
