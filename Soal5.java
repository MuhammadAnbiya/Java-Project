
public class Soal5 {
    public static void main(String[] args) {
        int umur = 19;
        int tinggi = 170;
        int tarif = 0;

        if (umur <1){
            System.out.println("Dilarang masuk");
        }
        else if (umur <=3){
            tarif = 30000;
            if (tinggi >70){
                tarif += 10000;
            }
        }

        else if (umur <=7){
            tarif = 40000;
            if (tinggi >120){
                tarif += 15000;
            }
        }

        else if (umur <=10){
            tarif = 50000;
            if (tinggi >150){
                tarif +=20000;
            }
        }

        else {
            tarif = 80000;
        }
        System.out.println("Tarif harga untuk umur " + umur + " tahun, tinggi "  + tinggi + " cm adalah Rp. " + tarif );
    }
}
