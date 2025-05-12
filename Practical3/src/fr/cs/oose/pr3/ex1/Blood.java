package fr.cs.oose.pr3.ex1;

public class Blood {
    private int systolic;
    private int diastolic;
    private Date date;

    public Blood(int systolic, int diastolic, Date date) {
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.date = date;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public Date getDate() {
        return date;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        String s =  "Blood [ systolic: ";
        s += systolic + " | diastolic: ";
        s += diastolic + " | date: ";
        s += date.toString() + " ]";
        return s;
    }
}
