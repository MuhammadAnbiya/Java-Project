
import java.util.ArrayList;

public class EssayUTS_Array {
    public static void main(String[] args) {

        String kota [] = {"Sukabumi", "Bekasi", "Malang"};
        System.out.println(kota.length);
        System.out.println(kota[1]);

        String catur [][] = {
                {"","Sukabumi","",""},
                {"","","",""},
                {"","","",""}
        };

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.println(catur[i][j]);
            }
        }

        // Rock and King

        int posisiKBaris = 0;
        int posisiKKolom = 0;
        int posisiRBaris = 0;
        int posisiRKolom = 0;
        String keterangan = "tidak skak";
        String chess [][] = {
                {"","","","","",""},
                {"","","","K","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","R","",""}
        };

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                if (chess[i][j].equals("K")){
                    posisiKBaris = i;
                    posisiKKolom = j;
                }
                if (chess[i][j].equals("R")){
                    posisiRBaris = i;
                    posisiRKolom = j;
                }
            }
        }

        if (posisiKBaris == posisiRBaris || posisiKKolom == posisiRKolom){
            System.out.println("skak king");
        } else{
            System.out.println(keterangan);
        }


        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(10);
        nilai.add(15);
        nilai.add(20);
        nilai.add(20);
        nilai.add(5);

        int jumlah = 0;
        for (int hasil:nilai) {
            jumlah = jumlah + hasil;
        }
        int banyak = nilai.size();

        System.out.println("jumlah dari arraylistnya " + jumlah);
        System.out.println("Banyak data arraylistnya " + banyak);
        System.out.println("rata ratanya " + jumlah / banyak);































//        int posisiKBaris = 0;
//        int posisiKKolom = 0;
//        int posisiRBaris = 0;
//        int posisiRKolom = 0;
//        String keterangan = "tidak skak";
//        String chess [][] = {
//                {"","","","K","",""},
//                {"","","","","",""},
//                {"","","","","",""},
//                {"","","","","",""},
//                {"","","","","",""},
//                {"","","","R","",""}
//        };
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                if (chess[i][j].equals("K")){
//                    posisiKBaris = i;
//                    posisiKKolom = j;
//                }
//                if (chess[i][j].equals("R")){
//                    posisiRBaris = i;
//                    posisiRKolom = j;
//                }
//            }
//        }
//        if ((posisiRBaris == posisiKBaris) || (posisiRKolom == posisiKKolom)){
//            keterangan= "skak benteng";
//        }
//        System.out.println(keterangan);
//
//        ArrayList<Integer> nilai = new ArrayList<>();
//        nilai.add(10);
//        nilai.add(20);
//
//        int jumlah = 0;
//            for (int angka : nilai) {
//            jumlah =  jumlah + angka;
//        }
//
//        double rataRata = jumlah / nilai.size();
//        System.out.println(rataRata);

    }
}
