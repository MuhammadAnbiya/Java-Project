import javax.swing.*;

public class tugasSesi3_1 {
    public static void main(String[] args) {
//        1. Conan ingin mencari anggota sindikat mafia dari Sicilia.
            String jawab = "y";


        do {
            String nama, tempatTinggal;
            String pangkat = "Warga Biasa";
            int umur, uangTabunganDalamDollar;
            // Input Data
            nama = JOptionPane.showInputDialog("Masukan nama anda : ");
            umur = Integer.parseInt(JOptionPane.showInputDialog("Masukan umur anda : "));
            tempatTinggal = JOptionPane.showInputDialog("Dimana tempat anda tinggal : \n1. Nevada\n2. New York\n3. Havana" +
                    "\n3. New Jersey\n4. Manhattan\n5. California\n6. Detroit\n7. Boston\n8. Lainnya ");
            tempatTinggal = tempatTinggal.toLowerCase();
            uangTabunganDalamDollar = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah uang anda (Dalam Dolar) : "));

                // Uji Coba DON
            if ((umur > 40) && (uangTabunganDalamDollar > 10_000_000) &&
                    (tempatTinggal.equals("nevada") || tempatTinggal.equals("new york") || tempatTinggal.equals("havana"))) {
                pangkat = "Don";

                // Uji Coba Underbooss
            } else if ((umur >= 25 && umur <= 40) && (uangTabunganDalamDollar >= 1_000_000 && uangTabunganDalamDollar <= 2_000_000) &&
                    (tempatTinggal.equals("new jersey") || tempatTinggal.equals("manhattan") || tempatTinggal.equals("nevada"))) {
                pangkat = "Underboss";

                // Uji Coba Capo
            } else if ((umur >= 18 && umur <= 24) && (uangTabunganDalamDollar < 1_000_000) &&
                    (tempatTinggal.equals("california") || tempatTinggal.equals("detroit") || tempatTinggal.equals("boston"))) {
                pangkat = "Capo";

            } // Hasil Keputusan
            if (pangkat.equals("Don") || pangkat.equals("Underboss") || pangkat.equals("Capo")) {
                JOptionPane.showMessageDialog(null, nama +
                        " Kemungkinan adalah seorang anggota mafia dengan pangkat " + pangkat);
            } else {
                JOptionPane.showMessageDialog(null, nama + " tidak Mencurigakan");

            } // Perulangan Program
            jawab = JOptionPane.showInputDialog("Apakah anda ingin mencoba lagi ? : Y/N");
            jawab = jawab.toLowerCase();
        } while (jawab.equals("y")) ;
    }
}