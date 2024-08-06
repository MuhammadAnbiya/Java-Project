public class UsernamePW {

    public static void main(String[] args) {
        String resultUser, resultPassword;
        String username = "anbiya";
        String password = "bismillah";

        if (username.equals("anbiya")  && password.equals("bismillah")){
            resultUser = "Benar";
            resultPassword = "Benar";
        }
        else if (username.equals("anbiya")  && !password.equals("bismillah")){
            resultUser = "Benar";
            resultPassword = "Salah";
        }
        else if (!username.equals("anbiya")  && password.equals("bismillah")){
            resultUser = "Salah";
            resultPassword = "Benar";
        } else{
            resultUser = "Salah";
            resultPassword = "Benar";
            }
        System.out.println(resultUser + "\n" +  resultPassword);
        }
    }

