
import componentes.Hamburgueza2;
import componentes.*;
import ingredientes.*;

import java.util.Scanner;

public class Main {

    private static Pan menuPan() {
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("Bien, comenzaremos con el tipo de pan");
        System.out.println("1.-Clásico");
        System.out.println("2.-Cristal");
        System.out.println("3.-Integral");
        System.out.println("4.-Amapola");
        System.out.println("5.-Brioche");
        opc=teclado.nextInt();

        Pan.tipo tipoPan= switch (opc) {
            case 1 -> Pan.tipo.clasico;
            case 2 -> Pan.tipo.cristal;
            case 3 -> Pan.tipo.integral;
            case 4 -> Pan.tipo.amapola;
            default -> Pan.tipo.brioche;
        };

        System.out.println("y ¿que tamaño te apetece?");
        System.out.println("1.- Chico");
        System.out.println("2.- Mediano");
        System.out.println("3.- Grande");
        opc=teclado.nextInt();

        Pan.tamannio_ tamannio= switch (opc){
          case 1 -> Pan.tamannio_.chico;
          case 2 -> Pan.tamannio_.mediano;
          default -> Pan.tamannio_.grande;
        };

        return new Pan(tipoPan,tamannio);
    }

    private static Carne menuCarne() {
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("ahora avanzamos con la carne");
        System.out.println("1.-Res");
        System.out.println("2.-Pollo");
        System.out.println("3.-Bife");
        System.out.println("4.-Añojo");
        opc=teclado.nextInt();

        Carne.tipo tipoCarne= switch (opc) {
            case 1 -> Carne.tipo.res;
            case 2 -> Carne.tipo.pollo;
            case 3 -> Carne.tipo.bife;
            default -> Carne.tipo.añojo;
        };

        System.out.println("y ¿en que punto de coaccion la prefieres?");
        System.out.println("1.- Cruda");
        System.out.println("2.- Término Medio");
        System.out.println("3.- Bien hecha");
        opc=teclado.nextInt();

        String coccion= switch (opc){
            case 1 -> "Cruda";
            case 2 -> "Término Medio";
            default -> "Bien Hecha";
        };

        return new Carne(tipoCarne,coccion);
    }

    private static Catsup menuCatzup(){
        return null;
    }

    private static Mostaza menuMostaza(){
        return null;
    }

    private static Jitomate menuJitomate(){
        return null;
    }

    private static Queso menuQueso(){
        return null;
    }

    private static Lechuga menuLechuga(){
        return null;
    }

    public static void main(String[] args) {
        Hamburgueza2 obj = new Hamburgueza2();
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int mesa;

        System.out.println("Hola ¡Cómo te llamas!");
        nombre= teclado.next();
        System.out.println(nombre + " bienvenido a Hamburguesas Mexicanas");

        obj.setPan(menuPan());
        obj.setCarne(menuCarne());

        obj.addCatsup();
        obj.addMotaza();
        obj.addJitomate();
        obj.addJitomate(Jitomate.tipo.cherry, 12f);
        obj.addQueso();
        obj.addQueso(Queso.tipo.gouda,150f);
        obj.addLechuga();
        obj.addCatsup();

        System.out.println(obj);
    }
}
