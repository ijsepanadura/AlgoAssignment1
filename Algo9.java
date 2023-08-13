import java.util.Scanner;

public class Algo9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text;
        String reverse;
        String[] set = new String[2];
        do{
            System.out.print("Enter a single word : ");
            text = scanner.nextLine().strip();
            if(text.length()==0){
                System.out.println("Text cannot be empty ! try again..");
                continue;
            }
            else if(text.contains(" ")){
                System.out.println("Please enter a single word ! try again..");
                continue;
            }
            int textLen= text.length();
            set[0]= text.substring(0,textLen/2);
            if(textLen%2==0){
                set[1]= text.substring(textLen/2,textLen);
            }else{
                set[1]= text.substring(textLen/2+1,textLen);
            }
            reverse="";
            for (int i = 0; i < set[1].length(); i++) {
                reverse= set[1].charAt(i) + reverse;
            }
            set[1]=reverse;
            if (set[0].equals(set[1]))System.out.println('"' + text +'"'+ " is a palindrome");
            else System.out.println(text+" is not a palindrome");
        }while(true);
    }
}
