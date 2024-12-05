/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examen.parcial.de.julca2.controller;

import com.example.examen.parcial.de.julca2.model.ParticipanteModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ParticipanteController {

    // GET: Mostrar el formulario de registro
    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("participante", new ParticipanteModel());
        return "registro"; // Nombre de la vista (archivo HTML o JSP)
    }

    // POST: Procesar el formulario de registro
    @PostMapping("/registro")
    public String procesarFormularioRegistro(@ModelAttribute("participante") ParticipanteModel participante, Model model) {
        // Aquí puedes agregar lógica para guardar los datos en la base de datos
        model.addAttribute("mensajeExito", "Registro exitoso. ¡Gracias por participar!");
        return "exito"; // Redirige a la vista de éxito
    }

    // GET: Página de éxito
    @GetMapping("/exito")
    public String mostrarPaginaExito(Model model) {
        return "exito"; // Nombre de la vista (archivo HTML o JSP)
    }
}
