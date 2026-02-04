package com.ms.corejava.collection;

import java.util.HashMap;
import java.util.Map;

public class MergeStudentMaps {
    public static void main(String[] args) {
        // Create a map to store usernames and passwords for MCA students
        Map<String, String> mcaStudents = new HashMap<>();
        mcaStudents.put("MCA_Student1", "password1");
        mcaStudents.put("MCA_Student2", "password2");
        mcaStudents.put("MCA_Student3", "password3");
        mcaStudents.put("MCA_Student4", "password4");
        mcaStudents.put("MCA_Student5", "password5");
        mcaStudents.put("MCA_Student6", "password6");
        mcaStudents.put("MCA_Student7", "password7");
        mcaStudents.put("MCA_Student8", "password8");
        mcaStudents.put("MCA_Student9", "password9");
        mcaStudents.put("MCA_Student10", "password10");

        // Create a map to store usernames and passwords for MSc students
        Map<String, String> mscStudents = new HashMap<>();
        mscStudents.put("MSc_Student1", "password11");
        mscStudents.put("MSc_Student2", "password12");
        mscStudents.put("MSc_Student3", "password13");
        mscStudents.put("MSc_Student4", "password14");
        mscStudents.put("MSc_Student5", "password15");
        mscStudents.put("MSc_Student6", "password16");
        mscStudents.put("MSc_Student7", "password17");
        mscStudents.put("MSc_Student8", "password18");
        mscStudents.put("MSc_Student9", "password19");
        mscStudents.put("MSc_Student10", "password20");

        // Merge the two maps
        Map<String, String> mergedStudents = new HashMap<>();
        mergedStudents.putAll(mcaStudents);
        mergedStudents.putAll(mscStudents);

        // Display the merged map
        System.out.println("Merged Student Map:");
        for (Map.Entry<String, String> entry : mergedStudents.entrySet()) {
            System.out.println("Username: " + entry.getKey() + ", Password: " + entry.getValue());
        }
    }
}
