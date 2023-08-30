import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner( System.in );
        char resposta;

        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();

        System.out.println("Nome: ");
        pessoa.setNome(scanner.nextLine());


        System.out.println("Idade: ");
        pessoa.setIdade(scanner.nextInt());

        System.out.println("Sexo(f/m): ");
        pessoa.setSexo(scanner.next().charAt(0));

        System.out.println("Endereço: ");
        endereco.setLogradouro(scanner.nextLine());

        scanner.nextLine();

        System.out.println("Numero: ");
        endereco.setNumero(scanner.nextInt());

        System.out.println("Possui complemento(y/n: ");
        resposta = scanner.next().charAt(0);

        if (resposta == 'y'){
            System.out.println("Digite o complemento: ");
            endereco.setComplemento(scanner.nextLine());

        }else {
            endereco.setComplemento("");
        }

        scanner.nextLine();

        System.out.println("Digite CEP: ");
        endereco.setCep(scanner.nextLine());

        pessoa.setEnd(endereco);

        System.out.print("Dados da pessoa: ");
        System.out.println(pessoa.imprimir());
    }

}
