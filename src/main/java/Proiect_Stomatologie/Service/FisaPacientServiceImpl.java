package Proiect_Stomatologie.Service;

import java.util.List;
import java.util.Optional;

import Proiect_Stomatologie.Class.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Proiect_Stomatologie.Class.FisaPacient;
import Proiect_Stomatologie.Repository.FisaPacientRepository;

@Service
public class FisaPacientServiceImpl implements FisaPacientService {

		@Autowired
		private FisaPacientRepository fisapacientRepository;

	@Override
		public List<FisaPacient> getAllFisaPacient() {
			return fisapacientRepository.findAll();
		}

		@Override
		public void saveFisaPacient(FisaPacient fisapacient) {
			this.fisapacientRepository.save(fisapacient);
		}

		@Override
		public FisaPacient getFisaPacientById(long id) {
			Optional<FisaPacient> optional = fisapacientRepository.findById(id);
			FisaPacient fisapacient;
			if (optional.isPresent()) {
				fisapacient = optional.get();
			} else {
				throw new RuntimeException(" Id " + id + "nu este a unei fise de pacient.");
			}
			return fisapacient;
		}

		@Override
		public void deleteFisaPacientById(long id) {
			this.fisapacientRepository.deleteById(id);
		}

}



