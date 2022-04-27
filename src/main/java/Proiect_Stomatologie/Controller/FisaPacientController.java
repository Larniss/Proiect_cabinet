package Proiect_Stomatologie.Controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import Proiect_Stomatologie.Class.FisaPacient;
import Proiect_Stomatologie.Service.FisaPacientService;



@Controller
public class FisaPacientController {

	@Autowired
	private FisaPacientService fisapacientService;



    // afiseaza lista fise pacienti
	@GetMapping("/fisapacienti")
	public String viewHomePage(Model model) {
		model.addAttribute("fisaPacienti", fisapacientService.getAllFisaPacient());
		return "listapacienti";
	}

	
	@GetMapping("/inregistrarefisapacient")
	public String showNewFisaPacientForm(Model model) {
		// creaza form pentru o fisa noua de pacient

		FisaPacient fisapacient = new FisaPacient();
		model.addAttribute("fisapacient", fisapacient);

		return "inregistrareFisaPacient";
	}

	@PostMapping("/salvareFisaPacient")
	public String saveFisaPacient(@ModelAttribute("fisapacient") FisaPacient fisapacient) {
		// salveaza fisa la database
		fisapacientService.saveFisaPacient(fisapacient);

		return "redirect:/listapacienti";

	}
	
	@GetMapping("/arataprofilfisapacient/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get fisa pacient from the service
		FisaPacient fisapacient = fisapacientService.getFisaPacientById(id);

		// set pacient as a model attribute to pre-populate the form
		model.addAttribute("fisapacient", fisapacient);
		return "update_fisapacient";
	}

	@GetMapping("/stergeFisaPacient/{id}")
	public String deleteFisaPacient(@PathVariable(value = "id") long id) {

		// call delete doctor method
		this.fisapacientService.deleteFisaPacientById(id);
		return "redirect:/listapacienti";
	}

}
