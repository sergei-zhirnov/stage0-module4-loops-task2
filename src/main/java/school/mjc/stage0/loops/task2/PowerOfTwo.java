package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int i = 0;
            while (i <= power) {
                double doubleResult = Math.pow(2,i);
                int intResult = (int) doubleResult;
                System.out.println(intResult);
                i++;
            }
        }

    }

    public static void main(String[] args) {
        printPower(4);
    }
}
