package school.mjc.stage0.loops.task2;
import java.lang.Math;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        while ((i <= Math.abs(multiplyByAndToInclusive)) && multiplyByAndToInclusive != 0) {
            System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
    }
}
