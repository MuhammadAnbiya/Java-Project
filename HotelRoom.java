public class HotelRoom {
    public static void main(String[] args) {
        String hotel [][] = {
                {"","","","X",""},
                {"","","","","*"},
                {"","","","","*"},
                {"","","","","X"}
        };
        // i = baris
        // j = kolom
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                if (hotel[i][j].equals("X")){
                    System.out.println("Tamu berada di Lantai " + ((hotel[i].length -1)-i) + " Kamar " + (j+1));
                }
            }
        }
    }

}