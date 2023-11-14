package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i = 0;
        while (i <= printTillInclusive) {
            switch (i % 2) {
                case (0):
                    System.out.println(i);
                    break;
                default:
                    break;
            }
            i++;
        }
    }
}
