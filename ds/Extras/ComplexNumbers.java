import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class ComplexNumbers
{
  int _real = 1;
  int _imaginary = 1;
  public static final int i_squared = -1;
  public static final int i_4th = 1;
  

  public ComplexNumbers()
  {
    
  }

  public ComplexNumbers(int real, int imaginary)
  {
    _real = real;
    _imaginary = imaginary;
  }

  public void setValues(int re, int im)
  {
    _real = re;
    _imaginary = im;
  }

  public String toString()
  {
    String complexNumber;
    if (this._imaginary < 0)
    {
      complexNumber = Integer.toString(this._real) + " - " + Integer.toString(Math.abs(this._imaginary)) + "i";
      System.out.println(complexNumber);
    }
    else
      complexNumber = Integer.toString(this._real) + " + " + Integer.toString(this._imaginary) + "i";
      System.out.println(complexNumber);

    return complexNumber;
  }

  public static ComplexNumbers add(ComplexNumbers a, ComplexNumbers b)
  {
    int realSum = a._real + b._real;
    int imaginarySum = a._imaginary + b._imaginary;
    ComplexNumbers sum = new ComplexNumbers(realSum,imaginarySum);
    return sum;
  }

  //for dividing, cannot have a square root in the denominator,
  //need to RATIONALIZE IT, multiply BOTH top and bottom by
  //CONJUGATE of denominator

  // private static int countDecimalPlaces(double value)
  // {
  //   int countDigits = 0;
  //   value = Math.abs(value);
  //   String decimal = Double.toString(value - Math.floor(value));

  //   return countDigits;
  // }

  
  private void conjugate()
  {
    this._imaginary = -1*this._imaginary;
  }

  // private void rationalize()
  // {
  //   int digits = countDecimalPlaces(this.numerator);

  // }
  
  public static ComplexNumbers multiply(ComplexNumbers a, ComplexNumbers b)
  {
    //(a + bi)*(c + di)
    //  a         b
    //ac + adi + bci + bd(i)^2

    int prodOne = a._real*b._real;
    int prodTwoImag = a._real*b._imaginary;
    int prodThreeImag = a._imaginary*b._real;
    int prodFour = (-1)*a._imaginary*b._imaginary;

    int realSum = prodOne + prodFour;
    int imaginarySum = prodTwoImag + prodThreeImag;
    ComplexNumbers p = new ComplexNumbers(realSum, imaginarySum);

    return p;
  }

  public static ComplexNumbers divide(ComplexNumbers a, ComplexNumbers b)
  {
    //a is numerator, b is denominator in that order
    int conjugateNumeratorProduct = 0;
    //cannot have a radical or an i in denominator
    b.conjugate();

    //multiply the conjugate with the numerator
    ComplexNumbers nonConjugated = b;
    b.conjugate();

    ComplexNumbers quotient = new ComplexNumbers();

    ComplexNumbers numerator = new ComplexNumbers();
    ComplexNumbers denominator = new ComplexNumbers();
    numerator = multiply(a,b);
    denominator = multiply(nonConjugated,b);

    double realQuotient, imagQuotient;
    realQuotient = (double)(numerator._real/denominator._real);
    imagQuotient = (double)(numerator._imaginary/denominator._imaginary);

    quotient.setValues((int)realQuotient,(int)imagQuotient);
    return quotient;
  }
}