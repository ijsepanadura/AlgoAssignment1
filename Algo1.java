import java.util.Scanner;

public class Algo1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int num=1;         // num variable for store input
        int check=0;       // check variable is declared for input validation
        int fibonancci1=0; 
        int fibonancci2=1;
        int hold;           // hold variable to hold fibonanci value during calc

        do{
            if(check==0){
                System.out.print("Enter a positive number for Fibonancci : ");
                num = scanner.nextInt();                // getting input
                scanner.skip(System.lineSeparator());   // skip new line command which is waiting
                if(num<0){
                    System.out.println("Please enter a positive number");
                    num = 1;
                }else {
                    check=1;        // pass to calculation
                    System.out.print("fibonancci numbers upto "+ num +" : " + fibonancci1);
                }
            }else if(check==1){
                System.out.print(", "+fibonancci2);
                hold =fibonancci1;
                fibonancci1=fibonancci2;
                fibonancci2 =hold + fibonancci2;

            }
            if(fibonancci2>num){
                System.out.println();
                fibonancci1=0;      // variable initilization for next input4
                fibonancci2 =1;
                check=0;
            }

        }while(true);
        
    }
}