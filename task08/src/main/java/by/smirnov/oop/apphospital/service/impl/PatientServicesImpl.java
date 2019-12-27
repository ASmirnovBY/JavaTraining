package by.smirnov.oop.apphospital.service.impl;

import by.smirnov.oop.apphospital.dao.PatientDao;
import by.smirnov.oop.apphospital.dao.exception.DAOException;
import by.smirnov.oop.apphospital.dao.factory.DAOFactory;
import by.smirnov.oop.apphospital.entity.Patient;
import by.smirnov.oop.apphospital.service.PatientService;
import by.smirnov.oop.apphospital.service.exception.ServiceException;

import java.util.List;
import java.util.stream.Collectors;

public class PatientServicesImpl implements PatientService {

    @Override
    public void addNewPatient(Patient patient) throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PatientDao patientDaoImpl = daoFactory.getPatientDao();
        try {
            patientDaoImpl.insert(patient);
        } catch (DAOException e) {
            throw new ServiceException("", e);
        }
    }

    @Override
    public List<Patient> allPatients() throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PatientDao patientDaoImpl = daoFactory.getPatientDao();
        List<Patient> patients;
        try {
            patients = patientDaoImpl.findAll();
        } catch (DAOException e) {
            throw new ServiceException("", e);
        }
        return patients;
    }

    @Override
    public List<Patient> findByDiagnosis(String diagnosis) throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PatientDao patientDaoImpl = daoFactory.getPatientDao();
        List<Patient> patientWithDiagnosis;

        try {
            patientWithDiagnosis = patientDaoImpl.findAll()
                    .stream()
                    .filter(
                            patient -> patient.getDiagnosis().equalsIgnoreCase(diagnosis)
                    ).collect(Collectors.toList());
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return patientWithDiagnosis;
    }

    @Override
    public List<Patient> findByCartNumber(int cartNumber) throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PatientDao patientDaoImpl = daoFactory.getPatientDao();
        List<Patient> patientCartNumberInRange;
        try {
            patientCartNumberInRange = patientDaoImpl.findAll()
                    .stream()
                    .filter(patient -> patient.getCartNumber() == cartNumber)
                    .collect(Collectors.toList());
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return patientCartNumberInRange;
    }

    @Override
    public List<Patient> findByPhoneNumber(String phone) throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PatientDao patientDaoImpl = daoFactory.getPatientDao();
        List<Patient> patientFindPhone;
        try {
            patientFindPhone = patientDaoImpl.findAll().stream()
                    .filter(
                            patient -> patient.getNumber().contains(phone)
                            )
                    .collect(Collectors.toList());
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return patientFindPhone;
    }
}
