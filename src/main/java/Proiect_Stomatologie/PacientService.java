package Proiect_Stomatologie;

import java.util.List;

public interface PacientService {
	List<Pacient> getAllPacient();

	void savePacient(Pacient pacient);

	Pacient getPacientById(long id);

	void deletePacientById(long id);

}
