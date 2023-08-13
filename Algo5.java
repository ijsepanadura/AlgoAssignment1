import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            String reverse="";
            System.out.print("Enter a text : ");
            String name = scanner.nextLine().strip(); // getting input and space remove

            if(name.length()==0){           // checking weither the input is empty
                System.out.println("Text cannot be Empty..");
                continue;
            }
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i)<0 || name.charAt(i)>127){ //checking weither the input is ASCII
                    System.out.println("you can only use ASCII input ! try again..");
                    continue loop;
                }
                reverse = Character.toString(name.charAt(i)) + reverse;  // input inverting 
            }
            System.out.println("reversed input is : " + reverse);
        }while(true);   
    }
}
