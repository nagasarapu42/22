class ArmstrongNumber{


public static void main(String args[]) {
        int start = 100, end = 200;

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
//is armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
    
}
}