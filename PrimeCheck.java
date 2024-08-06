public class PrimeCheck {
    public static void main(String[] args) {
        double bil = 7;
        int faktor = 0;
        for (int i = 1; i <= bil; i++) {                             // (int i = 2; i < bil; i++)
            if (bil % i == 0) {                                      // hanya ngecek 2,3,4
                faktor++;
            }
        }
        if (faktor == 2) {                                           // bisa diganti dengan 0
//            bil = (int) bil;                                       // casting (perubahan data ke tipe yang lebih kecil)
            System.out.println(bil + " adalah bilangan Prima");   // String.valueOf(bil) untuk ke string
        } else {
            System.out.println(bil + " adalah bukan bilangan Prima");
        }
    }
}
// totalkan bilangan prima dari 1 - 1000