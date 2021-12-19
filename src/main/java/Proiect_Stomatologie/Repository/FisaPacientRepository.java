package Proiect_Stomatologie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Proiect_Stomatologie.Class.FisaPacient;


@Repository
public interface FisaPacientRepository extends JpaRepository<FisaPacient, Long> {

}
