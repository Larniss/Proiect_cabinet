package Proiect_Stomatologie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Proiect_Stomatologie.Class.Pacient;

@Repository
public interface PacientRepository extends JpaRepository<Pacient, Long> {

}
