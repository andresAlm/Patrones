/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron2;

import static java.lang.Math.E;

/**
 *
 * @author fernando
 */
public class Banco implements IAprobador{
    private IAprobador next;
    
    public IAprobador getNext(){
        return next;
    }
    
   
    public void solicitudPrestamo(int monto){
        EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta() ;
        this.setNext(ejecutivo);
        
        LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
        ejecutivo.setNext(lider);
        
        Gerente gerente = new Gerente();
        lider.setNext(gerente);
        
        Director director = new Director();
        gerente.setNext(director);
        
        next.solicitudPrestamo(monto);
                
    }

    
    public  void setNext(IAprobador aprobador) {
        next = aprobador;
    }


    

   
}
