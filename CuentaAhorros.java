package bancos;

public class CuentaAhorros {
    private long cedula;
    private String nombre;
    private long numeroCuenta;
    private double saldo;
    
    public CuentaAhorros(long ced, String nom){
        cedula = ced;
        nombre = nom;
        saldo = 0;
        numeroCuenta = (long) (Math.random() * 10000);        
    }
    
     public CuentaAhorros(long ced, String nom, double val){
        cedula = ced;
        nombre = nom;
        saldo = val;
        numeroCuenta = (long) (Math.random() * 10000);        
    }
    
    
    public void consignar(double valor){
        saldo += valor;
    }
    
    public boolean retirar(double valor){
        if(saldo<valor)
            return false;
        saldo -= valor;
            return true;
    }
    
    public double consultarSaldo(){
        return saldo;
    }
    
    public long consultarCuenta(){
        return numeroCuenta;
    }
}