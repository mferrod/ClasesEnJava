package ClasePersona;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        String sex = sc.nextLine();
        char sexo = sex.charAt(0);
        int edad = sc.nextInt();
        double peso = sc.nextDouble();
        int altura = sc.nextInt();

        Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona p2 = new Persona(nombre,edad,sexo);
        Persona p3 = new Persona();
        sc.nextLine();
        p3.setNombre(sc.nextLine());
        sex = sc.nextLine();
        p3.setSexo(sex.charAt(0));
        p3.setEdad(sc.nextInt());
        p3.setPeso(sc.nextDouble());
        p3.setAltura(sc.nextInt());
        ArrayList<Persona> personas = new ArrayList<>(3);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        for (int i = 0; i < 3; i++) {
            if (personas.get(i).calcularIMC() == -1) {
                System.out.println("ESTA PERSONA NECESITA COMER MUCHO MÁS");
            } else if (personas.get(i).calcularIMC() == 0) {
                System.out.println("ESTA PERSONA ESTÁ SOBRE SU PESO");
            } else {
                System.out.println("ESTA PERSONA ESTÁ EN SOBREPESO");
            }
        }
        for (int i = 0; i < 3; i++) {
            if (personas.get(i).esMayorDeEdad()) {
                System.out.println("ES MAYOR DE EDAD");
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(personas.get(i).toString());
        }
    }
}
