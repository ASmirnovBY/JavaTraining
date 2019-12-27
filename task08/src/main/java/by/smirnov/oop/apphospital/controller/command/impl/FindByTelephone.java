package by.smirnov.oop.apphospital.controller.command.impl;

import by.smirnov.oop.apphospital.controller.command.Command;
import by.smirnov.oop.apphospital.entity.Patient;
import by.smirnov.oop.apphospital.service.PatientService;
import by.smirnov.oop.apphospital.service.exception.ServiceException;
import by.smirnov.oop.apphospital.service.factory.ServiceFactory;
import java.util.List;


public class FindByTelephone implements Command {

    @Override
    public String execute(String request) {
        String telephone = request.substring((request.indexOf(Command.paramDelimetr) + 1)
                , request.lastIndexOf(Command.paramDelimetr));
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PatientService patientService = serviceFactory.getPatientService();
        List<Patient> patientsWithTelephone;
        StringBuilder response = new StringBuilder();
        try {
            patientsWithTelephone = patientService.findByPhoneNumber(telephone);
            if (!patientsWithTelephone.isEmpty()) {
                for (Patient patient : patientsWithTelephone) {
                    response.append(patient.toString()).append("\n");
                }
            } else {
                response.append("Didn't find any patient with telephone contains ").append(telephone);
            }
        } catch (ServiceException e) {
            response.append("Error try again");
        }

        return response.toString();
    }
}
