import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String senten;
        String[] word;
        int sortLength;
        int longLength;
        int sortIndex=0;
        int longIndex=0;
        do{
            System.out.print("Enter a sentence : ");
            senten = scanner.nextLine().strip();
            if(senten.length()==0){
                System.out.println("sentence cannot be empty");
                continue;
            }
            word = senten.split(" ");
            sortLength = word[0].length();
            longLength = word[0].length();
            for(int i=1; i<word.length; i++){
                if(word[i].length()>longLength){
                    longLength=word[i].length();
                    longIndex=i;
                }
                if(word[i].length()<sortLength){
                    sortLength=word[i].length(); 
                    sortIndex=i;  
                }
            }
            System.out.println("longest word is : "+word[longIndex]);
            System.out.println("sortest word is : "+word[sortIndex]);
        }while(true);
    }
}
