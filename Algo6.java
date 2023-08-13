import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            String name;
            String collect="";
            String[] wordCut;
            char[] word;
            int count=0;
            int space =0;
            System.out.print("Enter a text : ");
            name = scanner.nextLine().strip();
            if(name.length()==0){
                System.out.println("Text cannot be Empty..");
                continue;
            }
            word = name.toCharArray();
            for (int i = 0; i < word.length; i++) {
                if((char)word[i]<0 || (char)word[i]>127 ){
                    System.out.println("You can only use ASCII charactors ! try again..");
                    continue loop;
                }
                if(word[i]==' ')space++;
            }
            wordCut = new String[space+1];
            for(int i=word.length-1; i>=0 ;i--){ 
                if(word[i] != ' ')collect = Character.toString(word[i]) + collect;
                if(word[i]==' ' || i==0){
                    wordCut[count]= collect;
                    System.out.print(wordCut[count]+" ");
                    count++;
                    collect="";          
                }
            }
            System.out.println(); 
        }while(true);
    }
}
