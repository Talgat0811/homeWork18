import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television(2);
        System.out.printf("%s%n%s%n%s%n%s%n", "Переключить на следуюший канал (1)",
                "Переключить на предедущий канал (2)",
                "Переключить  канал по номеру (3)", "Выход(4)");
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.print("Ввыберите действие:");
            int action = scn.nextInt();
            switch (action) {
                case 1:
                    tv.nextChannnel();
                    break;
                case 2:
                    tv.pervChannnel();
                    break;
                case 3:
                    tv.choiseNumChannnel();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong data!!!");
                    break;
            }
        }
    }
}