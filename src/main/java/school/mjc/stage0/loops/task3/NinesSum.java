package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int sum = 0;
        int lastNine = 1;
        int nine = 0;

        for(int i = 0; i < lengthOfLastNumber; i++){
            nine += 9 * lastNine;
            sum += nine;
            lastNine *= 10;
        }

        System.out.println(sum);
    }
}
