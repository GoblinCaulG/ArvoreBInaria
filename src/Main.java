import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArvoreBinaria arvore = new ArvoreBinaria();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Inserir");
            System.out.println("2. Remover");
            System.out.println("3. Buscar");
            System.out.println("4. Percursos");
            System.out.println("5. exibir");
            System.out.println("6. Propriedades");
            System.out.println("7. Carregar exemplo");
            System.out.println("0. Encerrar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor: ");
                    arvore.inserir(sc.nextInt());
                    arvore.exibir();
                    System.out.print("Em-Ordem: ");
                    arvore.emOrdem(arvore.raiz);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Valor: ");
                    arvore.remover(sc.nextInt());
                    arvore.exibir();
                    System.out.print("Em-Ordem: ");
                    arvore.emOrdem(arvore.raiz);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Valor: ");
                    int busca = sc.nextInt();
                    System.out.println(arvore.buscar(busca) ? "Encontrado" : "Nao encontrado");
                    break;
                case 4:
                    System.out.print("Em-Ordem:  ");
                    arvore.emOrdem(arvore.raiz);
                    System.out.print("\nPre-Ordem: ");
                    arvore.preOrdem(arvore.raiz);
                    System.out.print("\nPos-Ordem: ");
                    arvore.posOrdem(arvore.raiz);
                    System.out.println();
                    break;
                case 5:
                    arvore.exibir();
                    System.out.print("Em-Ordem: ");
                    arvore.emOrdem(arvore.raiz);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Altura: " + arvore.altura(arvore.raiz));
                    System.out.println("Total de nos: " + arvore.contarNos(arvore.raiz));
                    break;
                case 7:
                    arvore = new ArvoreBinaria();
                    int[] exemplo = {45, 20, 65, 10, 35, 55, 80};
                    for (int v : exemplo) arvore.inserir(v);
                    System.out.println("Exemplo carregado");
                    arvore.exibir();
                    System.out.print("Em-Ordem: ");
                    arvore.emOrdem(arvore.raiz);
                    System.out.println();
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
