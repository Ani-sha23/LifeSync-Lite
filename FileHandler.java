import java.io.*;
import java.util.*;

public class FileHandler {

    public static <T> void save(String fileName, List<T> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> load(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<T>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}