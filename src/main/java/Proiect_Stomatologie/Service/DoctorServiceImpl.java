package Proiect_Stomatologie.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Proiect_Stomatologie.Class.Doctor;
import Proiect_Stomatologie.Repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public List<Doctor> getAllDoctor() {
		return doctorRepository.findAll();
	}

	@Override
	public void saveDoctor(Doctor doctor) {
		this.doctorRepository.save(doctor);
	}

	@Override
	public Doctor getDoctorById(long id) {
		Optional<Doctor> optional = doctorRepository.findById(id);
		Doctor doctor = null;
		if (optional.isPresent()) {
			doctor = optional.get();
		} else {
			throw new RuntimeException(" Id " + id + "nu este al unul doctor.");
		}
		return doctor;
	}

	@Override
	public void deleteDoctorById(long id) {
		this.doctorRepository.deleteById(id);
	}

}
