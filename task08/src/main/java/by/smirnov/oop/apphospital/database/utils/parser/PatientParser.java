package by.smirnov.oop.apphospital.database.utils.parser;

import by.smirnov.oop.apphospital.entity.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientParser {
    private static final String DELIMETR = ",";

    public List<Patient> parse(List<String> option) {
        List<Patient> patients = new ArrayList<>();
        String[] splited;
        for (String patientLine : option) {
            splited = patientLine.split(DELIMETR);
            int id = Integer.parseInt(splited[0]);
            String firstName = splited[1];
            String lastName = splited[2];
            String patronymic = splited[3];
            String address = splited[4];
            String number = splited[5];
            int cartNumber = Integer.parseInt(splited[6]);
            String diagnosis = splited[7];
            patients.add(new Patient(id, firstName, lastName, patronymic
                    , address, number, cartNumber, diagnosis));
        }

        return patients;
    }
}
