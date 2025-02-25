import java.util.ArrayList;
import java.util.Scanner;

public class tugasSesi7_2 {
    public static void main(String[] args) {
        // Buatlah program dengan menggunakan ArrayList untuk membantu kondektur menghitung tarif penumpang berdasarkan
        // kota rute dan tujuan.

        String jawab = "y";
        Scanner sc = new Scanner(System.in);
        try {
            do {
                String pulangPergi, status, kotaKeberangkatan, kotaTujuan;
                int diskonJauh = 0, diskonTNI = 0, hargaHitung, hargaAwal = 0, indexBerangkat = 1, indexTujuan = 1;
                int validasiBerangkat = 0, validasiTujuan = 0, hargaTotal = 0;

                do {
                    validasiBerangkat = 0;
                    validasiTujuan = 0;
                    ArrayList<String> rute = new ArrayList<String>();
                    rute.add("sukabumi");
                    rute.add("cianjur");
                    rute.add("jatinangor");
                    rute.add("garut");
                    rute.add("tasik");
                    rute.add("ciamis");
                    rute.add("banjar");

                    System.out.print("====================================================" +
                            "\n          ===Pilih Kota Keberangkatan===           " +
                            "\n1. Sukabumi" +
                            "\n2. Cianjur" +
                            "\n3. Jatinangor" +
                            "\n4. Garut" +
                            "\n5. Tasik" +
                            "\n6. Ciamis" +
                            "\n7. Banjar" +
                            "\nMasukan Kota Keberangkatan : ");
                    kotaKeberangkatan = sc.next();
                    kotaKeberangkatan = kotaKeberangkatan.toLowerCase();

                    System.out.print("====================================================" +
                            "\n             ===Pilih Kota Tujuan===              " +
                            "\n1. Sukabumi" +
                            "\n2. Cianjur" +
                            "\n3. Jatinangor" +
                            "\n4. Garut" +
                            "\n5. Tasik" +
                            "\n6. Ciamis" +
                            "\n7. Banjar" +
                            "\nMasukan Kota Tujuan : ");
                    kotaTujuan = sc.next();
                    kotaTujuan = kotaTujuan.toLowerCase();

                    for (int i = 0; i < rute.size(); i++) {
                        if (kotaKeberangkatan.equals(rute.get(i))) {
                            indexBerangkat = i;
                            validasiBerangkat++;
                        }
                        if (kotaTujuan.equals(rute.get(i))) {
                            indexTujuan = i;
                            validasiTujuan++;
                        }
                    }

                    if (!kotaKeberangkatan.equals(kotaTujuan)){
                        if (validasiBerangkat == 0) {
                            System.out.println("====================================================" +
                                    "\n///Kota berangkat yang anda masukan salah tolong pilih kota sesuai list///");
                        }
                        if (validasiTujuan == 0) {
                            System.out.println("====================================================" +
                                    "\n///Kota tujuan yang anda masukan salah tolong pilih kota sesuai list///");
                        }
                    }
                    else {
                        if (validasiBerangkat == 0 && validasiTujuan == 0 ) {
                            System.out.println("====================================================" +
                                    "\n///Kota berangkat yang anda masukan salah tolong pilih kota sesuai list///" +
                                    "\n====================================================" +
                                    "\n///Kota tujuan yang anda masukan salah tolong pilih kota sesuai list///");
                        } else {
                            System.out.println("====================================================" +
                                    "\n///Kota berangkat dan kota tujuan anda sama pastikan anda memilih pilihan yang benar///");
                            validasiBerangkat--;
                            validasiTujuan--;
                        }
                    }
                } while (validasiBerangkat == 0 || validasiTujuan == 0);

                String harga[] = {"10000", "15000", "7500", "5000", "7500", "6000"};

                if (indexBerangkat < indexTujuan) {
                    for (int i = indexBerangkat; i < indexTujuan; i++) {
                        hargaHitung = Integer.parseInt(harga[i]);
                        hargaAwal = hargaAwal + hargaHitung;
                    }
                } else if (indexBerangkat > indexTujuan) {
                    for (int i = indexBerangkat - 1; i >= indexTujuan; i--) {
                        hargaHitung = Integer.parseInt(harga[i]);
                        hargaAwal = hargaAwal + hargaHitung;
                    }
                }

                System.out.println("Apakah anda ingin memesan tiket PP ? (Ya/Tidak) ");
                pulangPergi = sc.next();
                pulangPergi = pulangPergi.toLowerCase();
                System.out.println("Apakah anda anggota TNI/POLRI ? (Ya/Tidak) : ");
                status = sc.next();
                status = status.toLowerCase();

                int hargaSetelahDiskonPP = hargaAwal;
                //Pengecekan
                if (kotaKeberangkatan.equals("sukabumi") && kotaTujuan.equals("banjar") ||
                        kotaKeberangkatan.equals("banjar") && kotaTujuan.equals("sukabumi")) {
                    diskonJauh = hargaAwal * 5 / 100;
                    hargaSetelahDiskonPP = hargaSetelahDiskonPP - diskonJauh;
                    if (pulangPergi.equals("ya")){
                        hargaAwal = hargaAwal * 2;
                        diskonJauh = diskonJauh + diskonJauh;
                        if (status.equals("ya")){
                            diskonTNI = hargaSetelahDiskonPP * 10 / 100;
                            diskonTNI = diskonTNI + diskonTNI;
                        }
                    } else if (status.equals("ya")) {
                        diskonTNI = hargaSetelahDiskonPP * 10 / 100;
                    }
                }
                else if (status.equals("ya")) {
                    diskonTNI = hargaAwal * 10 / 100;
                    if (pulangPergi.equals("ya")){
                        hargaAwal = hargaAwal * 2;
                        diskonTNI = diskonTNI + diskonTNI;
                    }
                }
                else if (pulangPergi.equals("ya")) {
                    hargaAwal = hargaAwal * 2;
                }

                hargaTotal = hargaAwal - diskonJauh - diskonTNI;
                System.out.println("====================================================" +
                        "\n               Rute PO. Pahala Kencana              " +
                        "\nKota Keberangkatan : " + kotaKeberangkatan +
                        "\nKota Tujuan        : " + kotaTujuan +
                        "\n====================================================" +
                        "\nharga awal : " + hargaAwal +
                        "\nharga setelah diskon : " + hargaTotal +
                        "\n====================================================");
                if (kotaKeberangkatan.equals("jatinangor") && kotaTujuan.equals("sukabumi")){
                    System.out.println("Ilaya selamat pulaaaaaaang :) ");
                }
                if (kotaKeberangkatan.equals("sukabumi") && kotaTujuan.equals("jatinangor")){
                    System.out.println("Aku datang");
                }
                System.out.println("Apakah anda ingin mencoba lagi ? : Y/N");
                jawab = sc.next();
                jawab = jawab.toLowerCase();
            } while (jawab.equals("y"));
        } finally {
            sc.close();
        }
    }
}
