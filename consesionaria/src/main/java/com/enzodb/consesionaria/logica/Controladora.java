package com.enzodb.consesionaria.logica;

import com.enzodb.consesionaria.persistencia.ControladoraPersistencia;
import java.util.List;



public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void agregarAutomovil(String modelo, String marca, String motor, 
            String color, String patente, int cantidadPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setCantidadPuertas(cantidadPuertas);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(patente);
        
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(Long idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAutos(Long idAuto) {
        return controlPersis.traerAutos(idAuto);
   
    
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantidadPuertas) {
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        controlPersis.modificarAuto(auto);
        
    }
    
}
