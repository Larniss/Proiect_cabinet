package Proiect_Stomatologie.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Proiect_Stomatologie.Class.Doctor;



@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	
}
