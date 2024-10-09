package main;

import exceptions.ErroConsultaGitHubException;
import services.ConsultaGitHub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ConsultaGitHub consultaGitHub = new ConsultaGitHub();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome de usuário do GitHub: ");
            String username = scanner.nextLine();

            String resultado = consultaGitHub.buscarDadosUsuario(username);
            System.out.println(resultado);

        } catch (ErroConsultaGitHubException e) {
            System.err.println(e.getMessage());
        }
    }
}
