public class PendakianGunung {
    public static void main(String[] args) {
        String[][] pendakian = {
                {"P", "M", "M", "M", "M", "M", "M", "M", "M", "H", "H", "H"},
                {"H", "M", "H", "H", "H", "M", "M", "P", "M", "H", "M", "H"},
                {"H", "M", "M", "M", "H", "P", "H", "H", "H", "H", "M", "H"},
                {"H", "P", "H", "H", "H", "M", "H", "H", "M", "M", "M", "H"},
                {"H", "H", "M", "H", "H", "M", "P", "M", "M", "M", "M", "H"},
                {"P", "H", "M", "P", "H", "M", "H", "H", "H", "H", "H", "P"},
        };

        int tenaga = 12;
        String jalur = "LLLLLUUULRLDDLDRUULLLUUU";

        int row = 0;
        int col = 0;

        for (char step : jalur.toCharArray()) {
            if (step == 'L') {
                col--;
            } else if (step == 'R') {
                col++;
            } else if (step == 'U') {
                row--;
            } else if (step == 'D') {
                row++;
            } else if (step == 'I') {
                if (pendakian[row][col].equals("H")) {
                    tenaga--;
                } else if (pendakian[row][col].equals("M")) {
                    tenaga--;
                } else if (pendakian[row][col].equals("P")) {
                    System.out.println("Selamat Pendakian anda berhasil mencapai Puncak Mahameru, sisa tenaga anda " + tenaga);
                    return;
                }
            }

            if (row < 0 || row >= pendakian.length || col < 0 || col >= pendakian[0].length) {
                System.out.println("Jalur anda salah, anda masuk ke jurang/blank " + (row * pendakian[0].length + col));
                return;
            }

            if (tenaga <= 0) {
                System.out.println("Jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu");
                return;
            }
        }

        System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos -pos yang tersedia");
    }
}