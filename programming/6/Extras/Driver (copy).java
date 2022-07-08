/**
 * class Driver
 * tester class for class Rational
 */

public class Driver
{
  public static void main( String[] args )
  {
    //cut/paste this leading comment bar down, one line at a time, as you test...
    /*~~~~~v~~~~~~~~~~down~goer~3~~~~~~~~~~~~~v~~~~~
      Rational r = new Rational( 3, 7 );
      Rational s = new Rational();
      Rational t = new Rational( 8, 5 );
      Rational u = new Rational( 1, 2 );
      Rational v = new Rational( 2, 3 );
      Rational w = new Rational( 8, 12 );
      Rational x = new Rational( 8, 12 );
      System.out.println("r: " + r );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );
      System.out.println( r + " as a floating pt approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );
      System.out.print( r + " * " + t + " = ");
      r.multiply(t);
      System.out.println(r);
      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);
      ~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~*/
  }

  public void reduce()
  {
    
  }
  //calculates GCD/GCF of numerator and denominator
  public int gcd()
  {
    /*finding the gcd means finding the largest factor two #s have
    in common*/
    boolean factorsExhausted = false;
    /*dividing by zero is undefined and 1 does not have any 
    factors other than itself*/
    int i = 2;
    //num > den if rational > 1, num < den if rational < 1
    boolean ratGreaterThanOne = true;
    if (this._numerator/this._denominator > 1)
    {
      ratGreaterThanOne = true;
    }
    else
    {
      ratGreaterThanOne = false;
    }
  }

  //calculates GCD/GCF of two int inputs
  public static int gcd(int n, int d)
  {
    
  }

  public boolean equals(Rational other)
  {
    
  }
  
  public int compareTo(Rational other)
  {
    
  }

}//end class