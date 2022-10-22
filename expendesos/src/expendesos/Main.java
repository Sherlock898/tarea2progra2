package expendesos;

public class Main {

    public static void main(String[] args) {
        Expendedor exp1 = new Expendedor(5, 500);
        Moneda100 cienPeso = new Moneda100();
        Comprador noLeAlcanza = new Comprador(cienPeso, 2, exp1);
        System.out.println("Bebio: " + noLeAlcanza.quebebiste() + " Vuelto: " + noLeAlcanza.cuantoVuelto());
        
        Moneda1500 m1500 = new Moneda1500();
        Comprador leAlcanza = new Comprador(m1500, 1, exp1);
        System.out.println("Bebio: " + leAlcanza.quebebiste() + " Vuelto: " + leAlcanza.cuantoVuelto());
    }
    
}
