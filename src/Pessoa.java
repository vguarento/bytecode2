/*
Criar abstração do objeto pessoa com os seguintes atributos
nome, idade, sexo, endereço, numero do celular, altura, peso,
salário, numero de filhos e estado civil
 */

public class Pessoa {
    public static void main(String[] args) {
        String nome = "Hélio dos Santos";
        int idade = 49;
        char sexo = 'M';
        String endereço = "Rua Souza Santos - Nº 166 - Jardim Vera Cruz - São Paulo - SP - CEP: 06745-000";
        String celular = "(11) 988001100";
        float altura = 1.75f;
        float peso = 75.658f;
        int filhos = 2;
        float salario = 4521.66f;
        String estadocivil = "casado";

        System.out.println("O cliente " + nome + " com " + idade + " anos de idade" +
                " do sexo " + sexo + " \nresidente na " + endereço + " \ncom o numero de celular " + celular +
                " com altura de " + altura + " e peso de " + peso + "\ntem uma remuneração de R$ " + salario +
                " e tem " + filhos + " filhos " + "e é " + estadocivil);


    }
}
