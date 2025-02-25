public class skakCatur {
    public static void main(String[] args) {
        // K = King / Raja
        // R = Rocky / Benteng

            int posisiKBaris = 0;
            int posisiKKolom = 0;
            int posisiRBaris = 0;
            int posisiRKolom = 0;
            String keterangan = "tidak skak";
            String chess [][] = {                   
                    {"","","","K","",""},
                    {"","","","","",""},
                    {"","","","","",""},
                    {"","","","","",""},
                    {"","","","","",""},
                    {"","","","R","",""}
          };

          for (int i = 0; i < chess.length; i++) {
              for (int j = 0; j < chess[i].length; j++) {
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

        if ((posisiRBaris == posisiKBaris) || (posisiRKolom == posisiKKolom)){
            System.out.println(keterangan = "skak");
        } else{
            System.out.println(keterangan);
        }             
    }
}

