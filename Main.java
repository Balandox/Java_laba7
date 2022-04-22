
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Settings settings = new Settings();
        settings.loadFromTextFile("output.txt");
        settings.saveToTextFile("input.txt");
        settings.put("labelSize", 10);
        //settings.delete("volume");
        //settings.loadFromBinaryFile("BinInput.txt");
        //settings.saveToBinaryFile("BinOutput.txt");
        System.out.println(settings);
    }
}
