package asignaturas;

import miembros.Estudiante;

import java.util.Enumeration;

public class Inscripcion {
    private Estudiante alumno;
    private Curso paraEl;

    public Inscripcion(Estudiante alumno, Curso paraEl) {
        this.alumno = alumno;
        this.paraEl = paraEl;
    }

    public Curso getParaEl() {
        return paraEl;
    }

    public static boolean estaInscripto(String nombreAlumno, Curso curso){
        Enumeration<Inscripcion> ins = curso.getInscripciones().elements();
        while(ins.hasMoreElements()){
            Inscripcion inscripcion = ins.nextElement();
            if (inscripcion.alumno.getNombre().equals(nombreAlumno)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Inscripción: Alumno -> Legajo:" + alumno.getLegajo() + " , Nombre:" + alumno.getNombre()
               +  ", Curso = " + paraEl.getTitulo() ;
    }
}
