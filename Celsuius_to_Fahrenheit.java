import java.util.Scanner;
/**                      
 * This program will take a temperature in Celsius and convert it to Fahrenheit
 *
 * @author (Kai Wakura)
 * @version (1.0)
 */
public class Celsuius_to_Fahrenheit
{
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);
        
  Scanner keyboard1= new Scanner(System.in);
      
  String stringInput;
  System.out.print("Press 1 to convert celsius to fahrenheit and 2 for fahrenheit to celsius ");
  stringInput = keyboard1.next();
  
  int myInteger = stringInput.length();
  
  float c,f;
  
  
  if (myInteger == 1 )
  { Scanner sc = new Scanner(System.in);
    System.out.println("What is the celsius");
    c = sc.nextFloat();
     
    f = c * 9/5 + 32;
   
    System.out.println (" The fahrenheit is " + f);
  }
  
  else if (myInteger == 2 )
  
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the fahrenheit");
    f = sc.nextFloat();
     
    c = (f - 32) * 5/9;
   
    System.out.println (" The fahrenheit is " + c);
  }

  
}
}