package model;

public class Navn implements Comparable<Navn>{
private String fornavn;
private String efternavn;

public Navn(String fornavn, String efternavn) {
	this.setFornavn(fornavn);
	this.setEfternavn(efternavn);
}

public String getFornavn() {
	return fornavn;
}

public void setFornavn(String fornavn) {
	this.fornavn = fornavn;
}

public String getEfternavn() {
	return efternavn;
}

public void setEfternavn(String efternavn) {
	this.efternavn = efternavn;
}
public String toString() {
	return this.fornavn+" "+this.efternavn;
}

@Override
public int compareTo(Navn o) {
	if (this.fornavn.compareTo(o.getFornavn()) == 0){
		return this.efternavn.compareTo(o.getFornavn());
	}
	else {
		return this.fornavn.compareTo(o.getEfternavn());
	}
}
}
