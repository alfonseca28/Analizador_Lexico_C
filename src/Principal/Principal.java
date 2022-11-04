package Principal;

import Lenguaje.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author alfon
 */
public class Principal {

    private static File Prueba_c;
    //se declara el metodo como privado para ocuparse en todo el cuerpo del programa, se le asigna un atributo de tipo File para hacer
    //referencia al archivo de prueba "Prueba_c.txt" que es cual se va a analizar al momento de ejecutar el programa

    public static void main(String[] args) throws ParseException {
        //en el main se le pasan los parametros habituales y tambien se declara de tipo excpetion para que este encuentre errores en
        //el o los parser generados por javacc y declarados en el archivo compilado de la gramatica

        Prueba_c = new File("D:\\NetBeansProjects\\Analizador_Lexico_c\\src\\Principal\\Prueba_c.txt");
        //objeto de tipo file, con la ruta que contiene el archivo de prueba para analizar
        try {
            GramaticaTokenManager Gramatica_c = new GramaticaTokenManager(new SimpleCharStream(new FileReader(Prueba_c)));
            //se instancea un objeto de tipo tokenmanager que se ocupar
            System.out.println("SE ENCONTRARON LAS SIGUIENTES INDICENCIAS EN LA GRAMATICA\n");
            Token token;
            //se instancea un objeto de tipo Token, para cargarle los datos de la gramatica, con simplecharstream para que este
            //lea cadenas de caracteres simple, linea tras linea en el archivo de prueba con el atributo FileReader
            while ((token = Gramatica_c.getNextToken()).kind != GramaticaTokenManager.EOF) {
                //este while es para ir comparando todos los tokens declarados en gramatica.jj ya que va a ir de uno en uno, para ellos se
                //usa getNextToken para que asi vaya analizando de siguiente en siguiente, asi hasta que el objeto GramaticaTokenManager
                //sea != (diferente de EOF), EOF es el final del archivo, una vez que llegue al final del archivo se detiene el while
            }
            System.out.println("ANALISIS LEXICO EJECUTADO CORRECTAMENTE");
            //la clase tokenmanager es la que javacc genera y que se genera al momento de compilarlo desde el terminal para que este
            //sirva como una especie de traductor entre javacc y java asi poder entender las instancias que se le van a pasar con los
            //token delcarados en la gramatica
        } catch (FileNotFoundException f) {
            System.out.println("No se encontró el archivo, revisa si se renombró, movio de ubicación o eliminó");
        }
    }
}
