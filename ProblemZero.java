public class ProblemZero {
    public static void main(String[] args) {
        long sumOdd = 0;
        long power = 0;
        for (int i = 1; i <= 117000; i++) {
            power = (long) Math.pow(i, 2);
            if (power % 2 != 0) {
                sumOdd += power;
            }
        }
        System.out.println(sumOdd);
    }    
}
