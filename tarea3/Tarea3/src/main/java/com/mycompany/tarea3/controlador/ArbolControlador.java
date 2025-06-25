/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tarea3.controlador;
import com.mycompany.tarea3.modelo.Arbol;
import com.mycompany.tarea3.servicio.Arbolservicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author nigel
 */
@Controller
public class ArbolControlador {

    private final Arbolservicio servicio;

    public ArbolControlador(Arbolservicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/")
    public String listar(Model modelo) {
        modelo.addAttribute("arboles", servicio.listar());
        return "index";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model modelo) {
        modelo.addAttribute("arbol", new Arbol());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Arbol arbol) {
        servicio.guardar(arbol);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model modelo) {
        modelo.addAttribute("arbol", servicio.obtener(id));
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        servicio.eliminar(id);
        return "redirect:/";
    }
}
