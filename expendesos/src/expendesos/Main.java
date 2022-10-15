package expendesos;

public class Main {

    public static void main(String[] args) {
        Expendedor exp1 = new Expendedor(5, 500);
        Moneda100 cienPeso = new Moneda100();
        Comprador noLeAlcanza = new Comprador(cienPeso, 2, exp1);
        System.out.println("Bebio: " + noLeAlcanza.quebebiste() + " Vuelto: " + noLeAlcanza.cuantoVuelto());
    }
    
}
