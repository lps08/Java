package questão1;

public class Teste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Indivíduo");
		p.setAltura(1.70);
		p.setIdade(22);
		p.setPeso(55);
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("Altura: " + p.getAltura());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Peso: " + p.getPeso());
		
		System.out.println("IMC: " + p.imc() + "\n\n\n");
		
		p.mostraDados();
	}

}
