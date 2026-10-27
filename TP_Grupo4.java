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
