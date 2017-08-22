public class Tarjeta
{
    public float Saldo;
    
    public Tarjeta()
    {
       
        Saldo=0;
    }
    
    public void Depositar(float dinero)
    {
        if (dinero>0)
        {
            Saldo=Saldo+dinero;
        }
    }
    
    public float retirar(float dinero)
    {
        if (Saldo>=dinero)
        {
            Saldo=Saldo-dinero;
            return dinero;
        }
        return 0;
    
    }
    
    public float consultar()
    {
        System.out.println("saldo="+Saldo+"pesos");
        return 0;
    }
    
    public float pago(float pago)
    {
        if(Saldo>=pago)
        {
            Saldo=Saldo-pago;
        
        }
        return 0;
        
    }
}
