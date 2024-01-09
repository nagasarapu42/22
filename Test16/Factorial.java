class Factorial{

    public static int factorial(int n) {
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }
    
    public static void main(String[] args) {
        int num = 6;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

}