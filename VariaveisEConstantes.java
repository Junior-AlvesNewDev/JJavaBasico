package cursoJava.basico;
/*
 * Classe demostrativa de variaveis de constantes
 * 
 * versão: 1.0
 * 
 * autor: Junior
 * 
 */

public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Criação de constantes
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		//Criação de variaveis
		String nome="José";
		
		int idade=31;
		
		double peso=76,altura=1.73;
		
		char sexo='m',cnh='a';
		
		boolean doadorOrgaos=true;
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+altura);
		System.out.println("Sexo: "+sexo);
		System.out.println("CNH: "+cnh);
		System.out.println("Doador: "+doadorOrgaos);
		System.out.println("Gravidade da Terra: "+ACELERACAO_GRAVIDADE_TERRA);
	}

}
