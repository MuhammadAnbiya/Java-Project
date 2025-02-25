import java.util.*;

public class tugasSesi7_3 {
    public static void main(String[] args) {
        // Buatlah program dengan menggunakan ArrayList untuk membantu kondektur menghitung tarif penumpang berdasarkan
        // kota rute dan tujuan.

        String jawab = "y";
        Scanner sc = new Scanner(System.in);
        try {
            // Define valid cities and their prices in a List
            List<String> rute = Arrays.asList("sukabumi", "cianjur", "bandung", "garut", "tasik", "ciamis", "banjar");
            List<Integer> hargaList = Arrays.asList(10000, 15000, 7500, 5000, 7500, 6000, 0); // Added 0 for easy indexing

            // Define city index map for quick lookup
            Map<String, Integer> cityIndexMap = new HashMap<>();
            for (int i = 0; i < rute.size(); i++) {
                cityIndexMap.put(rute.get(i), i);
            }

            do {
                String pulangPergi, status, kotaKeberangkatan, kotaTujuan;
                int diskonJauh = 0, diskonTNI = 0, hargaHitung, hargaAwal = 0, indexBerangkat = -1, indexTujuan = -1;

                // Get departure city and validate
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

                // Check if departure city is valid
                if (!cityIndexMap.containsKey(kotaKeberangkatan)) {
                    System.out.println("====================================================" +
                            "\n///Kota berangkat yang anda masukan salah tolong pilih kota sesuai list///");
                    continue;
                }

                // Get destination city and validate
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

                // Check if destination city is valid
                if (!cityIndexMap.containsKey(kotaTujuan)) {
                    System.out.println("====================================================" +
                            "\n///Kota tujuan yang anda masukan salah tolong pilih kota sesuai list///");
                    continue;
                }

                // Check if departure and destination cities are different
                if (kotaKeberangkatan.equals(kotaTujuan)) {
                    System.out.println("====================================================" +
                            "\n///Kota berangkat dan kota tujuan anda sama pastikan anda memilih pilihan yang benar///");
                    continue;
                }

                // Get city indices for price calculation
                indexBerangkat = cityIndexMap.get(kotaKeberangkatan);
                indexTujuan = cityIndexMap.get(kotaTujuan);

                // Calculate base price
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

                // Get additional inputs
                System.out.println("Apakah anda ingin memesan tiket PP ? (Ya/Tidak) ");
                pulangPergi = sc.next().toLowerCase();
                System.out.println("Apakah anda anggota TNI/POLRI ? (Ya/Tidak) : ");
                status = sc.next().toLowerCase();

                // Calculate discounts
                if ((kotaKeberangkatan.equals("sukabumi") && kotaTujuan.equals("banjar")) ||
                        kotaKeberangkatan.equals("banjar") && kotaTujuan.equals("sukabumi")) {
                    diskonJauh = hargaAwal * 5 / 100;
                    if (pulangPergi.equals("ya")) {
                        hargaAwal *= 2;
                        diskonJauh *= 2;
                    }
                }
                if (status.equals("ya")) {
                    diskonTNI = hargaAwal * 10 / 100;
                    if (pulangPergi.equals("ya")) {
                        diskonTNI *= 2;
                    }
                }
                int hargaTotal = hargaAwal - diskonJauh - diskonTNI;

                // Print result
                System.out.println("====================================================" +
                        "\n               Rute PO. Pahala Kencana              " +
                        "\nKota Keberangkatan : " + kotaKeberangkatan +
                        "\nKota Tujuan        : " + kotaTujuan +
                        "\n====================================================" +
                        "\nharga awal : " + hargaAwal +
                        "\nharga setelah diskon : " + hargaTotal +
                        "\n====================================================");

                // Additional messages based on route
                if (kotaKeberangkatan.equals("jatinangor") && kotaTujuan.equals("sukabumi")) {
                    System.out.println("Ilaya selamat pulaaaaaaang :) ");
                }
                if (kotaKeberangkatan.equals("sukabumi") && kotaTujuan.equals("jatinangor")) {
                    System.out.println("Aku datang");
                }

                // Ask if user wants to try again
                System.out.println("Apakah anda ingin mencoba lagi ? : Y/N");
                jawab = sc.next().toLowerCase();
            } while (jawab.equals("y"));
        } finally {
            sc.close();
        }
    }
}
