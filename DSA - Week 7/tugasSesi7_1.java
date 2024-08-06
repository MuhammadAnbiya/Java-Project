import java.util.Scanner;

public class tugasSesi7_1 {
    public static void main(String[] args) {
        // Buatlah program dengan menggunakan array 2D untuk membantu kondektur menghitung tarif penumpang berdasarkan
        // kota keberangkatan dan tujuan.

        String kotaKeberangkatan, kotaTujuan, pulangPergi, status;
        int harga = 0;
        int berangkat, tujuan;
        Scanner sc = new Scanner(System.in);
        sc.close();

        String[] kota = {"Sukabumi", "Cianjur", "Bandung", "Garut", "Tasik", "Ciamis", "Banjar"};
        int[] tarif = {10000, 15000, 7500, 5000, 7500, 6000};

        // Validasi Kota Keberangkatan
        while (true) {
            System.out.print("====================================================" +
                    "\n          ===Pilih Kota Keberangkatan===           " +
                    "\n1. Sukabumi" +
                    "\n2. Cianjur" +
                    "\n3. Bandung" +
                    "\n4. Garut" +
                    "\n5. Tasik" +
                    "\n6. Ciamis" +
                    "\n7. Banjar" +
                    "\nMasukkan Kota Keberangkatan (isi dengan angka): ");
            berangkat = sc.nextInt();
            if (berangkat >= 1 && berangkat <= 7) {
                kotaKeberangkatan = kota[berangkat - 1];
                break;
            } else {
                System.out.println("Pilih kota sesuai nomor yang sudah ditentukan.");
            }
        }

        // Validasi Kota Tujuan
        while (true) {
            System.out.print("====================================================" +
                    "\n             ===Pilih Kota Tujuan===              " +
                    "\n1. Sukabumi" +
                    "\n2. Cianjur" +
                    "\n3. Bandung" +
                    "\n4. Garut" +
                    "\n5. Tasik" +
                    "\n6. Ciamis" +
                    "\n7. Banjar" +
                    "\nMasukkan Kota Tujuan: ");
            tujuan = sc.nextInt();
            if (tujuan >= 1 && tujuan <= 7) {
                kotaTujuan = kota[tujuan - 1];
                break;
            } else {
                System.out.println("Pilih kota sesuai nomor yang sudah ditentukan.");
            }
        }

        if (berangkat == tujuan) {
            System.out.println("Kota keberangkatan dan tujuan sama. Tarif adalah 0.");
        } else {
            int startIndex = Math.min(berangkat - 1, tujuan - 1);
            int endIndex = Math.max(berangkat - 1, tujuan - 1);

            for (int i = startIndex; i < endIndex; i++) {
                harga += tarif[i];
            }

            System.out.println("====================================================" +
                    "\nKota Keberangkatan Anda Dari: " + kotaKeberangkatan);
            System.out.println("====================================================" +
                    "\nKota Tujuan Menuju: " + kotaTujuan +
                    "\n====================================================");

            System.out.print("Apakah Anda ingin memesan tiket PP? (Ya/Tidak): ");
            pulangPergi = sc.next().toLowerCase();

            System.out.print("Apakah Anda anggota TNI/POLRI? (Ya/Tidak): ");
            status = sc.next().toLowerCase();

            int diskonJauh = 0, diskonTNI = 0;
            int harga2 = harga;

            if ((kotaKeberangkatan.equals("Sukabumi") && kotaTujuan.equals("Banjar")) ||
                    (kotaKeberangkatan.equals("Banjar") && kotaTujuan.equals("Sukabumi"))) {
                diskonJauh = harga * 5 / 100;
                if (pulangPergi.equals("ya")) {
                    harga2 -= diskonJauh;
                    diskonJauh *= 2;
                }
            }

            if (status.equals("ya")) {
                diskonTNI = harga2 * 10 / 100;
                if (pulangPergi.equals("ya")) {
                    diskonTNI *= 2;
                }
            }

            if (pulangPergi.equals("ya")) {
                harga *= 2;
            }

            int hargaTotal = harga - diskonJauh - diskonTNI;
            System.out.println("====================================================" +
                    "\nHarga awal: " + harga +
                    "\n====================================================" +
                    "\nHarga setelah diskon: " + hargaTotal +
                    "\n====================================================");
        }
    }
}
