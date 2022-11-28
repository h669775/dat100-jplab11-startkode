package no.hvl.dat100.jplab11.oppgave2;


public class Bilde extends Tekst {

	// TODO - objekt variable
		private String url; 
		
		public Bilde(int id, String bruker, String dato, String tekst, String url) {
			super(id, bruker,dato, tekst);
			this.url = url;
		}

		public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
			super(id, bruker, dato, likes, tekst);
			this.url = url;
		}
		
		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		@Override
		public String toString() {
			
			return "BILDE\n" + getId() + "\n" + getBruker() + "\n" +
					getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";

		}

	
	}