package by.smirnov.oop.apphospital.dao.impl;

import by.smirnov.oop.apphospital.dao.PatientDao;
import by.smirnov.oop.apphospital.dao.exception.DAOException;
import by.smirnov.oop.apphospital.database.utils.FileDataBasePath;
import by.smirnov.oop.apphospital.database.utils.parser.PatientParser;
import by.smirnov.oop.apphospital.entity.Patient;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PatientDaoImpl implements PatientDao {

    @Override
    public List<Patient> findAll() throws DAOException {
        List<Patient> patient;
        try {
            List<String> patientFromfile = Files.
                    lines(Paths.get(FileDataBasePath.PATIENT_FILE_PATH.getPath()))
                    .collect(Collectors.toList());
            PatientParser parser = new PatientParser();
            patient = parser.parse(patientFromfile);
        } catch (IOException e) {
            throw new DAOException("File not found", e);
        }

        return patient;
    }

    @Override
    public void insert(Patient patient) throws DAOException {
        if (patient != null) {
            try (FileWriter writer = new FileWriter(new File(FileDataBasePath.
                    PATIENT_FILE_PATH.getPath()), true)) {
                writer.write(patient.toFile());
                writer.append('\n');
                writer.flush();
            } catch (IOException e) {
                throw new DAOException("File not found", e);
            }
        }
    }
}