////Buatlah program menggunakan JAVA untuk permasalahan berikut ini:
////        Konversi nilai dari angka ke huruf, dengan aturan :
////        Nilai 85 – 100     = A
////        Nilai 75 – 84      = B
////        Nilai 65 – 74      = C
////        Nilai 55 – 64      = D
////        Kurang dari 55     = E
//
//public class TugasSesi2 {
//    public static void main(String[] args) {
//        int nilai = 87;
//        System.out.println("Nilai yang anda peroleh adalah " + nilai);
//        if (nilai >= 85 && nilai <= 100) {
//            System.out.println("Predikat A");
//        } else if (nilai >= 75 && nilai <= 84) {
//            System.out.println("Predikat B");
//        } else if (nilai >= 65 && nilai <= 74) {
//            System.out.println("Predikat C");
//        } else if (nilai >= 55 && nilai <= 64) {
//            System.out.println("Predikat D");
//        } else if (nilai >= 0 && nilai <= 54) {
//            System.out.println("Predikat E");
//        }
//    }
//}


public class TugasSesi2 {
    public static void main(String[] args) {
//        Operasi aritmatika dari 2 buah bilangan, dimana user bisa memilih operator aritmatikanya :
//        + (tambah), -(kurang), * (kali), /(bagi) dan %(modus).

     //Pertambahan
     int bilangan1 = 10;
     int bilangan2 = 20;
     int jumlah1 = bilangan1 + bilangan2;
         System.out.println("Hasil dari " + bilangan1 + " + "+ bilangan2 + " adalah " + jumlah1);

     //Pengurangan
     int bilangan3 = 10;
     int bilangan4 = 20;
     int jumlah5 = bilangan3 - bilangan4;
         System.out.println("Hasil pengurangan " + bilangan3 + " - "+ bilangan4 + " adalah " + jumlah5);

     //Pembagian
     int bilangan6 = 10;
     int bilangan7 = 20;
     double jumlah8 = (double) bilangan6 / bilangan7;
         System.out.println("Hasil pembagian " + bilangan6 + " : "+ bilangan7 + " adalah " + jumlah8);

     //Perkalian
     int bilangan9 = 10;
     int bilangan10 = 20;
     int jumlah11 = bilangan9 * bilangan10;
         System.out.println("Hasil perkalian " + bilangan9 + " x "+ bilangan10 + " adalah " + jumlah11 );

     //Modulus
     int bilangan12 = 10;
     int bilangan13 = 20;
     int jumlah14 = bilangan12 % bilangan13;
         System.out.println("Hasil modulus " + bilangan12 + " % "+ bilangan13 + " adalah " + jumlah14);
    }
}

