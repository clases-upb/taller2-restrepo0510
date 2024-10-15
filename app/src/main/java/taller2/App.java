/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
     public static int Calcular_saldo(int base_dinero, int total_recaudos, int total_retiros) {
        try {
            int base = 2000000;
            if (base_dinero == base) {

            } else {
                return -1;
            }

            int saldo_taquilla = base_dinero + total_recaudos - total_retiros;
            return saldo_taquilla;

        } catch (Exception e) {
            System.out.println("ocurrio un error");
            return -1;
        }
    }


    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
 public static String Calcular_tip(float consumo_cliente) {
        try {
            float consumo_min = 0;
            if (consumo_cliente > consumo_min) {
            } else {
                return "Error calculando consumo";
            }

            double porc_propina = 0.1;
            double impuesto_consumo = 0.08;
            double valor_propina = porc_propina * consumo_cliente;
            double valor_imconsumo = impuesto_consumo * consumo_cliente;
            double total_pagar = consumo_cliente + valor_propina + valor_imconsumo;
            String total_cuenta = String.format(
                    "valor comida: $%s - valor propina $%s - valor impoconsumo $%s - total a pagar $%s",
                    consumo_cliente, valor_propina, valor_imconsumo, total_pagar);

            return total_cuenta;

        } catch (Exception e) {

            return "Error en la función Calcular_tip";
        }
    }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
static public int Obtener_puntos(int partidos_ganados, int partidos_perdidos, int partidos_empatados) {
        try {
            int min_pganados = 0;
            int min_pperdidos = 0;
            int min_pempatados = 0;

            if (partidos_ganados < min_pganados || partidos_perdidos < min_pperdidos
                    || partidos_empatados < min_pempatados) {
                return -1;
            }

            int puntos_totales = (partidos_ganados * 3) + (partidos_empatados * 1) + (partidos_perdidos * 0);
            return puntos_totales;

        } catch (Exception e) {

            return -1;
        }
    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
static public float Calcular_definitiva(float n1, float n2, float n3, float n4, float n5, float p1, float p2,
            float p3, float p4, float p5) {
        try {
            float n_min = 0;
            float n_max = 5;
            if (n1 < n_min || n1 > n_max || n2 < n_min || n2 > n_max || n3 < n_min || n3 > n_max || n4 < n_min
                    || n4 > n_max || n5 < n_min || n5 > n_max) {
                return -1;
            }

            float p_min = 0;
            float p_max = 1;
            if (p1 < p_min || p1 > p_max || p2 < p_min || p2 > p_max || p3 < p_min || p3 > p_max || p4 < p_min
                    || p4 > p_max || p5 < p_min || p5 > p_max) {
                return -1;
            }

            float suma_p = p1 + p2 + p3 + p4 + p5;
            if (suma_p == 1) {

            } else {
                return -1;
            }

            float n_definitiva = (n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4) + (n5 * p5);
            return n_definitiva;

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
public static float Calcular_para_ganar(float n1, float n2, float n3, float n4, float p1, float p2, float p3, float p4, float p5) {
    try {
        
        if (p1 < 0 || p1 > 1 || p2 < 0 || p2 > 1 || p3 < 0 || p3 > 1 || 
            p4 < 0 || p4 > 1 || p5 < 0 || p5 > 1) {
            return -1;
        }

        float suma_p = p1 + p2 + p3 + p4 + p5;
            if (suma_p == 1) {

            } else {
                return -1;
            }

        if (n1 < 0 || n1 > 5 || n2 < 0 || n2 > 5 || n3 < 0 || n3 > 5 || n4 < 0 || n4 > 5) {
            return -1;
        }

        float puntaje_actual = (n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4);

        float nota_necesaria = (3.0f - puntaje_actual) / p5;

        if (nota_necesaria < 0 || nota_necesaria > 5) {
            return -1;
        }

        return nota_necesaria;
        
    } catch (Exception e) {
        return -1;
    }
}

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
 public static float Calcular_salario(int h_normal, int h_extra_diurna, int h_extra_nocturna, float valor_h_normal) {
        try {
            float min_valor_hnormal = 0;
            if (valor_h_normal <= min_valor_hnormal) {
                return -1;
            }
            float porcentaje_diurno = 0.15f;
            float porcentaje_nocturno = 0.35f;
            float cargo_hnormal = h_normal * valor_h_normal;
            float cargo_hdiurna = h_extra_diurna * valor_h_normal * porcentaje_diurno;
            float cargo_hnocturna = h_extra_nocturna * valor_h_normal * porcentaje_nocturno;
            float salario_total = cargo_hnormal + cargo_hdiurna + cargo_hnocturna;

            return salario_total;

        } catch (Exception e) {


            return -1;
        }
    }


    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
 public static float Calcular_area_triangulo(float base, float altura) {
        try {
            float base_min = 0;
            float altura_min = 0;
            if (base <= base_min || altura <= altura_min) {
                return -1;

            }

            float area = 0.5f * base * altura;

            return area;

        } catch (Exception e) {
            return -1;

        }
    }


    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

 public static float Calcular_perimetro_cuadrado(float lado) {
        try {
            float lado_min = 0;
            if (lado <= lado_min) {
                return -1;

            }

            float perimetro = lado * 4;

            return perimetro;

        } catch (Exception e) {
            return -1;
        }
    }
    
    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_volumen_cilindro(float radio, float altura) {
        try {
            float radio_min = 0;
            float altura_min = 0;
            if (radio <= radio_min || altura <= altura_min) {
                return -1;
            }

            float volumen = 3.1415927f * (radio * radio) * altura;
            return volumen;

        } catch (Exception e) {

            return -1;
        }
    }


    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
 public static float Calcular_area_circulo(float radio) {
        try {
            float radio_min = 0;
            if (radio <= radio_min) {
                return -1;
            }

            float area = 3.1415927f * (radio * radio);
            return area;

        } catch (Exception e) {

            return -1;
        }
    }




}
