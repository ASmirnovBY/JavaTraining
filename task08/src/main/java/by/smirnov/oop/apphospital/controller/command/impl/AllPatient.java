package by.smirnov.oop.apphospital.controller.command.impl;

import by.smirnov.oop.apphospital.controller.command.Command;
import by.smirnov.oop.apphospital.entity.Patient;
import by.smirnov.oop.apphospital.service.PatientService;
import by.smirnov.oop.apphospital.service.exception.ServiceException;
import by.smirnov.oop.apphospital.service.factory.ServiceFactory;

import java.util.List;

public class AllPatient implements Command {

    @Override
    public String execute(String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PatientService patientService = serviceFactory.getPatientService();
        List<Patient> patients;
        StringBuilder response = new StringBuilder();
        try {
            patients = patientService.allPatients();
            if (!patients.isEmpty()) {
                for (Patient patient : patients) {
                    response.append(patient.toString()).append("\n");
                }
            } else {
                response = new StringBuilder("No patients on data base");
            }
        } catch (ServiceException e) {
            response.append("File not found");
        }
        return response.toString();
    }
}
