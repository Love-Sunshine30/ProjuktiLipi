import java.util.Scanner;

public class App{
    public static void main(String[] args){
        // creating a scanner object
        Scanner scanner = new Scanner(System.in);

        // taking user input
        System.out.print("Enter your userId: ");
        String userId = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Hashing the password
        String hashedPassword = Password.hashPassword(password);
        User user = new User(userId, hashedPassword);

        // storing the user data
        DataStorage.saveData(user);

        System.out.print("Enter your password again for check: ");
        String enteredPassword = scanner.nextLine();

        // verifying password
        boolean matched = Password.verifyPassword(enteredPassword, hashedPassword);

        if(matched){
            System.out.println("Your password is correct!");
        }
        else{
            System.out.println("You've entered wrong password!");
        }
        // closing the scanner object
        scanner.close();
    }
}