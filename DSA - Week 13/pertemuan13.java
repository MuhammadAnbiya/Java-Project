public class pertemuan13 {

    static int maximum;
    public static void main(String[] args) {
        
        //Mencari Nilai Data Terkecil
        
        int data [] = {20,18,24,36,6};
        maximum = data[0];

        for(int i = 1; i < data.length;i++){
            if(data[i] < maximum){
                maximum = data[i];
            }
        }
        System.out.println("angka yang terkecil adalah : " + maximum);
    }
}
