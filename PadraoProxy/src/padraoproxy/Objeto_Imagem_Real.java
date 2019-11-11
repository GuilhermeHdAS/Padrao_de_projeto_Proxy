/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoproxy;

/**
 *
 * @author guilh
 * Essa classe é onde eu crio o serviço que vai ser oferecido, no caso, o serviço que o proxy vê se necessita ou não de chamar
 */
public class Objeto_Imagem_Real implements Imagem {  
   private String nome_arquivo_foto;
   
   //Agora a classe RealImage recebe o arquivo como parâmetro, toda vez que for instanciá-la preciso desse parâmentro
   //Eu atribuo a minha variável o nome do arquivo que contém a imagem
   public Objeto_Imagem_Real(String nome_arquivo_foto){
      this.nome_arquivo_foto = nome_arquivo_foto;
      buscando_arquivo(nome_arquivo_foto);//Aqui eu falo, busca esse arquivo no meu disco por exemplo, e passo o caminho
   }
   
   //Método exibir que só é executado aqui "SE" não tiver sido instanciada nenhuma vez e chamada pelo Proxy
   public void exibir() {
      System.out.println("Exibicao do arquivo: " + nome_arquivo_foto);
   }
   
   //Método para buscar meu arquivo
   private void buscando_arquivo(String nome_arquivo_foto){
      System.out.println("Carregando o arquivo " + nome_arquivo_foto);
   }
 }