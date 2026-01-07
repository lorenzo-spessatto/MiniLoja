 import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1. VETORES PARALELOS
        // O "Mouse" (índice 1) custa 50.00 (índice 1)
        String[] produtos = {"Fone de Ouvido", "Mouse Gamer", "Teclado Mecânico", "Monitor 24pol"};
        double[] precos = {120.00, 50.00, 250.00, 900.00};
        String listaCompras = "";
        double totalConta = 0.0;
        
        System.out.println("--- BEM-VINDO À TECH STORE ---");

        // 2. LOOP DE VENDAS
        while (true) {
            System.out.println("\nO que você deseja comprar?");
            
            // Mostra o catálogo usando um FOR
            for (int i = 0; i < produtos.length; i++) {
                // Truque visual: (i + 1) mostra "1" pro usuário em vez de "0"
                System.out.println((i + 1) + ". " + produtos[i] + " - R$ " + precos[i]);
            }
            System.out.println("0. Finalizar Compra");

            System.out.print("Digite o código do produto: ");
            int codigo = leitor.nextInt();
            // 3. LÓGICA DE SAÍDA
            if (codigo == 0) {
                break; // Sai do loop e vai para a conta final
            }

            // Ajuste do Índice: Usuário digitou 1, mas queremos o índice 0
            int indice = codigo - 1;

            // 4. VALIDAÇÃO E SOMA
            if (indice >= 0 && indice < produtos.length) {
                // Produto existe!
                totalConta += precos[indice]; // Acumula o valor
                listaCompras += produtos[indice] + "\n";
                System.out.println("Adicionado: " + produtos[indice]);
                System.out.println("Subtotal atual: R$ " + totalConta);
            } else {
                System.out.println("❌ Código inválido! Tente novamente.");
            }
        }

        // 5. ENCERRAMENTO
        if(totalConta>500){
            System.out.println("\nAtenção! \nParabéns você ganhou 10% de desconto");
            totalConta = totalConta * 0.9; 
        }

        System.out.println("\n--------------------------------");
        System.out.println("COMPRA FINALIZADA!\nItens Comprados");
         System.out.println(listaCompras + "\n");
        System.out.println("Total a pagar: R$ " + totalConta);
        System.out.println("--------------------------------");

        leitor.close();
    }
}
