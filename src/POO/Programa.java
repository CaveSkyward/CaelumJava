package POO;

public class Programa {
    public static void main(String args[]){
        Conta minhaConta; //Cria-se um atributo
        minhaConta = new Conta(); //O atributo recebe o objeto que é uma instância da classe Conta
        //Conta minhaConta = new Conta();
        
        minhaConta.dono = "Lucas";
        minhaConta.saldo = 1000.0;
        
        System.out.println("Saldo atual: " + minhaConta.saldo);
        
        Conta minhaConta2;
        minhaConta2 = new Conta();
        
        minhaConta2.dono = "Monique";
        minhaConta2.saldo = 2000.0;
        
        System.out.println("Saldo atual: " + minhaConta2.saldo);
        
        if(minhaConta.saca(2000)){
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }
        minhaConta.deposita(250);

        minhaConta.transferePara(minhaConta2, 100);
        System.out.println(minhaConta.saldo);
        System.out.println(minhaConta2.saldo);
        
        
        
        /*Conta c1 = new Conta();
        c1.deposita(100);
        
        Conta c2 = c1;
        c2.deposita(200);
        
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);*/
        
        
    }
}
