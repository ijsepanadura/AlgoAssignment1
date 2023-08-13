import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            String name;
            String[] word;
            String[] reverse;
            System.out.print("Enter a sentence: ");
            name = scanner.nextLine().strip();          // getting user input
            if(name.length()==0){                       // checking weither the input is empty
                System.out.println("sentence cannot be Empty..");
                continue;
            }
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i)<0 || name.charAt(i)>127 ){  // checking weither the input is ASSCII
                    System.out.println("You can only use ASCII charactors ! try again..");
                    continue loop;
                }  
            }
            word = name.split(" ");         // split word by space
            reverse = new String[word.length];
            for(int i=0; i< word.length; i++){
                reverse[i] = word[word.length-1-i];     // inverting array
                System.out.print(reverse[i]+" ");       // display reverse sentence
            }
            System.out.println();
        }while(true);
    }
}
