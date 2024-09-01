import componentes.Hamburgueza;
import componentes.Hamburgueza2;
public class Main {
    public static void main(String[] args) {
        Hamburgueza2 obj = new Hamburgueza2();
        obj.setCarne("pollo", "quemado");
        obj.setPan("integral","Grande");
        obj.addCatzup();
        obj.addMotaza();
        obj.addJitomate();
        obj.addJitomate("Jitomate cherry", 12f);
        obj.addQueso();
        obj.addQueso("Queso Manchego",150f);
        obj.addLechuga();
        obj.addCatzup();


        System.out.println(obj);
    }
}
