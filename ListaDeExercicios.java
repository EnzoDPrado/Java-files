
public class ListaDeExercicios{
    
    static void Exe01(){

        int valor1 = 1;
        int valor2 = 2;

        double result = (valor1 * 3 + 50) - (valor2 - 25 /7);
        System.out.println("O resultado e:" + result);

    }

    static void Exe02(){
        int valor1 = 7;
        int valor2 = 4;
        int expo = 5;

        double valor1expo = Math.pow(valor1, expo);
        double valor2expo = Math.pow(valor2, expo);

        double divisao = valor1/valor2;
        double modulo = valor1 % valor2; 
        double raiz1 = Math.sqrt(valor1);
        double raiz2 = Math.sqrt(valor2);
        System.out.println(" Potencia: " +"  "+ valor1expo +"  "+ valor2expo +"  "+ " divisao: " +"  "+ divisao +"  "+ " Exibir modulo " +"  "+"  "+ modulo +"  "+ " raizes: " + raiz1 +"  "+ raiz2);




    }

    static void Exe03(){
        int var1 = 10;
        int var2 = 4;
        int cache = 0;

        cache = var1;
        var1 = var2;
        var2 = cache;
        System.out.println("Os valores das variaveis sao:" + var1 +"  "+ var2);


    }

    static void Exe04(){
        int compra = 100;
        int desconto = 20;

        double descontagem = (compra/100) * desconto;
        double compraReal = descontagem - compra;
        System.out.println("Valor da compra real e:" + compraReal);




    }

    static void Exe05(){
        double valReal = 5.50;
        double valDolar = 10.70;
        
        double convert = valReal * valDolar;
        System.out.println("A conversao ira sair:" + convert);

    }

    static void Exe06(){

        double celsius = 30.60;
        double fah = (9 * celsius + 160) / 5;
        System.out.println("A conversao de celsius para fahrenheit e:" + fah);

    }







    public static void main(String[] args) {
        Exe01();
        Exe02();
        Exe03();
        Exe04();
        Exe05();
        Exe06();




    }
       
}


