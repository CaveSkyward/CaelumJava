package POO;

public class Conta {
    int numero;
    String dono;
    double saldo, limite;
    
    /*void saca(double quantidade){
        //double novoSaldo = this.saldo - quantidade;
        //this.saldo = novoSaldo;
        this.saldo -= quantidade;
        System.out.println("Saldo atual é: " + this.saldo);
    }*/
    
    void deposita(double quantidade){
        this.saldo += quantidade;
    }
    
    boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }
    
    boolean transferePara(Conta destino, double valor){    
        boolean retirou = this.saca(valor);
        if (retirou == false){
            return false;
        } else{
            destino.deposita(valor);
            return true;
        }
    }
}
