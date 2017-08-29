package harjoitus2.thymeleaf.hello.domain;

public class Message {
	private String nimi;
	private int ika;
	
	public String getNimi(){
		return nimi;
	}
	public void setNimi(String nimi){
		this.nimi = nimi;
	}
	public int getIka(){
		return ika;
	}
	public void setIka(int ika){
		
	}
	@Override
	public String toString() {
		return "Message [nimi=" + nimi + "]";
	}
}
