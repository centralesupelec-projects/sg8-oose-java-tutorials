package fr.cs.oose.pr9.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeTime {
    public static void main(String[] args) {
        PersitentTime time = null;
        try {
            FileInputStream fileIn= new FileInputStream("/tmp/time.ser");
            ObjectInputStream in= new ObjectInputStream(fileIn);
            time = (PersitentTime) in.readObject(); // requires casting
            in.close();
            fileIn.close();
        } catch(java.io.IOException i) {
            i.printStackTrace();
            return;
        } catch(ClassNotFoundException c) {
            System.out.println("Persistent time class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized time...");
        System.out.println("value:" + time.time);
    }
}
