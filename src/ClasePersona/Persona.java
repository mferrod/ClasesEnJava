package ClasePersona;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private static Character sexo = 'H';
    private double peso;
    private int altura;

    public Persona() {
        this.nombre = "ANONIMO";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, Character sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double calculo = (peso/1000)/(Math.pow((double) altura/100, 2 ));
        int devuelvo = -2;
        if (calculo > 20) {
            devuelvo = -1;
        } else if (calculo >= 20 ||calculo <= 25) {
            devuelvo = 0;
        } else devuelvo = 1;

        return devuelvo;
    }

    public boolean esMayorDeEdad() {
        if (this.edad > 18) {
            return true;
        }
        return false;
    }
    public boolean comprobarSexo(Character sexo) {
        if (sexo.equals('H') || sexo.equals('M')) {
            if (this.sexo.equals(sexo)) {
                return true;
            }
        }
        this.sexo = 'H';
        return false;
    }

    @Override
    public String toString() {
        return "La persona " + this.nombre + " tiene la edad de " + this.edad + ", su sexo es " + this.sexo + ", el dni de esta persona es: " + this.dni +
                ". Tiene un peso de " + this.peso + " y una altura de " + this.altura;
    }

    public void generarDNI() {
        String generado = "";
        Random random = new Random();
        int limit = 0;

        for (int i = 0; i < 8; i++) {
            generado += random.nextInt(9);
        }
        for (int i = 0; !(limit > 64); i++) {
            limit = random.nextInt(90);
        }
        generado += Character.toString((char) limit);
        this.dni = generado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        peso*=1000;
        this.peso = peso;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

}
