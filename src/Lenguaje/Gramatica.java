/* Gramatica.java */
/* Generated By:JavaCC: Do not edit this line. Gramatica.java */
package Lenguaje;
public class Gramatica implements GramaticaConstants {

//----------ANALIZADOR SINTACTICO----------

//aqui se van a crear funciones (expresiones regulares) mendiante javacc para que se analizen las estructuras basicas del lenguaje (el lenguaje a analizar es c)
  final public 
void Programa() throws ParseException {
    label_1:
    while (true) {
      Librerias();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LIBRERIAS:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
    }
    jj_consume_token(MAIN);
    jj_consume_token(PARENTESIS_APERTURA);
    jj_consume_token(PARENTESIS_APERTURA);
    jj_consume_token(LLAVE_APERTURA);
    Bloque();
    jj_consume_token(RETURN);
    jj_consume_token(NUMEROS);
    jj_consume_token(PUNTO_COMA);
    jj_consume_token(LLAVE_CIERRE);
    jj_consume_token(0);
  }

  final public void Librerias() throws ParseException {
    jj_consume_token(LIBRERIAS);
    jj_consume_token(NOMLIBRERIA);
  }

  final public void Bloque() throws ParseException {
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:
      case FLOAT:
      case CHAR:
      case SHORT:
      case STRING:
      case DOUBLE:
      case VOID:
      case FOR:
      case WHILE:
      case DO:
      case IF:
      case SWITCH:
      case SCANF:
      case PRINTF:
      case NOMBREVAR:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      Sentencias();
    }
  }

  final public void Sentencias() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INT:
    case FLOAT:
    case CHAR:
    case SHORT:
    case STRING:
    case DOUBLE:
    case VOID:{
      Declaraciones();
      break;
      }
    case WHILE:{
      cicloWhile();
      break;
      }
    case PRINTF:{
      Impresion();
      break;
      }
    case SCANF:{
      Lectura();
      break;
      }
    case IF:{
      Cond_IF();
      break;
      }
    case NOMBREVAR:{
      asignacionAritmetica();
      break;
      }
    case FOR:{
      cicloFor();
      break;
      }
    case DO:{
      cicloDoWhile();
      break;
      }
    case SWITCH:{
      Swich();
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Declaraciones() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INT:{
      jj_consume_token(INT);
      break;
      }
    case FLOAT:{
      jj_consume_token(FLOAT);
      break;
      }
    case CHAR:{
      jj_consume_token(CHAR);
      break;
      }
    case SHORT:{
      jj_consume_token(SHORT);
      break;
      }
    case STRING:{
      jj_consume_token(STRING);
      break;
      }
    case DOUBLE:{
      jj_consume_token(DOUBLE);
      break;
      }
    case VOID:{
      jj_consume_token(VOID);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(NOMBREVAR);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASIGNAR:
      case COMA:{
        ;
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASIGNAR:{
        jj_consume_token(ASIGNAR);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NUMEROS:{
          jj_consume_token(NUMEROS);
          break;
          }
        case CADENA:{
          jj_consume_token(CADENA);
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case COMA:{
        jj_consume_token(COMA);
        jj_consume_token(NOMBREVAR);
        jj_consume_token(ASIGNAR);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NOMBREVAR:{
          jj_consume_token(NOMBREVAR);
          break;
          }
        case NUMEROS:{
          jj_consume_token(NUMEROS);
          break;
          }
        case CADENA:{
          jj_consume_token(CADENA);
          break;
          }
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(PUNTO_COMA);
  }

  final public void asignacionAritmetica() throws ParseException {
    jj_consume_token(NOMBREVAR);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ASIGNAR:{
      jj_consume_token(ASIGNAR);
      break;
      }
    case SUMA:{
      jj_consume_token(SUMA);
      break;
      }
    case RESTA:{
      jj_consume_token(RESTA);
      break;
      }
    case MULTIPLICACION:{
      jj_consume_token(MULTIPLICACION);
      break;
      }
    case DIVISION:{
      jj_consume_token(DIVISION);
      break;
      }
    case MODULO:{
      jj_consume_token(MODULO);
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    operacion();
    jj_consume_token(PUNTO_COMA);
  }

  final public void operacion() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMEROS:{
      jj_consume_token(NUMEROS);
      break;
      }
    case NOMBREVAR:{
      jj_consume_token(NOMBREVAR);
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SUMA:
      case RESTA:
      case MULTIPLICACION:
      case DIVISION:
      case MODULO:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SUMA:{
        jj_consume_token(SUMA);
        break;
        }
      case RESTA:{
        jj_consume_token(RESTA);
        break;
        }
      case MULTIPLICACION:{
        jj_consume_token(MULTIPLICACION);
        break;
        }
      case DIVISION:{
        jj_consume_token(DIVISION);
        break;
        }
      case MODULO:{
        jj_consume_token(MODULO);
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUMEROS:{
        jj_consume_token(NUMEROS);
        break;
        }
      case NOMBREVAR:{
        jj_consume_token(NOMBREVAR);
        break;
        }
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void incrementoDecremento() throws ParseException {
    jj_consume_token(NOMBREVAR);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INCREMENTO:{
      jj_consume_token(INCREMENTO);
      break;
      }
    case DECREMENTO:{
      jj_consume_token(DECREMENTO);
      break;
      }
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Impresion() throws ParseException {
    jj_consume_token(PRINTF);
    jj_consume_token(PARENTESIS_APERTURA);
    jj_consume_token(CADENA);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMA:{
        ;
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        break label_5;
      }
      jj_consume_token(COMA);
      jj_consume_token(NOMBREVAR);
    }
    jj_consume_token(PARENTESIS_CIERRE);
    jj_consume_token(PUNTO_COMA);
  }

  final public void Lectura() throws ParseException {
    jj_consume_token(SCANF);
    jj_consume_token(PARENTESIS_APERTURA);
    jj_consume_token(CADENA);
    jj_consume_token(COMA);
    jj_consume_token(AMPERSAND);
    jj_consume_token(NOMBREVAR);
    jj_consume_token(PARENTESIS_CIERRE);
    jj_consume_token(PUNTO_COMA);
  }

  final public void comparacionLogica() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NOT:{
      jj_consume_token(NOT);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NOMBREVAR:{
        jj_consume_token(NOMBREVAR);
        break;
        }
      case NUMEROS:{
        jj_consume_token(NUMEROS);
        break;
        }
      case CADENA:{
        jj_consume_token(CADENA);
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case NOMBREVAR:{
      jj_consume_token(NOMBREVAR);
      break;
      }
    case NUMEROS:{
      jj_consume_token(NUMEROS);
      break;
      }
    case CADENA:{
      jj_consume_token(CADENA);
      break;
      }
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IGUAL:
      case DIFERENTE:
      case MENOR:
      case MAYOR:
      case MENOR_IGUAL:
      case MAYOR_IGUAL:
      case AND:
      case OR:{
        ;
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IGUAL:{
        jj_consume_token(IGUAL);
        break;
        }
      case DIFERENTE:{
        jj_consume_token(DIFERENTE);
        break;
        }
      case MENOR:{
        jj_consume_token(MENOR);
        break;
        }
      case MAYOR:{
        jj_consume_token(MAYOR);
        break;
        }
      case MENOR_IGUAL:{
        jj_consume_token(MENOR_IGUAL);
        break;
        }
      case MAYOR_IGUAL:{
        jj_consume_token(MAYOR_IGUAL);
        break;
        }
      case AND:{
        jj_consume_token(AND);
        break;
        }
      case OR:{
        jj_consume_token(OR);
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NOT:{
        jj_consume_token(NOT);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NOMBREVAR:{
          jj_consume_token(NOMBREVAR);
          break;
          }
        case NUMEROS:{
          jj_consume_token(NUMEROS);
          break;
          }
        case CADENA:{
          jj_consume_token(CADENA);
          break;
          }
        default:
          jj_la1[19] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case NOMBREVAR:{
        jj_consume_token(NOMBREVAR);
        break;
        }
      case NUMEROS:{
        jj_consume_token(NUMEROS);
        break;
        }
      case CADENA:{
        jj_consume_token(CADENA);
        break;
        }
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void Cond_IF() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(PARENTESIS_APERTURA);
    comparacionLogica();
    jj_consume_token(PARENTESIS_CIERRE);
    jj_consume_token(LLAVE_APERTURA);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:
      case FLOAT:
      case CHAR:
      case SHORT:
      case STRING:
      case DOUBLE:
      case VOID:
      case FOR:
      case WHILE:
      case DO:
      case IF:
      case SWITCH:
      case SCANF:
      case PRINTF:
      case NOMBREVAR:{
        ;
        break;
        }
      default:
        jj_la1[21] = jj_gen;
        break label_7;
      }
      Sentencias();
    }
    jj_consume_token(LLAVE_CIERRE);
    label_8:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_8;
      }
      jj_consume_token(ELSE);
      jj_consume_token(IF);
      jj_consume_token(PARENTESIS_APERTURA);
      comparacionLogica();
      jj_consume_token(PARENTESIS_CIERRE);
      jj_consume_token(LLAVE_APERTURA);
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INT:
        case FLOAT:
        case CHAR:
        case SHORT:
        case STRING:
        case DOUBLE:
        case VOID:
        case FOR:
        case WHILE:
        case DO:
        case IF:
        case SWITCH:
        case SCANF:
        case PRINTF:
        case NOMBREVAR:{
          ;
          break;
          }
        default:
          jj_la1[22] = jj_gen;
          break label_9;
        }
        Sentencias();
      }
      jj_consume_token(LLAVE_CIERRE);
    }
    label_10:
    while (true) {
      if (jj_2_2(2)) {
        ;
      } else {
        break label_10;
      }
      jj_consume_token(ELSE);
      jj_consume_token(LLAVE_APERTURA);
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INT:
        case FLOAT:
        case CHAR:
        case SHORT:
        case STRING:
        case DOUBLE:
        case VOID:
        case FOR:
        case WHILE:
        case DO:
        case IF:
        case SWITCH:
        case SCANF:
        case PRINTF:
        case NOMBREVAR:{
          ;
          break;
          }
        default:
          jj_la1[23] = jj_gen;
          break label_11;
        }
        Sentencias();
      }
      jj_consume_token(LLAVE_CIERRE);
    }
  }

  final public void cicloFor() throws ParseException {
    jj_consume_token(FOR);
    jj_consume_token(PARENTESIS_APERTURA);
    jj_consume_token(NOMBREVAR);
    jj_consume_token(ASIGNAR);
    jj_consume_token(NUMEROS);
    jj_consume_token(PUNTO_COMA);
    jj_consume_token(NOMBREVAR);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MENOR:{
      jj_consume_token(MENOR);
      break;
      }
    case MAYOR:{
      jj_consume_token(MAYOR);
      break;
      }
    case MENOR_IGUAL:{
      jj_consume_token(MENOR_IGUAL);
      break;
      }
    case MAYOR_IGUAL:{
      jj_consume_token(MAYOR_IGUAL);
      break;
      }
    case IGUAL:{
      jj_consume_token(IGUAL);
      break;
      }
    case DIFERENTE:{
      jj_consume_token(DIFERENTE);
      break;
      }
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMEROS:{
      jj_consume_token(NUMEROS);
      break;
      }
    case NOMBREVAR:{
      jj_consume_token(NOMBREVAR);
      break;
      }
    default:
      jj_la1[25] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PUNTO_COMA);
    jj_consume_token(NOMBREVAR);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INCREMENTO:{
      jj_consume_token(INCREMENTO);
      break;
      }
    case DECREMENTO:{
      jj_consume_token(DECREMENTO);
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PARENTESIS_CIERRE);
    jj_consume_token(LLAVE_APERTURA);
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:
      case FLOAT:
      case CHAR:
      case SHORT:
      case STRING:
      case DOUBLE:
      case VOID:
      case FOR:
      case WHILE:
      case DO:
      case IF:
      case SWITCH:
      case SCANF:
      case PRINTF:
      case NOMBREVAR:{
        ;
        break;
        }
      default:
        jj_la1[27] = jj_gen;
        break label_12;
      }
      Sentencias();
    }
    jj_consume_token(LLAVE_CIERRE);
  }

  final public void cicloWhile() throws ParseException {
    jj_consume_token(WHILE);
    jj_consume_token(PARENTESIS_APERTURA);
    comparacionLogica();
    jj_consume_token(PARENTESIS_CIERRE);
    jj_consume_token(LLAVE_APERTURA);
    label_13:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:
      case FLOAT:
      case CHAR:
      case SHORT:
      case STRING:
      case DOUBLE:
      case VOID:
      case FOR:
      case WHILE:
      case DO:
      case IF:
      case SWITCH:
      case SCANF:
      case PRINTF:
      case NOMBREVAR:{
        ;
        break;
        }
      default:
        jj_la1[28] = jj_gen;
        break label_13;
      }
      Sentencias();
    }
    jj_consume_token(LLAVE_CIERRE);
  }

  final public void cicloDoWhile() throws ParseException {
    jj_consume_token(DO);
    jj_consume_token(LLAVE_APERTURA);
    label_14:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:
      case FLOAT:
      case CHAR:
      case SHORT:
      case STRING:
      case DOUBLE:
      case VOID:
      case FOR:
      case WHILE:
      case DO:
      case IF:
      case SWITCH:
      case SCANF:
      case PRINTF:
      case NOMBREVAR:{
        ;
        break;
        }
      default:
        jj_la1[29] = jj_gen;
        break label_14;
      }
      Sentencias();
    }
    jj_consume_token(LLAVE_CIERRE);
    jj_consume_token(WHILE);
    jj_consume_token(PARENTESIS_APERTURA);
    comparacionLogica();
    jj_consume_token(PARENTESIS_CIERRE);
    jj_consume_token(PUNTO_COMA);
  }

  final public void Swich() throws ParseException {
    jj_consume_token(SWITCH);
    jj_consume_token(PARENTESIS_APERTURA);
    jj_consume_token(NOMBREVAR);
    jj_consume_token(PARENTESIS_CIERRE);
    jj_consume_token(LLAVE_APERTURA);
    label_15:
    while (true) {
      jj_consume_token(CASE);
      jj_consume_token(NUMEROS);
      jj_consume_token(DOS_PUNTOS);
      label_16:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INT:
        case FLOAT:
        case CHAR:
        case SHORT:
        case STRING:
        case DOUBLE:
        case VOID:
        case FOR:
        case WHILE:
        case DO:
        case IF:
        case SWITCH:
        case SCANF:
        case PRINTF:
        case NOMBREVAR:{
          ;
          break;
          }
        default:
          jj_la1[30] = jj_gen;
          break label_16;
        }
        Sentencias();
      }
      jj_consume_token(BREAK);
      jj_consume_token(PUNTO_COMA);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CASE:{
        ;
        break;
        }
      default:
        jj_la1[31] = jj_gen;
        break label_15;
      }
    }
    jj_consume_token(LLAVE_CIERRE);
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_3_2()
 {
    if (jj_scan_token(ELSE)) return true;
    if (jj_scan_token(LLAVE_APERTURA)) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_scan_token(ELSE)) return true;
    if (jj_scan_token(IF)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public GramaticaTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[32];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x80,0xbc03dc00,0xbc03dc00,0x3dc00,0x200000,0x0,0x0,0x200000,0xfc0000,0x0,0xdc0000,0xdc0000,0x0,0x3000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xbc03dc00,0xbc03dc00,0xbc03dc00,0x0,0x0,0x3000000,0xbc03dc00,0xbc03dc00,0xbc03dc00,0xbc03dc00,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x100000c,0x100000c,0x0,0x200000,0x6000000,0x7000000,0x200000,0x0,0x5000000,0x0,0x0,0x5000000,0x0,0x200000,0x7000000,0x7002000,0x1bf0,0x1bf0,0x7000000,0x7002000,0x100000c,0x100000c,0x100000c,0x3f0,0x5000000,0x0,0x100000c,0x100000c,0x100000c,0x100000c,0x1,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[2];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Gramatica(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Gramatica(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new GramaticaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 32; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 32; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Gramatica(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new GramaticaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 32; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 32; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Gramatica(GramaticaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 32; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(GramaticaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 32; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[60];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 32; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 60; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 2; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
