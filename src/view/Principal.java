package view;

import model.PlayController;

public class Principal {
	static String nome;
	static String art ;
	static String tem;
	public static void main(String[] args) {
		PlayController ad = new PlayController();
	
		for (int i=0 ;i< 5; i++) {
		
			try {
				 nome = "Vida " +i;
				 art = "Mary "+i;
				 tem = i+1+ " " ;
				ad.adicionaMusica(nome,art,tem);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int cont =2;
		ad.tocaMusica(cont);
		ad.removerMusica(2);
		nome="Casa Verde ";
		art=" Julia";
		tem =" 3";
	
		ad.adicionaMusica(nome, art, tem);
		ad.tocaMusica(cont);
	
}
}
