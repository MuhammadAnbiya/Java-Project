public class ABCDE {

    public static void main(String[] args) {
        int nilai = 66;
        System.out.println("Nilai yang anda peroleh adalah : " + nilai);
        if (nilai >= 85 && nilai <= 100){
            System.out.println("Nilai anda kategori A");
        }
        else if (nilai >= 75 && nilai <= 84) {
            System.out.println("Nilai anda kategori B");
        }
        else if (nilai >= 70 && nilai <= 74){
            System.out.println("Nilai anda kategori C");
        }
        else if (nilai >= 50 && nilai <= 69){
            System.out.println("Nilai anda kategori D");
        }
        else if (nilai <= 50  && nilai >= 0){
            System.out.println("Nilai anda kategori E");
        }
        else{
            System.out.println("Nilai yang anda masukan diluar range");
        }
    }
}

