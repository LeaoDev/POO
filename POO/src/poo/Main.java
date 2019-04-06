/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class Main {


    public static void main(String[] args) {
        Cadastrar cadastrar = new Cadastrar();
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        whilePrograma:
        while (true) {            
            System.out.println("Selecione uma opção:");
            System.out.println("[1] Adicionar Funcionario");
            System.out.println("[2] Deletar Funcionario");
            System.out.println("[3] Listar Funcionario");
            System.out.println("[4] Sair do Sistema");
            opcao = scanner.nextInt();
            System.out.println("\n\n");
            switch (opcao) {
                case 1:
                    cadastrar.CadastrarFuncionario();
                    break;
                case 2:
                    cadastrar.RemoverFuncionario();
                    break;
                case 3:
                    cadastrar.ListarFuncionario();
                    break;
                case 4:
                    break whilePrograma;
            }
        
        }
    }    
}
