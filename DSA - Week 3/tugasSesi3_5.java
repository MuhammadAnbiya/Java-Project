import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class tugasSesi3_5 {
    public static void main(String[] args) {
        String jawab = "y";

        do {
            int umur, tinggi = 0, harga = 0;
            String keterangan = "";
            
            // Input Data
            umur = Integer.parseInt(showInputDialog("Masukkan umur Anda: (Dalam Tahun)"));

            // Pengecekan
            if (umur <= 1) {
                keterangan = "Dilarang masuk!";
                JOptionPane.showMessageDialog(null, keterangan);
                continue;
            } else {
                tinggi = Integer.parseInt(showInputDialog("Masukkan tinggi badan Anda: (Dalam Cm)"));
                if (umur <= 3) {
                    harga = 30000;
                    if (tinggi > 70) {
                        harga += 10000;
                    }
                } else if (umur <= 7) {
                    harga = 40000;
                    if (tinggi > 120) {
                        harga += 15000;
                    }
                } else if (umur <= 10) {
                    harga = 50000;
                    if (tinggi > 150) {
                        harga += 20000;
                    }
                } else {
                    harga = 80000;
                }
            }
            
            // Output Hasil
            JOptionPane.showMessageDialog(null, "Umur anak: " + umur + "\n" +
                                                "Tinggi anak: " + tinggi + "\n" +
                                                "Tarif harga untuk bermain di wahana Disney Land: " + harga);
            
            // Perulangan Program
            jawab = JOptionPane.showInputDialog("Apakah Anda ingin mencoba lagi? Y/N: ");
            jawab = jawab.toLowerCase();
        } while (jawab.equals("y"));
    }
}
