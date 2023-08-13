import java.util.Arrays;

public class Algo8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        int numALen = numA.length;
        int numBLen = numB.length;
        int[] check = new int[7];
        int[] A_check = new int[7];
        int[] B_check = new int[7];
        
        int count=0;
        int count2=0;
        int count3=0;
        loop:
        for (int i = 0; i < numALen; i++) {
            for(int j = 0; j < numBLen; j++){
                if(numA[i]==numB[j]){
                    check[count]=numB[j]; // find (A∩B)
                    count++;
                    continue loop;
                }
            }
            A_check[count2]=numA[i]; // A-(A∩B)
            count2++;
        }
        loop2:
        for (int i = 0; i < numBLen; i++) {
            for(int j = 0; j < numALen; j++){
                if(numB[i]==numA[j]){
                    continue loop2;
                }
            }
            B_check[count3]=numB[i]; // B-(A∩B)
            count3++;
        }
        System.out.println(count);
        System.out.println(count3);
        for(int i=0; i<B_check.length; i++){
            System.out.println(B_check[i]);
        }
        int[] intersec = new int[count];
        int[] a_intSec = new int[count2];
        int[] b_intSec = new int[count3];
        
        for (int i = 0; i < count; i++) {
            intersec[i] = check[i];
        }
        String stringABintSec = Arrays.toString(intersec);

        for (int i = 0; i < a_intSec.length; i++) {
            a_intSec[i]= A_check[i];
        }
        String stringA_intsec = Arrays.toString(a_intSec);
        
        for (int i = 0; i < b_intSec.length; i++) {
            b_intSec[i]= B_check[i];
        }
        String stringB_intsec = Arrays.toString(b_intSec);

        System.out.println("(numA \u2229 numB) is : "+ stringABintSec);
        System.out.println("(numA \u222A numB) is : "+ stringA_intsec+"\b, " +stringABintSec.substring(1,stringABintSec.length()) + "\b, "+stringB_intsec.substring(1,stringB_intsec.length()));
        System.out.println("(numA \\ numB) is : "+ stringA_intsec);
        System.out.println("(numB \\ numA) is : "+ stringB_intsec);
        System.out.println("(numA \u25B3 numB) is : "+stringA_intsec +"\b, " + stringB_intsec.substring(1,stringB_intsec.length()));
    }
}
