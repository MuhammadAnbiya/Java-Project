//
//# >>>>> Variabel dan Tipe Data <<<<<
//# >>>>> Variabel
// > Variabel merupakan sebuah container yang digunakan untuk menyimpan suatu nilai secara sementara pada sebuah
//   program dengan tipe data tertentu.
// > Secara teknis, variabel merujuk ke sebuah alamat di memori komputer. Ketika membuat sebuah variabel, maka satu
//   ‘slot’ memory akan disiapkan untuk menampung nilai tersebut. Setiap variabel memiliki nama yang dipakai sebagai
// identitas dari variabel itu.
// > ruang alamat memori komputer menggunakan bilangan hexadesimal (basis 16 [0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,])
// > ketika membuat variabel maka satu slot memori disiapkan untuk menyimpan variabel tersebut
//
//int data;
//data = 2
// > variabel data dengan nilai interger bilangan bulat dua
// > Variabel dapat dianalogikan sebagai box (kotak) untuk menyimpan barang. Setiap box(kotak) mempunyai jenis
//   masing-masing sesuai dengan jenis barang yang dapat disimpan.
// >>> Aturan penamaan variabel :
//        > Variabel bisa terdiri dari huruf, angka dan karakter underscore / garis bawah ( _ ).
//        > Karakter pertama dari variabel hanya boleh berupa huruf dan underscore ( _ ), tidak bisa berupa angka
//        > Tidak diperbolehkan menggunakan reserved keyword
//        > Tidak diperbolehkan menggunakan spasi
// public class LatihanAlgo {

//    int _dataku;
//    String name;
//    boolean isCheck?;   >> tidak bisa karena ada symbol khsusus
//    double 2total;      >> tidak bisa karena diawali dengan angka
//    int new;            >> tidak bisa karena reserved keyword (kata yang sudah dipakai sebagai fungsi di java nya)
//    String while;       >> tidak bisa karena reserved keywoed juga
//    Sting nama lengkap; >> error karena pake spasi
//    kalau mau ditulis dengan cara camelCase atau snake_case
// }
// > variabel akan bersifat case sensitive (perbedaan huruf besar dan kecil sangat berpengaruh)
// public class LatihanAlgo {

//    static int nilai = 90;
   
//    public static void main(String[] args) {
//       System.out.println(nilai);
//    }
// }
//  output : 90
//# >>>>>> Konstanta
// > Konstanta adalah sebuah tempat atau container dari suatu nilai. Sesuai dengan namanya, nilai dari konstanta
//   bersifat tetap (konstan) dan tidak bisa diubah sepanjang program berjalan. Inilah yang menjadi pembeda dari
//   konstanta dengan variabel.
// > tipe data variabel bisa diubah nilainya, tetapi konstan tidak
// > tipe data konstanta ditulis dengan huruf besar semua dan ditambah 'final'
// public class LatihanAlgo {
//
//    static int nilai = 90;
//    static final double PHI = 3.14;
//
//    public static void main(String[] args) {
//        nilai = nilai + 90;
////        PHI = 3.4;
//        System.out.println(PHI);
//    }
//}
//   output = 3.14
//# >>>>> Tipe Data
// > Tipe data adalah suatu kelompok yang mempunyai jenis-jenis tertentu. Dengan kata lain, tipe data adalah sebuah
//   cara yang digunakan untuk menentukan jenis suatu data, kata lain dari hal ini ialah "deklarasi variabel".
// >>> Tipe data dalam pemrograman JAVA secara umum terbagi menjadi 2 jenis yaitu:
//       1. Primitive
//       2. Reference
// >>> Tipe data primitive terbagi menjadi:
//  tipe data primitive alokasi langsung kedalam sebuah ruang memori
//        1. Boolean, yaitu tipe data logika yang mempunyai kemungkinan nilai true atau false
//        2. Tipe Numerik, yaitu tipe data untuk jenis angka seperti byte, short, int, long, char, float dan double
// public class LatihanAlgo {

//    public static void main(String[] args) {

//     boolean isCheck = true;
//     byte size = 127;     // >> batasan untuk byte 2^7 - 1 = 128-1 = 127 // >> range dari -127 s/d 127
// >> 1 byte = 8 bit , range byte s/d 255
//     char karakter = 98;       // >> nilai numerik karena ada code ASCII (American Standard Code for Information Interchange)

//        System.out.println(karakter);
//    }
// }
//     output = b (dari kode ASCII 98)
// >>> Tipe data reference terbagi menjadi:
// karena tipe nya refrence tidak langsung mengacu ke alamat memory, alamat memorynya direfrensikan oleh alamat memory
// yang lain (mirip pemrograman pointer)
//        1. Tipe class
//        2. Tipe Array
//        3. Tipe interface
//# >>> JENIS VARIABEL BERDASARKAN RUANG LINGKUP
//        1.	Member Variable /Class Variable
//        2.	Local Variable
// >> CLASS/MEMBER VARIABLE :
//         a. Deklarasi dilakukan didalam class
// public class LatihanAlgo {
//
//    String firstname;   >> deklarasi didalam class
//
//    public static void main(String[] args) {
//        System.out.println();
//    }
//
//  String address;       >> deklarasi didalam class
//}
//         b. Dapat diakses minimal oleh semua function dalam class yang mendefinisikan
//public class LatihanAlgo {
//    static String firstname;
//
//    public static void main(String[] args) {
//        firstname = "DENI";
//    }
//    public void setName(String name){         >> setName adalah salah satu function
//            firstname = name;
//    }
//}
//         c. Dapat menggunakan modifier public, static, private, protected dan default
//public class LatihanAlgo {
//    static protected String firstname;        // >> protected adalah modifier
//
//    public static void main(String[] args) {
//        firstname = "DENI";
//    }
//    public void setName(String name){
//        firstname = name;
//    }
//}
// >>> Local Variabel
//        a. Deklarasi dilakukan didalam function
//        b. Hanya dapat diakses oleh function yang mendefinisikan
//        c. Tidak perlu menggunakan modifier
//public class LatihanAlgo {
//
//    static protected String firstname;  >> tipe data global bisa di akses keman saja
//
//    public static void main(String[] args) {
//        firstname = "DENI";
//        data = 100                  >> error tidak akan dikenali karena beda class
//    }
//
//    public void getData(){
//        int dara;
//        data = 50;                  >> data hanya di kenali di skop getData (yang dibatasi dengan kurung kurawal buka
//                                       kurung kurawal tutup (tipe data lokal)
//    }
//
//    public void setData(){
//        System.out.println(data);   >> error tidak akan dikenali karena beda class
//    }
//}
//# >>>>> Operator
// Operator dalam bahasa pemrograman merupakan simbol yang dapat digunakan untuk melakukan suatu proses. Contohnya,
// operasi matematika seperti perkalian, pembagian, pengurangan, dan penjumlahan
//   1. Operator Aritmatika
//   2. Operator Penugasan
//   3. Operator Perbandingan
//   4. Operator Logika
//   5. Operator Bitwise       // >> pergeseran lampu LED
//   6. Operator Ternary
// >>> Operator Aritmatika
//> Operator yang digunakan untuk melakukan operasi perhitungan matematika
//  - Penjumlahan (  +  )
//  - Pengurangn  (  -  )
//  - Perkalian   (  *  )
//  - Pembagian   (  /  )
//  - Modulo      (  %  )
//contoh modulo :
//public class LatihanAlgo {
//
//    public static void main(String[] args) {
//        int num1 = 100, num2 = 3;
//
//        int result = num1 % num2;
//        System.out.println(result);
//    }
//}
//     output = 1
// >>> Operator Penugasan
//> Operator yang digunakan untuk memberikan sebuah nilai kedalam variabel (assignment operator)
//  - Pengisian Nilai           (   =  )
//  - Pengisian dan pengurangan (  -=  )
//  - Pengisian dan Penambahan  (  +=  )
//  - Pengisian dan perkalian   (  *=  )
//  - Pengisian dan pembagian   (  /=  )
//  - Pengisian dan hasil bagi  (  %=  )
// public class LatihanAlgo {
//
//    public static void main(String[] args) {
//        int num1 = 100, num2 = 3;
//
//        int result = num1 % num2;
//        num1 += 50;
//        System.out.println(num1);
//    }
//}
//     output = 150
// >>> Operator Perbandingan
//> Operator yang digunakan untuk membandingkan antara beberapa kondisi. Nilai yang dihasilkan adalah boolean
// yaitu berupa true atau false
//  - lebih dari               (  >  )
//  - Kurang dari              (  <  )
//  - Lebih dari sama dengan   (  >= )
//  - Kurang dari sama dengan  (  <= )
//  - sama dengan              (  ==  )
//  - tidak sama dengan        (  !=  )
//public class LatihanAlgo {
//
//    public static void main(String[] args) {
//        int num1 = 100, num2 = 3;
//
//        int result = num1 % num2;
//        num1 += 50;
//        System.out.println(num1 == 150);
//    }
//}
//   output = true
// >>> Operator Logika
//> Operator logika adalah operator yang mempunyai nilai kebenaran sesuai dengan kaidah matematis
//  - and (dan)    (   &&  )
//  - or (atau)    (  ||  )
//  - not (tidak)  (  ~  )
//public class LatihanAlgo {
//
//    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a && b);
//    }
//}
//     output = false
// >>> Operator Bitwise ( Pergeseran )
//> Operator yang digunakan untuk operasi bit (biner), berlaku untuk data int, long, short, char, dan byte
//  - &    (  AND  )
//  - |    (  OR   )
//  - ^    (  XOR  )
//  - ~    (  Negasi  )
//  - <<   (  Left Shift )
//  - >>   (  Right Shift  )
//  - <<<  (  Left Shift Unsigned  )
//  - >>>  (  Right Shifft Unsigned  )
// contoh : soal yang 128 << 8
//         2^n , n = 7
//         2^7 + 8 = 2^15
//         2^15 = 32768
// >>> Operator Ternary
// > Operator kondisional yang menggunakan tanda tanya (?) dan titik dua (:) sebagai pemisah pilihan jawabannya
// ex =     kamu suka aku ? ya : tidak;
//public class LatihanAlgo {
//
//    public static void main(String[] args) {
//
//        int money = 7000;
//        String result = money > 5000 ? "Ya" : "Tidak";
//        System.out.println(result);
//    }
//}
//     output = Ya
//# >>>>> Latihan.
//import javax.swing.*;
// import java.util.Scanner;
// Seorang anak pergi ke toko membawa uang Rp 50.000 untuk membeli mainan. Sesampainya di toko ternyata mainan yang
// akan dibeli harganya Rp 55.000. Implementasikan kedalam kode program menggunakan operator ternary
//public class LatihanAlgo {
//
//    public static void main(String[] args) {
//         int uangAnak = 50_000;
//         int hargaMainan = 55_000;
//
//         String bayar = uangAnak > hargaMainan ? "Ya" : "Tidak";
//        System.out.println("Apakah sang anak bisa membayar mainan ? " + bayar );
//
//    }
//}
//# >>>>> Percabangan  <<<<<
// Percabangan juga dikenal dengan “Control Flow”, “Struktur Kondisi”, “Struktur IF”, “Decision”
// Percabangan digunakan untuk memilih dan mengeksekusi blok kode ketika ada 2(dua) atau lebih kemungkinan kondisi.
// Kondisi diisikan dengan sebuah pernyataan yang melibatkan operator perbandingan dan atau operator logika (dan, atau, negasi):
//        ==(sama dengan)
//        !=(tidak sama dengan)
//        !(negasi)
//        >(lebih besar)
//        <(lebih kecil)
//        >=(lebih besar sama dengan)
//        <=(lebih kecil sama dengan).
/// [ TAMBAHAN ] :
//    untuk variabel huruf pakenya kutip satu ( ' ' ) dan ada function Char.At()
//    untuk vaeiabel kata pakenya kurip dua ( " " )
// >>> Kondisi Percabangan if
// ada 3 kemungkinan if :
// 1.
//      if (kondisi){
//          eksekusi kondisi1
//        }
//         else{
//        }
// 2.
//      if (kondisi1){
//         eksekusi kondisi1
//        }
//         else of (kondisi2){
//         eksekusi kondisi2
//         }
// 3.
//      if (kondisi1){
//         eksekusi kondisi1
//        }
//         else of (kondisi2){
//         eksekusi kondisi2
//         }
//         else{
//         }
// > Contoh Program Menggunakan if else
//public class LatihanAlgo {
//    public static void main(String[] args) {
//        int nilai;
//        nilai = JOptionPane.showInputDialog("Masukan Nilai : ");
//
//        if (nilai > 0) {
//            System.out.println("Nilai adalah bilangan positif");
//        } else if (nilai == 0) {
//            System.out.println("Nilai adalah bilangan netral");
//        } else {
//            System.out.println("Nilai adalah bilangan negatif");
//        }
//    }
//}
// >>> kondisi Percabangan Switch
// Pada dasarnya penggunaannya sama saja dengan IF, akan tetapi bentuk struktur penulisannya lebih sederhana.
// tidak semua case bisa diselesailan dengan switch, misalnya untuk program yang perlu jangkauan (range) >=20 && <= 40.
// switch (kondisi1){
//    case value 1:
//        eksekusi kasus 1
//        break;
//    case value 2:
//        eksekusi kasus 1
//        break;
//    case value n:
//        eksekusi kasus 1
//        break;
// }
// Contoh Program Menggunakan Switch
// import java.util.Scanner;
//public class LatihanAlgo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int angka;
//        System.out.print("Masukan angka dari 1-3 : ");
//        angka = sc.nextInt();
//
//        switch (angka) {
//            case 1:
//                System.out.println("Senin");
//                break;
//            case 2:
//                System.out.println("Selasa");
//                break;
//            case 3:
//                System.out.println("Rabu");
//            default:
//                System.out.println("Angka bukan angka 1-3");
//        }
//    }
//}
// >>> Percabangan Nested if
// Bentuk percabangan NESTED IF adalah struktur penulisan dimana terdapat IF bersarang (IF didalam IF).
// Jadi jika pada struktur sebelumnya, sebuah pernyataan adalah perintah yang harus dikerjakan, maka ketika
// menggunakan NESTED IF pernyataan tersebut adalah kondisi yang harus dilakukan pengecekan.
// > bentuk Nested if
//    if (kondisi1){
//        if (kondisi2){
//        }
//        else {
//        }
//    else
//    }
// }
// > Contoh Program Nested If
//public class LatihanAlgo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukan Username : ");
//        String user = sc.next();
//        System.out.println("Masukan Password : ");
//        String pass = sc.next();
//
//        // Pengecekan dengan nested if jika user == "admin" dan pass == "admin" maka bisa masuk
//        if (user.equals("admin")) {
//            if (pass.equals("admin")) {
//                System.out.println("Username dan Password anda benar, anda bisa masuk");
//            } else {
//                System.out.println("Password yang anda masukan salah");
//            }
//        }
//        else {
//            System.out.println("Username yang anda masukan salah");
//        }
//    }
//}
// Terdapat sebuah jurnal yang menuliskan teorinya bahwa olahraga dapat membakar jumlahKalori yang terkandung dalam tubuh manusia.
//        Hal tersebut berbanding lurus dengan lama waktu yang dilakukan. Berikut ini adalah beberapa teori tersebut:
//        1. Olahraga lari membakar 60 jumlahKalori setiap 5 menit.
//        2. Olahraga push-up membakar 200 jumlahKalori setiap 30 menit
//        3. Olahraga plank membakar 5 jumlahKalori selama 1 menit
//
//        Buatlah program untuk menghitung berapa jumlah jumlahKalori setelah melakukan aktivitas olahraga tersebut dengan
//        ketentuan setiap orang boleh melakukan aktivitasnya lebih dari 1.

// import java.util.Scanner;

// public class JavaNotes {
//     public static void main(String[] args) {
//         int jumlahKalori = 0 ;     // >> kalau himpunan kosong di int pake = 0
//         int waktu = 0;
//         double pengkaliPushUp = 6.666666666666667;
//         double jumlahKaloriPushUp = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Jenis olahraga apa yang anda lakukan ? (Lari/Push-Up/Plank) : ");
//         String olahraga = sc.next();

//         System.out.print("Berapa lama anda melakukan olahraga itu ? (dalam menit) : ");
//             waktu = sc.nextInt();

//          if (olahraga.equals("Lari")){
//              jumlahKalori = waktu * 12;
//          } else if (olahraga.equals("Push-Up")) {
//              jumlahKaloriPushUp = (double) pengkaliPushUp * waktu;
//          } else if (olahraga.equals("Plank")) {
//              jumlahKalori = waktu * 5;
//          }
//          if ((olahraga.equals("Lari")) || (olahraga.equals("Plank"))){
//             System.out.println("Jumlah jumlahKalori yang anda bakar adalah : " + jumlahKalori);
//         } else {
//             System.out.println("Jumlah jumlahKalori yang anda bakar adalah : " + jumlahKaloriPushUp );
//         }
//     }
// }

//// [ TAMBAHAN ] :
// untuk input selain pake JOption bisa pake Scanner (class juga)
// > Contoh
// import java.util.Scanner;
//public class NyobaScanner {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);      // >> sc adalah variabel nama dari Scannernya
//        System.out.print("Masukan angka : ");
//        int angka = sc.nextInt();                 // >> nextInt(); adalah method untuk setiap sc bernilai integer
//        System.out.println(angka);
//
//    }
//}

