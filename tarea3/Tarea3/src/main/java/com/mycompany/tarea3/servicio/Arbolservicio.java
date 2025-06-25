/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tarea3.servicio;
import com.mycompany.tarea3.modelo.Arbol;
import com.mycompany.tarea3.repositorio.ArbolRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author nigel
 */
@Service
public class Arbolservicio {
    private final ArbolRepositorio repo;

    public Arbolservicio(ArbolRepositorio repo) {
        this.repo = repo;
    }

    public List<Arbol> listar() { return repo.findAll(); }

    public void guardar(Arbol arbol) { repo.save(arbol); }

    public Arbol obtener(int id) { return repo.findById(id).orElse(null); }

    public void eliminar(int id) { repo.deleteById(id); }
}
