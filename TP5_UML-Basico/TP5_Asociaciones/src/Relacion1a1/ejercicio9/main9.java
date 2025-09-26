package Relacion1a1.ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;

public class main9 {

    public static void main(String[] args) {
        // Cita Medica asociacion directa con Profesional y Paciente
        
        //Instanciar
        Paciente paciente1 = new Paciente("Francisco L", "OSIN");
        Profesional profesional1 = new Profesional("Francisco L" , "Pediatria");
        CitaMedica turno1 = new CitaMedica(LocalDate.of(2025,9,17), LocalTime.of(9,30,00));
        
        //Mostrar Informacion (parcial) del turno 
        turno1.mostrarInfoCita();
        
        //Asociar Paciente a la cita
        turno1.setPaciente(paciente1);
        
        //Asociar Profesional a la cita
        turno1.setProfesional(profesional1);
        
        //Mostrar Informacion (final) del turno
        turno1.mostrarInfoCita();
        
        
    }
    
}
