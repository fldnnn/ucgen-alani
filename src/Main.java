import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        int u;
        int alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        kenar3 = input.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alanı = " + alan);

    }
}
