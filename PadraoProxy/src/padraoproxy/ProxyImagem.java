/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoproxy;

/**
 *
 * @author guilh
 * Essa classe é onde implemento o padrão Proxy, ou seja, onde vou colocar a condição que eu quero de proxy, nesse caso o controle de cache
 * onde eu vejo se o arquivo existe (foi carregado), se não existe, eu instancio ele, se existe eu apenas mostro aquilo que já existe
 */
 public class ProxyImagem implements Imagem{
   private Objeto_Imagem_Real Imagem_real;//Essa variável faz referência ao serviço que quero usar, no caso o Objeto_Imagem_Real
   private String nome_arquivo_foto;//Essa variável pega qual o arquivo que eu quero
   
   //Alterando o construtor da classe: para instanciar essa classe eu preciso de passar o nome do arquivo da minha foto
   public ProxyImagem(String nome_arquivo_foto){
      this.nome_arquivo_foto = nome_arquivo_foto;//Atribuindo o valor do arquivo a minha variável nome_arquivo_foto
   }
   
   //Onde vou mostrar o conteúdo na tela, implementação do método criado na interface
   public void exibir() {
      
      //Toda primeira instanciação eu caio nessa condição, se o meu objeto não foi instanciado uma única vez eu o instancio
      if(Imagem_real == null){
         Imagem_real = new Objeto_Imagem_Real(nome_arquivo_foto);//Instância do meu objeto, no caso a Imagem
      }else
      {
          System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
          System.out.println("");
          System.out.println("Exibindo o arquivo " + nome_arquivo_foto + " que está em cache:");
      }
      Imagem_real.exibir();//Chamada do método exibir
      System.out.println("");

   }
 }
