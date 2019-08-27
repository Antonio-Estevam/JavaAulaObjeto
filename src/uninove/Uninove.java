
package uninove;


public class Uninove {
    
   
    public static void main(String[] args) {
       
        Produto prod01 = new Produto();
        
        prod01.getNome("Sabão");
        prod01.valor = 2.50;
        
        prod01.calcularValor(10,10,10);
        
        System.out.println(prod01.valor);
        System.out.println(prod01.setNome());

        
        
    }
    
}
