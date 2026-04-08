public class FilaArray {
    private final int [] elementos;
    private final int inicio;
    private int fim;
    private int quantidade;

    public FilaArray(int capacidade) {
        elementos = new int[capacidade];
        inicio = 0;
        fim = -1;
        quantidade = 0;
    }

    public void enqueue(int valor) {
        if (isFull()) {
            System.out.println("Erro: a fila está cheia.");
            return;
        }

        fim++;
        elementos[fim] = valor;
        quantidade++;
        System.out.println("Valor " + valor + " inserido na fila com sucesso.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Erro: a fila está vazia.");
            return;
        }

        int removido = elementos[inicio];

        for (int i = inicio; i < fim; i++) {
            elementos[i] = elementos[i + 1];
        }

        fim--;
        quantidade--;
        System.out.println("Valor removido da fila: " + removido);
    }

    public void front() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.println("Primeiro elemento da fila: " + elementos[inicio]);
    }

    public boolean isEmpty() {
        return quantidade == 0;
    }

    public boolean isFull() {
        return quantidade == elementos.length;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("Elementos da fila:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(elementos[i]);
        }
    }
}