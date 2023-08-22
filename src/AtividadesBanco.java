public class AtividadesBanco {


    public static void main(String[] args){



    Contas ContaCorrente= new Contas(45000,"BRB","401");
    Contas ContaPoupança = new Contas(100000, "Bradesco", "007");



        ContaCorrente.depositar(45000);
        ContaCorrente.transferir(100000,ContaPoupança);
        ContaPoupança.sacar(10000);
        System.out.println(ContaPoupança.saldo);
}
}
