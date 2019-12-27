package by.smirnov.oop.apphospital.controller.command.impl;

import by.smirnov.oop.apphospital.controller.command.Command;
import by.smirnov.oop.apphospital.entity.Patient;
import by.smirnov.oop.apphospital.service.PatientService;
import by.smirnov.oop.apphospital.service.exception.ServiceException;
import by.smirnov.oop.apphospital.service.factory.ServiceFactory;

import java.util.List;


public class FindByDiagnosis implements Command {

    @Override
    public String execute(String request) {
        String diagnosis = request.substring((request.indexOf(Command.paramDelimetr) + 1)
                , request.lastIndexOf(Command.paramDelimetr));
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PatientService patientService = serviceFactory.getPatientService();
        List<Patient> patientsWithDiagnosis;
        StringBuilder response = new StringBuilder();
        try {
            patientsWithDiagnosis = patientService.findByDiagnosis(diagnosis);
            if (!patientsWithDiagnosis.isEmpty()) {
                for (Patient patient : patientsWithDiagnosis) {
                    response.append(patient.toString()).append("\n");
                }
            } else {
                response.append("Didn't find patient with this ").append(diagnosis);
            }
        } catch (ServiceException e) {
            response.append("Error try again");
        }

        return response.toString();
    }
}
