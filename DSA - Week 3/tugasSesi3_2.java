import javax.swing.*;

public class tugasSesi3_2 {
    public static void main(String[] args) {
//     2. Buatlah sebuah sistem penerimaan calon programmer yang akan
//        menerima dua nilaiCoding ( nilaiCoding coding dan nilaiCoding interview).
        String jawab = "y";


        do {
            int nilaiCoding;
            String nilaiInterview;
            String hasilCoding = "";
            String hasilInterview = "";
            // Input nilaiCoding Test Coding
            nilaiCoding = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilaiCoding Skala 0-100 : "));

            // Pengecekan hasilCoding nilaiCoding Interview
            if (nilaiCoding > 80) {
                hasilCoding = "LOLOS";
            } else if (nilaiCoding >= 60 && nilaiCoding <= 80) {
                hasilCoding = "DIPERTIMBANGKAN";
            } else if (nilaiCoding < 60) {
                hasilCoding = "GAGAL";
            }
            // Pengecekan nilaiCoding Interview
            nilaiInterview = JOptionPane.showInputDialog("Masukan nilai Interview (Huruf) : ");
            nilaiInterview = nilaiInterview.toLowerCase();
            if (nilaiInterview.equals("a") || nilaiInterview.equals("b")) {
                hasilInterview = "LOLOS tes Interview";

            } else {
                hasilInterview = "GAGAL tes Interview";
            }
            // Hasil Akhir
            nilaiInterview = nilaiInterview.toUpperCase();
            if ((hasilCoding.equals("LOLOS") || hasilCoding.equals("DIPERTIMBANGKAN")) && (hasilInterview.equals("LOLOS tes Interview"))) {
                JOptionPane.showMessageDialog(null, "Nilai Tes Coding Kamu : " + nilaiCoding + " " + "(" + hasilCoding + ")" +
                        "\nNilai Tes Interview Kamu : " + nilaiInterview + " " + "(" + hasilInterview + ")" + "\n" +
                        "Selamat Kamu Berhasil Menjadi Calon Programmer");
            } else {
                JOptionPane.showMessageDialog(null, "Nilai Tes Coding Kamu : " + nilaiCoding + " " + "(" + hasilCoding + ")" +
                        "\nNilai Tes Interview Kamu : " + nilaiInterview + " " + "(" + hasilInterview + ")" + "\n" +
                        "Maaf Kamu Belum Berhasil Menjadi Calon Programmer.");
            }
            jawab = JOptionPane.showInputDialog("Apakah anda ingin mencoba lagi ? : Y/N");
            jawab = jawab.toLowerCase();
        }while(jawab.equals("y"));
    }
}