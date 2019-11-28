package trabalho;

public class Controller {

	public static void main(String[] args) {
		try{
	        TwitterSupremo twitter = new TwitterSupremo();

	        twitter.usuarios.add("Maria", new User("Maria Clara"));
	        twitter.usuarios.add("Jo�o", new User("Jo�o Sei-n�o"));
	        twitter.usuarios.add("Luis", new User("Luis Felipe"));
	        twitter.usuarios.add("Joana", new User("Joana Maria"));
	        
	        twitter.seguir("Maria", "Jo�o");
	        twitter.seguir("Luis", "Jo�o");
	        twitter.seguir("Joana", "Luis");
	        twitter.seguir("Joana", "Maria");
	        twitter.seguir("Jo�o", "Maria");
	        twitter.seguir("Maria", "Joana");
	        
	        System.out.println(twitter.usuarios);

	        twitter.twittar("Jo�o", "Hoje t� quente");
	        twitter.twittar("Maria", "N�o guento mais");
	        twitter.twittar("Joana", "J� cansei");
	        twitter.twittar("Luis", "Se o trabalho � para amanh� eu s� vou fazer amanh�");
	        twitter.twittar("Maria", "Hoje � prova");

	        System.out.println(twitter.usuarios.get("Maria").timeLine());
	        
	        twitter.like("Jo�o", "Maria", 0);
	        twitter.like("Jo�o", "Maria", 1);
	        twitter.like("Joana", "Maria", 1);

	        System.out.println(twitter.usuarios.get("Maria").timeLine());
     
	        }
	        catch (RuntimeException e){
	            System.out.println(e.getMessage());
	        }
	}
}

