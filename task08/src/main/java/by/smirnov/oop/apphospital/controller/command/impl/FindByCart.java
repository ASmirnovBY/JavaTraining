package by.smirnov.oop.apphospital.controller.command.impl;
import by.smirnov.oop.apphospital.controller.command.Command;
import by.smirnov.oop.apphospital.entity.Patient;
import by.smirnov.oop.apphospital.service.PatientService;
import by.smirnov.oop.apphospital.service.exception.ServiceException;
import by.smirnov.oop.apphospital.service.factory.ServiceFactory;

import java.util.List;


public class FindByCart implements Command {

    @Override
    public String execute(String request) {
        String strCartNumber = request.substring((request.indexOf(Command.paramDelimetr) + 1)
                , request.lastIndexOf(Command.paramDelimetr));
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        PatientService patientService = serviceFactory.getPatientService();
        List<Patient> patientsWithCart;
        StringBuilder response = new StringBuilder();
        int cartNumber = 0;
        try {
            cartNumber = Integer.parseInt(strCartNumber);
            patientsWithCart = patientService.findByCartNumber(cartNumber);
            if (!patientsWithCart.isEmpty()) {
                for (Patient patient : patientsWithCart) {
                    response.append(patient.toString()).append("\n");
                }
            } else {
                response = new StringBuilder("Didn't find patient with this cart ").append(cartNumber);
            }
        } catch (ServiceException e) {
            response.append("Error try again");
        } catch (NumberFormatException e) {
            response.append("Number is not valid");
        }

        return response.toString();
    }
}
