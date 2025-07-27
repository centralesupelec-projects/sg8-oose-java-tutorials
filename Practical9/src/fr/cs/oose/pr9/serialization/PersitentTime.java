package fr.cs.oose.pr9.serialization;

public class PersitentTime implements java.io.Serializable {
    // Avoid errors when updating the class
    // static final long serialVersionUID = -3126998878902358585L;
    public long time;

    public PersitentTime() {
        this.time = System.currentTimeMillis();
    }
}
