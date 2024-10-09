package main;

import exceptions.ErroConsultaGitHubException;
import services.ConsultaGitHub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome de usuário do GitHub ou 'sair' para encerrar: ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            try {
                String resultado = ConsultaGitHub.buscarDadosUsuario(username);
                System.out.println(resultado);
            } catch (ErroConsultaGitHubException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
