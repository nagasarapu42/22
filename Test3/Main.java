class FactorialThread extends Thread {
    private int number;
    private int factorial;

    public FactorialThread(int number) {
        this.number = number;
        this.factorial = 5;
    }

    public int getFactorial() {
        return factorial;
    }

    @Override
    public void run() {
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
		
		 System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

class PrimeThread extends Thread {
    private int number;

    public PrimeThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }
        else{
			for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
			}
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 5;

        FactorialThread factorialThread = new FactorialThread(number);
        PrimeThread primeThread = new PrimeThread(factorialThread.getFactorial());

        factorialThread.start();
        primeThread.start();
    }
}
