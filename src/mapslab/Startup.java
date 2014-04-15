
package mapslab;

import java.io.IOException;

public class Startup {

    public static void main(String[] args) {

        LabFileReader lfr = new LabFileReader();
        
        try{
        lfr.outputFile();
        } catch (IOException io){
            System.out.println("a");
        }
        
        try{
        lfr.createContacts();
        }catch (IOException io){
            System.out.println("a");
        }
        
        System.out.println();
        
    }
}
