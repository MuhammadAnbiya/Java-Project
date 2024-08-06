import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tugasSesi7_4 {
    public static void main(String[] args) {
        String jawab = "y";
        Scanner sc = new Scanner(System.in);

        List<String> rute = Arrays.asList("sukabumi", "cianjur", "bandung", "garut", "tasik", "ciamis", "banjar");
        List<Integer> hargaList = Arrays.asList(10000, 15000, 7500, 5000, 7500, 6000, 0); // Added 0 for easy indexing

        while (jawab.equals("y")) {
            String pulangPergi, status, kotaKeberangkatan, kotaTujuan;
            int diskonJauh = 0, diskonTNI = 0, hargaHitung, hargaAwal = 0, indexBerangkat = -1, indexTujuan = -1;

            System.out.print("====================================================" +
                    "\n          ===Pilih Kota Keberangkatan===           " +
                    "\n1. Sukabumi" +
                    "\n2. Cianjur" +
                    "\n3. Bandung" +
                    "\n4. Garut" +
                    "\n5. Tasik" +
                    "\n6. Ciamis" +
                    "\n7. Banjar" +
                    "\nMasukan Kota Keberangkatan : ");
            kotaKeberangkatan = sc.next().toLowerCase();

            if (!rute.contains(kotaKeberangkatan)) {
                System.out.println("====================================================" +
                        "\n///Kota berangkat yang anda masukan salah tolong pilih kota sesuai list///");
                continue;
            }

            System.out.print("====================================================" +
                    "\n             ===Pilih Kota Tujuan===              " +
                    "\n1. Sukabumi" +
                    "\n2. Cianjur" +
                    "\n3. Bandung" +
                    "\n4. Garut" +
                    "\n5. Tasik" +
                    "\n6. Ciamis" +
                    "\n7. Banjar" +
                    "\nMasukan Kota Tujuan : ");
            kotaTujuan = sc.next().toLowerCase();

            if (!rute.contains(kotaTujuan)) {
                System.out.println("====================================================" +
                        "\n///Kota tujuan yang anda masukan salah tolong pilih kota sesuai list///");
                continue;
            }

            if (kotaKeberangkatan.equals(kotaTujuan)) {
                System.out.println("====================================================" +
                        "\n///Kota berangkat dan kota tujuan anda sama pastikan anda memilih pilihan yang benar///");
                continue;
            }

            indexBerangkat = rute.indexOf(kotaKeberangkatan);
            indexTujuan = rute.indexOf(kotaTujuan);

            if (indexBerangkat < indexTujuan) {
                for (int i = indexBerangkat; i < indexTujuan; i++) {
                    hargaHitung = hargaList.get(i);
                    hargaAwal += hargaHitung;
                }
            } else {
                for (int i = indexBerangkat - 1; i >= indexTujuan; i--) {
                    hargaHitung = hargaList.get(i);
                    hargaAwal += hargaHitung;
                }
            }

            System.out.println("Apakah anda ingin memesan tiket PP ? (Ya/Tidak) ");
            pulangPergi = sc.next().toLowerCase();
            System.out.println("Apakah anda anggota TNI/POLRI ? (Ya/Tidak) : ");
            status = sc.next().toLowerCase();

            int hargaSetelahDiskonPP = hargaAwal;
            if ((kotaKeberangkatan.equals("sukabumi") && kotaTujuan.equals("banjar")) ||
                kotaKeberangkatan.equals("banjar") && kotaTujuan.equals("sukabumi")) {
                diskonJauh = hargaAwal * 5 / 100;
                hargaSetelahDiskonPP -= diskonJauh;
                if (pulangPergi.equals("ya")) {
                    hargaAwal *= 2;
                    diskonJauh *= 2;
                }
                if (status.equals("ya")) {
                    diskonTNI = hargaSetelahDiskonPP * 10 / 100;
                    diskonTNI *= (pulangPergi.equals("ya")) ? 2 : 1;
                }
            } else if (status.equals("ya")) {
                diskonTNI = hargaAwal * 10 / 100;
                if (pulangPergi.equals("ya")) {
                    hargaAwal *= 2;
                    diskonTNI *= 2;
                }
            } else if (pulangPergi.equals("ya")) {
                hargaAwal *= 2;
            }

            int hargaTotal = hargaAwal - diskonJauh - diskonTNI;
            System.out.println("====================================================" +
                    "\n               Rute PO. Pahala Kencana              " +
                    "\nKota Keberangkatan   : " + kotaKeberangkatan +
                    "\nKota Tujuan          : " + kotaTujuan +
                    "\n====================================================" +
                    "\nharga awal           : " + hargaAwal);
            if (diskonJauh > 0 || diskonTNI > 0) {
                System.out.println("harga setelah diskon : " + hargaTotal +
                        "\n====================================================");
            } else {
                System.out.println("====================================================");
            }

            System.out.println("Apakah anda ingin mencoba lagi ? : Y/N");
            jawab = sc.next().toLowerCase();
        }
        sc.close();
    }
}
