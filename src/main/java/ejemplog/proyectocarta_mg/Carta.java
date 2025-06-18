/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplog.proyectocarta_mg;

import javafx.scene.image.Image;

/**
 *
 * @author admar
 */
public abstract class Carta  {
  public enum EstadoCarta{
  Oculta,
  Revelada,
  Emparejada
  }
  
  public enum TipoCarta{
      Normal,
      Bonus,
      Castigo
  }
  private String id;
  private EstadoCarta estado;
  private TipoCarta tipo;
  private Image imagenCarta;

    public Carta(String id, EstadoCarta estado, TipoCarta tipo, Image imagenCarta) {
        this.id = id;
        this.estado = estado;
        this.tipo = tipo;
        this.imagenCarta = imagenCarta;
    }

    public String getId() {
        return id;
    }

    public EstadoCarta getEstado() {
        return estado;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public Image getImagenCarta() {
        return imagenCarta;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEstado(EstadoCarta estado) {
        this.estado = estado;
    }

    public void setTipo(TipoCarta tipo) {
        this.tipo = tipo;
    }

    public void setImagenCarta(Image imagenCarta) {
        this.imagenCarta = imagenCarta;
    }
  
  
   public abstract int obtenerPuntos();
   
   public abstract Carta clonar();
  
  
   
}
