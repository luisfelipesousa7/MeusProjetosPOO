package trabalho;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class Repositorio <Chave, Valor> {
	Map<Chave, Valor> data;
	String tipo;
	
	public Repositorio(){
		this.data = new TreeMap<Chave, Valor>();
		
	}
	
	public void add (Chave chave, Valor valor){
        if (data.get(chave) == null)
            data.put(chave, valor);
        else   
            throw new RuntimeException(tipo + " " + chave + " ja existe");
    }
	
	public Valor get(Chave chave){
        if (data.get(chave) != null)
            return data.get(chave);
        else
            throw new RuntimeException(tipo + " " + chave + " nao existe");
    }
	
	public void remove(Chave chave){
        if (data.get(chave) != null){
            System.out.println("removendo " + chave);
            data.remove(chave);
        }else  
            throw new RuntimeException(tipo + " " + chave + " nao existe, nao pode ser removido");
    }
	
	public ArrayList<Valor> getAll(){
		ArrayList<Valor> out = new ArrayList<Valor>();
		for(Chave chave : data.keySet())
			out.add(data.get(chave));
		return out;
	}
	
	public String toString() {
        String out = "";

        for (Chave chave : data.keySet()){
            out += data.get(chave);
        }
        out += "";
        return out;
        
    }
	
}
