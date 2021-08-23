import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = 0, primeCount = 0;
        while (number != 42) {
            number = scanner.nextInt();
            Integer sum = findSum(number);
            if (sum < 2)
            {
                continue;
            }
            primeCount += isPrime(sum) ? 1 : 0;
        }
        System.out.print("Count of coffee-request – ");
        System.out.print(primeCount);
    }

    private static Boolean isPrime(Integer number)
    {
        Integer root = findRoot(number);
        Integer current = 2;
        while (current <= root) {
            if (number % current == 0 && number != current) {
                return false;
            }
            current++;
        }
        return true;
    }

    private static Integer findSum(Integer number)
    {
        Integer sum = 0;
        while (number > 0)
        {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    private static Integer findRoot(Integer number)
    {
        int i = 1;
        int maxLimit = 46340;
        while (i * i < number && i < maxLimit) {
            i++;
        }
        return i;
    }
}
