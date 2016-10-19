public class Persona {
    private String dni;
    private String numSS;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String numSS, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.numSS = numSS;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {return dni;}
    public String getNumSS() {return numSS;}
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public int getEdad() {return edad;}

    public void setDni(String dni) {this.dni = dni;}
    public void setNumSS(String numSS) {this.numSS = numSS;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setEdad(int edad) {this.edad = edad;}

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", numSS='" + numSS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}