package asignaturas;
import java.util.Hashtable;

public class Curso {
    private String titulo;
    private Hashtable<Integer,Inscripcion> delAlumno1 = new Hashtable<>();

    public Curso(String nombre) {
        this.titulo = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void registrarInscripcion(Integer legajo,Inscripcion inscripcion) {
        this.delAlumno1.put(legajo,inscripcion);
    }

    public void inscriptosHashtable(){
        this.delAlumno1.forEach( (a,b) -> {
            System.out.println(b.toString());
        });
    }

    public int cantidadInscriptos(){
        return this.delAlumno1.size();
    }

    public Hashtable<Integer,Inscripcion> getInscripciones() {
        return this.delAlumno1;
    }
}
