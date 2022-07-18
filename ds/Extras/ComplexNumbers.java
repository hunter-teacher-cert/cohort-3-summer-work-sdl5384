import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class ComplexNumbers
{
  int _realComponent = 0;
  int _imaginary = 0;
  public static final int i_squared = -1;
  public static final int i_4th = 1;
  

  public ComplexNumbers()
  {
    
  }

  public ComplexNumbers(int real, int imaginary)
  {
    _realComponent = real;
    _imaginary = imaginary;
  }

  public String toString()
  {
    String complexNumber;
    if (this._imaginary < 0)
    {
      complexNumber = Integer.toString(this._realComponent) + " - " + Integer.toString(Math.abs(this._imaginary)) + "i";
      System.out.println(complexNumber);
    }
    else
      complexNumber = Integer.toString(this._realComponent) + " + " + Integer.toString(this._imaginary) + "i";
      System.out.println(complexNumber);

    return complexNumber;
  }

  public ComplexNumbers add(ComplexNumbers a, ComplexNumbers b)
  {
    int realSum = a._realComponent + b._realComponent;
    int imaginarySum = a._imaginary + b._imaginary;
    ComplexNumbers sum = new ComplexNumbers(realSum,imaginarySum);
    return sum;
  }

  //for dividing, cannot have a square root in the denominator,
  //need to RATIONALIZE IT, multiply BOTH top and bottom by
  //CONJUGATE of denominator

  private void conjugate()
  {
    this._imaginary = -1*this._imaginary;
  }

  private void rationalize()
  {
    
  }
  public ComplexNumbers muiltiply(ComplexNumbers a, ComplexNumbers b)
  {
    ComplexNumbers product;
    //(a + bi)*(c + di)
    //ac + adi + bci + bd(i)^2
  }

  public static void main(String[] args)
  {
    ComplexNumbers c = new ComplexNumbers(5,3);

    c.toString();
  }
}