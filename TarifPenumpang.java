import java.util.ArrayList;
import java.util.Scanner;

public class TarifPenumpang {
    
    public static void main(String[] args) {
        ArrayList<String> jalurOperasional = new ArrayList<>();
        jalurOperasional.add("Sukabumi");
        jalurOperasional.add("Cianjur");
        jalurOperasional.add("Bandung");
        jalurOperasional.add("Garut");
        jalurOperasional.add("Tasik");
        jalurOperasional.add("Ciamis");
        jalurOperasional.add("Banjar");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Daftar jalur operasional : ");
        for(String kota : jalurOperasional){
            System.out.println(kota);
        }
        System.out.println("Masukan Kota keberangkatan: ");
        String kotaKeberangkatan = scanner.nextLine();
        System.out.println("Masukan kota tujuan: ");
        String kotaTujuan = scanner.nextLine();
        
        int indeksKeberangkatan = jalurOperasional.indexOf(kotaKeberangkatan);
        int indeksTujuan = jalurOperasional.indexOf(kotaTujuan);
        
        if(indeksKeberangkatan == -1 ||indeksTujuan == -1){
            System.out.println("Kota keberangkatan atau tujuan tidak valid. ");
        }else{
            double tarif = hitungTarif(jalurOperasional, indeksKeberangkatan, indeksTujuan);
            System.out.println("Tarif dari " + kotaKeberangkatan + " ke " + kotaTujuan + "adalah: " + tarif + "Rupiah");
            
            System.out.println("Apakah penumpang termasuk anggota TNI/Polri? (ya/tidak): ");
            String isAnggota = scanner.nextLine();
            
            double diskon = 0.0;
            
            if(kotaKeberangkatan.equals("Sukabumi") && kotaTujuan.equals("Banjar")){
                diskon = 0.05; //Diskon 5% jika PP dari Suabumi  ke Banjar atau sebaliknya
            }
            if(isAnggota.equalsIgnoreCase("ya")){
                diskon += 0.10;//Tambah diskon 10% jika penumpang adlah anggota TNI/POLRI 
            }
            
            double totalTarif = tarif - (tarif * diskon);
            System.out.println("Total tarif setelah diskon: " + totalTarif + " Rupiah ");
            
            
            
            
        }
        scanner.close();
        
    }
    public static double hitungTarif(ArrayList<String>jalurOperasional, int indeksKeberangkatan, int indeksTujuan){
        double[][] tarifPerjalanan ={
            {0,10000,15000,0,0,0,0},
            {0,0,7500,0,0,0,0},
            {0,0,0,5000,0,0,0},
            {0,0,0,0,7500,0,0},
            {0,0,0,0,6000,0,0},
            {0,0,0,0,0,0,0}
        };
        
        return tarifPerjalanan[indeksKeberangkatan][indeksTujuan];
        
    }
}