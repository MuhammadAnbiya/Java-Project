import java.util.Scanner;

public class IF23Else {
    public static void main(String[] args) {

        String jawab = "y";
        do {
            @SuppressWarnings("unused")
            boolean adaAcara = true;
            Scanner sc = new Scanner(System.in);
            System.out.print("Apakah daniel ikut : ");
            String danilIkut = sc.next();
            sc.close();

            if (danilIkut.equals("ya")) {
                System.out.println("daniel wajib ikut");
            } else if (danilIkut.equals("ngga")) {
                System.out.println("daniel tetap harus ikut");
                System.out.println("anbiya insyaallah ikut");
            }
            System.out.println("Apakah anda ingin mencoba lagi ? : Y/N");
            jawab = sc.next();
            jawab = jawab.toLowerCase();
        } while (jawab.equals("y"));
    }
}
