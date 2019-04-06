/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class Cadastrar {
    
     List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public void CadastrarFuncionario(){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Cadastrando Funcionario...");
        
        System.out.print("Informe o codigo: ");
        pessoa.setCodigo(scanner.nextInt());
        System.out.print("Informe o nome: ");
        scanner = new Scanner(System.in);
        
        pessoa.setNome(scanner.nextLine());
        
        scanner = new Scanner(System.in);
        
        System.out.print("Informe a idade: ");
        pessoa.setIdade(scanner.nextInt());

        funcionarios.add((Funcionario) pessoa);
        
    }
    public void RemoverFuncionario(){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Removendo Funcionario.....");
        System.out.print("Informe o codigo do Funcionario: ");
        pessoa.setCodigo(scanner.nextInt());
        funcionarios.remove(pessoa);
        System.out.println("Funcionario removido com sucesso!\n\n");
    }
    
    public void ListarFuncionario(){
        for (Pessoa itemDaLista : funcionarios) {
            System.out.println("------~Funcionario~------");
            
            System.out.println("Código: "+itemDaLista.getCodigo());
            System.out.println("Nome: "+itemDaLista.getNome());
            System.out.println("---------------------");
        }
        System.out.println("\n\n");
    }
    
}
