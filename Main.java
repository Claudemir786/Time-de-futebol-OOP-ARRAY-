package POO.exercicios.ARRAYS.TimeDeFutebol;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        TimeDeFutebol[] times=new TimeDeFutebol[3];
        for(int i=0;i< times.length;i++){
            TimeDeFutebol time=new TimeDeFutebol();
            System.out.println("digite o nome do Time");
            time.setNome(scanner.nextLine());
            System.out.println("digite a cidade deste time:");
            time.setCidade(scanner.nextLine());
            System.out.println("digite o numero de vitorias:");
            while(!scanner.hasNextInt()){
                System.out.println("digite um numero de vitorias por favor:");
                scanner.next();
            }
            time.setVitorias(scanner.nextInt());
            if(time.getVitorias()<0){
                while(time.getVitorias()<0){
                    System.out.println("Erro! não é permitido numero negativo, digite um numero positivo de vitorias");
                    time.setVitorias(scanner.nextInt());
                }

            }
            System.out.println("digite o numero de derrotas:");
            while(!scanner.hasNextInt()){
                System.out.println("digite um numero de derrotas por favor:");
                scanner.next();
            }
            time.setDerrotas(scanner.nextInt());
            if(time.getDerrotas()<0){
                while(time.getDerrotas()<0){
                    System.out.println("Erro! não é permitido numero negativo, digite um numero positivo de derrotas");
                    time.setDerrotas(scanner.nextInt());
                }

            }
            System.out.println("diigite o numero de empates");
            while(!scanner.hasNextInt()){
                System.out.println("digite um numero de empates por favor:");
                scanner.next();
            }
            time.setEmpates(scanner.nextInt());
            if(time.getEmpates()<0){
                while(time.getEmpates()<0){
                    System.out.println("Erro! não é permitido numero negativo, digite um numero positivo de derrotas");
                    time.setEmpates(scanner.nextInt());
                }
            }
            scanner.nextLine();
            times[i]=time;

        }
        for(int i=0;i< times.length;i++){
            times[i].ExibirInfo();
        }
    }
}
