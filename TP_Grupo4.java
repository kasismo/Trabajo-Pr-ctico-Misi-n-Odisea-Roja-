/*
 * SISTEMAS DE AUTOMATIZACION DE OFICINAS (SAO)
 * Trabajo Practico: Mision Odisea Roja
 * Archivo unico de entrega: TP_GrupoXX.java
 * Grupo: XX (reemplazar por el numero real de grupo)
 *
 * INTEGRANTES Y RESPONSABILIDADES
 * 1. Estado de SoVYNE: __________________________________
 * 2. Gestion ProDeLB: ____________________________________
 * 3. Trayectoria del Rover: Guzmán, Gonzalo Ariel
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

import java.util.Scanner;

public class TP_Grupo4 {

    // ============================================================
    // SECCION COMPARTIDA: MENU PRINCIPAL Y COORDINACION
    // RESPONSABLE: INTEGRANTE 5 (EN ACUERDO CON EL GRUPO)
    // ============================================================

    public static void main(String[] args) {

        // TODO: Elegir e imprimir el nombre y el logo de la consola.

        // TODO: Mostrar el menu con las opciones 1, 2, 3, 4 y 5.

        // TODO: Leer y validar la opcion elegida

        // TODO: Repetir el menu hasta que se elija la opcion 5
        //       o se hayan acumulado 3 opciones incorrectas,
        //       aunque no sean consecutivas.

        // TODO: Usar una estructura de seleccion para llamar
        //       al metodo correspondiente a cada opcion.
        //       Nombres propuestos para esas llamadas:
        //       opcion1SoVYNE();
        //       opcion2ProDeLB();
        //       opcion3Rover();
        //       opcion4Regolito();
        //       opcion5Salir();

        // IMPORTANTE: Las llamadas estan comentadas a proposito.
        // La persona que integre el menu debe ubicarlas dentro
        // de la estructura de seleccion que decida el equipo.

        Scanner scanner = new Scanner(System.in);
        opcion3Rover(scanner);
    }

    // ============================================================
    // OPCION 1: ESTADO DE SoVYNE
    // RESPONSABLE: _____________________________________________
    // ============================================================

    public static void opcion1SoVYNE() {
    Scanner scanner = new Scanner(System.in);

        double oxigeno;
        int agua;
        double energia;

        do {
            System.out.println("Ingrese el nivel actual del Oxigeno");
            oxigeno = scanner.nextDouble();

            if (oxigeno >= 0 && oxigeno <= 100) {
                System.out.println("Valor ingresado correctamente");
            } else {
                System.out.println("Valor invalido, intente nuevamente");
            }

        } while (oxigeno < 0 || oxigeno > 100);

        do {
            System.out.println("Ingrese el nivel actual del Agua");
            agua = scanner.nextInt();

            if (agua >= 0) {
                System.out.println("Valor ingresado correctamente");
            } else {
                System.out.println("Valor invalido, intente nuevamente");
            }

        } while (agua < 0);

        do {
            System.out.println("Ingrese el nivel actual de Energia");
            energia = scanner.nextDouble();

            if (energia >= 0 && energia <= 200) {
                System.out.println("Valor ingresado correctamente");
            } else {
                System.out.println("Valor invalido, intente nuevamente");
            }

        } while (energia < 0 || energia > 200);

        if (oxigeno < 20 || energia < 15) {
            System.out.println("ALERTA CRÍTICA: Priorizar soporte de vida");
        } else if (agua < 50 && oxigeno >= 20) {
            System.out.println("PRECAUCIÓN: Racionamiento hídrico activado");
        } else {
            System.out.println("CONDICIÓN ÓPTIMA: Hábitat presurizado y estable");
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
    // RESPONSABLE: Guzmán, Gonzalo Ariel
    // ============================================================

    public static void opcion3Rover(Scanner scanner) {

        System.out.println("------- SIMULACIÓN DE TRAYECTORIA DEL ROVER -------");
        // Declaración de variables de entrada
        double distanciaBaseCrater = distanciaBaseCrater(scanner);
        int solesSimulacion = solesSimulacion(scanner);
        System.out.println(" ");
        // Declaración de variables calculadas
        double distanciaRestante = distanciaBaseCrater;
        double distanciaRecorrida = 0;
        double bateriaRover = 100;
        int sol = 1;
        int solesRecorridos = 0;
        int estado = 0; // 1- Batería crítica, 2- Simulación exitosa, 3- Soles insuficientes
        // Se realiza la simulacion de cada sol hasta que cambie el estado
        while (estado == 0) {
            double desgasteBateria = calcularDesgasteBateria(sol);
            // Verifica que el rover pueda avanzar sin llegar a batería crítica
            // Si no llega envía un mensaje de error y cambia el estado
            if ((bateriaRover - desgasteBateria) < 10) {
                System.out.println("BATERIA CRÍTICA: Deteniendo avance para recarga solar estática");
                estado = 1;
            } else {
                // Si puede avanzar, realiza el recorrido de ese sol
                double avanceDelDia = calcularAvanceDelDia(sol);
                // Corrección para evitar que avance mas de lo que le queda
                if (avanceDelDia > distanciaRestante) {
                    avanceDelDia = distanciaRestante;
                }
                distanciaRecorrida = distanciaRecorrida + avanceDelDia;
                distanciaRestante = distanciaBaseCrater - distanciaRecorrida;
                bateriaRover = bateriaRover - desgasteBateria;
                solesRecorridos++;
                // Hace el reporte de la simulacion de cada sol transcurrido
                reporteSol(sol,avanceDelDia,distanciaRecorrida,distanciaRestante,desgasteBateria,bateriaRover);
            }
            // Verifica que el rover haya llegado a destino
            // En caso de que lo haya logrado, envía un mensaje de éxito y cambia el estado
            // Si no lo hace, verifica que no se hayan simulado todos los soles que ingresó el usuario
            // Si es así, envía un mensaje de que ya no se puede seguir la simulación y cambia el estado
            if (distanciaRestante <= 0) {
                System.out.println("SIMULACIÓN EXITOSA");
                estado = 2;
            } else if (sol == solesSimulacion) {
                System.out.println("SOLES INSUFICIENTES: Deteniendo avance, con los soles especificados no se puede llegar al cráter");
                estado = 3;
            }
            // Si no cambia en ningún momento el estado, continúa la simulación y se avanza al siguiente sol
            sol++;
        }
        // Luego de que finalice la simulación, se realiza el reporte del balance final de la simulación
        reporteFinal(solesRecorridos,distanciaRecorrida,distanciaRestante,bateriaRover,estado);
    }

    // Metodos auxiliares de la OPCION 3:

    // Entrada y validación de distancia
    public static double distanciaBaseCrater(Scanner scanner){
        double distanciaBaseCrater;
        do {
            System.out.print("Ingrese la distancia entre la base y el crater en km. (Hasta 50 km.): ");
            distanciaBaseCrater = scanner.nextDouble();
            if (distanciaBaseCrater <= 0 || distanciaBaseCrater > 50) {
                System.out.println("Ingrese una distancia entre la base y el cráter válida");
            }
        } while (distanciaBaseCrater <= 0 || distanciaBaseCrater > 50);
        return distanciaBaseCrater;
    }
    // Entrada y validación de soles
    public static int solesSimulacion(Scanner scanner){
        int solesSimulacion;
        do {
            System.out.print("Ingrese el número de soles a simular (Máximo 20 soles): ");
            solesSimulacion = scanner.nextInt();
            if (solesSimulacion <= 0 || solesSimulacion > 20) {
                System.out.println("Ingrese una cantidad de soles válida");
            }
        } while (solesSimulacion <= 0 || solesSimulacion > 20);
        return solesSimulacion;
    }
    // Cálculo del desgaste de la bateria por sol
    public static double calcularDesgasteBateria(int sol){
        double desgasteBateria = 12 + (sol * 1.5);
        return desgasteBateria;
    }
    // Cálculo del avance real del rover por sol
    public static double calcularAvanceDelDia(int sol){
        final double avanceNominal = 4.5;
        double avanceDelDia= avanceNominal - (sol * 0.2);
        return avanceDelDia;
    }
    // Reporte de la simulación por día
    public static void reporteSol(int sol, double avanceDelDia, double distanciaRecorrida,
                                  double distanciaRestante, double desgasteBateria, double bateriaRover){
        System.out.println("------- Reporte del sol " + sol + " -------");
        System.out.printf("Avance efectivo del dia: %.2f km%n", avanceDelDia);
        System.out.printf("Distancia recorrida: %.2f km%n", distanciaRecorrida);
        System.out.printf("Distancia restante: %.2f km%n", distanciaRestante);
        System.out.printf("Desgaste de la bateria del día: %.2f %%%n", desgasteBateria);
        System.out.printf("Batería restante: %.2f %%%n",  bateriaRover);
        System.out.println(" ");
    }
    // Reporte final de la simulación
    public static void reporteFinal(int solesRecorridos, double distanciaRecorrida,
                                    double distanciaRestante, double bateriaRover, int estado){
        //Se verifica cual fue el motivo de la finalización de la simulación y se guarda en un mensaje
        String mensajeEstado="";
        switch (estado) {
            case 1:
                mensajeEstado = "Estado: Falla por energía. Rover varado; requiere despliegue de paneles de emergencia.";
                break;
            case 2:
                mensajeEstado = "Estado: Éxito total de la misión. Muestras geológicas listas para recolección.";
                break;
            case 3:
                mensajeEstado = "Estado: Misión inconclusa por límite de tiempo. Rover a la espera de nueva ventana de comando.";
                break;
            default:
                break;
        }
        System.out.println(" ");
        System.out.println("------- Reporte del balance final de la expedición -------");
        System.out.println("Soles efectivos operados: " + solesRecorridos);
        System.out.printf("Distancia total recorrida:  %.2f km%n", distanciaRecorrida);
        System.out.printf("Distancia restante:  %.2f km%n", distanciaRestante);
        System.out.printf("Bateria restante: %.2f %%%n", bateriaRover);
        System.out.println(mensajeEstado);
    }

    // ============================================================
    // OPCION 4: ANALISIS SECUENCIAL DE REGOLITO MARCIANO
    // RESPONSABLE: _____________________________________________
    // ============================================================

    // Queda encapsulada en su propio método recibiendo el Scanner
    public static void opcion4Regolito(Scanner scanner) {
        System.out.println("Operador está validando la geología marciana ");
        
        int CantidadMuestras;
        
        do {
            System.out.println("Ingrese la cantidad de muestras que quiere analizar:");
            CantidadMuestras = scanner.nextInt();
        } while (CantidadMuestras <= 0);
        
        double PorcentajeHierro;
        double CantidadHierro = 0;
        double PromedioHierro;
        double Maximo = 0;
        double Minimo = 100;
        int MuestraMaximo = 0;
        int MuestrasToxicas = 0;
        double PorcentajeToxicidad;
        
        for (int i = 1; i <= CantidadMuestras; i++) {
            
            // 1. Validar el porcentaje de hierro
            do {
                System.out.println("Muestra numero " + i + " - Ingrese el porcentaje de hierro:");
                PorcentajeHierro = scanner.nextDouble();
                
                if (PorcentajeHierro < 0 || PorcentajeHierro > 100) {
                    System.out.println("Error: El porcentaje debe estar entre 0 y 100%.");
                }
            } while (PorcentajeHierro < 0 || PorcentajeHierro > 100);
                
            // Se suma el hierro acumulado
            CantidadHierro = CantidadHierro + PorcentajeHierro;
            
            // 2. Calcular máximo y mínimo
            if (i == 1 || PorcentajeHierro > Maximo) {
                Maximo = PorcentajeHierro;
                MuestraMaximo = i;
            }
            Minimo = Math.min(Minimo, PorcentajeHierro);
            
            // 3. Completar el do-while de percloratos
            char perclorato;
            do {
                System.out.println("¿Presencia de percloratos? (s/n):");
                perclorato = scanner.next().charAt(0);
                
                if (perclorato != 's' && perclorato != 'S' && perclorato != 'n' && perclorato != 'N') {
                    System.out.println("Error: Ingrese solo 's' o 'n'.");
                }
            } while (perclorato != 's' && perclorato != 'S' && perclorato != 'n' && perclorato != 'N');
            
            // Se suma toxicidad solo si la respuesta es afirmativa
            if (perclorato == 's' || perclorato == 'S') {
                MuestrasToxicas = MuestrasToxicas + 1;
            }
            
            // Reporte individual obligatorio
            System.out.println("--- Reporte Muestra " + i + " ---");
            System.out.println("Hierro: " + PorcentajeHierro + "%");
            if (perclorato == 's' || perclorato == 'S') {
                System.out.println("Condición: Tóxica");
            } else {
                System.out.println("Condición: Segura");
            }
            System.out.println("------------------------");
        }
        
        // 4. Reporte y cálculos consolidados
        System.out.println("\n=== REPORTE FINAL DEL LOTE ===");
        System.out.println("Total de muestras: " + CantidadMuestras);
        System.out.println("Mayor porcentaje de hierro: " + Maximo);
        System.out.println("Numero de muestra con más hierro: " + MuestraMaximo);
        
        PromedioHierro = CantidadHierro / CantidadMuestras;
        System.out.println("Promedio de Hierro: " + PromedioHierro + "%");
        
        PorcentajeToxicidad = (MuestrasToxicas * 100.0) / CantidadMuestras;
        System.out.println("Porcentaje de toxicidad: " + PorcentajeToxicidad + "%");
        
        // 5. Decisión final
        if (PromedioHierro > 45.0 && PorcentajeToxicidad < 25.0) {
            System.out.println("Clasificación final: LOTE APTO");
        } else {
            System.out.println("Clasificación final: LOTE DESCARTADO");
        }
    }
}

    // Metodos auxiliares de la OPCION 4: agregarlos aqui.


    // ============================================================
    // OPCION 5: SALIR DEL SISTEMA
    // RESPONSABLE: _____________________________________________
    // ============================================================

    public static void opcion5Salir() {
        // TODO: Mostrar el mensaje de cierre de telemetria
        //       y desconexion segura del enlace satelital.
        // TODO: Coordinar con main la finalizacion del programa.
    }

    // Metodos auxiliares de la OPCION 5: agregarlos aqui.

} // FIN DE LA CLASE TP_GrupoXX: no escribir metodos fuera de esta llave.
