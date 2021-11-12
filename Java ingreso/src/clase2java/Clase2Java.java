
package clase2java;

import java.util.Scanner;

public class Clase2Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();               
        System.out.println("Ingrese su edad");
        String edad = entrada.nextLine();
        System.out.println("¿Cuál es su hobbie?");
        String hobbie = entrada.nextLine();        
        System.out.println("¿Cuál es su editor de código preferido?");
        String editor = entrada.nextLine();
        System.out.println("¿Qué sistema operativo utiliza?");
        String sistop = entrada.nextLine(); 
      
        System.out.println("Bienvenid@! "+ nombre + " " + apellido);
        System.out.println("Tiene " + edad + " años");
        System.out.println("Le gusta " + hobbie); 
        System.out.println("Trabaja en " + sistop + " con " + editor);
        

        System.out.println("Ingrese su usuario");
        String user = entrada.nextLine();
        System.out.println("Ingrese su contraseña");
        String pass = entrada.nextLine();
        Ingreso ingresar = new Ingreso();
        ingresar.setUsuario(user);
        ingresar.setPass(pass);
        if(ingresar.validar()){
            System.out.println("Bienvenido al sistema");
            System.out.println("Los datos ingresados son:");
            System.out.println("Tu Usuario: " + ingresar.getUsuario());
            System.out.println("Tu clave: " + ingresar.getPass());
        } else{
            System.out.println("Los datos son incorrectos.");
        }
        
    }
    
}
