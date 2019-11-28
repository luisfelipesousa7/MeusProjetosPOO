package trabalho;

public class TwitterSupremo {
	
	Repositorio<String, User> usuarios;

    TwitterSupremo() {
        usuarios = new Repositorio<String, User>();
    }

    public Repositorio<String, User> getUsuarios() {
        return usuarios;
    }

    public void seguir(String s1, String s2){
        usuarios.get(s1).getSeguidos().add(s2, usuarios.get(s2));

        usuarios.get(s2).getSeguidores().add(s1, usuarios.get(s1));
    }

    public void twittar(String user, String msg){
        usuarios.get(user).getTweets().add(new Tweet(user, msg));
    }

    public void like (String likador, String user, int t){
        Tweet p = usuarios.get(user).getTweets().get(t);
        String f = this.usuarios.get(likador).getId();
        p.idLikes.add(f);
        p.setLikes(p.getLikes() + 1);
    }
}
