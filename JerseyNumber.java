import javax.swing.*;

public class JerseyNumber {
    public static void main(String[] args) {
        int noPunggung;
        String posisi1 = "Gak Ada Posisi";
        String posisi2 = "Gak ada Posisi";

        noPunggung = Integer.parseInt(JOptionPane.showInputDialog("Masukan nomor punggung : "));

        if (noPunggung % 2 == 0){
            posisi1 = "target attacker";
            if (noPunggung >= 50 && noPunggung <=100){
                posisi1 = "target attacker";
                posisi2 = "berhak dipilih menjadi capten team";
            }
        }
        JOptionPane.showMessageDialog(null,"Posisi nomor punggung adalah : " + posisi1 + posisi2);
    }
}