package miembros;

import asignaturas.Curso;

public class Profesor extends Persona {
    private Curso docente;
    public Profesor(String nombre) {
        super(nombre);
    }

    public void dicta(Curso curso){
        this.docente = curso;
    }

    public void miCurso(){
        System.out.println("El Profesor "+super.nombre+", dicta:"+this.docente.getTitulo());
    }
}
