import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
class RegexChecker{

public static void isRegex(String email){

        String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        
        if (email.matches(pattern)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
}

public static void main(String args[]){
String email = "shiva@12.com";
isRegex(email);
}

}