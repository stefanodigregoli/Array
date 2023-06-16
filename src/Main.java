import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String [] carBrands = {"Fiat", "Mercedes", "Delorean" , "McLaren", "Jeep"};
        System.out.println(carBrands[2]);

        int[]primeNumbers = new int [6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        for(int i=0; i<primeNumbers.length; i++){

            

            System.out.println(primeNumbers[i]);

        }
    }
}