package Test;

import Dominio.Punto;
import java.util.Scanner;

public class PruebaPunto {

    public static void posicion(Punto p) {
        int b = 0, c, h, j, a,k;
        double t;
        Scanner e = new Scanner(System.in);
        h = p.getD();
        System.out.println("Cuantas quiere que se mueva: ");
        a = e.nextInt();
        do {
            if (a < 0) {
                k = 0;
                System.out.println("No se acepta valores menores a 0.");
                System.out.println("Ingrese otro valor:");
                a = e.nextInt();
            }else{
                k=1;
            }
        } while (k != 1);
        do {
            System.out.println("Cuantos espacios quiere mover:");
            c = e.nextInt();
            do {
            if (c < 0) {
                k = 0;
                System.out.println("No se acepta valores menores a 0.");
                System.out.println("Ingrese otro valor:");
                c = e.nextInt();
            }else{
                k=1;
            }
        } while (k != 1);
            h = h + c;
            t = Math.random() * 8 + 1;
            if (t < 3) {
                p.setX(p.getX() + c);
                p.setD(c);
                System.out.println(p.posicion() + " a la derecha.");
            }
            if (t > 3) {
                if (t < 5) {
                    p.setX(p.getX() - c);
                    p.setD(c);
                    System.out.println(p.posicion() + " a la izquierda.");
                }
            }
            if (t > 5) {
                if (t < 7) {
                    p.setY(p.getY() + c);
                    p.setD(c);
                    System.out.println(p.posicion() + " para arriba.");
                }
            }
            if (t > 7) {
                p.setY(p.getY() - c);
                p.setD(c);
                System.out.println(p.posicion() + " para abajo.");
            }
            System.out.println("----------------------------------");
            b++;
        } while (b != a);
        p.setD(h);
        System.out.println(p.posicion() + " en total.");
    }

    public static void main(String[] args) {
        Punto p;
        Scanner e = new Scanner(System.in);
        p = new Punto();
        int i = 0, j, k;
        System.out.println("El programa movera un punto en cualquier direccion dependiendo la entrada que reciba");
        System.out.println("Todos los movimientos son en relacion al plano (x;y)");
        System.out.println("El punto esta iniciado en la posicion 0;0.");
        do {
            System.out.println("--------------------------Menu--------------------------");
            System.out.println("1.-Datos para mover el punto.");
            System.out.println("2.-Terminar.");
            i = e.nextInt();
            do {
                if (i > 2) {
                    k = 0;
                    System.out.println("Opcion no valida.");
                    System.out.println("Ingrese otra opcion:");
                    i = e.nextInt();
                } else {
                    k = 1;
                }
                if (i < 1) {
                    k = 0;
                    System.out.println("Opcion no valida.");
                    System.out.println("Ingrese otra opcion:");
                    i = e.nextInt();
                } else {
                    k = 1;
                }
            } while (k != 1);
            if (i == 1) {
                posicion(p);
            }

            System.out.println("\n");

        } while (i != 2);

    }

}
