package Proiect_Stomatologie;

import java.util.List;

public interface DoctorService {
	List<Doctor> getAllDoctor();

	void saveDoctor(Doctor doctor);

	Doctor getDoctorById(long id);

	void deleteDoctorById(long id);

}
