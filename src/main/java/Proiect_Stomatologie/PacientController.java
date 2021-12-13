package Proiect_Stomatologie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacientController {

	@Autowired
	private PacientService pacientService;

	// afiseaza lista pacienti
	@GetMapping("/listapacienti")
	public String viewHomePage(Model model) {
		model.addAttribute("listaPacienti", pacientService.getAllPacient());
		return "listapacienti";
	}

	@GetMapping("/inregistrarepacient")
	public String showNewPacientForm(Model model) {
		// create model attribute to bind form data
		Pacient pacient = new Pacient();
		model.addAttribute("pacient", pacient);

		return "inregistrarePacient";
	}

	@PostMapping("/salvarePacient")
	public String savePacient(@ModelAttribute("pacient") Pacient pacient) {
		// save doctor to database
		pacientService.savePacient(pacient);
		return "redirect:/listapacienti";
	}
	
	@GetMapping("/arataprofilpacient/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get pacient from the service
		Pacient pacient = pacientService.getPacientById(id);

		// set pacient as a model attribute to pre-populate the form
		model.addAttribute("pacient", pacient);
		return "update_pacient";
	}

	@GetMapping("/stergePacient/{id}")
	public String deletePacient(@PathVariable(value = "id") long id) {

		// call delete doctor method
		this.pacientService.deletePacientById(id);
		return "redirect:/listapacienti";
	}

}
