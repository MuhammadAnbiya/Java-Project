import java.util.Arrays; 
public class insertionSortAnbi {
    
    void sort(int arr[]) {
      int n = arr.length;
      
      for(int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;
      
        while (j >= 0 && arr[j] > key) {
          arr[j + 1] = arr[j];
          j = j - 1;
        }
        arr[j + 1] = key;
      }
    }
    
    public static void main(String[] args) {
  
      int[] nilai = {88, 34, 6, 23, 56, 97};
      System.out.println("Nilai sebelum diurutkan: " + Arrays.toString(nilai));
      
      insertionSortAnbi ob = new insertionSortAnbi(); 
      ob.sort(nilai);
      
      System.out.println("Nilai setelah diurutkan: " + Arrays.toString(nilai)); 
    }
  }