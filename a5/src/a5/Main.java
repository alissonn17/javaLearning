package a5;

public class Main{
	public static class Pessoa{
		public String name;
		public int age;
		public float height;
		Pessoa(String name, int age, float height){
			this.name = name;
			this.age = age;
			this.height = height;
		}
		public String dataPessoa() {
			return "Individuo de nome " + this.name + ", idade " + this.age + " e altura " + this.height + "m.";
		}
	}
	
	
	public static void main(String[] args) {
		Pessoa Nolan = new Pessoa("Nolan", 26, 1.78f);
		System.out.println(Nolan.dataPessoa());
	}
}