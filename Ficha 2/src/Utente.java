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

		/**
		 * @return the nome
		 */
		public String getNome() {
			return nome;
		}

		/**
		 * @param nome the nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

		/**
		 * @return the genero
		 */
		public String getGenero() {
			return genero;
		}

		/**
		 * @param genero the genero to set
		 */
		public void setGenero(String genero) {
			this.genero = genero;
		}

		/**
		 * @return the idade
		 */
		public int getIdade() {
			return idade;
		}

		/**
		 * @param idade the idade to set
		 */
		public void setIdade(int idade) {
			this.idade = idade;
		}

		/**
		 * @return the altura
		 */
		public float getAltura() {
			return altura;
		}

		/**
		 * @param altura the altura to set
		 */
		public void setAltura(float altura) {
			this.altura = altura;
		}

		/**
		 * @return the peso
		 */
		public int getPeso() {
			return peso;
		}

		/**
		 * @param peso the peso to set
		 */
		public void setPeso(int peso) {
			this.peso = peso;
		}

		/**
		 * @return the iMC
		 */
		public double getIMC() {
			return IMC;
		}

		/**
		 * @param iMC the iMC to set
		 */
		public void setIMC(double iMC) {
			IMC = iMC;
		}

		/**
		 * @return the limite_peso
		 */
		public String getLimite_peso() {
			return limite_peso;
		}

		/**
		 * @param limite_peso the limite_peso to set
		 */
		public void setLimite_peso(String limite_peso) {
			this.limite_peso = limite_peso;
		}
}