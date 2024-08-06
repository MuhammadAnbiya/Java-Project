import java.util.Scanner;

public class HillCipherAnbi {
    static int a, b, c, d;
    static String abjad = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    static String keputusan;

    static String addSpaces(String kalimat) {
        if (kalimat.length() % 2 == 1) {
            kalimat += " ";
        }
        return kalimat;
    }

    static int[] hurufToAngka(String kalimat) {
        int result[] = new int[kalimat.length()];
        for (int i = 0; i < kalimat.length(); i++) {
            for (int j = 0; j < abjad.length(); j++) {
                if (kalimat.charAt(i) == abjad.charAt(j)) {
                    result[i] = j;
                }
            }
        }
        return result;
    }

    static boolean isDeterminanOne(int a, int b, int c, int d) {
        int det = (a * d) - (b * c);
        return det == 1;
    }

    static void inverseMatriks() {
        int t = d;
        d = a;
        a = t;
        b = 27-b;
        c = 27-c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("       Pilih Mana Yang Ingin Anda Kerjakan : " + "\n" +
                "\t" + "   1 . Enskripsi" + "\n" +
                "\t" + "   2 . Dekripsi" + "\n" +
                "\t" + "Masukan Keputusa Berupa Angka : ");
        keputusan = sc.nextLine();
        System.out.println("=================================================");

        System.out.print("Input Matriks A :");
        a = sc.nextInt();
        System.out.print("Input Matriks B :");
        b = sc.nextInt();
        System.out.print("Input Matriks C :");
        c = sc.nextInt();
        System.out.print("Input Matriks D :");
        d = sc.nextInt();
        System.out.print("Isikan Kalimat :");
        String kalimat = sc.next();
        sc.close();

        if (isDeterminanOne(a, b, c, d)) {
            if (keputusan.equals("1")) {
                kalimat = addSpaces(kalimat);
                int data[] = hurufToAngka(kalimat);
                int result[] = new int[data.length];
                for (int i = 0; i < data.length; i = i + 2) {
                    int b1k1 = (data[i] * a) + (data[i + 1] * c);
                    int b1k2 = (data[i] * b) + (data[i + 1] * d);
                    result[i] = b1k1 % 27;
                    result[i + 1] = b1k2 % 27;
                }

                for (int i = 0; i < result.length; i++) {
                    System.out.print(abjad.charAt(result[i]) + " ");
                }
            } else if (keputusan.equals("2")) {
                inverseMatriks();
                kalimat = addSpaces(kalimat);
                int data[] = hurufToAngka(kalimat);
                int result[] = new int[data.length];

                for (int i = 0; i < data.length; i = i + 2) {
                    int b1k1 = (data[i] * a) + (data[i + 1] * c);
                    int b1k2 = (data[i] * b) + (data[i + 1] * d);
                    result[i] = b1k1 % 27;
                    result[i + 1] = b1k2 % 27;
                }

                for (int i = 0; i < result.length; i++) {
                    System.out.print(abjad.charAt(result[i]) + " ");
                }
            }
        } else {
            System.out.println("Matriks Determinan harus = 1");
        }
    }
}
