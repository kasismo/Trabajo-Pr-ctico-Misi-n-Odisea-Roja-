/*
 * SISTEMAS DE AUTOMATIZACION DE OFICINAS (SAO)
 * Trabajo Practico: Mision Odisea Roja
 * Archivo unico de entrega: TP_GrupoXX.java
 * Grupo: XX (reemplazar por el numero real de grupo)
 *
 * INTEGRANTES Y RESPONSABILIDADES
 * 1. Estado de SoVYNE: __________________________________
 * 2. Gestion ProDeLB: ____________________________________
 * 3. Trayectoria del Rover: ______________________________
 * 4. Analisis de Regolito: _______________________________
 * 5. Salida + menu principal e integracion: ______________
 *
 * REGLAS DE TRABAJO
 * - Cada integrante modifica su seccion identificada con comentarios.
 * - El responsable del punto 5 coordina los cambios del main.
 * - Antes de cambiar nombres, parametros o retornos de metodos,
 *   acordarlo con el resto para no romper las llamadas desde main.
 * - Usar solamente lo visto en las unidades 1 a 4.
 * - No utilizar arreglos ni matrices (unidad 5).
 * - Usar metodos static, parametros y retornos cuando corresponda.
 * - Validar todos los datos de entrada antes de procesarlos.
 *
 * ATENCION: ESTA ES SOLO UNA PLANTILLA DE ORGANIZACION.
 * Compila, pero todavia NO implementa los requisitos del TP.
 */

public class TP_GrupoXX {

    // ============================================================
    // SECCION COMPARTIDA: MENU PRINCIPAL Y COORDINACION
    // RESPONSABLE: INTEGRANTE 5 (EN ACUERDO CON EL GRUPO)
    // ============================================================

    public static void main(String[] args) {

        // TODO: Elegir e imprimir el nombre y el logo de la consola.

        Scanner scanner = new Scanner(System.in);
        
        final int ERRORESCONS = 3;
        int N1,N2,N3,N4,N5;
        int opcion =0, fallasconsecutivas = 0;
        
        do{
       System.out.println("ingrese una de las siguientes opciones: ");
       System.out.println("1-Estado del SoVYNE(Soporte vital y nivel de emergencia).");
       System.out.println("2-Gestion ProDeLB-de Protocolos de la Base.");
       System.out.println("3-Simulacion de Trayectoria del Rover.");
       System.out.println("4-Analisis Secuencial de Muestras de Regolito Marciano.");
       System.out.println("5-Salir del Sistema.");
       opcion = scanner.nextInt();
        switch(opcion){
            
            case 1:{
                  System.out.println("Seleccionaste la opcion 1: ");
                  fallasconsecutivas =0;
                  break;}
            case 2: {
                  System.out.println("Seleccionaste la opcion 2: ");
                  fallasconsecutivas =0;
                  break;}      
            case 3:
                  System.out.println("Seleccionaste la opcion 3: ");
                  fallasconsecutivas =0;
                  break;
            case 4: 
                  System.out.println("Seleccionaste la opcion 4: ");
                  fallasconsecutivas =0;
                  break;
        
    }

    // ============================================================
    // OPCION 1: ESTADO DE SoVYNE
    // RESPONSABLE: _____________________________________________
    // ============================================================

    public static void opcion1SoVYNE() {
        // TODO: Pedir oxigeno (de 0 a 100%), agua (litros)
        //       y energia (kWh).
        // TODO: Validar cada entrada y permitir reingreso
        //       indefinido cuando sea necesario.
        // TODO: Determinar la condicion de la base segun
        //       los umbrales establecidos en la consigna.
        // TODO: Mostrar la alerta que corresponda.
        // TODO: Si hacen falta subcalculos, crear aqui debajo
        //       metodos static con parametros y retornos claros.
    }

    // Metodos auxiliares de la OPCION 1: agregarlos aqui.


    // ============================================================
    // OPCION 2: GESTION ProDeLB - PROTOCOLOS DE LA BASE
    // RESPONSABLE: _____________________________________________
    // ============================================================

    public static void opcion2ProDeLB() {
        // TODO: Mostrar el submenu: a, b, c, d y z.
        // TODO: Aceptar letras mayusculas y minusculas.
        // TODO: Implementar los protocolos indicados en el ANEXO:
        //       a) Invernadero hidroponico.
        //       b) Carga de baterias solares.
        //       c) Blindaje contra tormenta de polvo.
        //       d) Modo reposo.
        //       z) Volver al menu principal.
        // TODO: Validar los datos de cada protocolo.
        // TODO: Calcular impactos e imprimir procedimientos.
        // TODO: Ante un codigo no reconocido, mostrar el error,
        //       no modificar suministros y volver al menu.
        // IMPORTANTE: Consultar las formulas originales del ANEXO.
    }

    // Metodos auxiliares de la OPCION 2: agregarlos aqui.


    // ============================================================
    // OPCION 3: SIMULACION DE TRAYECTORIA DEL ROVER
    // RESPONSABLE: _____________________________________________
    // ============================================================

    public static void opcion3Rover() {
        // TODO: Pedir y validar distancia (maximo 50 km).
        // TODO: Pedir y validar soles a simular (maximo 20).
        // TODO: Simular el avance sol por sol, sin arreglos.
        // TODO: Calcular avance, distancia acumulada y restante,
        //       consumo y nivel de bateria.
        // TODO: Evaluar las condiciones de finalizacion:
        //       bateria critica, soles insuficientes o meta lograda.
        // TODO: Imprimir el balance final de la expedicion.
        // IMPORTANTE: Consultar las formulas originales del ANEXO.
    }

    // Metodos auxiliares de la OPCION 3: agregarlos aqui.


    // ============================================================
    // OPCION 4: ANALISIS SECUENCIAL DE REGOLITO MARCIANO
    // RESPONSABLE: _____________________________________________
    // ============================================================

    public static void opcion4Regolito() {
        // TODO: Pedir y validar la cantidad de muestras.
        // TODO: Para cada muestra, solicitar porcentaje de oxido
        //       de hierro (0 a 100%) y presencia de perclorato.
        // TODO: Validar cada dato antes de usarlo.
        // TODO: Llevar acumuladores y contadores SIN arreglos.
        // TODO: Calcular promedio de hierro, concentracion
        //       maxima y su numero de muestra, y toxicidad.
        // TODO: Imprimir reporte individual y reporte final.
        // TODO: Clasificar el lote segun los umbrales del ANEXO.
    }

    // Metodos auxiliares de la OPCION 4: agregarlos aqui.


    // ============================================================
    // OPCION 5: SALIR DEL SISTEMA
    // RESPONSABLE: _____________________________________________
    // ============================================================

    public static void opcion5Salir() {
       case 5:
                  System.out.println("Seleccionaste la opcion 5: ");
                  fallasconsecutivas =0;
                  System.out.println("Cierre del Programa. Mision realizada con exito...");
                  System.out.println("Esperamos que nuestros valores sean de ayuda para toda la nave Nodriza y si no sobrevivimos que nos recuerden como heroes que hicimos lo que teniamos que hacer.....");
                  System.out.println("Desconexion segura del enlase satelital...");
                  System.out.println("@@@@  @   @ @@@@@ @   @    @   @ @@@  @@@    @@@ @@@@@    @   @  @@@  @@@@  @@@@  @@@ @@@@@  @@@ ");
                  System.out.println("@   @ @   @ @     @@  @    @   @  @  @   @    @  @        @@  @ @   @ @   @ @   @  @     @  @   @ ");
                  System.out.println("@@@@  @   @ @@@@  @ @ @    @   @  @  @@@@@    @  @@@@     @ @ @ @   @ @   @ @@@@   @    @   @@@@@ ");
                  System.out.println("@   @ @   @ @     @  @@     @ @   @  @   @ @  @  @        @  @@ @   @ @   @ @  @   @   @    @   @ ");
                  System.out.println("@@@@   @@@  @@@@@ @   @      @   @@@ @   @  @@   @@@@@    @   @  @@@  @@@@  @   @ @@@ @@@@@ @   @ ");
            default:
                  System.out.println("Seleccionaste un valor no valido: ");
                  fallasconsecutivas++;
             if (fallasconsecutivas == ERRORESCONS) {
                        System.out.println("Se cierra el sistema porque hubo " + ERRORESCONS + " fallas consecutivas");
                    } else {
                        System.out.println("Te quedan " + (ERRORESCONS - fallasconsecutivas) + " fallas consecutivas disponibles.");
                    }
                    break; 
        }
        }while(opcion != 5 && fallasconsecutivas < ERRORESCONS);      
           
    }

    // Metodos auxiliares de la OPCION 5: agregarlos aqui.

} // FIN DE LA CLASE TP_GrupoXX: no escribir metodos fuera de esta llave.
