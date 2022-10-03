
public class Utente {

	private String nome;
	private String genero;
	private int idade;
	private float altura;
	private int peso;
	private double IMC;
	private String limite_peso;
	/**
	 * @param nome
	 * @param genero
	 * @param idade
	 * @param altura
	 * @param peso
	 */
	public Utente(String nome, String genero, int idade, float altura, int peso) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.IMC = IMC();
		this.limite_peso = limite_peso();
	}
		
		public double IMC() {
			double i = peso/(altura * altura);
			return i;
		}
		
		public String limite_peso() {
			String limite_peso = "";
			if (IMC <= 19) {
				limite_peso = "Abaixo do peso normal";
			}
			if (IMC <= 25 && IMC > 19) {
				limite_peso = "Peso normal";
			}
			if (IMC > 25 && IMC <= 30) {
				limite_peso = "Excesso peso";
			}
			if (IMC > 30) {
				limite_peso = "Excesso peso";
			}
			return limite_peso;
		}

}
