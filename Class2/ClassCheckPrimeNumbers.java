/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class2;

import java.util.Scanner;

/**
 *
 * @author Taimoo
 */
public class ClassCheckPrimeNumbers {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, flag = 0;
        int flagA = 0;
        int flagB = 0;
        int flagC = 0;
        int input;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter Number" + " " + i + " : ");
            input = scan.nextInt();
            if (input > 0 && input > 1) {
                switch (i) {
                    case 1:
                        a = input;
                        for (int j = 0; j <= a / 2; j++) {
                            if (a % 2 == 0) {
                                flagA = 1;
                                break;
                            } else {
                                flagA = 0;
                            }
                        }
                    case 2:
                        b = input;
                        for (int k = 0; k <= b / 2; k++) {
                            if (b % 2 == 0) {
                                flagB = 1;
                                break;
                            } else {
                                flagB = 0;
                            }
                        }
                    case 3:
                        c = input;
                        for (int l = 0; l <= c / 2; l++) {
                            if (c % 2 == 0) {
                                flagC = 1;
                                break;
                            } else {
                                flagC = 0;
                            }
                        }
                }
                flag = 0;

            } else {
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("*************************************************************** Checking Prime Numbers ***************************************************************");
            System.out.println("Value Of First Number Was :" + " " + a + " " + (flagA == 0 ? "Which Is A Prime Number" : " Which Is Not A Prime Number"));
            System.out.println("Value Of Second Number Was :" + " " + b + " " + (flagB == 0 ? "Which Is A Prime Number" : " Which Is Not A Prime Number"));
            System.out.println("Value Of Third Number Was :" + " " + c + " " + (flagC == 0 ? "Which Is A Prime Number" : " Which Is Not A Prime Number"));
            System.out.println("                                                                                                                                                         ");
            System.out.println("*************************************************************** Ascending Order Of Number ***************************************************************");
            // Ascending order 
            if ((a < b) && (b < c)) {
                System.out.println("Ascending Order OF Numbers : " + a + "," + b + "," + c);
            }
            if ((a < b) && (b > c)) {
                System.out.println("Ascending Order OF Numbers : " + a + "," + c + "," + b);
            }
            if ((a > b) && (b > c)) {
                System.out.println("Ascending Order OF Numbers : " + c + "," + b + "," + a);
            }
            if ((a > b) && (b < c)) {
                System.out.println("Ascending Order OF Numbers : " + b + "," + a + "," + c);
            }
            if ((a == b) && (b == c)) {
                System.out.println("Ascending Order OF Numbers : " + b + "," + a + "," + c);
            }

            // Desceding Order 
            System.out.println("                                                                                                                                                         ");
            System.out.println("*************************************************************** Descending Order Of Number ***************************************************************");
            if ((a > b) && (b > c)) {
                System.out.println("Descending Order Of Numbers :" + a + "," + b + "," + c);
            }
            if ((a > b) && (b < c)) {
                System.out.println("Descending Order Of Numbers :" + a + "," + c + "," + b);
            }

            if ((a < b) && (b < c)) {
                System.out.println("Descending Order Of Numbers :" + c + "," + b + "," + a);
            }
            if ((a < b) && (b > c)) {
                System.out.println("Descending Order Of Numbers :" + b + "," + c + "," + a);
            }
            if ((a == b) && (b == c)) {
                System.out.println("Inputs Are Same Descending Order Of Numbers :" + a + "," + b + "," + c);
            }
        } else {
            System.out.println("Number Should Be Greater Than 0 & 1 To Check Prime Numbers");

        }

    }

}
