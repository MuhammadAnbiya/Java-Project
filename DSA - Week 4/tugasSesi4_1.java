import javax.swing.*;

public class tugasSesi4_1 {
    public static void main(String[] args) {
//        1. Mengetahui bahwa sebuah kata termasuk palindrome atau bukan.
        String kata;
        String jawab = "y";


        do {
            // Tipe Data
            String keterangan = "Palindrome";
            // Input Kata
            kata = JOptionPane.showInputDialog("Masukan kata yang ingin di cek : ");
            kata = kata.toLowerCase();

            // Pengecekan Palindrome
            for (int i = 0; i < kata.length(); i++) {
                char hurufMaju = kata.charAt(i);
                char hurufMundur = kata.charAt((kata.length() -1) - i);

                if (hurufMaju != hurufMundur) {
                    keterangan = "Bukan Palindrome";
                    break;
                }
            }
            JOptionPane.showMessageDialog(null,kata + " adalah " + keterangan);
            jawab = JOptionPane.showInputDialog("Apakah anda ingin mencobanya lagi ? Y/N");
            jawab = jawab.toLowerCase();
        }while(jawab.equals("y"));
    }
}
