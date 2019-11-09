/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronproxi;

/**
 *
 * @author fernando
 */
public class PatronProxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c = new Cuenta(1, "Andres", 500);
        
       ICuenta cuentaProxi = new CuentaProxi();
        cuentaProxi.mostrarSaldo(c);
        c=cuentaProxi.depositarDinero(c, 50);
        c=cuentaProxi.retirarDinero(c, 20);
        cuentaProxi.mostrarSaldo(c);
        
    }
    
}
