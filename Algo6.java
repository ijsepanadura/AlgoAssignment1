import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            String name;
            String[] word;
            System.out.print("Enter a sentence: ");
            name = scanner.nextLine().strip();
            if(name.length()==0){
                System.out.println("sentence cannot be Empty..");
                continue;
            }
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i)<0 || name.charAt(i)>127 ){
                    System.out.println("You can only use ASCII charactors ! try again..");
                    continue loop;
                }  
            }
            word = name.split(" ");
            for(int i=0; i< word.length; i++){
                System.out.print(word[word.length-1-i]+" ");
            }
            System.out.println();
        }while(true);
    }
}
