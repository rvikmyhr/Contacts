package mapslab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LabFileReader {

    private File data = new File("src" + File.separatorChar + "mapslab" + File.separatorChar + "Lab1.txt");
    private BufferedReader bReader = null;
    private List<Contact> contactList = new ArrayList<Contact>();
    
    public void outputFile() throws IOException {

        bReader = new BufferedReader(new FileReader(data));
        String line = bReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bReader.readLine();
        }
    }

    public void createContacts() throws IOException {
        String line = bReader.readLine();

        int count = 1;

        while (line != null) {
            double recordStart = count * 8 - 7;
            double recordEnd = recordStart + 7;
            if (count >= recordStart && count <= recordEnd) {
                Contact contact = new Contact();
                
            }
            line = bReader.readLine();
            count++;
        }
    }

}
