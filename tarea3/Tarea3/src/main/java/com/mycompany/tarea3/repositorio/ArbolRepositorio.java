/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tarea3.repositorio;

import com.mycompany.tarea3.modelo.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author nigel
 */
public interface ArbolRepositorio extends JpaRepository<Arbol, Integer> {
}