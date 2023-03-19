package Calc;
import java.util.Scanner;
class SimpleCalculator
{
 private double firstNumber;
	
 private double secondNumber;
 
 public double getFirstNumber()
 {
 return firstNumber;
 }
 public double getSecondNumber()
{
return  secondNumber;
}
public  void setFirstNumber(double a)
{
firstNumber = a;
}
public  void setSecondNumber(double a)
{
secondNumber = a;
}
public double add()
{
double result = firstNumber + secondNumber;
return result;
}
public double sub()
{
double result = firstNumber - secondNumber;
return result;
}
public double multiply()
{
double result = firstNumber * secondNumber;
return result;
}
public double divide()
{
	if(secondNumber==0)
		return 0;
double result = firstNumber/secondNumber;
return result;
}
}
public class SimpleCalc
{
public static void main(String args [])
{
	double a,b;
Scanner ob = new Scanner(System.in);	
System.out.println("Enter two numbers: ");
a = ob.nextDouble();
b = ob.nextDouble();
SimpleCalculator calc= new SimpleCalculator();			      
calc.setFirstNumber(a);
calc.setSecondNumber(b);
System.out.println("The addition of the two numbers is: " + calc.add());
System.out.println("The substraction of the first number by the second is: " + calc.sub());
System.out.println("The substraction of the first number by the second is: " + calc.multiply());
System.out.println("The division of the first number by the second number is: " + calc.divide());
}
}


