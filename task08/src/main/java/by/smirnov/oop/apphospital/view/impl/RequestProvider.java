package by.smirnov.oop.apphospital.view.impl;

import by.smirnov.oop.apphospital.view.command.RequestCommand;
import by.smirnov.oop.apphospital.view.command.RequestType;
import by.smirnov.oop.apphospital.view.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class RequestProvider {
    private Map<RequestType, RequestCommand> requests = new HashMap<>();

    RequestProvider() {
        requests.put(RequestType.ALL_PATIENT, new AllPatient());
        requests.put(RequestType.BY_DIAGNOSIS, new FindPatientByDiagnosis());
        requests.put(RequestType.BY_CART, new FindPatientByCart());
        requests.put(RequestType.BY_PHONE, new FindPatientByTelephone());
        requests.put(RequestType.WRONG_REQUEST, new WrongRequest());
        requests.put(RequestType.ADD_PATIENT, new AddPatient());
        requests.put(RequestType.EXIT, new ExitCommand());
    }

    RequestCommand getRequestCommand(String type) {
        RequestCommand requestCommand = null;
        RequestType requestType = null;
        try{
            requestType = RequestType.valueOf(type.toUpperCase());
            requestCommand = requests.get(requestType);
        } catch (IllegalArgumentException | NullPointerException e) {
            requestCommand = requests.get(RequestType.WRONG_REQUEST);
        }
        return requestCommand;
    }
}
