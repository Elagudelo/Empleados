
package Emp;


public class Formu {

    public static void buscar(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String nombres;
    String correo;
    
    private String apellidos,direccion,cedula,celular,salariofinal1,telefonofijo;
   
    private double salariobase,horasextrad,horasextran,valorhexd,valorhexn;
  
    public Formu(String nombres, String correo, String apellidos, String direccion, String cedula,String celular,String salariofinal1,
              String telefonofijo) {
        this.nombres = nombres;
        this.correo = correo;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.cedula=cedula;
        this.celular=celular;
        this.salariofinal1=salariofinal1;
        this.telefonofijo=telefonofijo;
        
    }

   

    public Formu(double salariobase, double horasextrad, double horasextran, double valorhexd, double valorhexn) {
        this.salariobase = salariobase;
        this.horasextrad = horasextrad;
        this.horasextran = horasextran;
        this.valorhexd = valorhexd;
        this.valorhexn = valorhexn;
      
    }

    public String getSalariofinal1() {
        return salariofinal1;
    }

    public void setSalariofinal1(String salariofinal1) {
        this.salariofinal1 = salariofinal1;
    }


    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public double getHorasextrad() {
        return horasextrad;
    }

    public void setHorasextrad(double horasextrad) {
        this.horasextrad = horasextrad;
    }

    public double getHorasextran() {
        return horasextran;
    }

    
    
    public void setHorasextran(double horasextran) {
        this.horasextran = horasextran;
    }

    public double getValorhexd() {
        return valorhexd;
    }

    public void setValorhexd(double valorhexd) {
        this.valorhexd = valorhexd;
    }

    public double getValorhexn() {
        return valorhexn;
    }

    public void setValorhexn(double valorhexn) {
        this.valorhexn = valorhexn;
    }

    
    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefonofijo() {
        return telefonofijo;
    }

    public void setTelefonofijo(String telefonofijo) {
        this.telefonofijo = telefonofijo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
//    public double calcular(){
//        
//       return valorh= getSalariobase() / gethora();
//        
//        
//        
//        
//        
//    }
//    
    
    
    
    
    
    
    
    
    
    
}
