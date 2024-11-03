import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File(".idea/nogletal.csv");


    public ArrayList<Covid19Data> loadAllRegionsAndAgeGroups() throws FileNotFoundException {
        ArrayList<Covid19Data> allRegionsAndAgeGroups = new ArrayList<>();

        Scanner scanner = null;

        try {

            scanner = new Scanner(file);

            scanner.nextLine();

            Covid19Data covid19Data = null;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (!line.isEmpty()  && !line.matches("^[;]*$")) {
                    String[] attributes = line.split(";");

                    if (attributes.length >= 6) {
                        try {

                            covid19Data = new Covid19Data(attributes[0], attributes[1], (Integer.parseInt(attributes[2])),
                                    (Integer.parseInt(attributes[3])),
                                    (Integer.parseInt(attributes[4])),
                                    (Integer.parseInt(attributes[5])), attributes[6]
                            );

                            allRegionsAndAgeGroups.add(covid19Data);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number format in line: " + line);
                        }
                    } else {
                        System.out.println("Nout enough attribtues in line: " + line);

                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return allRegionsAndAgeGroups;
    }


}
