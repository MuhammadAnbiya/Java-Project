import java.util.Arrays; 
public class bubbleSortAnbi {
    
  public static void main(String[] args) {
    
    String[] kota = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};
    
    System.out.println("Sebelum diurutkan: " + Arrays.toString(kota));

    for(int i = 0; i < kota.length-1; i++) {
      for(int j = 0; j < kota.length-i-1; j++) {
        if(kota[j].compareTo(kota[j+1]) < 0) {
          
          // tukar posisi kota
          String temp = kota[j];
          kota[j] = kota[j+1];  
          kota[j+1] = temp;
        }
      }
    }
    
    System.out.println("Sesudah diurutkan: " + Arrays.toString(kota));
  } 
}