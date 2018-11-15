package model;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>>{
private T navn;

public Person(T navn) {
	this.navn = navn;
}
public T getNavn() {
	return this.navn;
}

@Override
public int compareTo(Person<T> o) {
	return getNavn().compareTo(o.getNavn());
}
@Override
public String toString() {
	return ""+this.navn;
}
}
