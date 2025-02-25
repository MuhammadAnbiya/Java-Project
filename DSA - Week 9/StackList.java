public class StackList {
    public static void main(String[] args) {
        Stack bukusaya = new Stack();
        bukusaya.push("Sukabumi");
        bukusaya.push("Bandung");
        bukusaya.push("Jatinangor");
        bukusaya.push("Sukabumi");
        bukusaya.push("Bandung");
        bukusaya.push("Jatinangor");
        bukusaya.push("Sukabumi");
        bukusaya.push("Bandung");
        bukusaya.push("Harusnya ini");

        System.out.println(bukusaya.pop());

        bukusaya.InfoStack();


    }
}
