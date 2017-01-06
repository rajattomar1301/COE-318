package coe318.lab2;
/**
 * ComplexNumber models a complex number expressed
 * in rectangular form (real and imaginary parts).
 * It is an immutable object.
 *
 * @author Satchel French
 */
public class ComplexNumber {
  //Instance variable declarations
    
    double real;
    double imaginary;
    
  /**
   * Construct a ComplexNumber given its
   * real and imaginary parts.
   * @param re The real component
   * @param im The imaginary component
   */
  public ComplexNumber(double re, double im) {
      //Initialize the instance variables
      
      real = re;
      imaginary = im;
      
  }
  /**
   * Returns the real component.
   * @return the real
   */
  public double getReal() {
      return real;  //A stub: to be fixed
  }
  /**
   * Returns the imaginary component.
   * @return the imaginary
   */
  public double getImaginary() {
      return imaginary;  //A stub: to be fixed
  }
  /**
   * Returns a new ComplexNumber number that is
   * the negative of <em>this</em>.  Note: the
   * original ComplexNumber is NOT
   * modified.
   * @return -this
   */
  public ComplexNumber negate() {
      return new ComplexNumber(-real, -imaginary); //A stub: to be fixed
  }
  /**
   * Returns a new ComplexNumber that is the
   * sum of this and <em>z</em>.
   * Note: the  original ComplexNumber is
   * NOT modified.
   */
  public ComplexNumber add(ComplexNumber z) {    
      return new ComplexNumber((real+z.real),(imaginary+z.imaginary));
  }  //A stub: to be fixed
  /**S
   * Returns a new ComplexNumber that is the
   * difference of this  and z
   * Note: the  original ComplexNumber is
   * NOT modified.

   */
  public ComplexNumber subtract(ComplexNumber z) {
      return new ComplexNumber((real-z.real), (imaginary-z.imaginary));  //A stub: to be fixed
  }
  /**
   * Returns a new ComplexNumber that is the
   * product of this and z.
   * Note: the original ComplexNumber is
   * NOT modified.

   */
  public ComplexNumber multiply(ComplexNumber z) {
      return new ComplexNumber((real*z.real - imaginary*z.imaginary), (imaginary*z.real + real*z.imaginary));  //A stub: to be fixed
  }
  /**
   * Returns a new ComplexNumber that is
   * the reciprocal of this.
   * Note: the original ComplexNumber is
   * NOT modified.
   * @return 1.0 / this
   */
  public ComplexNumber reciprocal() {
      return new ComplexNumber((real/(real*real + imaginary*imaginary)),(-imaginary/(real*real + imaginary*imaginary)));  //A stub: to be fixed
  }
  /**
   * Returns a new ComplexNumber that is
   * <this divided by z.
   * Note: the original ComplexNumber is
   * NOT modified.
   * @param z
   * @return this / z
   */
  public ComplexNumber divide(ComplexNumber z) {
      
      double x = z.real;
      double y = z.imaginary;
      
     ComplexNumber divided = new ComplexNumber(
              ((real*x + imaginary*y)/(x*x + y*y)),
              ((imaginary*x - real*y)/(x*x + y*y)));
      
      return divided;  //A stub: to be fixed
  }
  /**
   * Returns a String representation of
   * <em>this</em> in the format:
   * <pre>
   * real +-(optional) i imaginary
   * </pre>
   * If the imaginary part is zero, only the
   * real part is converted to a String.
   * A "+" or "-" is placed between the real
   *    * and imaginary parts depending on the
   * the sign of the imaginary part.
   * 
   * Examples:
   * 
   * // println(new ComplexNumber(0,0); - "0.0"
   *   //println(new ComplexNumber(1,1); - "1.0 + i1.0"
   *  //println(new ComplexNumber(1,-1); - "1.0 - i1.0"
   * 
   * @return the String representation.
   */
  @Override
  public String toString() {
      //DO NOT MODIFY THIS CODE!
      String str = "" + this.getReal();
      if (this.getImaginary() == 0.0) {
          return str;
      }
      if (this.getImaginary() > 0) {
          return str + " + i" + this.getImaginary();
      } else {
          return str + " - i" + -this.getImaginary();
      }
  }
}