package rentaautomoviles;


public class Vehiculo {
    String placa, marca, color;
    int kmIniciales, kmFinales;

    public Vehiculo(String placa, String marca, String color, int kmIniciales, int kmFinales) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.kmIniciales = kmIniciales;
        this.kmFinales = kmFinales;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKmIniciales() {
        return kmIniciales;
    }

    public void setKmIniciales(int kmIniciales) {
        this.kmIniciales = kmIniciales;
    }

    public int getKmFinales() {
        return kmFinales;
    }

    public void setKmFinales(int kmFinales) {
        this.kmFinales = kmFinales;
    }
    
    
    
    
}
