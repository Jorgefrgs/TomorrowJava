package Classes;
import Classes.carteiraDeMotorista;

public class Condutor {
    
    private String nome;
    private String CPF;
    private carteiraDeMotorista carteiraDeMotorista;

public Condutor(String nome, String CPF, carteiraDeMotorista carteiraDeMotorista){

    this.nome = nome;
    this.CPF = CPF;
    this.carteiraDeMotorista = carteiraDeMotorista;
}
public void mudarCategoria(String outraCategoria){
    this.carteiraDeMotorista.mudarCategoria(outraCategoria);
}
public void addPontos(int pontos){
    this.carteiraDeMotorista.addPontos(pontos);
}
public int consultaPontos(){
    return this.carteiraDeMotorista.consultaPontos();
}
public boolean carteiraCancelada(){
    return this.carteiraDeMotorista.carteiraCancelada();
}


}
