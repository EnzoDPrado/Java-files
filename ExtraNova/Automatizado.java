import java.io.Console;

public class Automatizado {

    public static void main(String arg[]){

        final int consumomedio= 12;

        Console line = System.console();

        String velocidade = line.readLine("Insira a velocidade media em KM");
        String tempo = line.readLine("Insira o tempo em horas");

        double distancia = Double.parseDouble(tempo) * Double.parseDouble(velocidade);
        double litros = distancia/consumomedio;

        litros = Math.round(litros);

        System.out.println("velocidade media:"+" "+ velocidade);
        System.out.println("Tempo gasto"+" " + tempo);
        System.out.println("Distancia percorrida"+" " + distancia);
        System.out.println("Litros gastos"+" " + litros);
        

    }
    
}