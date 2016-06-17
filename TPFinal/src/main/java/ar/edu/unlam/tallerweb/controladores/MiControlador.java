package ar.edu.unlam.tallerweb.controladores;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb.modelo.Persona;
import ar.edu.unlam.tallerweb.modelo.TablaPersonas;

@Controller
@RequestMapping("/controlador")
public class MiControlador {
	
	@RequestMapping("/saludo")
	public ModelAndView saludo(){
		ModelMap modelMap = new ModelMap();
		modelMap.put("dato", "Datos enviados");
		
		return new ModelAndView("saludo", modelMap);
	}
	
	//Ejemplo
	@RequestMapping(value = "/holaComun", method = RequestMethod.GET)
	public ModelAndView holaComun(@RequestParam("nombre") String nombre){
		ModelMap modelMap = new ModelMap();
		modelMap.put("dato", nombre);
		
		return new ModelAndView("hola", modelMap);
	}
	
	//Ejemplo
	@RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET)
	public ModelAndView holaREST(@PathVariable String nombre){
		
		ModelMap modelMap = new ModelMap();
		modelMap.put("dato", nombre);
		
		ModelAndView vista = new ModelAndView();
		vista.addAllObjects(modelMap);
		vista.setViewName("hola");
		
		return vista;
	}
	
	@RequestMapping(value = "/listarPersonas", method = RequestMethod.GET)
	public ModelAndView listarPersonas(){
		ModelMap modelMap = new ModelMap();
		TablaPersonas listaPersonas = TablaPersonas.getInstance();
		
		modelMap.put("listaPersonas", listaPersonas.listarTodas());
		
		return new ModelAndView("listarPersonas", modelMap);
	}
	
	@RequestMapping(value="/nuevaPersona", method = RequestMethod.GET)
	public ModelAndView nuevaPersona(){
		ModelMap modelMap = new ModelMap();
		
		Persona persona = new Persona();
		
		modelMap.put("persona", persona);
		
		return new ModelAndView("nuevaPersona", modelMap);
	}
	
	@RequestMapping(value="/guardarPersona", method = RequestMethod.POST)
	public ModelAndView guardarPersona(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido, @RequestParam("edad") String edad, @RequestParam("email") String email){
		ModelMap modelMap = new ModelMap();
		
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setEdad(new Integer(edad));
		persona.setEmail(email);
		modelMap.put("persona", persona);
		
		TablaPersonas listaPersonas = TablaPersonas.getInstance();
		listaPersonas.crearPersona(persona);
		
		return new ModelAndView("redirect:/controlador/listarPersonas");
	}
}
