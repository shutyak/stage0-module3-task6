package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int rounded=Math.round( numberToBeRounded);
        System.out.println(rounded);
    }

    public static void main(String[] args) {
        new FloatTypeCasting().roundNumber(3.7f);
    }
}
