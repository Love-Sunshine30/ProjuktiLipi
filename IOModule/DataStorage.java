
import java.io.FileWriter;
import java.io.IOException;

public class DataStorage{
    private static final String FILENAME = "data_store.txt";

    public static void saveData(User user){
        try(FileWriter writer = new FileWriter(FILENAME)){
            writer.write(user.getUserId() + "\n");
            writer.write(user.getHashedPassword() + "\n");
            writer.close();
            System.out.println("Data Saved Successfully!");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}