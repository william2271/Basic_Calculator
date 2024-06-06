import java.util.Scanner;

public class Calculator {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter first number"); //take user first number
    int num1 = myObj.nextLine(); // Read user input
    System.out.println("Enter second number"); // takes 2nd number
    int num2 = myObj.nextLine(); // takes second number
    operation();

    public static void operation() {
        System.out.println("Which operation do you want to do");
        String response = myObj.nextLine();

        if (response.equals("add") || response.equals("addition") {
            add(num1,num2);
        }

        if (response.equals("subutract") || response.equals("subtraction") {
            subs(num1,num2);
        }
       if (response.equals("multiply") || response.equals("multiplication") {
            multi(num1,num2);
        }
       if (response.equals("divide") || response.equals("division") {
            if( num2 == 0) {
                System.out.println("Cannot divide by zero"); // in case of 0
                num2 = myObj.nextLine(); // takes second number
            }
            divide(num1,num2);
        }

       if (response.equals("modulo") || response.equals("modulate") {
            modulo(num1,num2);
        }

        else {

            operation()
        }
        
    }
    public void add(num1, num2){
        System.out.println(num1+num2);
    }
    public void subs(num1,num2){

        System.out.println(num1-num2);
    }
    public void multi(num1, num2){

        System.out.println(num1*num2);

    }
    public void divide(num1, num2){

        System.out.println(num1/num2);
    }
    public void modulo(num1, num2){

        System.out.println(num1%num2);

    }

}
