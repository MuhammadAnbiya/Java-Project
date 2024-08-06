
public class stackListAnbi {
      public static void main(String[] args) {
        stackAnbi mybook = new stackAnbi();
        mybook.push("1");
        mybook.push("2");
        mybook.push("3");
        mybook.push("4");
        mybook.push("5");
        mybook.push("6");
        mybook.push("7");
        mybook.push("8");
        mybook.push("9");
        mybook.push("10");
        mybook.infoStack();
        System.out.println("--------------------------------");
        System.out.println("data yang di pop " + mybook.pop());
        mybook.infoStack();
        mybook.push("18");
        System.out.println("--------------------------------");
        mybook.infoStack();
        
    }
}
