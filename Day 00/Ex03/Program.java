import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        Integer week = 0;
        long result = 0;
        while (!inputStr.equals("42")) {
            week++;
            if (!inputStr.equals("Week " + week) || week > 18)
                exitWithIllegalArgument();
            Integer currentMinGrade = 9;
            for (Integer j = 0; j < 5; j++) {
                Integer inputGrade = sc.nextInt();
                if (inputGrade < 1 || inputGrade > 9)
                    exitWithIllegalArgument();
                if (inputGrade < currentMinGrade)
                    currentMinGrade = inputGrade;
            }
            sc.nextLine();
            result = week == 1 ? currentMinGrade : result * 10 + currentMinGrade;
            inputStr = sc.nextLine();
        }
        for (Integer k = 0; k < week; k++) {
            System.out.print("Week ");
            System.out.print(k + 1);
            System.out.print(' ');
            long del = 1;
            for (Integer b = 1; b < week - k; b++)
                del *= 10;
            long grade = result / del;
            result %= del;
            for (long l = 0; l < grade; l++)
                System.out.print('=');
            System.out.print(">\n");
        }
    }

    private static void exitWithIllegalArgument() {
        System.err.println("IllegalArgument");
        System.exit(-1);
    }
}
