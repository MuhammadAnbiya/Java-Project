public class tugasSesi5_1Rev {
    public static void main(String[] args) {
//        1. Buatlah program dengan JAVA, untuk mengetahui keberadaan tamu ada di lantai dan kamar berapa.
        String hotel [][] = {
                {"*","*","*","X","*" },
                {"*","*","*","*","*" },
                {"*","*","*","*","*" },
                {"*","*","*","*","X" }
        };

        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                if (hotel[i][j].equals("X")){
                    System.out.println("Tamu berada di Lantai " + (hotel.length - i) +  " Kamar " + (j+1));
                }
            }
        }
    }
}
