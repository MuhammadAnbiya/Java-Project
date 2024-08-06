import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class tugasSesi3_5 {
    public static void main(String[] args) {
//        5. Tampilkan tarif harga sesuai umur dan tinggi seorang anak.
        String jawab = "y";


        do {
            int umur,tinggi, harga = 0;
            String keterangan = "";
            // Input Data
            umur = Integer.parseInt(showInputDialog("Masukan umur anda : (Dalam Tahun) "));

            // Pengecekan
            if (umur <= 1) {
                keterangan = "Dilarang masuk!";
                JOptionPane.showMessageDialog(null, "Dilarang masuk!");
                continue;
            }else {
                tinggi = Integer.parseInt(showInputDialog("Masukan tinggi badan anda : (Dalam Cm) "));
                if (umur <= 3) {
                    harga = 30_000;
                    if ((umur > 1 && umur < 4) && (tinggi > 70)) {
                        harga += 10_000;
                    }
                } else if (umur <= 7) {
                    harga = 40_000;
                    if ((umur > 3 && umur < 8) && (tinggi > 120)) {
                        harga += 15_000;
                    }
                } else if (umur <= 10) {
                    harga = 50_000;
                    if ((umur > 7 && umur < 11) && (tinggi > 150)) {
                        harga += 20_000;
                    }
                } else {
                    harga = 80_000;
                }
            }
              // Output Hasil
                JOptionPane.showMessageDialog(null, "Umur anak : " + umur+ "\n" +
                                                                            "Tinggi anak : " + tinggi + "\n" +
                                                                            "Tarik harga untuk bermain di wahana disney land : " + harga);
              // Perulangan Program
            jawab = JOptionPane.showInputDialog("Apakah anda ingin mencoba lagi ? Y/N : ");
            jawab = jawab.toLowerCase();
             }while(jawab.equals("y"));
        }
    }


