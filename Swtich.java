public class Swtich {
    public static void main(String[] args) {
        int day = 1;
        String resultDay;  // ibaratkan list kosong
        switch (day){
            case 1:
                resultDay = "senin";
                break;
            case 2:
                resultDay = "selasa";
                break;
            case 3:
                resultDay = "rabu";
                break;
            case 4:
                resultDay = "kamis";
                break;
            case 5:
                resultDay = "jumat";
                break;
            case 6:
                resultDay = "sadsabtu";
                break;
            case 7:
                resultDay = "minggu";
                break;
            default :
                resultDay = "salah input";

        }
        System.out.println(resultDay);
    }
}
