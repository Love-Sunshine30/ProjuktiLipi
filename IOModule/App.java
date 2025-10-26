import java.util.Scanner;

public class App{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your userId: ");
        String userId = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        String hashedPassword = Password.hashPassword(password);
        User user = new User(userId, hashedPassword);

        DataStorage.saveData(user);

        System.out.print("Enter your password again for check: ");
        String enteredPassword = scanner.nextLine();

        boolean matched = Password.verifyPassword(enteredPassword, hashedPassword);

        if(matched){
            System.out.println("Your password is correct!");
        }
        else{
            System.out.println("You've entered wrong password!");
        }
        
    }
}