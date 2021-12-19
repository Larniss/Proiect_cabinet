package Proiect_Stomatologie.Service;

import java.util.List;

import Proiect_Stomatologie.Class.FisaPacient;

public interface FisaPacientService {
	
	
	List<FisaPacient> getAllFisaPacient();

	void saveFisaPacient(FisaPacient fisapacient);

	FisaPacient getFisaPacientById(long id);

	void deleteFisaPacientById(long id);

}
