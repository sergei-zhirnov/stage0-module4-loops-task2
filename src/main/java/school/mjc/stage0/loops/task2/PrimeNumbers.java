package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive) {
            int j = 2;
            int counter = 0;
            while (j < i) {
                if (i % j == 0) {
                    counter++;
                }
                j++;
            }

            switch (counter) {
                case (0):
                    System.out.println(i);
                    break;
                default:
                    break;
            }

            i++;
        }

    }

    public static void main(String[] args) {
        printPrimeNumbers(33);
    }
}
