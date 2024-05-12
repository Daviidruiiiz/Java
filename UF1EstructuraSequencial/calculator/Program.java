/*
 * 
 * Program.java
 * 
 * Ask two values and calculate add, subtract, multiply, divide
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

   /**
    * calculate add, subtract, multiply, divide
    * 
    * @param a firstValue
    * @param b secondValue
    * 
    */
    public double add(double firstValue, double secondValue) {
        // Variable declaration
        double answerSum =firstValue + secondValue;
        
        return answerSum;

    }
    public double subtract(double firstValue, double secondValue) {
        // Variable declaration
        double answerRes =firstValue - secondValue;
        
        return answerRes;

    }
    public double multiply(double firstValue, double secondValue) {
        // Variable declaration
        double answerMul =firstValue * secondValue;
        
        return answerMul;

    }
    public double divide(double firstValue, double secondValue) {
        // Variable declaration
        double answerDiv =firstValue / secondValue;
        
        return answerDiv;

    }
}