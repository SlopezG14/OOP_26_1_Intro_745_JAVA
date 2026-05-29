import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Random;

public class Workshop {

    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int x, int y) {
        return x + y;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            return num1;
        }

        if (num2 >= num1 && num2 >= num3) {
            return num2;
        }

        return num3;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int valor, int limite) {

        int[] resultado = new int[limite];

        for (int posicion = 0; posicion < limite; posicion++) {
            resultado[posicion] = valor * (posicion + 1);
        }

        return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int numero) {

        if (numero < 0) {
            throw new IllegalArgumentException("No negativos");
        }

        int acumulado = 1;

        for (int contador = 1; contador <= numero; contador++) {
            acumulado *= contador;
        }

        return acumulado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int valor) {

        if (valor <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(valor); divisor++) {

            if (valor % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int cantidad) {

        if (cantidad < 0) {
            throw new IllegalArgumentException("No negativos");
        }

        int[] fibonacci = new int[cantidad];

        if (cantidad > 0) {
            fibonacci[0] = 0;
        }

        if (cantidad > 1) {
            fibonacci[1] = 1;
        }

        for (int indice = 2; indice < cantidad; indice++) {
            fibonacci[indice] = fibonacci[indice - 1] + fibonacci[indice - 2];
        }

        return fibonacci;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] numeros) {

        int total = 0;

        for (int elemento : numeros) {
            total += elemento;
        }

        return total;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] numeros) {

        if (numeros.length == 0) {
            return 0;
        }

        return (double) sumaElementos(numeros) / numeros.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] datos) {

        int maximo = datos[0];

        for (int valor : datos) {

            if (valor > maximo) {
                maximo = valor;
            }
        }

        return maximo;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] datos) {

        int minimo = datos[0];

        for (int valor : datos) {

            if (valor < minimo) {
                minimo = valor;
            }
        }

        return minimo;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] datos, int buscado) {

        for (int actual : datos) {

            if (actual == buscado) {
                return true;
            }
        }

        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] datos) {

        int[] reverso = new int[datos.length];

        for (int indice = 0; indice < datos.length; indice++) {
            reverso[indice] = datos[datos.length - 1 - indice];
        }

        return reverso;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] datos) {

        int[] ordenado = datos.clone();

        java.util.Arrays.sort(ordenado);

        return ordenado;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] numeros) {

        Set<Integer> valores = new LinkedHashSet<>();

        for (int item : numeros) {
            valores.add(item);
        }

        int[] sinDuplicados = new int[valores.size()];

        int posicion = 0;

        for (int numero : valores) {
            sinDuplicados[posicion++] = numero;
        }

        return sinDuplicados;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] primero, int[] segundo) {

        int[] union = new int[primero.length + segundo.length];

        System.arraycopy(primero, 0, union, 0, primero.length);

        System.arraycopy(segundo, 0, union, primero.length, segundo.length);

        return union;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] datos, int movimientos) {

        int longitud = datos.length;

        if (longitud == 0) {
            return datos;
        }

        int[] rotado = new int[longitud];

        movimientos = movimientos % longitud;

        if (movimientos < 0) {
            movimientos += longitud;
        }

        for (int i = 0; i < longitud; i++) {
            rotado[(i + movimientos) % longitud] = datos[i];
        }

        return rotado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String texto) {

        return texto.length() + 3;
    }

    // Método que invierte una cadena
    public String invertirCadena(String texto) {

        return new StringBuilder(texto).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String texto) {

        String procesada = texto.replaceAll("\\s+", "").toLowerCase();

        return procesada.equals(invertirCadena(procesada));
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String texto) {

        if (texto.trim().isEmpty()) {
            return 0;
        }

        return texto.trim().split("\\s+").length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String texto) {

        return texto.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String texto) {

        return texto.toLowerCase();
    }

    // Método que reemplaza una subcadena
    public String reemplazarSubcadena(String texto,
                                      String objetivo,
                                      String reemplazo) {

        return texto.replace(objetivo, reemplazo);
    }

    // Método que busca una subcadena
    public int buscarSubcadena(String texto, String parte) {

        return texto.indexOf(parte);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String email) {

        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    // Método que calcula el promedio de una lista
    public double promedioLista(List<Integer> numeros) {

        if (numeros.isEmpty()) {
            return 0.0;
        }

        int acumulador = 0;

        for (int valor : numeros) {
            acumulador += valor;
        }

        return (double) acumulador / numeros.size();
    }

    // Método que convierte un número en binario
    public String convertirABinario(int valor) {

        if (valor < 0) {
            return "-" + Integer.toBinaryString(Math.abs(valor));
        }

        return Integer.toBinaryString(valor);
    }

    // Método que convierte un número en hexadecimal
    public String convertirAHexadecimal(int valor) {

        if (valor < 0) {
            return "-" + Integer.toHexString(Math.abs(valor)).toUpperCase();
        }

        return Integer.toHexString(valor).toUpperCase();
    }

    // Piedra Papel Tijera Lagarto Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String usuario) {

        String[] jugadas = {
                "Piedra",
                "Papel",
                "Tijera",
                "Lagarto",
                "Spock"
        };

        Random azar = new Random();

        String cpu = jugadas[azar.nextInt(5)];

        if (usuario.equals(cpu)) {
            return "Empate";
        }

        boolean victoria =
                (usuario.equals("Piedra") &&
                        (cpu.equals("Tijera")
                                || cpu.equals("Lagarto")))

                        ||

                        (usuario.equals("Papel") &&
                                (cpu.equals("Piedra")
                                        || cpu.equals("Spock")))

                        ||

                        (usuario.equals("Tijera") &&
                                (cpu.equals("Papel")
                                        || cpu.equals("Lagarto")))

                        ||

                        (usuario.equals("Lagarto") &&
                                (cpu.equals("Spock")
                                        || cpu.equals("Papel")))

                        ||

                        (usuario.equals("Spock") &&
                                (cpu.equals("Tijera")
                                        || cpu.equals("Piedra")));

        if (victoria) {
            return "Ganaste";
        }

        return "Perdiste";
    }

    // Piedra Papel Tijera Lagarto Spock versión corta
    public String pptls2(String[] partida) {

        String jugadorUno = partida[0];
        String jugadorDos = partida[1];

        if (jugadorUno.equals(jugadorDos)) {
            return "Empate";
        }

        if (
                (jugadorUno.equals("S") && jugadorDos.equals("P")) ||
                (jugadorUno.equals("P") && jugadorDos.equals("R")) ||
                (jugadorUno.equals("R") && jugadorDos.equals("L")) ||
                (jugadorUno.equals("L") && jugadorDos.equals("V")) ||
                (jugadorUno.equals("V") && jugadorDos.equals("S")) ||
                (jugadorUno.equals("S") && jugadorDos.equals("L")) ||
                (jugadorUno.equals("L") && jugadorDos.equals("P")) ||
                (jugadorUno.equals("P") && jugadorDos.equals("V")) ||
                (jugadorUno.equals("V") && jugadorDos.equals("R")) ||
                (jugadorUno.equals("R") && jugadorDos.equals("S"))
        ) {
            return "Player 1";
        }

        return "Player 2";
    }

    // Método área círculo
    public double areaCirculo(double radio) {

        return Math.PI * radio;
    }

    // Método signo zodiacal
    public String zoodiac(int dia, int mes) {

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return "Invalid Date";
        }

        if (mes == 2 && dia > 29) {
            return "Invalid Date";
        }

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19))
            return "Aries";

        if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20))
            return "Tauro";

        if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20))
            return "Gemini";

        if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22))
            return "Cancer";

        if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22))
            return "Leo";

        if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22))
            return "Virgo";

        if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22))
            return "Libra";

        if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21))
            return "Escorpio";

        if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21))
            return "Sagitario";

        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19))
            return "Capricornio";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18))
            return "Acuario";

        return "Piscis";
    }
}

