package Ex2;

public class ExercicioX {
    public static void main(String args[]){
        //Equivalentes - Imprimir os números de 150 até 300, resolvi fazer de três formas diferentes
        /*for(int i = 150 ; i <= 300; i++){
            System.out.println(i);
        }*/
        
        /*int i = 150;
        while(i <= 300){
            System.out.println(i);
            i++;
        }*/
        
        /*int i = 150;
        do{
            System.out.println(i);
            i++;
        } while(i <= 300);*/
        
        //Equivalentes - Somar todos os numeros de 1 a 1000, fiz três formas diferentes
        /*int soma = 0;
        for (int i = 1; i <= 1000; i++){
            soma += i;
        }
        System.out.println(soma);*/
        
        /*int soma = 0;
        int i = 1;
        while(i <= 1000){
            soma += i;
            i++;
        }
        System.out.println(soma);*/
        
        /*int soma = 0;
        int i = 1;
        do{
            soma += i;
            i++;
        }while(i <= 1000);
        System.out.println(soma);*/
        
        //EQUIVALENTES - Imprimir todos os multiplos de 3, entre 1 e 100
        
        /*for(int i = 0; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }*/
        
        /*int i = 0;
        while(i <= 100){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }*/
        
        /*int i = 0;
        do{
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }while(i <= 100);*/
        
        /*long fatorial = 1;
        for(long i = 1; i <= 20; i++){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " é " + fatorial);
        }*/
        
        /*int fatorial = 1;
        int i = 1;
        while(i <= 10){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " é " + fatorial);
            i++;
        }*/
        
        /*int fatorial = 1;
        int i = 1;
        do{
            fatorial *= i;
            System.out.println("Fatorial de " + i + " é " + fatorial);
            i++;
        }while(i <=10 );*/
      
    }
}
