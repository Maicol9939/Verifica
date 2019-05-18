
public class Docente  {

	private String nome;
	private String cognome;
	private String ID;
	private String password;
	private String materia;
	
public Docente(String nome, String cognome, String iD, String password, String materia) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.ID = iD;
		this.password = password;
		this.materia = materia;
	}
	
public Docente(Docente d) {
	
	this.nome = d.getNome();
	this.cognome = d.getCognome();
	this.ID = d.ID;
	this.password = d.getPassword();
	this.materia = d.materia;
}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void ricercaStudenteConMediaVotoPiuAlta(String voti)
	{
		
		
	}
	
	
}
