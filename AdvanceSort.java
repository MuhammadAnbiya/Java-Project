public class AdvanceSort {

    static int maximum;
    public static void main(String[] args)   //100,75,3,9,50
    {
         int data [] = {271,1060,17,8,72};
 
        for (int i = 0; i < data.length; i++) {
             for (int j = i + 1; j < data.length; j++) {
 
                int temp = 0;
                if (data[j] < data[i]) {
 
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
 
            System.out.print(data[i] + " ");
        }
    }
}

