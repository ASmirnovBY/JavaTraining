package by.smirnov.oop.apphospital.service.factory;

import by.smirnov.oop.apphospital.service.PatientService;
import by.smirnov.oop.apphospital.service.impl.PatientServicesImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final PatientService patientService = new PatientServicesImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public PatientService getPatientService() {
        return patientService;
    }
}
