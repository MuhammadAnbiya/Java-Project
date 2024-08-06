import java.util.ArrayList;

public class pertemuan7 {                                         // ini untuk ngerjain soal rata rata kemarin.
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<>();
        
        nilai.add(10);                  // memasukan value ke array, bertambah sesuai penambahan value
        nilai.add(20);
        System.out.println(nilai);

        nilai.add(0, 40);   // jika ingin menambahkan value sesuai urutan menggunakan dua angka. ex : 0, 1
        // nilai.add(4,50);                                                         // 0 sebagai indedx, 1 sebagai value
        System.out.println(nilai);   

        nilai.set(1, 60);   // untuk mengganti value array di suatu index menggunakan set
         System.out.println(nilai);

        nilai.remove(1);            // untuk menghapus nilai array 
        System.out.println(nilai);

        System.out.println("Pangjang Array nya adalah " + nilai.size());

        for (int i = 0; i < nilai.size(); i++) {     // untuk mengakses isi array nya 
            System.out.println("Isi array nya " + nilai.get(i));
        }

        for (int n : nilai) {                        // ruas kiri tipe data dan nama variabel, 
            System.out.println(n);                   // ruas kanan untuk variabel yang nilainya ingin kita keluarkan
        }
        
        // Rata-rata 
        int jumlah = 0;
        for (int angka : nilai) {
            jumlah = jumlah + angka;
        }

        double rataRata = jumlah / nilai.size();    
        System.out.println(rataRata);

        // System.out.println(nilai.clear());    // tidak bisa karena void 
        nilai.clear();                           // (function yang tidak memiliki nilai balik / return value)
        System.out.println(nilai);        // untuk mengembalikan Arrays ke Arrays kosong


        // // Arrayys List 2D
        // ArrayList<ArrayList<Integer>> Nilai = new ArrayList<>();
        
        // Antrian Bus 
        String bus [][] = {
            {"Andri", "", "Adi", "Reni"},
            {"", "Budi","","Neni"},
            {"Dina","","Rudi","Lia"}
        };

        ArrayList<String> tunggu = new ArrayList<>();
        tunggu.add("Fahmi");
        tunggu.add("Dedi");
        tunggu.add("Ronaldo");
        tunggu.add("Messi");
        tunggu.add("Doni");
        
        int index = 0;
        // Memasukan ArrayList kedalam Array
        for (int i = 0; i < bus.length; i++) {
            for (int j = 0; j < bus[i].length; j++) {
                if (bus[i][j] == ""){
                    bus[i][j] = tunggu.get(index);
                    index++;
                }
                System.out.print(bus[i][j] + " ");
            }
            System.out.println();
        }

        // Menyebutkan orang yang tidak kebagian bus
        for (int i = index ; i <= tunggu.size(); i++) {                             // print orang setelah index 4
            System.out.println("Yang tidak kebagian bus " + tunggu.get(i));
            
        }                                 
    }
}