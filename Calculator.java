import java.util.Scanner;

class calccode
{
  void run() 
  {
    int redo = 1;
    do 
    {
      Scanner scobj = new Scanner(System.in);
      System.out.println("Hi! Press 1 for Simple Calculations, 2 for Zakat Calculations or 3 for Currency Conversion:");
      int mainselect = scobj.nextInt();
      if(mainselect==1)
      {
        System.out.println("Enter first value:");
        int val1 = scobj.nextInt();
        System.out.println("Enter second value:");
        int val2 = scobj.nextInt();
  
        System.out.println("Press 1 to ADD, 2 to SUBTRACT, 3 to MULTIPLY or 4 to DIVIDE:");
        int calcselect = scobj.nextInt();
        if(calcselect==1)
        {
          double ans = val1 + val2;
          System.out.println("The answer is " + ans);
        } 
        else if(calcselect==2)
        {
          double ans = val1 - val2;
          System.out.println("The answer is " + ans);
        } 
        else if(calcselect==3)
        {
          double ans = val1 * val2;
          System.out.println("The answer is " + ans);
        } 
        else if(calcselect==4)
        {
          double ans = val1 / val2;
          System.out.println("The answer is " + ans);
        }
        else 
        {
          System.out.println("Sorry, that's an invalid response. Please try again.");
          redo = 1;
        }
      }      
      else if(mainselect==2)
      {
        System.out.println("Enter salary:");
        int val1 = scobj.nextInt();
        double ans = val1*0.025;
        System.out.println("Your due zakat is Rs." + ans);
      } 
      else if(mainselect==3)
      {
        System.out.println("Press 1 for USD to PKR or 2 for PKR to USD:");
        int currselect = scobj.nextInt();
        if(currselect==1)
        {
          System.out.println("Enter USD amount:");
          int usd = scobj.nextInt();
          double usdc = usd*105;
          System.out.println("Your $" + usd + " are Rs." + usdc);
        } 
        else if(currselect==2)
        {
          System.out.println("Enter PKR amount:");
          int pkr = scobj.nextInt();
          double pkrc = pkr/105;
          System.out.println("Your Rs." + pkr + " are $" + pkrc);
        }
        else 
        {
          System.out.println("Sorry, that's an invalid response. Please try again.");
          redo = 1;
        }
      }
      else
      {
        System.out.println("Sorry, that's an invalid response. Please try again."); 
        redo = 1;
      }
      System.out.println("Would you like to continue? 1. YES 2. NO");
      int choice = scobj.nextInt();
      if(choice == 1) 
      {
        redo= 1;
      }   
      else 
      {
        redo= 0;
        System.out.println("Thank you for using this program!");
      }
    }
    while (redo == 1);
  }
}


class Calculator 
{
  public static void main(String args[])
  {
  Calculator calculator = new Calculator();
  calculator.run();
  }
  
}   
