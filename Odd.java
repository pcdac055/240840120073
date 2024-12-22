public class Odd {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        System.out.println("First 100 odd numbers:");
        while (count < 100) {
            System.out.print(number + " ");
            number += 2;
            count++;

            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
