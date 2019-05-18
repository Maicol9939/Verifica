
public class Studente<Voto> {

private String classe;
private String Nome;
private String cognome;
private Voto[] voti;

public Studente(String classe, String nome, String cognome, Voto[] voti) {
	
	this.classe = classe;
	Nome = nome;
	this.cognome = cognome;
	this.voti = voti;
}

public String getClasse() {
	return classe;
}
public void setClasse(String classe) {
	this.classe = classe;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public Voto[] getVoti() {
	return voti;
}
public void setVoti(Voto[] voti) {
	this.voti = voti;
}


}
