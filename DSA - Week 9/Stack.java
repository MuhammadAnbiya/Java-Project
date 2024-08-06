public class Stack {
    final int MAX_DATA = 10; // final untuk tipe data yang konstan

    int teratas;
    String tumpukan [] = new String[MAX_DATA]; 

    public Stack(){
        teratas = 0;
    }

    public void push(String data){

        if (teratas == MAX_DATA){
            System.out.println("Tumpukan Sudah Penuh");
        } else{
            teratas++;
            tumpukan [MAX_DATA-teratas] = data;
        }
        
    }

    public boolean empty(){
        return teratas == 0;
    }

    public String pop(){
        String data = null;
        if(!empty()){
            for (int i = 0; i < tumpukan.length; i++){
                if (tumpukan[i] != null){
                        data = tumpukan[i];
                        tumpukan[i] = null;
                        break;
                }
            }
            teratas--;
            return data;
        } else{
            return "Tumpukan Sudah Kosong";
        }
            
    }

    public void InfoStack(){
        for (int i = 0; i < tumpukan.length; i++) {
            System.out.println(tumpukan[i]);
        }
    }
}
