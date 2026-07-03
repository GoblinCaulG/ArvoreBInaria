public class ArvoreBinaria {
    No raiz;

    void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }

    private No inserir(No no, int valor) {
        if (no == null) return new No(valor);
        if (valor < no.valor) no.esquerda = inserir(no.esquerda, valor);
        else if (valor > no.valor) no.direita = inserir(no.direita, valor);
        return no;
    }

    boolean buscar(int valor) {
        return buscar(raiz, valor);
    }

    private boolean buscar(No no, int valor) {
        if (no == null) return false;
        if (valor == no.valor) return true;
        return valor < no.valor ? buscar(no.esquerda, valor) : buscar(no.direita, valor);
    }

    void remover(int valor) {
        raiz = remover(raiz, valor);
    }

    private No remover(No no, int valor) {
        if (no == null) return null;
        if (valor < no.valor) no.esquerda = remover(no.esquerda, valor);
        else if (valor > no.valor) no.direita = remover(no.direita, valor);
        else {
            if (no.esquerda == null) return no.direita;
            if (no.direita == null) return no.esquerda;
            No sucessor = minimo(no.direita);
            no.valor = sucessor.valor;
            no.direita = remover(no.direita, sucessor.valor);
        }
        return no;
    }

    private No minimo(No no) {
        while (no.esquerda != null) no = no.esquerda;
        return no;
    }

    void emOrdem(No no) {
        if (no == null) return;
        emOrdem(no.esquerda);
        System.out.print(no.valor + " ");
        emOrdem(no.direita);
    }

    void preOrdem(No no) {
        if (no == null) return;
        System.out.print(no.valor + " ");
        preOrdem(no.esquerda);
        preOrdem(no.direita);
    }

    void posOrdem(No no) {
        if (no == null) return;
        posOrdem(no.esquerda);
        posOrdem(no.direita);
        System.out.print(no.valor + " ");
    }

    int altura(No no) {
        if (no == null) return -1;
        return 1 + Math.max(altura(no.esquerda), altura(no.direita));
    }

    int contarNos(No no) {
        if (no == null) return 0;
        return 1 + contarNos(no.esquerda) + contarNos(no.direita);
    }

    void exibir() {
        if (raiz == null) {
            System.out.println("Arvore vazia");
            return;
        }
        System.out.println("\nEstrutura da Arvore:");
        exibir(raiz.direita, "        ", false);
        System.out.println("    " + raiz.valor + " (raiz)");
        exibir(raiz.esquerda, "        ", true);
    }

    private void exibir(No no, String prefixo, boolean esq) {
        if (no == null) return;
        exibir(no.direita, prefixo + (esq ? "│   " : "    "), false);
        System.out.println(prefixo + (esq ? "└── " : "┌── ") + no.valor);
        exibir(no.esquerda, prefixo + (esq ? "    " : "│   "), true);
    }
}
