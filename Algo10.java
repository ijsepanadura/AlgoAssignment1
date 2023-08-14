import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String number;
        loop:
        do{
            System.out.print("Enter a phone number : ");
            number = scanner.nextLine().strip();    // getting user input and remove white space
            if(number.length()==0){                 // check weither user input is empty
                System.out.println("Number is cannot be empty..! try again.. ");
            }
            if(number.charAt(0)=='0' && number.charAt(3)=='-' && number.length()==11 ){ // check fist format condition
                for(int i=1; i< number.length(); i++){
                    if(i==3)continue;                              //skip iteration for '-' location
                    if(!Character.isDigit(number.charAt(i))){      // check weither input is given format digit
                        System.out.println("Invalid phone number.! try again.. ");
                        continue loop;
                    }
                }
                System.out.println("Number is validated");
            }else if (number.substring(0,3).equals("+94") 
                    && number.charAt(3)==' ' && number.charAt(6) == ' '
                    && number.length()==14 ){           // // check second format condition
                for (int i = 3; i < number.length(); i++) {
                    if(i==3 || i==6)continue;                  // skip iteration for space location
                    if(!Character.isDigit(number.charAt(i))){  // check weither input is given format digit
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
