
package uninove;


public class Produto {
    private String nome;
    double valor;
    
    double calcularValor(){
        return valor += 50;  
    }
    
    double calcularValor(double valor02){
        return valor += valor02;
    }
    
      double calcularValor(double valor02 ,double valor03){
        return valor += valor02 + valor03;
    }
      
        double calcularValor(double valor02 ,double valor03, double valor04){
        return valor += valor02 + valor03 + valor04;
        
    }
        
        public void getNome(String nomeProduto){
            this.nome = nomeProduto;            
        }

        public String setNome(){
            return this.nome;            
        }
        
        
    
    
}
