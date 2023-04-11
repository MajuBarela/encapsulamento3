public class Principal {
    
    public static void main(String [] args){

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1713);
        conta.setTitular("Maria Julia Barela Netto");
        conta.setSaldo(1000);

        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.depositarValor(500);
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacarValor(250);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}