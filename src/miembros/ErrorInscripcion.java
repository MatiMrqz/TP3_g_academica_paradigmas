package miembros;

import asignaturas.Curso;

public class ErrorInscripcion extends Exception {
    public ErrorInscripcion(Estudiante e,  Curso c) {
        super("No se pudo inscribir al estudiante "+e.getNombre()+ " al curso " +c.getTitulo()+". Ya se encuentra inscripto en el máximo de cursos permitido (3).");
    }
}
