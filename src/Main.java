public class Main {
    public static void main(String[] args) {
        //Write code to get the sum of even numbers from 0 to 100
       int sumEvenFor=0;
        for (int i = 0; i <= 100; i+=2) {
         sumEvenFor+=i;
        }
        System.out.println("Sum for Even numbers using for loop = "
                + sumEvenFor);

        int sumEvenWhile=0;
        int k=0;
        while (k<=100){
            sumEvenWhile+=k;
            k+=2;
        }
        System.out.println("Sum for Even numbers using while loop = "
                + sumEvenWhile);


        int sumEvenDoWhile=0;
        int j=0;
        do{
            sumEvenDoWhile+=j;
            j+=2;
        }while (j<=100);
        System.out.println("Sum for Even numbers using do-while loop = "
                + sumEvenDoWhile);

        System.out.println("=========================================");


        //Write code to get the sum of odd numbers from 0 to 100
        int oddEvenFor=0;
        for (int i = 1; i <= 100; i+=2) {
            oddEvenFor+=i;
        }
        System.out.println("Sum for Odd numbers using for loop = "
                + oddEvenFor);

        int oddEvenWhile=0;
        int m=1;
        while (m<=100){
            oddEvenWhile+=m;
            m+=2;
        }
        System.out.println("Sum for Odd numbers using while loop = "
                + oddEvenWhile);


        int oddEvenDoWhile=0;
        int n=1;
        do{
            oddEvenDoWhile+=n;
            n+=2;
        }while (n<=100);
        System.out.println("Sum for Odd numbers using do-while loop = "
                + oddEvenDoWhile);

        System.out.println("=========================================");

    }
}