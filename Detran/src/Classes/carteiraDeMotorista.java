
package Classes;

public class carteiraDeMotorista{

    private String numero;
    private boolean status;
    private String categoria;
    private int pontos;

public carteiraDeMotorista(String numero, boolean status, String categoria, int pontos){

    this.numero = numero;
    this.status = status;
    this.categoria = categoria;
    this.pontos = pontos;
}
public void mudarCategoria(String outraCategoria){
    this.categoria = outraCategoria;
}
public int consultaPontos(){
    return this.pontos;
}
public void addPontos(int pontos){
    this.pontos += pontos;
    if(this.pontos > 30){
        this.status = false;
    }
}
public boolean carteiraCancelada(){
    return this.status = false;
}

}