import asignaturas.Curso;
import asignaturas.Inscripcion;
import miembros.ErrorInscripcion;
import miembros.Estudiante;
import miembros.Profesor;

public class Main {
    public static void main(String[] args) {
        //TIP <h1> Instanciación de 4 Profesores junto con Cursos que dicta para pruebas</h1>
        //<i>Profesor 1 + Curso 1</i>
        Profesor wilkinson = new Profesor("Pablo Wilkinson");
        Curso paradigmas = new Curso("Paradigmas");
        wilkinson.dicta(paradigmas);
        //TIP<i>Profesor 2 + Curso 2</i>
        Profesor marcos = new Profesor("Marcos");
        Curso sintaxis = new Curso("Sintaxis y semántica");
        marcos.dicta(sintaxis);
        //TIP<i>Profesor 3 + Curso 3</i>
        Profesor maria = new Profesor("Maria");
        Curso algebra = new Curso("Algebra");
        maria.dicta(algebra);
        //TIP<i>Profesor 4 + Curso 4</i>
        Profesor lucas = new Profesor("Lucas");
        Curso algoritmos = new Curso("Algoritmos");
        lucas.dicta(algoritmos);

        //TIP <h1> Crea estudiante</h1>
        Estudiante juan = new Estudiante("Juan",12344);

        //TIP <h1>Inscribe Estudiante</h1>
        //TIP<p>Si se intenta inscribir a mas de 3 cursos, retorna <span style="color:red;">excepción</span>.</p>
        try{
            juan.inscribir(paradigmas);
            juan.inscribir(sintaxis);
            juan.inscribir(algebra);
            juan.inscribir(algoritmos);
        }catch (ErrorInscripcion e){
            System.err.println(e.getMessage());
        }

        //TIP <h1>Lista Inscripciones</h1>
        paradigmas.inscriptosHashtable();

        //TIP <h1>Muestra Curso dictado por Profesor</h1>
        wilkinson.miCurso();

        //TIP <h1>Listado de Cursos en los que se encuentra inscripto el Estudiante</h1>
        juan.misCursos();

        //TIP <h1>Muestra cantidad de Incriptos a un Curso</h1>
        System.out.println("Cantidad de inscriptos a "+paradigmas.getTitulo()+":"+ paradigmas.cantidadInscriptos());

        //TIP <h1>Metodo de Clase (Estatico) para encontrar si un Alumno esta inscripto en un Curso</h1>
        // <i>Cambiar el nombre en  <span style="color:yellow;">buscarAlumno</span> para probar caso <b>false</b></i>
        String buscarAlumno = "Juan";
        System.out.println("El Alumno "+buscarAlumno);
        if(Inscripcion.estaInscripto(buscarAlumno,paradigmas)){
            System.out.println("SI está inscripto a "+paradigmas.getTitulo());
        }else{
            System.out.println("NO está inscripto a "+paradigmas.getTitulo());
        }
    }


}