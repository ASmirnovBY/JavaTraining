package by.smirnov.oop.apphospital.dao.factory;
import by.smirnov.oop.apphospital.dao.PatientDao;
import by.smirnov.oop.apphospital.dao.impl.PatientDaoImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final PatientDao patientDaoImpl = new PatientDaoImpl();

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public PatientDao getPatientDao() {
        return patientDaoImpl;
    }
}
