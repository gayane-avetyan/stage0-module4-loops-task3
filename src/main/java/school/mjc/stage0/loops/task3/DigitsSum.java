package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        int length = (t + "").length();
        int res = 0;
        t = t < 0 ? t * (-1) : t;

        for(int i = 0; i < length; i++){

            int last = t % 10;
            t /= 10;
            res += last;
        }

        System.out.println(res);
    }
}
