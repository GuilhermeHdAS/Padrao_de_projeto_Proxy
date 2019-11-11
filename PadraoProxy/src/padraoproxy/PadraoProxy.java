/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoproxy;

/**
 *
 * @author guilh
 */
public class PadraoProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Instanciação do proxy, vou para a Classe ProxyImage executar os métodos delas
      Imagem imagem = new ProxyImagem("Imagem_de_Teste.jpg");
      
      //Chamando o método exibir após a instanciação do proxy, então aqui o "PROXY" irá chamar a minha classe que oferece meu serviço real
      imagem.exibir();
            
      //Posso chamar agora quantas vezes quiser o método exibir
      imagem.exibir();
      imagem.exibir();
      imagem.exibir();
      imagem.exibir();
    }
    
}
