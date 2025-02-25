import javax.swing.*;

public class pertemuan6 {

    static int data1[][] = new int[3][3];
    static int data2[][] = {{10, 20, 30, 46, 76}, {40, 50, 60}};

    public static void main(String[] args) {


        // Panjang Array dan Pemanggilan Array
//        System.out.println(data2.length);
//        System.out.println(data1.length);
//        System.out.println(data2[0][0]);
//        data2[0][0] += 15;
//        System.out.println(data2[0][0]);

        // Mencari rata rata Array
//        int total = 0;
//        double jumlahData = 0;
//        for (int i = 0; i < data2.length;i++) {
//            for (int j = 0; j < data2[i].length; j++) {
////                System.out.println(i + "," + j);
////                System.out.println(data2[i][j]);
//                total = total + data2[i][j];
//                jumlahData++;                                // setiap ada daya array yang dicek maka dihitung 1 array
//            }                                                // sama saja saat array nya selesai dicek maka hasilnya
//        }                                                    // adalah total seluruh array
//        double rataRata = total / jumlahData;
//        System.out.println("total data2 = " + total +
//                            "\njumlah data2 = " + jumlahData +
//                            "\nrata-rata data2 = " +rataRata);

        // Matriks Identitas
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Jumlah Baris : ");
//        int baris = sc.nextInt();
//
//        System.out.print("Jumlah Kolom : ");
//        int kolom = sc.nextInt();
//
//        int matriks[][] = new int[baris][kolom];
//
//        for (int m = 0; m < matriks.length; m++) {
//            for (int n = 0; n < matriks[m].length; n++) {
//                if (m == n) {
//                    matriks[m][n] = 1;
//                } else{
//                    matriks[m][n] = 0;
//            }
//                System.out.print(matriks[m][n]);
//            }
//            System.out.println();
//        }

        // Check King And Rock
                // K = King / Raja
                // R = Rocky / Benteng
        int posisiKBaris = 0;
        int posisiKKolom = 0;
        int posisiRBaris = 0;
        int posisiRKolom = 0;
        String keterangan = "tidak skak";
        String chess [][] = {                   
                {"","","","K","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","R","",""}
        };

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if (chess[i][j].equals("K")){
                    posisiKBaris = i;
                    posisiKKolom = j;
                }
                if (chess[i][j].equals("R")){
                    posisiRBaris = i;
                    posisiRKolom = j;
                }
            }
        }
        if ((posisiRBaris == posisiKBaris) || (posisiRKolom == posisiKKolom)){
            keterangan= "skak benteng";
//        } else if(){             
    // bisa ditambahakan jenis bidak catur nya

        }
        System.out.println(keterangan);

         // Lapak Penjual Tahu
        final int hargaTahu = 5000;
        int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang anda : " ));
        int jumlahBeliTahu = uang / hargaTahu;
        int totalTahu = 0;
        System.out.println(jumlahBeliTahu);

        int lapakTahu [][] = {
                {10,20,30},
                {10,20,30},
                {10,20,30}
        };

        for (int i = 0; i < lapakTahu.length; i++) {
            for (int j = 0; j < lapakTahu[i].length; j++) {
                if (lapakTahu[i][j] < jumlahBeliTahu){
                    totalTahu = jumlahBeliTahu - lapakTahu[i][j];
                    lapakTahu[i][j] = 0;
                    totalTahu = lapakTahu[i][j+1] - totalTahu;
//                    if (totalTahu ==  0){

                } else if (lapakTahu[i][j] >= jumlahBeliTahu) {
                    totalTahu = lapakTahu[i][j] - jumlahBeliTahu;
                }
                System.out.print(lapakTahu[i][j]);
            }
            System.out.println();
        }
    }
}




