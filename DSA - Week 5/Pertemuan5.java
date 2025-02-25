import java.util.Arrays;

public class Pertemuan5 {
    public static void main(String[] args) {
        int data1 [] = new int[4];
        data1 [0] = 5;
        data1 [1] = 8;
        data1 [2] = 6;
        data1 [3] = 7;                             // bisa dibikin satuan
        System.out.println(Arrays.toString(data1));
        int data2 [] = {5,8,6,7};                  // bisa dibikin langsung
        System.out.println(Arrays.toString(data2));
        // cari rata rata :W
        double total =0;
        for(int i = 0;i < data1.length;i++){
            total = total + data1[i];
        }
        double rataRata = total / data1.length;
        System.out.println("Jumlah data1 : " + total);
        System.out.println("Banyak data1 : " + data1.length);
        System.out.println("Rata rata array : " + rataRata);
//
//         Penjumlahan Matriks
//        int data3 [] = new int[5];
//        data3 [0] = 5;
//        data3 [1] = 8;
//        data3 [2] = 6;
//        data3 [3] = 7;
//        data3 [4] = 10;
//
//        int data4 [] = {10,40,50,60,70};
//        int hasil [] = new int [5];
//
//        for (int i = 0; i < data3.length; i++) {
//            hasil [i] = data3 [i] + data4 [i];
//            System.out.println(data3[i] + " + " + data4[i] + " = " + hasil[i]);
//        }
//        System.out.println(Arrays.toString(hasil));
//
//        hasil [0] = data3 [0] + data4 [0];    // >> manual
//        hasil [1] = data3 [1] + data4 [1];
//        hasil [2] = data3 [2] + data4 [2];
//        hasil [3] = data3 [3] + data4 [3];
//        hasil [4] = data3 [4] + data4 [4];
//
//        String tempatDuduk[] = new String[8];
//        tempatDuduk[0] = "L";
//        tempatDuduk[1] = "L";
//        tempatDuduk[2] = "P";
//        tempatDuduk[3] = "P";
//        tempatDuduk[4] = "P";
//        tempatDuduk[5] = "P";
//        tempatDuduk[6] = "L";
//        tempatDuduk[7] = "L";
//
//          String tempatDuduk[] = {"L","L","P","P","P","P","L","L"};
//
//        // Cek Jumlah laki laki dan perempuan
//        int jumlahLakilaki = 0;
//        int jumlahPerempuan = 0;
//        for (int i = 0; i < tempatDuduk.length; i++) {
//            if (tempatDuduk[i].equals("L")) {
//                jumlahLakilaki = jumlahLakilaki + 1;
//            } else {
//                jumlahPerempuan = jumlahPerempuan + 1;
//            }
//        }
//        int totalPenonton = jumlahLakilaki + jumlahPerempuan;
//        System.out.println("Jumlah Laki laki di bioskop = " + jumlahLakilaki);
//        System.out.println("Jumlah Perempuan di bioskop = " + jumlahPerempuan);
//        System.out.println("Jumlah total penonton = " + totalPenonton);
//
//        // Mencari Couple
//        int couple = 0;
//        for (int i = 0; i < tempatDuduk.length - 1; i++) {      // > kalau array nya out of index
//            if (tempatDuduk[i] != tempatDuduk[i + 1]) {
//                couple = couple + 1;
//            }
//        }
//        System.out.println("Total pasangan di bioskop = " + couple);
//
//         Pesen Tiket Bioskop

    }
}

//        for(int i=0; i <= 5; i++){
//                System.out.println("*****");
//                }
//
//                for (int i = 1; i <= 8 ; i++) {
//                for (int j = 1; j <= i ; j++) {
//                System.out.println(i);
//
//                }
//
//                }

// array dalam java hanya bisa di isi dengan satu type daya setiaps satuan array
// array didalam array bisa disebut array multidimesnsi, array multi dimensi dimulai dari baris 0 lalu kolom 0