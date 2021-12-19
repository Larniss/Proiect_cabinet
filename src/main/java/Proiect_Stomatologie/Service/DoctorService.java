package Proiect_Stomatologie.Service;

import java.util.List;

import Proiect_Stomatologie.Class.Doctor;

public interface DoctorService {
	List<Doctor> getAllDoctor();

	void saveDoctor(Doctor doctor);

	Doctor getDoctorById(long id);

	void deleteDoctorById(long id);

}
