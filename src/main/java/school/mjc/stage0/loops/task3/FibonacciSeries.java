package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstFibonacci = 1;
        int secondFibonacci = 0;
        int res = 0;
        System.out.println(res);

        for(int i = 0; i < lastFibonacci - 1; i++){

            res = firstFibonacci + secondFibonacci;
            System.out.println(res);

            firstFibonacci = secondFibonacci;
            secondFibonacci = res;
        }
    }
}
