public class tugasSesi5_2Rev {
    public static void main(String[] args) {
//        2. buatlah program untuk menghitung jumlah kamar yang kosong.
        int totalPengunjung = 0;
        int totalkamarKosong = 0;
        int seluruhKamar = 0;

        String hotel[][] = {
                {"*", "*", "*", "X", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "X"}
        };

        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                seluruhKamar++;
                if (hotel[i][j].equals("X")) {
                    // Pengecekan jumlah kamar yang tersedia
                    totalPengunjung++;
                    totalkamarKosong = seluruhKamar - totalPengunjung;
                    System.out.println("Tamu berada di Lantai " + (hotel.length - i) + " Kamar " + (j + 1));
                }
            }
        }
        System.out.println("\nJumlah kamar yang tersedia adalah " + totalkamarKosong + " kamar");
    }
}
