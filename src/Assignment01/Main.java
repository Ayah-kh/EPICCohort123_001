package Assignment01;

public class Main {
    public static void main(String[] args) {

        //Write code to get the sum of even numbers from 0 to 100
        int sumEvenFor = 0;
        for (int i = 0; i <= 100; i += 2) {
            sumEvenFor += i;
        }
        System.out.println("Sum for Even numbers using for loop = " + sumEvenFor);

        int sumEvenWhile = 0;
        int k = 0;
        while (k <= 100) {
            sumEvenWhile += k;
            k += 2;
        }
        System.out.println("Sum for Even numbers using while loop = " + sumEvenWhile);


        int sumEvenDoWhile = 0;
        int j = 0;
        do {
            sumEvenDoWhile += j;
            j += 2;
        } while (j <= 100);
        System.out.println("Sum for Even numbers using do-while loop = " + sumEvenDoWhile);

        System.out.println("=========================================");


        //Write code to get the sum of numbers that is dividable by 7 from 0 to 100
        int sumOddFor = 0;
        for (int i = 1; i <= 100; i += 2) {
            sumOddFor += i;
        }
        System.out.println("Sum for Odd numbers using for loop = " + sumOddFor);

        int sumOddWhile = 0;
        int m = 1;
        while (m <= 100) {
            sumOddWhile += m;
            m += 2;
        }
        System.out.println("Sum for Odd numbers using while loop = " + sumOddWhile);


        int sumOddDoWhile = 0;
        int n = 1;
        do {
            sumOddDoWhile += n;
            n += 2;
        } while (n <= 100);
        System.out.println("Sum for Odd numbers using do-while loop = " + sumOddDoWhile);

        System.out.println("=========================================");

        //Write code to get the sum of even numbers from 0 to 100
        int sumBy7For = 0;
        for (int i = 0; i <= 100; i += 7) {
            sumBy7For += i;
        }
        System.out.println("Sum for numbers that is dividable by 7 using for loop = " + sumBy7For);

        int sumBy7While = 0;
        int q = 0;
        while (q <= 100) {
            sumBy7While += q;
            q += 7;
        }
        System.out.println("Sum for numbers that is dividable by 7 using while loop = " + sumBy7While);


        int sumBy7DoWhile = 0;
        int s = 0;
        do {
            sumBy7DoWhile += s;
            s += 7;
        } while (s <= 100);
        System.out.println("Sum for numbers that is dividable by 7 using do-while loop = " + sumBy7DoWhile);

    }
}