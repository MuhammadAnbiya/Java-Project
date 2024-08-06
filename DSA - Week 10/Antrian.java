public class Antrian {
    String [] data;
    int palingDepan, palingBelakang;
    int maksElemen;

    public Antrian(int ukuran) {
        palingDepan = 0;
        palingBelakang = 0;
        maksElemen = ukuran;
        data = new String[maksElemen];

    }

    public void insert(String data){
        if (palingBelakang ==  maksElemen){
        System.out.println("Antrian Sudah Penuh");
        System.out.println("Tidak Masuk ke dalam Antrian");

    } else {
        this.data[palingBelakang] = data;
        palingBelakang++;
    }
}

    public String infoPalingBelakang(){
        return "Posisi Paling Belakang Adalah : " + data [palingBelakang-1];
    }

    public String infoPalingDepan(){
        return "Possii Paling Depan Adalah : " + data[palingDepan];
    }


    public String remove (){
        String d = data[palingDepan];
        data [palingDepan] = null;
        palingDepan++;
        return d;
    }


    public void info(){
        for (int i = 0; i < data.length; i++) {
            System.out.println(i+1+". "+data[i]);
        }
    }

}