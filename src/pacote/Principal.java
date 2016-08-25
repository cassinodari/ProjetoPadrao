
package pacote;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        for(int i=0; i < 10; i++){
            Conexao con = Conexao.instance();
                System.out.println(con);
        }
        
    }
    
}
