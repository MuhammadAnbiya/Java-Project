import javax.swing.*;

public class tugasSesi3_4 {
    public static void main(String[] args) {
//        4.Buatlah program untuk menghitung berapa jumlah kalori setelah
//          melakukan aktivitas olahraga tersebut dengan ketentuan setiap orang
//          boleh melakukan aktivitasnya lebih dari 1.
        String jawab = "y";

    do {
        String lari;
        String pushUp;
        String plank;
        double lariPermennit = 12;
        double pushUpPermenit = 6.66666667;
        double plankPermennit = 5;
        double totalKalori = 0;

        lari = JOptionPane.showInputDialog("Waktu lama lari : ");
        pushUp = JOptionPane.showInputDialog("Waktu lama push-up : ");
        plank = JOptionPane.showInputDialog("Waktu lama plank : ");

        double dLari = Double.parseDouble(lari);
        double dpushUp = Double.parseDouble(pushUp);
        double dPlank = Double.parseDouble(plank);

        if (dLari > 0) {
            totalKalori = totalKalori + (dLari * lariPermennit);
        }
        if (dpushUp > 0) {
            totalKalori = totalKalori + (dpushUp * pushUpPermenit);
        }
        if (dPlank > 0) {
            totalKalori = totalKalori + (dPlank * plankPermennit);
        }
        JOptionPane.showMessageDialog(null, "Jumlah kalori yang anda bakar : "
                            + Math.floor(totalKalori));     // pr nya bikin bener bener jadi bilangan int
        jawab = JOptionPane.showInputDialog("Apakah anda ingin mencoba lagi ? : Y/N");
        jawab = jawab.toLowerCase();
    }while(jawab.equals("y"));
    }
}