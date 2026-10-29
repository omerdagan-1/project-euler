public class ProblemOne {
    public static void main(String[] args) {
        int sumMult = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumMult += i;
            }
        }
        System.out.println(sumMult);
    }   
}
