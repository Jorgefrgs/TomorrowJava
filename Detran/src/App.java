import Classes.Condutor;
import Classes.carteiraDeMotorista;

public class App {
    public static void main(String[] args) throws Exception {
        carteiraDeMotorista carteiraDeMotorista = new carteiraDeMotorista("11111", true, "A", 0 );
        Condutor condutor = new Condutor("Jorge Ferreira", "1125646", carteiraDeMotorista);
        System.out.println("Pontos na carteira: " + Condutor.consultaPontos());
        Condutor.addPontos(10);
        System.out.println("Pontos atualizados: " + Condutor.consultaPontos());
        Condutor.addPontos(25);
        System.out.println("Status final da CNH: " + (Condutor.carteiraCancelada() ? false : true));

    }
}
