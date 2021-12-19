package Proiect_Stomatologie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import Proiect_Stomatologie.Class.Doctor;
import Proiect_Stomatologie.Service.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	// afiseaza lista doctori
	@GetMapping("/listadoctori")
	public String viewHomePage(Model model) {
		model.addAttribute("listaDoctori", doctorService.getAllDoctor());
		return "listadoctori";
	}

	@GetMapping("/inregistraredoctor")
	public String showNewDoctorForm(Model model) {
		// create model attribute to bind form data
		Doctor doctor = new Doctor();
		model.addAttribute("doctor", doctor);

		return "inregistrareDoctor";
	}

	@PostMapping("/salvareDoctor")
	public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
		// save doctor to database
		doctorService.saveDoctor(doctor);
		return "redirect:/listadoctori";
	}

	@GetMapping("/arataprofilDoctor/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get doctor from the service
		Doctor doctor = doctorService.getDoctorById(id);

		// set doctor as a model attribute to pre-populate the form
		model.addAttribute("doctor", doctor);
		return "update_doctor";
	}

	@GetMapping("/stergeDoctor/{id}")
	public String deleteDoctor(@PathVariable(value = "id") long id) {

		// call delete doctor method
		this.doctorService.deleteDoctorById(id);
		return "redirect:/listadoctori";
	}

}
