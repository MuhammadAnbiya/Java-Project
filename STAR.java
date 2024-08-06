public class STAR {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == 5){
                for (int k = 5; k >= 1; k--) {
                    for (int l = 1; l <= k; l++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
