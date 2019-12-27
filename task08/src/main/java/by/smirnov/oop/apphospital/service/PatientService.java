package by.smirnov.oop.apphospital.service;
import by.smirnov.oop.apphospital.entity.Patient;
import by.smirnov.oop.apphospital.service.exception.ServiceException;
import java.util.List;


public interface PatientService {
    void addNewPatient(Patient patient) throws ServiceException;
    List<Patient> allPatients() throws ServiceException;
    List<Patient> findByDiagnosis(String diagnosis) throws ServiceException;
    List<Patient> findByCartNumber(int cartNumber) throws ServiceException;
    List<Patient> findByPhoneNumber(String phone) throws ServiceException;
}
