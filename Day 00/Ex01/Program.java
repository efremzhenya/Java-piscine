package com.company;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        if (number <= 1) {
            System.err.print("Illegal Argument");
            System.exit(-1);
        }
        else
        {
            Integer root = findRoot(number);
            Integer current = 2;
            Boolean isPrime = true;
            while (current <= root && isPrime)
            {
                if (number % current == 0 && number != current)
                {
                    isPrime = false;
                }
                current++;
            }
            System.out.print(isPrime);
            System.out.print(' ');
            System.out.print(current - 2);
        }
    }
    public static Integer findRoot(Integer number)
    {
        int i = 1;
        int maxLimit = 46340;
        while (i * i < number && i < maxLimit)
        {
            i++;
        }
        return i;
    }
}
