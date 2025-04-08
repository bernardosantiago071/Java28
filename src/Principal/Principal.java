
package Principal;

import Model.Produto;
import javax.swing.JOptionPane;


public class Principal {


    public static void main(String[] args) {
       Produto objetoproduto = new Produto (1,"produto1",10.5);
       
       JOptionPane.showMessageDialog(null, objetoproduto.getNome());
       
       objetoproduto.setNome("produto1 plus");
       
       JOptionPane.showMessageDialog(null, objetoproduto.getNome());
    }
    
}
