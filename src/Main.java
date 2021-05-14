import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int enominator = 20;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите стоимость билета рублях: ");
        int amount = in.nextInt();
        in.close();
        int bonusMiles = amount / enominator; // Рассчет бонусных миль
        System.out.println("Ваш бонус в милях равен: " + bonusMiles);
    }
}
