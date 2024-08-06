import javax.swing.*;

public class tugasSesi6_2{
    public static void main(String[] args) {
        //        buatlah program JAVA untuk menentukan pengecekan progress dari  Langkah-langkah perencanaan pendakian.
        int energi = 0;
        String jalur;

        energi = Integer.parseInt(JOptionPane.showInputDialog("Masukan energi awal : "));
        jalur = JOptionPane.showInputDialog("Masukan jalur pendakian : ");

        String pendakian[][] = {
                {"P", "M", "M", "M", "M", "M", "M", "M", "M", "H", "H", "H",},
                {"H", "M", "H", "H", "H", "M", "M", "P3", "M", "H", "M", "H",},
                {"H", "M", "M", "M", "H", "P4", "H", "H", "H", "H", "M", "H",},
                {"H", "TC", "H", "H", "H", "M", "H", "H", "M", "M", "M", "H",},
                {"H", "H", "M", "H", "H", "M", "P2", "M", "M", "M", "M", "H",},
                {"P5", "H", "M", "RK", "H", "M", "H", "H", "H", "H", "H", "P1",}    // 5,11
        };
        int kolom = 11;
        int baris = 5;

        for (char huruf : jalur.toCharArray()) {
            String hurufString = String.valueOf(huruf);
            hurufString = hurufString.toLowerCase();

            if (hurufString.equals("l")){
                kolom--;
            } else if (hurufString.equals("r")){
                kolom++;
            } else if (hurufString.equals("u")){
                baris--;
            } else if (hurufString.equals("d")){
                baris++;
            } else if (hurufString.equals("i")) {
                if (pendakian[baris][kolom].equals("P1") || pendakian[baris][kolom].equals("P2") ||
                        pendakian[baris][kolom].equals("P3") || pendakian[baris][kolom].equals("P4") ||
                        pendakian[baris][kolom].equals("P5") || pendakian[baris][kolom].equals("RK") || pendakian[baris][kolom].equals("TC")) {
                    energi += 10;
                } else {
                    System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos-pos yang tersedia");
                    break;

                }
            }
            String posisi = pendakian[baris][kolom];
            if (posisi.equals("H") || posisi.equals("P1") || posisi.equals("P2") || posisi.equals("P3") || posisi.equals("P4") ||
                posisi.equals("P5") || posisi.equals("RK") || posisi.equals("TC")){
                if (!hurufString.equals("i")) {
                    energi--;
                }
            }
            else if (posisi.equals("M")){
                energi--;
                System.out.println("Jalur anda salah, anda masuk ke jurang/blank 45.");
                break;
            } else if (posisi.equals("P")) {
                energi--;
                System.out.println("Selamat Pendakian anda berhasil mencapai Puncak Mahameru, sisa energi anda " + energi);
            }

            if (energi == 0){
                System.out.println("Jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu");
                break;
            }
        }
        System.out.println("Sisa energi anda : " + energi);
    }
}