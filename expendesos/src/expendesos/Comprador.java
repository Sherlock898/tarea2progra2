package expendesos;

public class Comprador {
    private String sabor;
    private int cantidadTotal;
    
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        cantidadTotal = 0;
    }
    
    public int cuantoVuelto(){
        return 0;
    }

    public String quebebiste(){
        return sabor;
    }
}
