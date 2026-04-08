public class PilhaArray {
    // Array que vai guardar os elementos da pilha e a posição do topo da pilha
    private int[] elementos;
    private int topo;
    // Constructor da pilha, começa em -1 indicando que está vazia ainda
    public PilhaArray(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }
    // Função para adicionar valor, validando se está cheia antes
    public void push(int valor) {
        if (isFull()) {
            System.out.println("Erro: a pilha está cheia.");
            return;
        }
        topo++; //adiciona uma posição ao topo
        elementos[topo] = valor;//coloca o valor na posiçaõ criafa
        System.out.println("Valor " + valor + " empilhado com sucesso.");
    }
    // Função para remover  uma valor  // validando se está vazia antes
    public void pop() {
        if (isEmpty()) {
            System.out.println("Erro: a pilha está vazia.");
            return;
        }
        int removido = elementos[topo];
        topo--;
        System.out.println("Valor removido da pilha: " + removido);
    }
    //Função
    public void peek() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        System.out.println("Topo da pilha: " + elementos[topo]);
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        System.out.println("Elementos da pilha:");
        for (int i = topo; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}