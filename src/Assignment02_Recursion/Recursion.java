package Assignment02_Recursion;

public class Recursion {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println("Sum for numbers form 0 to 100 = " + sum);
        int sum2 = sum2(50, 100);
        System.out.println("Sum for numbers form 50 to 100 = " + sum2);
        int sumEven = sumEven(100);
        System.out.println("Sum for even numbers form 0 to 100 = " + sumEven);
        int sumOdd = sumOdd(100);
        System.out.println("Sum for odd numbers form 0 to 100 = " + sumOdd);
        int sumBy7 = sumBy7(100);
        System.out.println("Sum for numbers dividable by 7 form 0 to 100 = " + sumBy7);


    }

    public static int sum(int k) {
        return k > 0 ? k + sum(k - 1) : 0;

    }

    public static int sum2(int start, int end) {
        return end > start ? end + sum2(start, end - 1) : start;
    }

    public static int sumEven(int k) {
        if (k % 2 != 0)
            k -= 1;
        return k > 0 ? k + sumEven(k - 2) : 0;
    }

    public static int sumOdd(int k) {
        if (k % 2 == 0)
            k -= 1;
        return k > 0 ? k + sumOdd(k - 2) : 0;
    }

    public static int sumBy7(int k) {
        if (k % 7 != 0)
            k -= k % 7;
        return k > 0 ? k + sumBy7(k - 7) : 0;
    }


}
