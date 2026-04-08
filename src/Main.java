import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA DIDÁTICO: PILHA E FILA =====");
        System.out.print("Informe o tamanho das estruturas: ");
        int capacidade = sc.nextInt();

        PilhaArray pilha = new PilhaArray(capacidade);
        FilaArray fila = new FilaArray(capacidade);

        int opcaoPrincipal;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Testar Pilha");
            System.out.println("2 - Testar Fila");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = sc.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    menuPilha(sc, pilha);
                    break;
                case 2:
                    menuFila(sc, fila);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcaoPrincipal != 3);

        sc.close();
    }

    public static void menuPilha(Scanner sc, PilhaArray pilha) {
        int opcao;
        do {
            System.out.println("\n===== MENU PILHA =====");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Mostrar topo");
            System.out.println("4 - Verificar se está vazia");
            System.out.println("5 - Verificar se está cheia");
            System.out.println("6 - Exibir pilha");
            System.out.println("7 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para empilhar: ");
                    int valor = sc.nextInt();
                    pilha.push(valor);
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 3:
                    pilha.peek();
                    break;
                case 4:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("A pilha não está vazia.");
                    }
                    break;
                case 5:
                    if (pilha.isFull()) {
                        System.out.println("A pilha está cheia.");
                    } else {
                        System.out.println("A pilha não está cheia.");
                    }
                    break;
                case 6:
                    pilha.display();
                    break;
                case 7:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }

    public static void menuFila(Scanner sc, FilaArray fila) {
        int opcao;
        do {
            System.out.println("\n===== MENU FILA =====");
            System.out.println("1 - Inserir na fila");
            System.out.println("2 - Remover da fila");
            System.out.println("3 - Mostrar primeiro elemento");
            System.out.println("4 - Verificar se está vazia");
            System.out.println("5 - Verificar se está cheia");
            System.out.println("6 - Exibir fila");
            System.out.println("7 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para inserir na fila: ");
                    int valor = sc.nextInt();
                    fila.enqueue(valor);
                    break;
                case 2:
                    fila.dequeue();
                    break;
                case 3:
                    fila.front();
                    break;
                case 4:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("A fila não está vazia.");
                    }
                    break;
                case 5:
                    if (fila.isFull()) {
                        System.out.println("A fila está cheia.");
                    } else {
                        System.out.println("A fila não está cheia.");
                    }
                    break;
                case 6:
                    fila.display();
                    break;
                case 7:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }
}