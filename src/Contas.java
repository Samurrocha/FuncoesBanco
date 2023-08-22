public class Contas {

    public double saldo;
    protected String agência;
    protected String numeroAgência;

    protected Contas(double saldo,String agência, String numeroAgência){

        this.saldo=saldo;
        this.agência=agência;
        this.numeroAgência=numeroAgência;

    }

    protected void sacar(double valor){

        saldo-=valor;
    }


    protected void depositar(double valor){

        saldo+=valor;
    }


   protected void transferir(double valor,Contas conta){

        this.saldo-=valor;
        conta.depositar(valor);

    }


    protected void verExtrato(){

        System.out.println("O seu saldo na Agência "+agência+" de número "+numeroAgência+" é de"+saldo);
    }








}

