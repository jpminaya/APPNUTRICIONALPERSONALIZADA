
package Modelo;

public class Usuario {
    private int idUsuario;             // ID_USUARIO INT IDENTITY(1,1) PRIMARY KEY
    private String nombreCompleto;       // NOMBRE_COMPLETO VARCHAR(100)
    private String correoElectronico;   // CORREO_ELECTRONICO VARCHAR(100)
    private String sexo;                 // SEXO VARCHAR(20) ('Masculino', 'Femenino', 'Otro')
    private int edad;                   // EDAD INT
    private double peso;                // PESO DECIMAL(5,2)
    private double estatura;            // ESTATURA DECIMAL(5,2)
    private double imc;  
    
    // Constructor vacío
    public Usuario() {} 
    
    // Constructor con todos los atributos (excepto idUsuario que suele ser generado)
    public Usuario(int Idusuario, String nombreCompleto, String correoElectronico, String sexo, int edad, double peso, double estatura, double imc) {
        this.idUsuario =idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.imc = imc;
    }
    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }

    // Puedes agregar método para calcular IMC si quieres, ejemplo:
    public void calcularIMC() {
        if (estatura > 0) {
            this.imc = peso / (estatura * estatura);
        }
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCorreo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 
   
    
    
