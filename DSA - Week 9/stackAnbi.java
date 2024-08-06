public class stackAnbi {

    final int MAX_DATA =10; 
    String [] tumpukan = new String [MAX_DATA];
    int teratas;

    public stackAnbi(){
       teratas=0; 
    }

    public void push(String data){
        if (teratas == MAX_DATA){
            System.out.println("tumpukan sudah penuh");
        }else{ 
        teratas++; 
        tumpukan[MAX_DATA-teratas]=data;
    }
}
    

    public boolean empty(){
        return teratas==0;
    }
    
    public String pop(){
        String data =null;
        if (!empty()){
            for (int i=0;i<tumpukan.length;i++){
                if (tumpukan[i]!= null){
                    data = tumpukan[i];
                    tumpukan[i]=null;
                    break; 
                }
            }  
        teratas--;
        return data;
    }
    else{
    return "tumpukan sudah kosong";
    }
}
    
    public void infoStack(){
        for (int i=0;i<tumpukan.length;i++){
            System.out.println(tumpukan[i]);
        }
    }
}
