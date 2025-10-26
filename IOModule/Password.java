import org.mindrot.jbcrypt.BCrypt;

public class Password{
    public static  String hashPassword(String plainPassword){
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    public static boolean verifyPassword(String enteredPassword, String hashedPassword){
        return BCrypt.checkpw(enteredPassword, hashedPassword);
    }
}