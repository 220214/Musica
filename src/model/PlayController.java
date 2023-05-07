package model;


import br.mari.listaString.*;
public class PlayController {
	   
		
	Lista l = new Lista();
	Lista l1 = new Lista();
	Lista d = new Lista();
	    public  PlayController() {
		    
	    }

	    public void adicionaMusica(String Nome, String Artista,String tempo) {
	    	
	    		        
	        if (l.isEmpty()== true) {
	            l.addFirst(Nome);
	            l1.addFirst(Artista);
	            d.addFirst(tempo);
	        } else {
	            try {
					l.addLast(Nome);
					 l1.addLast(Artista);
			         d.addLast(tempo);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           
	        }
	       
	    }
	    	public void removerMusica(int pos) {
	    		if(l.isEmpty()) {
	    			System.out.println("Lista Vazia");
	    		}else {
	    		try {
	    			System.out.println(" Removido com sucesso !");
					l.remova(pos);
					l1.remova(pos);
		    		d.remova(pos);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		
	    		}
	    	}

	    	public void tocaMusica(int j) {
	    		int tam= l.size();
	    		System.out.println("Inicio da Lista -- Tocando a Musica ");
	    		for(int i=0;i<tam;i++) {
	    			try {
						System.out.println("Musica: " + l.get(i)+ " \t artista: "+ l1.get(i)+ "\t Duração: "+ d.get(i));
						double tempo  = (i+1)*j*1000;
			    		Thread.sleep((long) tempo);
	    			} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			
	    		}
	    	}
	   
	}
	





