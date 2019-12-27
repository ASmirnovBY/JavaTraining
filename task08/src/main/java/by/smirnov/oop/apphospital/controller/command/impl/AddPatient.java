package by.smirnov.oop.apphospital.controller.command.impl;

import by.smirnov.oop.apphospital.controller.command.Command;
import by.smirnov.oop.apphospital.entity.Patient;
import by.smirnov.oop.apphospital.service.PatientService;
import by.smirnov.oop.apphospital.service.exception.ServiceException;
import by.smirnov.oop.apphospital.service.factory.ServiceFactory;

public class AddPatient implements Command {

    @Override
    public String execute(String request) {
        String requestPatientParam = request.substring((request.indexOf(Command.paramDelimetr) + 1)
                , request.lastIndexOf(Command.paramDelimetr));
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PatientService patientService = serviceFactory.getPatientService();
        StringBuilder response = new StringBuilder();
        String[] parameters = requestPatientParam.split(",");
        Patient newPatient = new Patient();
        newPatient.setId(Integer.parseInt(parameters[0]));
        newPatient.setFirstName(parameters[1]);
        newPatient.setLastName(parameters[2]);
        newPatient.setPatronymic(parameters[3]);
        newPatient.setAddress(parameters[4]);
        newPatient.setNumber(parameters[5]);
        newPatient.setCartNumber(Integer.parseInt(parameters[6]));
        newPatient.setDiagnosis(parameters[7]);
        try {
            patientService.addNewPatient(newPatient);
            response.append("Added").append(" ").append(newPatient.toString());
        } catch (ServiceException e) {
            response.append("File not found");
        }

        return response.toString();
    }
}
