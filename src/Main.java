import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Cria um leitor chamado sc que vai ler o que eu digitar no meu teclado
        Aluno aluno = new Aluno();
        int op; //cria uma variavel chamada op que vai guardar um número inteiro
        do {
            System.out.println("Escolha uma opção: \n1 - Cadastras dados \n2 - Exibir dados \n3 - Sair");
            op = sc.nextInt(); //Pega o número inteiro que o usuário digitou e guarda dentro da variavel op
            switch (op) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = sc.next() + sc.nextLine(); //sc.nextLine lê tudo o que o usuário digitar até ele dar enter

                    System.out.println("Escreva seu registro de matricula: ");
                    int matricula = sc.nextInt();
                    aluno.nome = nome;
                    aluno.registroMatricula = matricula;

                    System.out.println("Digite sua rua: ");
                    String rua = sc.nextLine() + sc.nextLine();

                    System.out.println("Digite o número da sua casa: ");
                    int numeroCasa = sc.nextInt();

                    System.out.println("Dgite seu CEP: ");
                    int cep = sc.nextInt();

                    //Criando o objeto
                    EnderecoAluno endereco = new EnderecoAluno(rua, numeroCasa, cep);

                    //Atribuindo o objeto endereco ao aluno
                    aluno.endereco = endereco;

                    System.out.println("Informe sua cidade: ");
                    String cidade = sc.nextLine() + sc.nextLine();

                    System.out.println("Informe seu estado: ");
                    String estado = sc.nextLine();

                    //Criando o objeto
                    CidadeAluno objetocidade = new CidadeAluno(cidade, estado);

                    //Atribuindo o objeto cidade ao aluno
                    aluno.cidade = objetocidade;
                    break;
                case 2:
                    System.out.println("Nome: " + aluno.nome + "; " + "Registro de matricula: " + aluno.registroMatricula + "; " + "Rua: " + aluno.endereco.rua + "; " + "Número da casa: " + aluno.endereco.numeroCasa + "; " + "CEP: " + aluno.endereco.cep + "; " + "Cidade: " + aluno.cidade.cidade + "; " + "Estado: " + aluno.cidade.estado);
                    break;
                case 3:
                    System.out.println("Finalizando o programa...");
                default: //caso o usuário não digite nenhuma das opções
                    System.out.println("Opção invalidada");
            }
        } while (op != 3); //Enquanto o usuario não digitar '3' o loop continua
        sc.close();
    }
}