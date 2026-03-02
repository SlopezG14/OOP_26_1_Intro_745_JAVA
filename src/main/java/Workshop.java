import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.List;

public class Workshop {

    public static void main(String[] args) {

    }

    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No se permite negativo");
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("No negativo");

        int[] serie = new int[n];
        if (n > 0)
            serie[0] = 0;
        if (n > 1)
            serie[1] = 1;
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }

    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int num : arreglo) {
            if (num > mayor)
                mayor = num;
        }
        return mayor;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int num : arreglo) {
            if (num < menor)
                menor = num;
        }
        return menor;
    }
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento)
                return true;
        }
        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }
    public int[] ordenarArreglo(int[] arreglo) {
    int[] copia = arreglo.clone();
    for (int i = 0; i < copia.length - 1; i++) {
        for (int j = 0; j < copia.length - 1 - i; j++) {
            if (copia[j] > copia[j + 1]) {
                int temp = copia[j];
                copia[j] = copia[j + 1];
                copia[j + 1] = temp;
            }
        }
    }
    return copia;
}

public int[] eliminarDuplicados(int[] arreglo) {
    java.util.Set<Integer> set = new java.util.LinkedHashSet<>();
    for (int num : arreglo) {
        set.add(num);
    }
    int[] resultado = new int[set.size()];
    int i = 0;
    for (int num : set) {
        resultado[i++] = num;
    }
    return resultado;
}

public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
    int[] combinado = new int[arreglo1.length + arreglo2.length];
    for (int i = 0; i < arreglo1.length; i++) {
        combinado[i] = arreglo1[i];
    }
    for (int i = 0; i < arreglo2.length; i++) {
        combinado[arreglo1.length + i] = arreglo2[i];
    }
    return combinado;
}

public int[] rotarArreglo(int[] arreglo, int posiciones) {
    int n = arreglo.length;
    if (n == 0) return arreglo;
    posiciones = posiciones % n;
    if (posiciones < 0) posiciones += n;

    int[] rotado = new int[n];
    for (int i = 0; i < n; i++) {
        rotado[(i + posiciones) % n] = arreglo[i];
    }
    return rotado;
}

public int contarCaracteres(String cadena) {
    return cadena.length();
}

public String invertirCadena(String cadena) {
    StringBuilder sb = new StringBuilder(cadena);
    return sb.reverse().toString();
}

public boolean esPalindromo(String cadena) {
    String limpia = cadena.replaceAll("\\s+", "").toLowerCase();
    String invertida = new StringBuilder(limpia).reverse().toString();
    return limpia.equals(invertida);
}

public int contarPalabras(String cadena) {
    if (cadena == null || cadena.trim().isEmpty()) return 0;
    String[] palabras = cadena.trim().split("\\s+");
    return palabras.length;
}

     public String convertirAMayusculas(String cadena) {
        return cadena == null ? "" : cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {
        return cadena == null ? "" : cadena.toLowerCase();
    }

    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena == null ? "" : cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena == null || subcadena == null ? -1 : cadena.indexOf(subcadena);
    }

    public boolean validarCorreoElectronico(String correo) {
        return correo != null && correo.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        return lista.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        Random random = new Random();
        String eleccionComputadora = opciones[random.nextInt(opciones.length)];
        if (eleccionUsuario == null) return "Elección inválida";

        eleccionUsuario = eleccionUsuario.substring(0,1).toUpperCase() 
                          + eleccionUsuario.substring(1).toLowerCase();

        if (eleccionUsuario.equals(eleccionComputadora)) return "Empate. Ambos eligieron " + eleccionUsuario;

        boolean usuarioGana = switch (eleccionUsuario) {
            case "Piedra" -> eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto");
            case "Papel" -> eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock");
            case "Tijera" -> eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto");
            case "Lagarto" -> eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel");
            case "Spock" -> eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra");
            default -> false;
        };

        return usuarioGana ? "Ganaste. La computadora eligió " + eleccionComputadora
                            : "Perdiste. La computadora eligió " + eleccionComputadora;
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
//Signo zodiaca
    public String zoodiac(int day, int month) {
        return switch (month) {
            case 1 -> (day >= 20) ? "Acuario" : "Capricornio";
            case 2 -> (day <= 18) ? "Acuario" : "Piscis";
            case 3 -> (day >= 21) ? "Aries" : "Piscis";
            case 4 -> (day <= 19) ? "Aries" : "Tauro";
            case 5 -> (day <= 20) ? "Tauro" : "Géminis";
            case 6 -> (day <= 20) ? "Géminis" : "Cáncer";
            case 7 -> (day <= 22) ? "Cáncer" : "Leo";
            case 8 -> (day <= 22) ? "Leo" : "Virgo";
            case 9 -> (day <= 22) ? "Virgo" : "Libra";
            case 10 -> (day <= 22) ? "Libra" : "Escorpio";
            case 11 -> (day <= 21) ? "Escorpio" : "Sagitario";
            case 12 -> (day <= 21) ? "Sagitario" : "Capricornio";
            default -> "Fecha inválida";
        };
    }


}

