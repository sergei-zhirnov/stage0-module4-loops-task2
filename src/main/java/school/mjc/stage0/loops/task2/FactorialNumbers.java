package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int i = 1;
        int result = 1;
        System.out.println(result);
        while (i <= printToInclusive) {
            result *= i;
            System.out.println(result);
            i++;
        }

    }

    public static void main(String[] args) {
        printFactorialRow(0);
    }
}
