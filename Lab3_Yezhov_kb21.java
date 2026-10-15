import java.util.Scanner;

public class Lab3_Yezhov_kb21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String s = sc.nextLine();

        System.out.print("int: ");
        int i = Integer.parseInt(sc.nextLine());

        System.out.print("double: ");
        double d = Double.parseDouble(sc.nextLine());

        System.out.print("boolean: ");
        boolean b = Boolean.parseBoolean(sc.nextLine());

        System.out.println("\n--- РЕЗУЛЬТАТ ---");

        System.out.println("1: " + s + " | " + i + " | " + d + " | " + b);

        System.out.printf("2: Базовий: %s, %d, %f, %b\n", s, i, d, b);
        System.out.printf("3: Округлення: %.2f\n", d);
        System.out.printf("4: Знак числа: %+d\n", i);
        System.out.printf("5: Відступ праворуч: |%15s|\n", s);
        System.out.printf("6: Відступ ліворуч: |%-15s|\n", s);
        System.out.printf("7: Нулі попереду: %08d\n", i);

        System.out.println(String.format("8: ВЕЛИКІ ЛІТЕРИ: %S, %B", s, b));
        System.out.println(String.format("9: Зворотній порядок: %4$b, %3$.1f, %2$d, %1$s", s, i, d, b));
        System.out.println(String.format("10: Підсумок: Дані [%s], Число [%d]", s, i));

        sc.close();
    }
}