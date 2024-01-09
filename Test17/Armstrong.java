public class Armstrong {
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;
        for (; originalNum != 0; originalNum /= 10) {
            n++;
        }
        originalNum = num;
        for (; originalNum != 0; originalNum /= 10) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }
        return result == num;
    }

    public static void main(String[] args) {
        int start = 100;
        int end = 999;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
