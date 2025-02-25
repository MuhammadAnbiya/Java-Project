import javax.swing.*;

public class tugasSesi4_2 {
    public static void main(String[] args) {
        // 2. Mencari angka palindrome terdekat selanjutnya dari sebuah input.
        String jawab = "y";


        do {
            String angka1;
            boolean keterangan = true;
            int rubahAngka = 0;

            // Input Angka
            angka1 = JOptionPane.showInputDialog("Masukan angka : ");
            rubahAngka = Integer.parseInt(angka1);

            do {
                keterangan = true;
                rubahAngka++;
                String angka2 = String.valueOf(rubahAngka);

                // Pengecekan Palindrome
                for (int i = 0; i < angka2.length(); i++) {
                    char hurufMaju = angka2.charAt(i);
                    char hurufMundur = angka2.charAt(angka2.length() - 1 - i);

                    if (hurufMaju != hurufMundur) {
                        keterangan = false;
                        break;
                    }
                }
            } while (keterangan == false);
            JOptionPane.showMessageDialog(null, "Angka Palindrome setelah angka "
                    + angka1 + " adalah " + rubahAngka);
            jawab = JOptionPane.showInputDialog("Apakah anda ingin mencoba lagi : Y/N");
            jawab = jawab.toLowerCase();
        } while (jawab.equals("y"));
    }
}


