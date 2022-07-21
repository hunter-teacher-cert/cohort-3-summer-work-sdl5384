public class ComplexNumbersDriver
{
  public static void main(String[] args)
  {
    ComplexNumbers c = new ComplexNumbers(5,3);
    ComplexNumbers d = new ComplexNumbers(7,4);

    ComplexNumbers a = ComplexNumbers.add(c,d);
    ComplexNumbers m = ComplexNumbers.multiply(c,d);
    ComplexNumbers q = ComplexNumbers.divide(c,d);
  
    a.toString();
    m.toString();
    q.toString();
  }
}