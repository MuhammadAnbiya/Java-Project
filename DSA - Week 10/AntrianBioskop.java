public class AntrianBioskop {
    public static void main(String[] args) {
        Antrian antri1 = new Antrian(5);
        antri1.insert("A");
        antri1.insert("C");
        antri1.insert("D");
        antri1.insert("Z");

        antri1.info();
        System.out.println(antri1.infoPalingBelakang());
        System.out.println(antri1.infoPalingDepan());


        System.out.println("==================================");

        antri1.remove();
        antri1.info();

        System.out.println(antri1.infoPalingBelakang());
        System.out.println(antri1.infoPalingDepan());

    }    
}
