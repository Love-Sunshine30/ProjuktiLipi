public class User{
    private final String userId;
    private final String hashedPassword;

    public User(String userId, String hashedPassword){
        this.userId = userId;
        this.hashedPassword = hashedPassword;
    }

    public String getUserId(){
        return userId;
    }
    public String getHashedPassword(){
        return hashedPassword;
    }
}