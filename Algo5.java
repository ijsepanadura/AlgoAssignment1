import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            byte ascii;
            System.out.print("Enter a text : ");
            byte[] name = scanner.nextLine().strip().getBytes();
            if(name.length==0){
                System.out.println("Text cannot be Empty..");
                continue;
            }
            for (int i = 0; i < name.length/2; i++) {
                if(name[i]<0 || name[i]>127 ||name[name.length-1-i]<0 || name[name.length-1-i]>127){
                    System.out.println("you can only use ASCII input ! try again..");
                    continue loop;
                }
                ascii= name[name.length-1-i];
                name[name.length-1-i] = name[i];   // interchange end and start values
                name[i]=ascii;
            }
            System.out.print("reversed input is : ");
            for (int i = 0; i < name.length; i++) {
                System.out.print((char)name[i]);  // print array values
            }
            System.out.println();
        }while(true);   
    }
}
