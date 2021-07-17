package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //FIXO E ACESSADO POR TUDO
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	//A LISTA INSTANCIADA COM O TIPO CLASSE COMMENT
	
	
	public Post() {	
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
//-----------------------------
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	//GERENCIADORES DE LISTA
	public void addComment (Comment comment) {
		comments.add(comment);
				
	}
	
	public void removeComment (Comment comment) {
		comments.remove(comment);
				
	}
	
	public String toString() {
			StringBuilder sb = new StringBuilder();//NOVA FUNÇÃO
			sb.append(title + "\n");
			sb.append(likes);
			sb.append(" Likes - ");
			sb.append(sdf.format(moment) + "\n");//FORMATAÇÃO DA DATA
			sb.append(content + "\n");
			sb.append("Comments: \n");
			for(Comment c : comments) {//FOR PARA EXIBIR TODOS OS COMETNARIOS
				
				sb.append(c.getText() + "\n" );//GET PARA PEGAR O TEXTO DE CADA ITEM DA LISTA
				
			}
			return sb.toString();//RETORNAR TUDO
			
				
			
	}
		
}
