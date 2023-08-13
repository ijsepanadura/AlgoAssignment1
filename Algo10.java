import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String number;
        loop:
        do{
            System.out.print("Enter a phone number : ");
            number = scanner.nextLine().strip();
            if(number.length()==0){
                System.out.println("Number is cannot be empty..! try again.. ");
            }
            if(number.charAt(0)=='0' && number.charAt(3)=='-' && number.length()==11 ){
                for(int i=1; i< number.length(); i++){
                    if(i==3)continue;
                    if(!Character.isDigit(number.charAt(i))){
                        System.out.println("Invalid phone number.! try again.. ");
                        continue loop;
                    }
                }
                System.out.println("Number is validated");
            }else if (number.substring(0,3).equals("+94") 
                    && number.charAt(3)==' ' && number.charAt(6) == ' '
                    && number.length()==14 ){
                for (int i = 3; i < number.length(); i++) {
                    if(i==3 || i==6)continue;
                    if(!Character.isDigit(number.charAt(i))){
                        System.out.println("Invalid phone number.! try again..");
                        continue loop;
                    }   
                }
                System.out.println("Number is validated");
            }
            else{
                System.out.println("Invalid phone number.! try again..");
                continue;
            }
        }while(true);
    }
}
