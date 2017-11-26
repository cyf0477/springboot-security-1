package pe.edu.tecsup.security.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValidacionSeguridadController {

    @RequestMapping("/index")
    public String cargarPortadaVisitante(Model model) {
        model.addAttribute("mensaje", "Hoy es: " + new Date());

        return "general/index";
    }

    @RequestMapping("/ventas/index")
    public String cargarPortadaVentas(Model model) {
        model.addAttribute("mensaje", "Registre sus Ventas");

        return "ventas/index";
    }

    @RequestMapping("/admin/index")
    public String cargarPortadaAdm(Model model) {
        model.addAttribute("mensaje", "Administración");
        return "admin/index";
    }
}
