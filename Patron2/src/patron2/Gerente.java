/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron2;

/**
 *
 * @author fernando
 */
public  class Gerente implements IAprobador{
    private IAprobador next;
    public IAprobador getNext(){
        return next;
    }
    
    public void solicitudPrestamo(int monto){
        if (monto > 50000 && monto <= 100000) {
            System.out.println(" lo manejo yo, el gerente");
        }else{
            next.solicitudPrestamo(monto);
        }
    }
    
    public void setNext(IAprobador aprobador){
        next = aprobador;
    }

}
