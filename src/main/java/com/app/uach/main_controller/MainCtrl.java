package com.app.uach.main_controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.uach.models.product;
import com.app.uach.models.usuario;

@Controller
public class MainCtrl {

    @GetMapping("/")
    public String inicio(Model model) {
        
		model.addAttribute("mensaje_2", "¡Hola desde Spring Boot y Thymeleaf!");
		
		model.addAttribute("ecabezado", "Titulo XYZ");
		
		model.addAttribute("usuarioLogueado", false);

        
		return "index"; // Esto resuelve a la plantilla index.html
    }
	
	
	@GetMapping("/productos")
	public String listarProductos(Model model) {
		
	    List<product> productos = Arrays.asList(
	        new product("Laptop", 1200.0),
	        new product("Mouse", 25.0)
	    );
	    model.addAttribute("productos", productos);
	    return "productos"; // nombre de la vista HTML
	}

	
	@GetMapping("/perfil")
    public String mostrarPerfil(Model model) {
        usuario usuario = new usuario("Juan Pérez", "juan@example.com", 25);
        model.addAttribute("usuario", usuario); // Nombre en la vista y objeto
        return "perfil"; // Nombre de la plantilla HTML (perfil.html)
    }

	@GetMapping("/ejemplo")
	public String ejemplo(Model model) {
		usuario usuario = new usuario("Jared Isai Lopez Espino", "juan@example.com", 23);
		model.addAttribute("usuario", usuario);
		model.addAttribute("color1", true); // Cambia a false para mostrar el otro panel
		return "ejemplo"; // nombre de la vista HTML
	}
}
