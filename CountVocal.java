public class CountVocal {
    public static void main(String[] args) {

        String variabel = "UNIVERSITAS NUSA PUTRA";
        System.out.println(variabel.length());
        int total_a = 0;
        int total_i = 0;
        int total_u = 0;
        int total_e = 0;
        int total_o = 0;
        int total_konsonan = 0;


        for (int i = 0; i < variabel.length(); i++) {
            char letter = variabel.toLowerCase().charAt(i);   // to lowe case buat bikin string jadi huruf kecil
            if (letter == 'a') {                              // char.At buat nunjuk perhuruf satu satu
                total_a++;                                   //  total_a ++; sama saja dengan total_a = total_a + 1;
            } else if (letter == 'i') {
                total_i++;
            } else if (letter == 'u') {                      // bisa tidak pake toLowerCase() tapi pake or
                total_u++;                                   // else if (letter == 'u' || letter == 'U');
            } else if (letter == 'e') {
                total_e++;
            } else if (letter == '0') {
                total_o++;
            } else {
                total_konsonan++;

            }


        }
        int total_huruf_vocal = total_a + total_i + total_u + total_e +total_o;
        System.out.println("Jumlah Huruf a : " + total_a);
        System.out.println("Jumlah Huruf i : " + total_i);
        System.out.println("Jumlah Huruf u : " + total_u);
        System.out.println("Jumlah Huruf e : " + total_e);
        System.out.println("Jumlah Huruf o : " + total_o);
        System.out.println("Jumlah Huruf Konsonan : " + total_konsonan);
        System.out.println("Jumlah Huruf Vocal : " + total_huruf_vocal);
    }

}