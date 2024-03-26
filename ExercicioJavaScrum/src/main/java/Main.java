public class Main {
    public static void main(String[] args) {

        Clientes cliente1 = new Clientes("Jorge", 24);

        System.out.println("Ingresso com valor de: R$" + cliente1.calculoDoIngresso("Sexta"));

        ParImpar parImpar = new ParImpar(true);

        parImpar.imprimirNumeros(10, 1); // Tipo de laç pode ser 1, 2 ou 3.
    }