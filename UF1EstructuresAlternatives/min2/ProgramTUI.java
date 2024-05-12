/*
 * 
 * ProgramTUI.java
 * 
 * Gets the minimum number between two real numbers
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
import java.util.Scanner;

public class ProgramTUI {

    /**
     * Gets the minimum number between two real numbers
     *
     * @param num1 The first number
     * @param num2 The second number
     *
     * @return the minimum number
     */
    public static int min2(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num = s.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();

        int result = min2(num, num2);

        System.out.println("The minimum between " + num + " and " + num2 + " is " + result);
    }
}
