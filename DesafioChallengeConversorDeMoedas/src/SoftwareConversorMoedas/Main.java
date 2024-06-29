package SoftwareConversorMoedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConsultaMoeda consulta = new ConsultaMoeda();


        while(true){
            System.out.println("*************************************************************");
            System.out.println("Seja Bem-Vindo ao Conversor de Moeda =)");
            System.out.println();
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("*************************************************************");

            String opcao = scanner.nextLine();

            if(opcao.equalsIgnoreCase("7")){
                System.out.println("Sessão Encerrada.");
                break;
            }

            System.out.println("Digite o valor que deseja converter:");
            double moeda = scanner.nextDouble();

            scanner.nextLine(); // Linha usada para o scanner jogue para a linha de baixo para antes de digitar um novo valor, possa escolher uma opção.

            String baseMoeda = "";
            String moedaConvertida = "";

            switch (opcao){
                case "1": baseMoeda = "USD"; moedaConvertida = "ARS"; break;
                case "2": baseMoeda = "ARS"; moedaConvertida = "USD"; break;
                case "3": baseMoeda = "USD"; moedaConvertida = "BRL"; break;
                case "4": baseMoeda = "BRL"; moedaConvertida = "USD"; break;
                case "5": baseMoeda = "USD"; moedaConvertida = "COP"; break;
                case "6": baseMoeda = "COP"; moedaConvertida = "USD"; break;
                default:
                    System.out.println("Opção inválida.");
            }

            try{
                Conversao conversao = consulta.buscaMoeda(baseMoeda, moedaConvertida, moeda);
                System.out.println(conversao);
            } catch (RuntimeException e){
                System.out.println("Erro ao buscar a conversão: " + e.getMessage());
            }
        }
    }
}