import org.mindrot.jbcrypt.BCrypt;

public class Password{
    // encrypts password
    public static  String hashPassword(String plainPassword){
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    // verify password
    public static boolean verifyPassword(String enteredPassword, String hashedPassword){
        return BCrypt.checkpw(enteredPassword, hashedPassword);
    }
}