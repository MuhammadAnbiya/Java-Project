import java.util.Scanner;

public class CountCalorie {
    public static void main(String[] args) {
       double lariPermennit = 60/5;
       double pushUpPermenit = 6.66666667;
       double plankPermennit = 5;
       double totalKalori = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Waktu lama lari : ");
        String lari = sc.nextLine();
        System.out.print("Waktu lama push-up : ");
        String pushUp = sc.nextLine();
        System.out.print("Waktu lama plank : ");
        String plank = sc.nextLine();
        sc.close();

        double dLari = Double.parseDouble(lari);
        double dpushUp = Double.parseDouble(pushUp);
        double dPlank = Double.parseDouble(plank);

        if (dLari > 0){
            totalKalori = totalKalori + (dLari * lariPermennit);
        }if (dpushUp > 0){
            totalKalori = totalKalori + (dpushUp * pushUpPermenit);
        }if (dPlank > 0){
            totalKalori = totalKalori + (dPlank * plankPermennit);
        }

        System.out.println(Math.floor(totalKalori));     // pr nya bikin bener bener jadi bilangan int
    }
}
