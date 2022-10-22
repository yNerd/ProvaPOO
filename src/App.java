import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import classes.Produto;

public class App {
        public static void main(String[] args) throws InterruptedException, IOException {
        ArrayList<Produto>produtos = new ArrayList<>();
        String parada;
        int opcao, qntProduto = 0;
        Produto p = new Produto();
            
            Scanner in = new Scanner(System.in);
             
            
    
            
            do {
                System.out.println("\n****\nMENU\n****\n");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Consultar produtos cadastrados");
                System.out.println("3 - Listar produtos");
                System.out.println("4 - Vender por periodo-detalhado");
                System.out.println("5 - Realizar venda");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
    
                opcao = in.nextInt();
                in.nextLine(); 
    
                if (opcao == 1) {
    
                    do {
                        System.out.println("----------------------------");
                        System.out.println("Digite o nome do produto: ");
                        p.setNome(in.nextLine());                        
                        System.out.println("Digite o codigo do produto: ");
                        p.setCodigo(in.nextInt());
                        System.out.println("Digite o valor do produto: ");
                        p.setValor(in.nextFloat());
                        qntProduto++;
                        p.setQtdEstoque(qntProduto);
                        produtos.add(p);

                        System.out.println("\n----------------------------");
                        System.out.println("Deseja continuar cadastrando: ");
                        in.nextLine();
                        parada=in.nextLine();
                        
                    } while (parada.equalsIgnoreCase("s"));
                        voltarMenu(in);     
                
                } else if (opcao == 2) {
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println(produtos.get(i));
                        voltarMenu(in);
                    }
    
                  
               }else if (opcao == 3) {
                        int achou;
                        System.out.println("--------------------------");
                        System.out.println("Digite o codigo do produto");
                        achou = in.nextInt();                      
                            for (int i = 0; i < produtos.size(); i++) {
                                if(achou == p.getCodigo()){
                                    System.out.print("Venda realizada");
                                    produtos.remove(i);
                                    voltarMenu(in);
                                }
                                else if(achou != p.getCodigo()){
                                    System.out.print("Produto nao encontrado!!!");
                                    voltarMenu(in);

                                }
                   
                   }
                   
    
               }
                 else if (opcao == 4) {
                    
                   
                }
                else if (opcao != 0) {
                    System.out.println("\nOpção inválida!");
                }
            } while (opcao != 0);
    
            System.out.println("Fim do programa!");
    
            in.close();
        }
    
        private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
            System.out.println("\nPressione ENTER para voltar ao menu.");
            in.nextLine();
    
            // Limpa toda a tela, deixando novamente apenas o menu
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();             
            else
                System.out.print("\033[H\033[2J");
            
            System.out.flush();
        }
    
}