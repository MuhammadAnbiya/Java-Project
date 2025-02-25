public class VariabelDanData {
    public static void main(String[] args) {
        // Konversi nilai dari angka ke huruf,
        int nilai = 66;
        System.out.println("Nilai yang anda peroleh adalah : " + nilai);
        if (nilai >= 85 && nilai <= 100){
            System.out.println("Nilai anda kategori A");
        }
        else if (nilai >= 75 && nilai <= 84) {
            System.out.println("Nilai anda kategori B");
        }
        else if (nilai >= 70 && nilai <= 74){
            System.out.println("Nilai anda kategori C");
        }
        else if (nilai >= 50 && nilai <= 69){
            System.out.println("Nilai anda kategori D");
        }
        else if (nilai <= 50  && nilai >= 0){
            System.out.println("Nilai anda kategori E");
        }
        else{
            System.out.println("Nilai yang anda masukan diluar range");
        }

        // Operasi aritmatika dari 2 buah bilangan,
        // Pertambahan
        int Bil1 = 10;
        int Bil2 = 20;
        int jumlah1 = Bil1 + Bil2;
        System.out.println("\nHasil penjumlahan " + Bil1 + " dan " + Bil2 + " adalah " + jumlah1);

        // Pengurangan
        int Bil11 = 10;
        int Bil22 = 20;
        int jumlah11 = Bil11 - Bil22;
        System.out.println("Hasil pengurangan " + Bil11 + " dan " + Bil22 + " adalah " + jumlah11);

        // Perkalian
        int Bil111 = 10;
        int Bil222 = 20;
        int jumlah111 = Bil111 * Bil222;
        System.out.println("Hasil perkalian " + Bil111 + " dan " + Bil222 + " adalah " + jumlah111);

        // Pembagian
        int Bil1111 = 10;
        int Bil2222 = 20;
        double jumlah1111 = (double) Bil1111 / Bil2222;
        System.out.println("Hasil pembagian " + Bil1111 + " dan " + Bil2222 + " adalah " + jumlah1111);

        // Modulo
        int Bil11111 = 10;
        int Bil22222 = 20;
        int jumlah11111 = Bil11111 % Bil22222;
        System.out.println("Hasil modulo " + Bil11111 + " dan " + Bil22222 + " adalah " + jumlah11111);
    }

}



