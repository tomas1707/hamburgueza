
import componentes.Hamburgueza2;
import componentes.*;
import ingredientes.*;

import java.util.Scanner;

public class Main {

    private static BasePan menuPan() {
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("Bien, comenzaremos con el tipo de pan");
        System.out.println("1.-Clásico");
        System.out.println("2.-Cristal");
        System.out.println("3.-Integral");
        System.out.println("4.-Amapola");
        System.out.println("5.-Brioche");
        opc=teclado.nextInt();

        BasePan.tipo tipoPan= switch (opc) {
            case 1 -> BasePan.tipo.clásico;
            case 2 -> BasePan.tipo.cristal;
            case 3 -> BasePan.tipo.integral;
            case 4 -> BasePan.tipo.amapola;
            default -> BasePan.tipo.brioche;
        };

        System.out.println("y ¿que tamaño te apetece?");
        System.out.println("1.- Chico");
        System.out.println("2.- Mediano");
        System.out.println("3.- Grande");
        opc=teclado.nextInt();

        BasePan.tamannio_ tamannio= switch (opc){
          case 1 -> BasePan.tamannio_.chico;
          case 2 -> BasePan.tamannio_.mediano;
          default -> BasePan.tamannio_.grande;
        };

        return new BasePan(tipoPan.name(),tamannio);
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

        return new Carne(tipoCarne.name(),coccion);
    }

    private static Hamburgueza2 opcCatsup(Hamburgueza2 obj){
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("¿Gustas agregar Catsup?");
        System.out.println("1.- Si");
        System.out.println("2.- No");
        opc=teclado.nextInt();

        if (opc==1)
            obj.addCatsup();

        return obj;
    }

    private static Hamburgueza2 opcMostaza(Hamburgueza2 obj){
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("¿Gustas agregar Mostaza?");
        System.out.println("1.- Si");
        System.out.println("2.- No");
        opc=teclado.nextInt();

        if (opc==1)
            obj.addMotaza();

        return obj;
    }

    private static Hamburgueza2 opcJitomate(Hamburgueza2 obj){
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("Ahora vamos con el jitomate");
        System.out.println("1.- Jitomate Bola");
        System.out.println("2.- Jitomate Roma");
        System.out.println("3.- Jitomate Chery");
        System.out.println("4.- Sin Jitomate por favor");

        opc=teclado.nextInt();

        switch (opc){
            case 1: obj.addJitomate(Jitomate.tipo.bola,15f);
                break;
            case 2: obj.addJitomate(Jitomate.tipo.roma,20f);
                break;
            case 3: obj.addJitomate(Jitomate.tipo.cherry,13f);
                break;
        }

        return obj;
    }

    private static Hamburgueza2 opcQueso(Hamburgueza2 obj){
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("Seguimos con el queso");
        System.out.println("1.- Queso Manchego");
        System.out.println("2.- Queso Chedar");
        System.out.println("3.- Queso Gouda");
        System.out.println("4.- Queso Mozzarella");
        System.out.println("5.- Sin queso por favor");

        opc=teclado.nextInt();

        switch (opc){
            case 1: obj.addQueso(Queso.tipo.manchego,65f);
                break;
            case 2: obj.addQueso(Queso.tipo.chedar,75f);
                break;
            case 3: obj.addQueso(Queso.tipo.gouda,120f);
                break;
            case 4: obj.addQueso(Queso.tipo.mozzarella,140f);
                break;
        }

        return obj;
    }

    private static Hamburgueza2 opcLechuga(Hamburgueza2 obj){
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("¿Agregamos lechuga en tu hamburgueza?");
        System.out.println("1.- Si claro");
        System.out.println("2.- No en esta ocasión");
        opc=teclado.nextInt();

        if (opc==1)
            obj.addLechuga();

        return obj;
    }

    public static void main(String[] args) {
        Hamburgueza2 obj = new Hamburgueza2();
        Scanner teclado = new Scanner(System.in);
        int opc;

        System.out.println("Hola ¡Cómo te llamas!");
        obj.setCliente(teclado.next());
        System.out.println(obj.getCliente() + " bienvenido a Hamburguesas Mexicanas");

        System.out.println("¿Gustas ordenar una hamburgueza especialidad de la casa? o ¿quieres personalizarla?");
        System.out.println("1.- La especidalidad de la casa esta bien");
        System.out.println("2.- Quiero personalizarla gracias");
        opc=teclado.nextInt();

        if (opc==1){
            obj.ingresientesDeLaCasa();
        }
        else if(opc==2)
        {
            obj.setBasePan(menuPan());
            obj.setCarne(menuCarne());
            System.out.println("buenisimo...");
            System.out.println("ahora seleciona uno a uno tus ingredientes");

            obj=opcCatsup(obj);
            obj=opcMostaza(obj);
            obj=opcJitomate(obj);
            System.out.println("Ya casi terminamos...");
            obj=opcQueso(obj);
            obj=opcLechuga(obj);
        }

        System.out.println(obj);
    }
}
