
package dao;
import java.util.ArrayList;
import modelo.Aluno;

public class AlunoDao {
    public static ArrayList<Aluno>minhaLista = new ArrayList<>();
    
    public static ArrayList<Aluno>getMinhaLista(){
        return minhaLista;
    }
    public static void setMinhaLista(ArrayList<Aluno>minhaLista){
        AlunoDao.minhaLista = minhaLista;
    }

    public static int maiorID(){
        int maiorID = 0;
        for(int i=0; i < minhaLista.size();i++){
            if(minhaLista.get(i).getId()>maiorID){
                maiorID = minhaLista.get(i).getId();
            }
        }
        return maiorID;
    }
    
}
