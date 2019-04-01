package sortingnumbers;

import java.util.Scanner;

public class SortingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int reserve, a, b, c;

        // Sorts numbers from largest to smallest.
        System.out.print("Enter 3 integers :\t");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a < b) {

            reserve = b;
            b = a;
            a = reserve;

        }
        if (a < c) {

            reserve = c;
            c = b;
            b = a;
            a = reserve;

        }
        if (b < c) {

            reserve = c;
            c = b;
            b = reserve;

        }

        System.out.printf("Largest to smallest:"
                + "\n%d\t%d\t%d\n\n\n", a, b, c);

        //Sorts numbers from smallest to largest.
        /*   Method 1:
        
         System.out.printf("Smallest to largest:"
         + "\n%d\t%d\t%d\n\n\n", c, b, a);
        
         */
        //Method 2:
        if (a > b) {

            reserve = a;
            a = b;
            b = reserve;

        }
        if (a > c) {

            reserve = a;
            a = c;
            c = reserve;

        }
        if (b > c) {

            reserve = b;
            b = c;
            c = reserve;

        }

        System.out.printf("Smallest to largest:"
                + "\n%d\t%d\t%d\n\n\n", a, b, c);

    }

}
