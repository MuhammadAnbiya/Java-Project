import javax.swing.*;

public class tugasSesi3_3 {
    public static void main(String[] args) {
//    3. Buatlah program untuk melakukan pengecekan sebuah nomor punggung dapat berfungsi sebagai posisi apa saja
        String jawab = "y";


        do {
        int nomorPunggung;
        String posisiSatu = "-";
        String posisiDua = "-";
        String posisiTiga = "-";
            // Input Nomber Punggung
            nomorPunggung = Integer.parseInt(JOptionPane.showInputDialog("Masukan nomor punggung : "));

            // Pengecekan Posisi
            if (nomorPunggung % 2 == 0){
                posisiSatu = "target attacker";
                if (nomorPunggung >= 50 && nomorPunggung <=100){
                    posisiDua = "berhak dipilih menjadi capten team";
                }
            }
            else if (nomorPunggung % 2 == 1) {
                posisiSatu = "defender";
                if (nomorPunggung > 90) {
                    posisiDua = "Playmaker";
                    if (nomorPunggung % 3 == 0 && nomorPunggung % 5 == 0) {
                        posisiTiga = "keeper";
                    }
                }else if (nomorPunggung % 3 == 0 && nomorPunggung % 5 == 0){
                    posisiDua = "keeper";
                }
            }
            JOptionPane.showMessageDialog(null,"Angka " + nomorPunggung + " bisa berfungsi sebagai posisi :\n" +
                    "Posisi satu : " + posisiSatu + "\n" +
                    "Posisi dua  : " + posisiDua + "\n" +
                    "Posisi tiga : " + posisiTiga);
            jawab = JOptionPane.showInputDialog("Apakah anda ingin mencoba lagi ? : Y/N");
            jawab = jawab.toLowerCase();
        } while(jawab.equals("y"));
    }
}