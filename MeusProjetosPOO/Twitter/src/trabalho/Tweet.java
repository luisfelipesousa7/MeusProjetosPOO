package trabalho;

import java.util.ArrayList;

public class Tweet {

	String idUsuario;
    String mensagem;
    int like;

    ArrayList<String> idLikes; 

    public String getMsg() {
        return mensagem;
    }

    public void setMsg(String msg) {
        this.mensagem = msg;
    }

    public String getIdUser() {
        return idUsuario;
    }

    public void setIdUser(String idUser) {
        this.idUsuario = idUser;
    }

    public Tweet(String idUser, String msg) {
        this.idUsuario = idUser;
        this.mensagem = msg;
        this.like = 0;
        this.idLikes = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return mensagem + " / likes = " + like + " /] " + idLikes;
    }

	public int getLikes() {
		return like;
	}

	public void setLikes(int likes) {
		this.like = likes;
	}
}
