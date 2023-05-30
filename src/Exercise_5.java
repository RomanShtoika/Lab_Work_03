import java.util.Scanner;
public class Exercise_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Зчитування границь проміжку та кроку
            System.out.print("Введіть початкову границю проміжку: ");
            double start = scanner.nextDouble();
            System.out.print("Введіть кінцеву границю проміжку: ");
            double end = scanner.nextDouble();
            System.out.print("Введіть крок: ");
            double step = scanner.nextDouble();

            System.out.println("За допомогою оператора while:");

            int countWhile = 0;
            double xWhile = start;
            while (xWhile <= end) {
                double result = 0.25 * Math.pow(xWhile, 3) + xWhile - 1.2502;
                System.out.println("f(" + xWhile + ") = " + result);
                if (result >= -0.5 && result <= 0.5) {
                    countWhile++;
                }
                xWhile += step;
            }

            System.out.println("Кількість значень функції, що знаходяться в діапазоні [-0.5, 0.5]: " + countWhile);
            System.out.println();

            System.out.println("За допомогою оператора for:");

            int countFor = 0;
            for (double xFor = start; xFor <= end; xFor += step) {
                double result = 0.25 * Math.pow(xFor, 3) + xFor - 1.2502;
                System.out.println("f(" + xFor + ") = " + result);
                if (result >= -0.5 && result <= 0.5) {
                    countFor++;
                }
            }

            System.out.println("Кількість значень функції, що знаходяться в діапазоні [-0.5, 0.5]: " + countFor);
        }
    }


