package grupo4;
import java.util.Scanner;

public class Grupo4F {



public class TP_Grupo4 {

    
    
    
   
    // SECCION MENU PRINCIPAL Y COORDINACION
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ERRORESCONS = 3;
        int N1, N2, N3, N4, N5; 
        int opcion = 0, fallasconsecutivas = 0;

        // El nombre y logo
        System.out.println("--- Nodriza IV ---");
        System.out.println("            ^");
        System.out.println("           /A\\");
        System.out.println("          //I\\\\");
        System.out.println("         ///I\\\\\\");
        System.out.println("        ////I\\\\\\\\");
        System.out.println("       /////I\\\\\\\\\\");
        System.out.println("      //////I\\\\\\\\\\\\");
        System.out.println("     ///////I\\\\\\\\\\\\\\");
        System.out.println("    ////////I\\\\\\\\\\\\\\\\");
        System.out.println("   /////////I\\\\\\\\\\\\\\\\\\");
        System.out.println("  //////////I\\\\\\\\\\\\\\\\\\\\");
        System.out.println("   '////////I\\\\\\\\\\\\\\\'");
        System.out.println("NDZ   '//////I\\\\\\\\\\\'");
        System.out.println("        '////I\\\\\\\'");
        System.out.println("          '//I\\\'");
        System.out.println("            'I'");

        do {
            System.out.println("ingrese una de las siguientes opciones: ");
            System.out.println("1-Estado del SoVYNE(Soporte vital y nivel de emergencia).");
            System.out.println("2-Gestion ProDeLB-de Protocolos de la Base.");
            System.out.println("3-Simulacion de Trayectoria del Rover.");
            System.out.println("4-Analisis Secuencial de Muestras de Regolito Marciano.");
            System.out.println("5-Salir del Sistema.");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opcion 1: ");
                    opcion1SoVYNE(scanner);
                    break;
                case 2:
                    System.out.println("Seleccionaste la opcion 2: ");
                    opcion2ProDeLB(scanner);
                    break;
                case 3:
                    System.out.println("Seleccionaste la opcion 3: ");
                    opcion3Rover(scanner);
                    break;
                case 4:
                    System.out.println("Seleccionaste la opcion 4: ");
                    opcion4Regolito(scanner);
                    break;
                case 5:
                    System.out.println("Seleccionaste la opcion 5: ");
                    opcion5Salir();
                    break;
                default:
                    System.out.println("Seleccionaste un valor no valido: ");
                    fallasconsecutivas++;
                    if (fallasconsecutivas == ERRORESCONS) {
                        System.out.println("Se cierra el sistema porque hubo " + ERRORESCONS + " fallas");
                    } else {
                        System.out.println("Te quedan " + (ERRORESCONS - fallasconsecutivas) + " fallas disponibles.");
                    }
                    break;
            }
        } while (opcion != 5 && fallasconsecutivas < ERRORESCONS);
    }

    
    // OPCION 1: ESTADO DE SoVYNE
    
    public static void opcion1SoVYNE(Scanner sc) {
        double oxigeno;
        int agua;
        double energia;

        do {
            System.out.println("Ingrese el nivel actual del Oxigeno");
            oxigeno = sc.nextDouble();

            if (oxigeno >= 0 && oxigeno <= 100) {
                System.out.println("Valor ingresado correctamente");
            } else {
                System.out.println("Valor invalido, intente nuevamente");
            }
        } while (oxigeno < 0 || oxigeno > 100);

        do {
            System.out.println("Ingrese el nivel actual del Agua");
            agua = sc.nextInt();

            if (agua >= 0) {
                System.out.println("Valor ingresado correctamente");
            } else {
                System.out.println("Valor invalido, intente nuevamente");
            }
        } while (agua < 0);

        do {
            System.out.println("Ingrese el nivel actual de Energia");
            energia = sc.nextDouble();

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
    }

   
    // OPCION 2: GESTION ProDeLB PROTOCOLOS
    
    public static void opcion2ProDeLB(Scanner scanner) {
        final double CONSUMO_AGUA_POR_HORA = 3.5;
        final double CONSUMO_ENERGIA_POR_HORA = 12.0;
        char letra;

        do {
            System.out.println("-GESTION DE PROTOCOLOS DE LA BASE-");
            System.out.println("Porfavor selecciona una opcion:");
            System.out.println("a) Invernadero hidroponico.");
            System.out.println("b) Carga de baterias solares.");
            System.out.println("c) Blindaje contra tormenta de polvo.");
            System.out.println("d) Modo reposo.");
            System.out.println("z) Volver al menu principal.");
            
            letra = scanner.next().trim().toLowerCase().charAt(0);

            switch (letra) {
                case 'a': {
                    System.out.println("- GESTION INVERNADERO HIDROPONICO -");
                    System.out.println("Ingresar Horas de ciclo lumínico activo a programar, valor entre 1 y 24.");
                    int horas = scanner.nextInt();

                    if (horas < 1 || horas > 24) {
                        System.out.println("Error: las horas deben estar entre 1 y 24.");
                        break;
                    }

                    double aguaConsumida = horas * CONSUMO_AGUA_POR_HORA;
                    double energiaConsumida = horas * CONSUMO_ENERGIA_POR_HORA;

                    System.out.println("- PROCEDIMIENTO TÉCNICO -");
                    System.out.println("1. Activar lámparas LED de espectro completo en sectores hidropónicos A y B.");
                    System.out.println("2. Abrir válvulas de recirculación de solución nutriente enriquecida con nitrógeno marciano.");
                    System.out.println("3. Acoplar los absorbedores al circuito vegetal para forzar la fotosíntesis.");
                    System.out.println("- BALANCE NETO -");
                    System.out.println("Agua consumida: " + aguaConsumida + " LITROS");
                    System.out.println("Energía restada: " + energiaConsumida + " kWh");
                    break;
                }
                case 'b': {
                    System.out.println("- GESTION DE CARGAS DE BATERIAS SOLARES-");
                    System.out.println("Ingresar nivel de radiacion solar detectado en el sensor exterior considerando valores entre 100.0 y 700.0");
                    double radiacion = scanner.nextDouble();

                    final double RADIACION_MIN = 100.0;
                    final double RADIACION_MAX = 700.0;
                    if (radiacion < RADIACION_MIN || radiacion > RADIACION_MAX) {
                        System.out.println("error radiacion fuera de rango ");
                        System.out.println("RADIACION MINIMA: " + RADIACION_MIN);
                        System.out.println("RADIACION MAXIMA: " + RADIACION_MAX);
                        break;
                    }

                    double energiaProducida = (radiacion * 50 * 0.22) / 1000;

                    System.out.println("- PROCEDIMIENTO TÉCNICO -");
                    System.out.println("1. Desplegar los servomotores azimutales del arreglo de paneles solares fotovoltaicos.");
                    System.out.println("2. Calibrar ángulo de inclinación según la declinación solar local del cráter Jezero.");
                    System.out.println("3. Derivar la corriente generada a los bancos de almacenamiento de iones de litio.");
                    System.out.println("4. Energia solar generada: " + energiaProducida + " kWh");
                    break;
                }
                case 'c': {
                    System.out.println("-GESTION DE BLINDAJE CONTRA TORMENTA DE POLVO-");
                    System.out.println("ingresar velocidad estimada del viento marciano en km/h entre 40.0 y 250.0");
                    double velocidadViento = scanner.nextDouble();

                    final double VELOCIDAD_MIN = 40.0;
                    final double VELOCIDAD_MAX = 250.0;
                    if (velocidadViento < VELOCIDAD_MIN || velocidadViento > VELOCIDAD_MAX) {
                        System.out.println("error velocidad fuera de rango");
                        System.out.println("velocidad MINIMA: " + VELOCIDAD_MIN);
                        System.out.println("velocidad MAXIMA: " + VELOCIDAD_MAX);
                        break;
                    }

                    double consumoEnergetico = 30.0 + (velocidadViento * 0.45);

                    System.out.println("- PROCEDIMIENTO TÉCNICO -");
                    System.out.println("1. Bajando compuertas de aleación de titanio sobre las cúpulas de visualización.");
                    System.out.println("2. Presurizando los sellos perimetrales de las esclusas para impedir la infiltración de regolito fino.");
                    System.out.println("3. Retrayendo mástiles meteorológicos secundarios y antenas de comunicaciones redundantes");
                    System.out.println("4. Coste energetico total del despliegue defensivo: " + consumoEnergetico + " kWh");
                    break;
                }
                case 'd': {
                    System.out.println("-GESTION DEL MODO REPOSO-");
                    System.out.println("Ingresar horas de reposo a programar. Validas entre 1 y 48");
                    double horas = scanner.nextDouble();

                    final double HORAS_MIN = 1;
                    final double HORAS_MAX = 48;
                    if (horas < HORAS_MIN || horas > HORAS_MAX) {
                        System.out.println("error horas fuera de rango");
                        System.out.println("HORAS MINIMAS: " + HORAS_MIN);
                        System.out.println("HORAS MAXIMAS: " + HORAS_MAX);
                        break;
                    }

                    double aguaConsumida = horas * 0.5;
                    double oxigenoConsumido = horas * 0.3;
                    double energiaConsumida = horas * 4.0; 

                    System.out.println("- PROCEDIMIENTO TÉCNICO -");
                    System.out.println("1. Desconectando subsistemas no esenciales");
                    System.out.println("2. reduciendo la temperatura interna de los módulos comunes de 21°C a 14°C para conservar calor en el núcleo.");
                    System.out.println("3. Poner la red de telemetría en estado de escucha pasiva a la espera de señales de la Tierra.");
                    System.out.println("- BALANCE DE RECURSOS CONSUMIDOS (BAJO CONSUMO) -");
                    System.out.println("Agua consumida: " + aguaConsumida + " LITROS");
                    System.out.println("Oxígeno consumido: " + oxigenoConsumido);
                    System.out.println("Energía consumida: " + energiaConsumida + " kWh");
                    break;
                }
                case 'z': {
                    System.out.println("Volviendo al menú principal...");
                    break;
                }
                default: {
                    System.out.println("[ERROR DE SISTEMA]: Código de protocolo no reconocido por la computadora central. Operación abortada para prevenir fallas de presurización.");
                    letra = 'z'; 
                    break;
                }
            }
        } while (letra != 'z');
    }

    
    // OPCION 3: SIMULACION DE TRAYECTORIA DEL ROVER
   
    public static void opcion3Rover(Scanner scanner) {
        System.out.println("------- SIMULACIÓN DE TRAYECTORIA DEL ROVER -------");
        
        double distanciaBaseCrater = distanciaBaseCrater(scanner);
        int solesSimulacion = solesSimulacion(scanner);
        System.out.println(" ");
        
        double distanciaRestante = distanciaBaseCrater;
        double distanciaRecorrida = 0;
        double bateriaRover = 100;
        int sol = 1;
        int solesRecorridos = 0;
        int estado = 0; 
        
        while (estado == 0) {
            double desgasteBateria = calcularDesgasteBateria(sol);
            
            if ((bateriaRover - desgasteBateria) < 10) {
                System.out.println("BATERIA CRÍTICA: Deteniendo avance para recarga solar estática");
                estado = 1;
            } else {
                double avanceDelDia = calcularAvanceDelDia(sol);
                
                if (avanceDelDia > distanciaRestante) {
                    avanceDelDia = distanciaRestante;
                }
                distanciaRecorrida = distanciaRecorrida + avanceDelDia;
                distanciaRestante = distanciaBaseCrater - distanciaRecorrida;
                bateriaRover = bateriaRover - desgasteBateria;
                solesRecorridos++;
                
                reporteSol(sol, avanceDelDia, distanciaRecorrida, distanciaRestante, desgasteBateria, bateriaRover);
            }
            
            if (estado == 0) {
                if (distanciaRestante <= 0) {
                    System.out.println("SIMULACIÓN EXITOSA");
                    estado = 2;
                } else if (sol == solesSimulacion) {
                    System.out.println("SOLES INSUFICIENTES: Deteniendo avance, con los soles especificados no se puede llegar al cráter");
                    estado = 3;
                }
            }
            sol++;
        }
        reporteFinal(solesRecorridos, distanciaRecorrida, distanciaRestante, bateriaRover, estado);
    }

    // Metodos auxiliares de la OPCION 3
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
    
    public static double calcularDesgasteBateria(int sol){
        double desgasteBateria = 12 + (sol * 1.5);
        return desgasteBateria;
    }
    
    public static double calcularAvanceDelDia(int sol){
        final double avanceNominal = 4.5;
        double avanceDelDia = avanceNominal - (sol * 0.2);
        return avanceDelDia;
    }
    
    public static void reporteSol(int sol, double avanceDelDia, double distanciaRecorrida,
                                  double distanciaRestante, double desgasteBateria, double bateriaRover){
        System.out.println("------- Reporte del sol " + sol + " -------");
        System.out.println("Avance efectivo del dia: " + avanceDelDia + " km");
        System.out.println("Distancia recorrida: " + distanciaRecorrida + " km");
        System.out.println("Distancia restante: " + distanciaRestante + " km");
        System.out.println("Desgaste de la bateria del día: " + desgasteBateria + " %");
        System.out.println("Batería restante: " + bateriaRover + " %");
        System.out.println(" ");
    }
    
    public static void reporteFinal(int solesRecorridos, double distanciaRecorrida,
                                    double distanciaRestante, double bateriaRover, int estado){
        String mensajeEstado = "";
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
        System.out.println("Distancia total recorrida:  " + distanciaRecorrida + " km");
        System.out.println("Distancia restante:  " + distanciaRestante + " km");
        System.out.println("Bateria restante: " + bateriaRover + " %");
        System.out.println(mensajeEstado);
    }

    
    // OPCION 4: ANALISIS SECUENCIAL DE REGOLITO
    
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
        int MuestraMaximo = 0;
        int MuestrasToxicas = 0;
        double PorcentajeToxicidad;
        
        for (int i = 1; i <= CantidadMuestras; i++) {
            
            do {
                System.out.println("Muestra numero " + i + " - Ingrese el porcentaje de hierro:");
                PorcentajeHierro = scanner.nextDouble();
                
                if (PorcentajeHierro < 0 || PorcentajeHierro > 100) {
                    System.out.println("Error: El porcentaje debe estar entre 0 y 100%.");
                }
            } while (PorcentajeHierro < 0 || PorcentajeHierro > 100);
                
            CantidadHierro = CantidadHierro + PorcentajeHierro;
            
            if (i == 1 || PorcentajeHierro > Maximo) {
                Maximo = PorcentajeHierro;
                MuestraMaximo = i;
            }
            
            char perclorato;
            do {
                System.out.println("¿Presencia de percloratos? (s/n):");
                String entradaPerclorato = scanner.next();
                
                if (entradaPerclorato.length() == 1) {
                    perclorato = entradaPerclorato.charAt(0);
                } else {
                    perclorato = 'x';
                }
                
                if (perclorato != 's' && perclorato != 'S' && perclorato != 'n' && perclorato != 'N') {
                    System.out.println("Error: Ingrese solo 's' o 'n'.");
                }
            } while (perclorato != 's' && perclorato != 'S' && perclorato != 'n' && perclorato != 'N');
            
            if (perclorato == 's' || perclorato == 'S') {
                MuestrasToxicas = MuestrasToxicas + 1;
            }
            
            System.out.println("--- Reporte Muestra " + i + " ---");
            System.out.println("Hierro: " + PorcentajeHierro + "%");
            if (perclorato == 's' || perclorato == 'S') {
                System.out.println("Condición: Tóxica");
            } else {
                System.out.println("Condición: Segura");
            }
            System.out.println("------------------------");
        }
        
        System.out.println("\n=== REPORTE FINAL DEL LOTE ===");
        System.out.println("Total de muestras: " + CantidadMuestras);
        System.out.println("Mayor porcentaje de hierro: " + Maximo);
        System.out.println("Numero de muestra con más hierro: " + MuestraMaximo);
        
        PromedioHierro = CantidadHierro / CantidadMuestras;
        System.out.println("Promedio de Hierro: " + PromedioHierro + "%");
        
        PorcentajeToxicidad = (MuestrasToxicas * 100.0) / CantidadMuestras;
        System.out.println("Porcentaje de toxicidad: " + PorcentajeToxicidad + "%");
        
        if (PromedioHierro > 45.0 && PorcentajeToxicidad < 25.0) {
            System.out.println("Clasificación final: LOTE APTO: Aprobado para extracción y fundición de metales.");
        } else {
            System.out.println("Clasificación final: LOTE DESCARTADO: Alta concentración de sales tóxicas o bajo rendimiento mineral.");
        }
    }

    
    // OPCION 5: SALIR DEL SISTEMA
    
    public static void opcion5Salir() {
        System.out.println("Cierre del Programa. Mision realizada con exito...");
        System.out.println("Esperamos que nuestros valores sean de ayuda para toda la nave Nodriza y si no sobrevivimos que nos recuerden como heroes que hicimos lo que teniamos que hacer.....");
        System.out.println("Desconexion segura del enlace satelital...");
        System.out.println("@@@@  @   @ @@@@@ @   @    @   @ @@@  @@@    @@@ @@@@@    @   @  @@@  @@@@  @@@@  @@@ @@@@@  @@@ ");
        System.out.println("@   @ @   @ @     @@  @    @   @  @  @   @    @  @        @@  @ @   @ @   @ @   @  @     @  @   @ ");
        System.out.println("@@@@  @   @ @@@@  @ @ @    @   @  @  @@@@@    @  @@@@     @ @ @ @   @ @   @ @@@@   @    @   @@@@@ ");
        System.out.println("@   @ @   @ @     @  @@     @ @   @  @   @ @  @  @        @  @@ @   @ @   @ @  @   @   @    @   @ ");
        System.out.println("@@@@   @@@  @@@@@ @   @      @   @@@ @   @  @@   @@@@@    @   @  @@@  @@@@  @   @ @@@ @@@@@ @   @ ");
    }
}
