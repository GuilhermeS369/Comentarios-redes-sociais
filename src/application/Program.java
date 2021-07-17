package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		Comment c1 = new Comment ("Have a nice trip");// COMENTARIO 1
		Comment c2 = new Comment ("Wow that's awesome!"); //COMENTARIO 2
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),  // INSTANCIANDO O POST COM DATA E TEXTO E NUMERO
				"Travelling to New Zeland", 
				"I'm going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);//ADICIONANDO O COMENTARIO NA LISTA Q TEM DENTRO DO P1
		p1.addComment(c2);//ADICIONANDO O COMENTARIO NA LISTA Q TEM DENTRO DO P1
		
		
		
		//--------------------------------------------
		
		Comment c3 = new Comment ("Good night");// COMENTARIO 3
		Comment c4 = new Comment ("May the Force be with you"); //COMENTARIO 4
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),  // INSTANCIANDO O POST COM DATA E TEXTO E NUMERO
				"Good night guys", 
				"See you tomorrow",
				5);
		
		p2.addComment(c3);//ADICIONANDO O COMENTARIO NA LISTA Q TEM DENTRO DO P2
		p2.addComment(c4);//ADICIONANDO O COMENTARIO NA LISTA Q TEM DENTRO DO P2
		
		System.out.println(p1);
		System.out.println(p2);
		
		sc.close();
		
	}

}
