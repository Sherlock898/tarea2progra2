package expendesos;

public class Expendedor {
    Deposito depCoca;
    Deposito depFanta;
    Deposito depSprite;
    DepositoVuelto depVuelto;
    
    public Expendedor(int numBebidas, int precioBebidas){
        depCoca = new Deposito();
        depFanta= new Deposito();
        depSprite = new Deposito();
        for(int i = 0; i < numBebidas; i++){
            depCoca.addBebida(new CocaCola());
            depFanta.addBebida(new Fanta());
            depSprite.addBebida(new Sprite());
        }
    }
    
    public Bebida comprarBebida(Moneda m, int cual){
        return new Bebida();
    }
    
}
