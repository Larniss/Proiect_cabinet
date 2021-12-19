package Proiect_Stomatologie.Service;

import java.util.List;



import Proiect_Stomatologie.Class.Pacient;

public interface PacientService {
	

	List<Pacient> getAllPacient();

	void savePacient(Pacient pacient);

	Pacient getPacientById(long id);

	void deletePacientById(long id);

}
