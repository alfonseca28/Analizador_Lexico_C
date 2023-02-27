package Principal;

import Lenguaje.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author alfon
 */
public class Analizador_Sintactico {

    private static File Prueba_c;
    //se declara el metodo como privado para ocuparse en todo el cuerpo del programa, se le asigna un atributo de tipo File para hacer
    //referencia al archivo de prueba "Prueba_c.txt" que es cual se va a analizar al momento de ejecutar el programa

    public static void main(String[] args) throws ParseException {
    //en el main se le pasan los parametros habituales y tambien se declara de tipo excpetion para que este encuentre errores en
    //el o los parser generados por javacc y declarados en el archivo compilado de la gramatica

        Prueba_c = new File("D:\\Documentos HDD\\Escuela\\Programacion\\NetBeansProjects\\Analizador_Lexico_C\\src\\Principal\\Prueba_c.txt");
        //objeto de tipo file, con la ruta que contiene el archivo de prueba para analizar
        try {
            //se trabaja con sentencias completas (sintaxis regex), esto haciendo enfasis en las expresiones regulares
            Gramatica gram = new Gramatica(new FileReader(Prueba_c));
            //se crea un objeto de tipo gramatica de nombre "gram" que este lo que hara sera pasar los parametros de las funciones
            //que se crearon a partir de los tokens en el archivo Gramatica.jj
            System.out.println("SE ANALIZARON LAS SIGUIENTES ESTRUCTURAS DEL LENGUAJE\n");
            //ahora para el funcionamiento del analisis sintactico, se esta tomando en cuenta al archivo de prueba no solo como un
            //un archivo de texto plano, sino como un archivo con una estructura, un cuerpo del programa (esto en base a como es
            //un archivo sencillo de c, contemplando su estructura, funciones, variables, etc)
            gram.Programa();
            //aqui se ocupa el objeto gram, el cual lo que va a hacer es que va a invocar el metodo o funcion del archivo Gramatica.jj
            //y va a empezar a leer la gramatica del cuerpo del archivo que se declaro anteiormente en los token, generando las
            //funciones para cada estructura del lenguaje
            System.out.println("ANALISIS SINTACTICO EJECUTADO CORRECTAMENTE");
            //como ningun archivo a analizar es infinito este tiene un final, asi que en el funcion Programa() que se declaro en el
            //archivo de la gramatica del lenguaje se hace uso de la palabra EOF (End Of File), para indicar que una vez que se llego
            //al final del archivo este detenga y termine su ejecuccion, y posteriormente imprima que se hizo el analisis sintactico
        } catch (FileNotFoundException f) {
            System.out.println("No se encontró el archivo, revisa si se renombró, movio de ubicación o eliminó");
            //se pone para el catch una expecion para indicar que no encontro el archivo de prueba
        }

    }
}
