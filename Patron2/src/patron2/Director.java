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
public class Director implements IAprobador{
    private IAprobador next;
    
    
    public IAprobador getNext(){
        return next;
    }
    
    public void solicitudPrestamo(int monto){
        if (monto >= 1000000) {
            System.out.println(" Lo manejo yo, el director ");
        }
    }

    @Override
    public void setNext(IAprobador aprobador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
