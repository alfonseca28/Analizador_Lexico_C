/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    //es para ocupar en todo el cuerpo del programa

    public static void main(String[] args) throws ParseException {
    //el excpecion es para errores

        Prueba_c = new File("D:\\NetBeansProjects\\Analizador_Lexico_c\\src\\Principal\\Prueba_c.txt");
        //objeto de tipo file, con la ruta que contiene el archivo de prueba para analizar
        try {
            GramaticaTokenManager Gramatica_c = new GramaticaTokenManager(new SimpleCharStream(new FileReader(Prueba_c)));
            //se instancea un objeto de tipo token manager que se ocupar
            Token token;
            //se instance, para cargarle los datos de la gramatica, con simplecharstream (es para leer cadenas deca racteres somple, va a leer el archivo de prueba con filereader)
            while ((token = Gramatica_c.getNextToken()).kind != GramaticaTokenManager.EOF) {
            //este while es para ir comparando todos los tokens declarados en gramatica.jj ya que va a ir de uno en uno, para ellos se usa getNextToken para que asi vaya
            //analizando de siguiente en siguiente, asi hasta que el objeto GramaticaTokenManager sea != (diferente de EOF), EOF es el final del archivo, una vez que llegue
            //al final del archivo se detiene el while
            }
            //la clase tokenmanager es la que javacc genera y que hace que al momento de compilarlo para que este sirva como una especie de traductor entre javacc y java para entender las instancias que se le van a pasar con los token delcarados en la gramatica
        } catch (FileNotFoundException f) {
            System.out.println("No se encuentra el archivo");
        }

    }
}
