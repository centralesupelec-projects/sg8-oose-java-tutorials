package fr.cs.oose.pr9.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTime {
    public static void main(String[] args) {
        PersitentTime persitentTime = new PersitentTime();
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/time.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(persitentTime);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch(java.io.IOException i) {
            i.printStackTrace();
        }
    }
}
