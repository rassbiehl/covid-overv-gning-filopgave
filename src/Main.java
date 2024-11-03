import java.io.FileNotFoundException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
FileHandler fh = new FileHandler();

ArrayList<Covid19Data> covid19Data = fh.loadAllRegionsAndAgeGroups();

for (Covid19Data dataLinje : covid19Data) {
    System.out.println(dataLinje);
}

    }
}