public class App {

    public static void main(String[] args) {
        Arvore<Integer> arvore;
        arvore = new Arvore<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);
        arvore.adicionar(87);
        arvore.adicionar(123);

        System.out.println("\n\n\n|| ÁRVORE BINÁRIA ||");
        System.out.println("\n\n-- Em-ordem");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pré-ordem");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pós-ordem");
        arvore.posOrdem(arvore.getRaiz());

        arvore.remover(20);
        System.out.println("\n\n\n\nRemovido o valor 20.");

        System.out.println("\n-- Em-ordem");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pré-ordem");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pós-ordem");
        arvore.posOrdem(arvore.getRaiz());

        arvore.remover(5);
        System.out.println("\n\n\n\nRemovido o valor 5.");

        System.out.println("\n-- Em-ordem");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pré-ordem");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pós-ordem");
        arvore.posOrdem(arvore.getRaiz());

        arvore.remover(8);
        System.out.println("\n\n\n\nRemovido o valor 8.");

        System.out.println("\n-- Em-ordem");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pré-ordem");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pós-ordem");
        arvore.posOrdem(arvore.getRaiz());

        arvore.remover(9);
        System.out.println("\n\n\n\nRemovido o valor 9.");

        System.out.println("\n-- Em-ordem");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pré-ordem");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pós-ordem");
        arvore.posOrdem(arvore.getRaiz());

        arvore.remover(13);
        System.out.println("\n\n\n\nRemovido o valor 13.");

        System.out.println("\n-- Em-ordem");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pré-ordem");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pós-ordem");
        arvore.posOrdem(arvore.getRaiz());

        arvore.remover(7);
        arvore.remover(18);
        System.out.println("\n\n\n\nRemovidos os valores 7 e 18.");

        System.out.println("\n-- Em-ordem");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pré-ordem");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pós-ordem");
        arvore.posOrdem(arvore.getRaiz());

        arvore.remover(87);
        System.out.println("\n\n\n\nRemovido o valor 87.");

        System.out.println("\n-- Em-ordem");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pré-ordem");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n\n-- Pós-ordem");
        arvore.posOrdem(arvore.getRaiz());
        System.out.println("\n\n\n");
    }

}