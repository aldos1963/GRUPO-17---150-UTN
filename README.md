# GRUPO-17---150-UTN
Repositorio del Grupo 17 - Cohorte 150 UTN ARGENTINA PROGRAMA

Mapa de Clases.

Equipo //Clase de Equipo
//Atributos
-nombre: String //Nombre del equipo de clase String.
-descripcion: String //Descripcion del equipo de clase String.

Partido //Clase de Partido
//Atributos
-equipo1: Equipo //equipo1 de clase Equipo.
-equipo2: Equipo //equipo2 de clase Equipo.
-golesEquipo1: int
-golesEquipo2: int
//Debe devolver
+resultado(Equipo): ResultadoEnum //Falta crear metodo para devolver y la clase ResultadoEnum.

ResultadoEnum //Clase
//Debe devolver
+ganador,perdedor,empate

Ronda //Clase
//Atributos
-nro: String //nro de clase String.
-partidos: Partido[] //partidos de clase Partido.
//Debe devolver
+puntos(): int

Pronostico
//Atributos
-partido: Partido //partido de clase Partido
-equipo: Equipo//equipo de clase Equipo
-resultado: ResultadoEnum //resultado de clase ResultadoEnum
//Debe devolver
+puntos(): int
