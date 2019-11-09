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
public class CuentaProxi implements ICuenta{
   
   private CuentaBanco cuentaReal;
   
   public Cuenta retirarDinero(Cuenta cuenta, double monto){
       if (cuentaReal == null) {
           cuentaReal = new CuentaBanco();
           return cuentaReal.retirarDinero(cuenta, monto);    
       }else{
           return cuentaReal.retirarDinero(cuenta, monto);
       }
   }
   
   public Cuenta depositarDinero(Cuenta cuenta, double monto){
       if (cuentaReal == null) {
           cuentaReal = new CuentaBanco();
           return cuentaReal.depositarDinero(cuenta, monto);    
       }else{
           return cuentaReal.depositarDinero(cuenta, monto);
       }
   }
   
   
   public void mostrarSaldo(Cuenta cuenta){
       if (cuentaReal == null) {
           cuentaReal = new CuentaBanco();
            cuentaReal.mostrarSaldo(cuenta);    
       }else{
           cuentaReal.mostrarSaldo(cuenta);
       }
   }

}
