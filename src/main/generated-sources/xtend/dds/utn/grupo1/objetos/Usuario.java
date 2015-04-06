package dds.utn.grupo1.objetos;

@SuppressWarnings("all")
public class Usuario {
  public double getAltura() {
    return 1.75;
  }
  
  public int getPeso() {
    return 70;
  }
  
  public double getIMC() {
    int _peso = this.getPeso();
    double _altura = this.getAltura();
    double _altura_1 = this.getAltura();
    double _multiply = (_altura * _altura_1);
    return (_peso / _multiply);
  }
}
