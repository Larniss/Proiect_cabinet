package Proiect_Stomatologie;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	//afiseaza lista doctori
	 @GetMapping("/")
	    public String viewHomePage(Model model) {
	        model.addAttribute("listaDoctori", doctorService.getAllDoctor());
	        return "index";
	    }


	 @GetMapping("/inregistrare")
	 public String showNewEmployeeForm(Model model) {
	    //create model attribute to bind form data
		Doctor doctor = new Doctor();
		model.addAttribute("doctor",doctor);
			
		return "inregistrareDoctor";
	 }
 
	 @PostMapping("/salvareDoctor")
	 public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
	     // save doctor to database
	     doctorService.saveDoctor(doctor);
	     return "redirect:/";
	 }
	 
	 @GetMapping("/arataprofil/{id}")
	 public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
	  
	  // get doctor from the service
	   Doctor doctor = doctorService.getDoctorById(id);
	  
	  // set doctor as a model attribute to pre-populate the form
	  model.addAttribute("doctor",doctor);
	  return "update_doctor";
	 }
	 
	 @GetMapping("/stergeDoctor/{id}")
	 public String deleteDoctor(@PathVariable (value = "id") long id) {
	  
	  // call delete doctor method 
	  this.doctorService.deleteDoctorById(id);
	  return "redirect:/";
	 }
	 
} 
