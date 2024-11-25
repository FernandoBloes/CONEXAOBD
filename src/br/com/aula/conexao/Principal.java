package br.com.aula.conexao;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n Menu Principal");
            System.out.println("1 - Inserir Aluno");
            System.out.println("2 - Atualizar Aluno");
            System.out.println("3 - Deletar Aluno");
            System.out.println("4 - Ler Registro de Alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); //Limpando o buffer
            switch (opcao) {
                case 1:
                    InserirDados.main(null); //Chamando a classe InserirDados
                    break;
                case 2:
                    AtualizarDados.main(null); //Chamando a classe AtualizarDados
                    break;
                case 3:
                    DeletarDados.main(null); //Chamando a classe DeletarDados
                    break;
                case 4:
                    LerDados.main(null); //Chamando a classe LerDados
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Finalizando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
