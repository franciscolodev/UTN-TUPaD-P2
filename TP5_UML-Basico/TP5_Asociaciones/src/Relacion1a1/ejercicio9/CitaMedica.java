package Relacion1a1.ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedica {

    private LocalDate fecha;
    private LocalTime hora;
    private Profesional profesional;
    private Paciente paciente;

    //Constructor de Cita Medica
    public CitaMedica(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    //Agregar datos del profesional a la cita medica
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    //Agregar datos del paciente a la cita medica

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

//Agregar Getters para mostrar informacion puntual sobre la cita

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
    
//Mostrar Datos de la cita
    
  public void mostrarInfoCita(){
      System.out.println("            >>>>>>>Cita Medica<<<<<<\n"
              + "Horario de la cita : " + getFecha() + " - " + getHora());
      if(paciente != null){
      System.out.println( "Paciente: " + paciente.getNombre() + "; Obra Social: " + paciente.getObraSocial());
      }else{
          System.out.println( "Paciente: Los datos del paciente no estan asociados con la cita");
      }
      if(profesional != null){
          System.out.println( "Profesional: " + profesional.getNombre() + "; Especialidad: " + profesional.getEspecialidad());
      } else{
          System.out.println( "Profesional: Los datos del Profesional no estan asociados con la cita");
      }  
  }  
  
    
    
}
