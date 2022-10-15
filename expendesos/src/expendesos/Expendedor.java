package expendesos;

public class Expendedor {
    private Deposito depCoca;
    private Deposito depFanta;
    private Deposito depSprite;
    private DepositoVuelto depVuelto;
    private int precioBebidas;
    
    public Expendedor(int numBebidas, int precioBebidas){
        depCoca = new Deposito();
        depFanta= new Deposito();
        depSprite = new Deposito();
        for(int i = 0; i < numBebidas; i++){
            depCoca.addBebida(new CocaCola(i));
            depFanta.addBebida(new Fanta(i + 100));
            depSprite.addBebida(new Sprite(i + 200));
        }
        this.precioBebidas = precioBebidas;
    }
    
    public Bebida comprarBebida(Moneda m, int cual){
        //throws NoHayBebidaException PagoInsuficienteException, PagoIncorrectoException;
        if(m == null){
            System.out.print("PagoIncorrectoException");
            return null;
        }
        
        if(m.getValor() < precioBebidas){
            System.out.print("PagoInsuficienteExeption");
            depVuelto.addMoneda(m);
            return null;
        }
        
        Bebida bebida;

        switch (cual) {
            case 1:
                bebida = depCoca.getBebida();
                break;
            case 2:
                bebida = depSprite.getBebida();
                break;
            case 3:
                bebida = depFanta.getBebida();
                break;
            default:
                System.out.println("NoHayBebidaExeption");
                depVuelto.addMoneda(m);
                return null;
        }

        if(bebida == null){
            System.out.println("NoHayBebidaExeption");
            depVuelto.addMoneda(m);
            return null;
        }

        //compra exitosa
        for(int i = 0; i < (m.getValor() - precioBebidas) / 100; i++){
            depVuelto.addMoneda(new Moneda100());
        }

        return bebida;

    }
    
    public Moneda getVuelto(){
        return depVuelto.getMoneda();
    }
}
