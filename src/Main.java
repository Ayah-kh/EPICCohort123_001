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
        int i=0;
        while (i<=100){
            sumEvenWhile+=i;
            i+=2;
        }
        System.out.println("Sum for Even numbers using while loop = "
                + sumEvenWhile);
    }
}