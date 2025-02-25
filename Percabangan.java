public class Percabangan {

    public static void main(String[] args) {
        // percabangan satu kondisi

        int number = 5;
        if (number == 5){
            System.out.println("Bilangan = 5");
        }
        // percabangan dua kondisi
        int nilai = 70;
        System.out.println("Nilai anda adalah : " + nilai);
        if (nilai >= 70){
            System.out.println(" Nilai anda "+ nilai +"Anda lulus KKM");
        }
        else{
            System.out.println(" Nilai anda "+ nilai +"Anda tidak lulus KKM");
        }
        // percabangan tiga kondisi
        int age = 13;
        System.out.println("Umur anda adalah " + age);
        if (age > 30){
            System.out.println("Umur anda di atas 30");
        }
        else if (age == 30) {
            System.out.println("Umur sama dengan 30");
        }
        else {
            System.out.println("Umur anda dibawah 30 ");
        }

    }
}
