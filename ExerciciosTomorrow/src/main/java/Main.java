

public class Main {
    public static void main(String[] args) {


        Clientes cliente1 = new Clientes("vinicius", 24);

        System.out.println("Ingresso com valor de: R$" + cliente1.calculoDoIngresso("Sexta"));

        ParImpar parImpar = new ParImpar(true);

        parImpar.imprimirNumeros(10, 1);
    }