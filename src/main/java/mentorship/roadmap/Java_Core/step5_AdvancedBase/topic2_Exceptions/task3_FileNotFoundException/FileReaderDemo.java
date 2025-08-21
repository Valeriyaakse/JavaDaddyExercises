package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task3_FileNotFoundException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader filereader = new FileReader("fff");
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
