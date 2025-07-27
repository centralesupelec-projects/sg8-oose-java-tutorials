package fr.cs.oose.pr3.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Patient {
    private String name;
    private List<Blood> bloodList;

    public Patient(String name) {
        this.name = name;
        this.bloodList = new ArrayList<Blood>();
    }

    public void addBlood_measure(Blood blood_measure) {
        this.bloodList.add(blood_measure);
    }

    public List<Blood> getAbnormalMeasures() {
        List<Blood> abnormalMeasures = new ArrayList<>();
        for (Blood blood : bloodList) {
            if (blood.getSystolic() > 140) {
                abnormalMeasures.add(blood);
            }
        }
        return abnormalMeasures;
    }

    public int getAverageDiastolic() {
        int sum = 0;
        for (Blood blood : bloodList) {
            sum += blood.getDiastolic();
        }
        return sum / bloodList.size();
    }

    public Blood getMaximumSystolicBlood() {
        Blood maxSystolicBlood = bloodList.get(0);
        for (Blood blood : bloodList) {
            if (blood.getSystolic() > maxSystolicBlood.getSystolic()) {
                maxSystolicBlood = blood;
            }
        }
        return maxSystolicBlood;
    }

    public Blood getMaximumDiastolicBlood() {
        Blood maxDiastolicBlood = bloodList.get(0);
        for (Blood blood : bloodList) {
            if (blood.getDiastolic() > maxDiastolicBlood.getDiastolic()) {
                maxDiastolicBlood = blood;
            }
        }
        return maxDiastolicBlood;
    }

    public String getName() {
        return name;
    }

    public List<Blood> getBloodList() {
        return bloodList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBloodList(List<Blood> bloodList) {
        this.bloodList = bloodList;
    }

    public void printReport() {
        System.out.println("** Report for " + name + " **");
        List<Blood> abnormalMeasures = getAbnormalMeasures();
        if (abnormalMeasures.isEmpty()) {
            System.out.println("no measurement was too high");
            System.out.println("Mean diastolic: " + getAverageDiastolic());
        }
        else {
            System.out.println("Systolic measurement was too high: \n" + getMaximumSystolicBlood().toString());
            System.out.println("Mean diastolic: " + getAverageDiastolic());
            Set<Blood> max_measures = new HashSet<Blood>();
            max_measures.add(getMaximumSystolicBlood());
            max_measures.add(getMaximumDiastolicBlood());
            System.out.println("Max measures: " + max_measures);

        }
    }

    public String toString() {
        String s = "Patient [name=" + name + ", bloodList=\n";
        StringBuilder blood_string = new StringBuilder();
        for (Blood blood : bloodList) {
            blood_string.append(blood.toString());
            blood_string.append("\n");
        }
        s += blood_string.toString();
        s += "]";
        return s;
    }
}
