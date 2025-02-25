import java.util.Scanner;

public class StringInteger {
    public static void main(String[] args) {
        StringBuilder huruf = new StringBuilder();
        StringBuilder angka = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Text : ");
        String text = sc.nextLine();
        sc.close();

        for (char x : text.toCharArray()) {
            if (Character.isDigit(x)) {
                angka.append(x);
            } else {
                huruf.append(x);
            }
        }
        System.out.println(huruf);
        System.out.println(angka);
    }
}
