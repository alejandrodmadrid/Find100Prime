public class HundredthPrime {
    public static void main(String[] args) {
            {
                int number = 1;
                int position = 1;

                while (position <= 100) {
                    for (int divisor = 2; divisor <= number; divisor++) {
                        if (divisor == number) {
                            System.out.println(number + " Is a prime number and it's position is " + position);
                            position++;
                            continue;
                        }
                        if (number % divisor == 0) {
                            System.out.println(number + " Is not a prime number.");
                            break;
                        }
                    }
                    number++;
                }
                System.out.print(number-1 + " is the 100th Prime!");
            }
        }
    }
