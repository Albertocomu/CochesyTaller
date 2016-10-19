public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int precio;

    public Coche(String matricula, String marca, String modelo, int precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMatricula() {return matricula;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getPrecio() {return precio;}

    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setPrecio(int precio) {this.precio = precio;}

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}