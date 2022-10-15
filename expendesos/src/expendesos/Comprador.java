package expendesos;

public class Comprador {
    private String sabor;
    private int cantidadTotal;
    
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        cantidadTotal = 0;
        Bebida bebida = exp.comprarBebida(m, cualBebida);
        if(bebida != null){
            sabor = bebida.beber();
        }
        else{
            sabor = "Nada";
        }
        
        Moneda vuelto = exp.getVuelto();
        while(vuelto != null){
            cantidadTotal += vuelto.getValor();
            vuelto = exp.getVuelto();
        }
    }
    
    public int cuantoVuelto(){
        return cantidadTotal;
    }

    public String quebebiste(){
        return sabor;
    }
}
