package miembros;

import asignaturas.Curso;
import asignaturas.Inscripcion;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private Integer legajo;
    private ArrayList<Inscripcion> inscripto = new ArrayList<>();
    public Estudiante(String nombre, Integer legajo) {
        super(nombre);
        this.legajo = legajo;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public String getNombre(){
        return nombre;
    }

    public void inscribir (Curso c) throws ErrorInscripcion{
        //Agregar ErrorInscripcion si mas de 3 cursos
        if(this.inscripto.size()>=3) throw new ErrorInscripcion(this,c);
        Inscripcion inscripcion = new Inscripcion(this,c);
        this.inscripto.add(inscripcion);
        c.registrarInscripcion(this.legajo, inscripcion);
    }

    public void misCursos(){
        System.out.println("El Alumno "+this.nombre+", esta inscripto en:");
        for (Inscripcion ins : this.inscripto) {
            System.out.println("- "+ins.getParaEl().getTitulo());
        }
    }

}
