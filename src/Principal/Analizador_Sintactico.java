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

    public static void main(String[] args) throws ParseException {

        Prueba_c = new File("D:\\NetBeansProjects\\Analizador_Lexico_c\\src\\Principal\\Prueba_c.txt");
        //el objeto de tipo file es para pasarle la instancia con la ruta de donde se va a encontrar el archivo de prueba
        try {
            //se trabaja con sentencias completas (sintaxis regex)
            Gramatica gram = new Gramatica(new FileReader(Prueba_c));
            System.out.println("SE ANALIZARON LAS SIGUIENTES ESTRUCTURAS DEL LENGUAJE\n");
            //el programa tiene un cuerpo
            gram.Programa();
            //va a empezar a leer la gramatica del cuerpo del archivo que se declaro anteiormente en los token, generando las funciones para cada estructura del lenguaje
            System.out.println("ANALISIS SINTACTICO EJECUTADO CORRECTAMENTE");

        } catch (FileNotFoundException f) {
            System.out.println("No se encontró el archivo, revisa si se renombró, movio de ubicación o eliminó");
        }

    }
}
