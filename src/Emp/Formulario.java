
package Emp;


public class Formulario extends Formu {

    
     double salariobase,horasextrad,horasextran,valorhexd,valorhexn;
    
     String cedula,celular,telefonofijo;
    
    
    public Formulario(String nombres,String correo, String apellidos, String direccion,String salariofinal1,String cedula,
          String celular,String telefonofijo,double salariobase, double horasextrad,
            double horasextran,double valorhexd,double valorhexn) {
        super(nombres,correo,apellidos,direccion,cedula,celular,salariofinal1,telefonofijo);
        
        this.cedula=cedula;
        this.celular=celular;
        this.horasextrad=horasextrad;
        this.horasextran=horasextran;
        this.salariobase=salariobase;
        this.telefonofijo=telefonofijo;
        this.valorhexd=valorhexd;
        this.valorhexn=valorhexn;
        
        
    }


    
}
