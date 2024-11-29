
// simula un juego de Piedra, Papel o Tijeras entre dos jugadores.
//Primero, solicita a cada jugador que ingrese su jugada, convirtiéndola a minúsculas para evitar errores en la comparación. Luego, verifica si las jugadas son iguales para declarar un empate. 
//Si no es empate, utiliza un switch para determinar quién gana, comparando las jugadas de ambos jugadores. 
//Si alguno de los jugadores ingresa una jugada inválida, el programa muestra un mensaje de error y termina. Al final, cierra el Scanner para liberar recursos.

package piedraPapelTijera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//Solo usamos una instancia scanner para el codigo no es neceesario usar dos, cambiamos la varriable sc a scanner como lo hemos hecho en clase
	Scanner scanner = new Scanner(System.in);
		
		//Pedir jugada del jugador 1
		
	System.out.print("Turno jugador 1. Introduzca: piedra, papel o tijeras: ");
	
	//El método next line lee toda la linea de texto que ingresa el usuario.El texto se almacena en una cadena.
	//usamos toLowerCase para convertir todos los caracteres de la cadena en minusculas
	
	String j1 = scanner.nextLine().toLowerCase();

	
	//Turno jugador 2
	
	 System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	 
	 String j2 = scanner.nextLine().toLowerCase();
	
	
	//Ver si es empate 
	 // Se cambia == por equals porque == no compara cadenas que se crean en tiempo de ejecucion, que es nuestro caso usando el scanner. Equals compara el contenido de las cadenas
	 
	 if (j1.equals(j2)) {
		 
		 System.out.print("Es un Empate");
		 
	 }else {
		
		//Se inicia por defecto comoo ganador al jugador 2 y cambiamos el nombre de la variable
		 int ganador = 2;
		 
		 switch (j1) {
		 
		 case "piedra":
             if (j2.equals("tijeras")) {
                 ganador = 1;
             }
             
             break;
          
		 case "papel":
             if (j2.equals("piedra")) {
                 ganador = 1;
             }
             break;
          
		 case "tijeras":
             if (j2.equals("papel")) {
                 ganador = 1;
             }
             break;    
        //Si el deaulf esta vacio no se ejecutara nada cuando no haya coincidencia en los casos definidos en el switch
		 default:
			  System.out.println("No valido");
			  //sale del programa si la juga no es valida
              return; 
		 }
		 
		 
		 //Para mostrar el ganador
		 
		 
System.out.println("Gana el jugador " + ganador);
		  
		 
	 	}
	//cerramos el scanner para gestionar mejor los recursos y el rendimiento del programa
	 		scanner.close();
	}

}
