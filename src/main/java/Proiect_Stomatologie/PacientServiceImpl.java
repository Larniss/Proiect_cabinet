package Proiect_Stomatologie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacientServiceImpl implements PacientService {

	@Autowired
	private PacientRepository pacientRepository;

	@Override
	public List<Pacient> getAllPacient() {
		return pacientRepository.findAll();
	}

	@Override
	public void savePacient(Pacient pacient) {
		this.pacientRepository.save(pacient);
	}

	@Override
	public Pacient getPacientById(long id) {
		Optional<Pacient> optional = pacientRepository.findById(id);
		Pacient pacient = null;
		if (optional.isPresent()) {
			pacient = optional.get();
		} else {
			throw new RuntimeException(" Id " + id + "nu este al unul pacient.");
		}
		return pacient;
	}

	@Override
	public void deletePacientById(long id) {
		this.pacientRepository.deleteById(id);
	}

}

