package bancos;
import javax.swing.*;
public class Bancos {
    public Bancos(){
        long ced = Long.parseLong(JOptionPane.showInputDialog("De la cedula"));
        String nom = JOptionPane.showInputDialog("De el nombre");
        CuentaAhorros ref;
        if(JOptionPane.showConfirmDialog(null, "Abre cuenta con valor?") == 0){
            double val = Double.parseDouble(JOptionPane.showInputDialog("Valor indicial de su cuenta"));
            ref = new CuentaAhorros(ced, nom, val);
        }else{
            ref = new CuentaAhorros(ced, nom);
        }        
        JOptionPane.showMessageDialog(null, "Cuenta: " + ref.consultarCuenta());
        int i;
        do{            
            String op[] = {"Consignar", "Retirar", "Consultar saldo", "Salir"};
            i= JOptionPane.showOptionDialog(null, "Opcion", "Banco", 0, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
            switch(i){
                case 0: double val = Double.parseDouble(JOptionPane.showInputDialog("Valor a consignar"));
                        ref.consignar(val);
                        break;
                case 1:  val = Double.parseDouble(JOptionPane.showInputDialog("Valor a retirar"));                         
                        if(ref.retirar(val)){
                            JOptionPane.showMessageDialog(null, "Retiro: " + val);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                        }
                    break;
                case 2: JOptionPane.showMessageDialog(null, "Saldo: " + ref.consultarSaldo());
                        break;
            }            
        }while(i!=3);
        
        
    }   
    public static void main(String[] args) {
        new Bancos();
    }
    
}
