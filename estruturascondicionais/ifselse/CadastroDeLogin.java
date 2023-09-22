package academy.devdojo.estruturascondicionais.ifselse;/*
Eu como administrador do sistema, gostaria de permitir que os
proprios usuarios cadastrassem o nome de usuário (login) no sistema para
agilizar o processo de migração do sistema antigo para o novo.

O usuário não pode deixar o login vazio ""; , ou criar um usuário
com o login " admin " ou " administrador ".
Se o valor entrada for válido, o sistema deverá exibir uma
mensage "<nome do usuário> cadastrado com sucesso".
Se não o sistema deverá mostrar o erro "Usuário inválido ". */

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe Nome Para Novo Cadastro: ");
        String login = input.nextLine();

        if (login.equals("") || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário cadastrado inválido ! ");
        } else {
            System.out.println(login + " cadastrado com sucesso.");
        }
    }
}