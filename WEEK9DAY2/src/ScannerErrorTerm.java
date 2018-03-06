import java.util.Scanner;

public class ScannerErrorTerm
{
	/*
	 * @author saksham bansal
	 */
public static void main(String[] args)
{

              double st, nd , er , err , conc , concerr ;
              char sb;
              Scanner keyboard = new Scanner(System.in);

 //input of first value
System.out.print("Enter the 1st value:");
     st = keyboard.nextDouble();
     // input the first error value
     System.out.print("Enter First Number Error Term: ");
     er = keyboard.nextDouble();   
//input of second value
     System.out.print("Enter the 2nd value:");
      nd = keyboard.nextDouble();
      // input the second error value
      System.out.print("Enter Second Number Error Term: ");
      err = keyboard.nextDouble();
      // input of the operation you want to perfrom
      System.out.print("Enter Operator (+ or -) : ");
      sb = keyboard.next().charAt(0);
                  
      if(sb == '+')
      {
        // performing the addition calculation
    	  conc = st + nd;
           concerr = er + err;
           System.out.println(conc +","+ concerr);
      }
      else if(sb == '-')
      {
          // performing the subtraction calculation
    	  conc = st - nd;
           concerr = er-err;
           
           System.out.print(conc + ","+  concerr);
      }

      }

}
