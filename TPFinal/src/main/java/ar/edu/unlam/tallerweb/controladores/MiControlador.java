package ar.edu.unlam.tallerweb.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ger")
public class MiControlador {
	
	@RequestMapping("/saludo")
	public ModelAndView saludo(){
		ModelMap modelMap = new ModelMap();
		modelMap.put("dato", "Datos enviados");
		
		return new ModelAndView("saludo", modelMap);
	}
}
