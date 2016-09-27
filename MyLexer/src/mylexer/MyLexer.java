package mylexer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MyLexer {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        
        Identifier("[+]", input, "PLUS");
        Identifier("[-]", input, "MINUS");
        Identifier("[*]", input, "TIMES");
        Identifier("[/]", input, "DIVIDE");
        Identifier("[(]", input, "LPAREN");
        Identifier("[)]", input, "RPAREN");
        Identifier("[=]", input, "ASSIGN");
        Identifier("[;]", input, "SEMI");
        Identifier("[a-z_]{1,}", input, "ID");
        Identifier("[0-9]{1,}", input, "NUMBER");
    }
    public static void Identifier(String regex, String check, String checker){
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(check);

            while (match.find()){
                if (match.group().length() !=0) {
                    System.out.println("Token: " + match.group().trim());
                }
                System.out.println("Symbolic Name: " + checker);
            }
    }
}
