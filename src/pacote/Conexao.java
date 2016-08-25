package pacote;

/**
 *
 * @author aluno
 */
public class Conexao {


    private static Conexao con = null;

    private Conexao(){

    }

    public static Conexao instance(){
        if(con == null){
            con = new Conexao();
        }
    
        return con;
    }   
}
