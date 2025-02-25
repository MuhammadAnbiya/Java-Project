public class PalindromeCheck {
    public static void main(String[] args) {
        String sentences = "anbiya";
        String isPalindrome  = "Palindrome";
        for (int i = 0; i < sentences.length(); i++) {
            char Forward = sentences.charAt(i);
            char Backward = sentences.charAt((sentences.length()-1)-i);

            if (Forward != Backward){
                isPalindrome = "Bukan Palindrome";
                break;   // supaya mempercepat compile
            }
        }
        System.out.println(isPalindrome);
    }
}

