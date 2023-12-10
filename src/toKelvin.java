// user enters a value that is either clesisus or fahrenheit to be converted to kelvin with methods
import java.util.Scanner;
public class toKelvin {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        boolean flag = true; // creating a flag to continue the conversion loop until false
        do{
            char type; // initializing a char to allow the loop to operate 
            do{
            System.out.print("What temperature type do you want to convert to Kelvin? (F/C): "); // asking the user to pick a temperature type to be converted into kelvin
            type = kb.nextLine().charAt(0);
            type = Character.toUpperCase(type); // auto uppercase to ensure loop breaks
            } while(!(type == 'F' || type == 'C'));
            
            System.out.print("Enter your temperature value: "); // asking user for desired value
            double value = kb.nextDouble();

            kb.nextLine(); // consumes newline character left in the buffer to prevent program error

            conversion(type,value); // calling conversion method and filling with the user's desired type and value
            flag = anotherOne(flag); // calling anotherOne method to see if the user wants to convert another temperature

        } while(flag==true);
        System.out.println("Ight gootbye!"); // the ending program message to confirm the loop was exited
    }
    public static void conversion(char type, double value){ // plugging in values from user to be converted and printed
        if (type == 'F'){
            System.out.println("The conversion from Fahrenheit to Kelvin is "+ (value + 255.93));
        }else{
            System.out.println("The conversion from Celsius to Kelvin is "+ (value + 274.15));        }
    }
    public static boolean anotherOne(boolean flag){ // asking the user if they want to repeat the loop in the main program to convert another value
        Scanner kb = new Scanner(System.in);

        System.out.print("Do you want to convert another temperature?: (Y/N) ");
        char again = kb.nextLine().charAt(0);
        again = Character.toUpperCase(again);
        
        if(again == 'Y'){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
        }   
}
