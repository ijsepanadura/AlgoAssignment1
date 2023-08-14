import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String senten;
        String[] word;      // declare a array for store splited words
        int sortLength;
        int longLength;
        int sortIndex=0;  //declare a variable for sortest word index
        int longIndex=0;  //declare a variable for longest word index
        do{
            System.out.print("Enter a sentence : ");
            senten = scanner.nextLine().strip();                // getting user input and remove space
            if(senten.length()==0){                             // check weither the sentence is empty
                System.out.println("sentence cannot be empty");
                continue;
            }
            word = senten.split(" ");       // separate word by space & add to String array
            sortLength = word[0].length();        // variable initialization
            longLength = word[0].length();        // variable initialization
            longLength = word[0].length();
            for(int i=1; i<word.length; i++){
                if(word[i].strip().length()==0)continue;  // check weither is there any empty words
                if(word[i].length()>longLength){           // finding longest word
                    longLength=word[i].length();
                    longIndex=i;                           // store longest word index
                }
                if(word[i].length()<sortLength){            // finding sortest word
                    sortLength=word[i].length(); 
                    sortIndex=i;                            // store sortest word index
                }
            }
            System.out.println("longest word is : "+word[longIndex]+" & length is : "+ word[longIndex].length());
            System.out.println("sortest word is : "+word[sortIndex]+" & length is : "+ word[sortIndex].length());
        }while(true);
    }
}
