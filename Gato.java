public class Gato{
	
	String raca;
	int idade;
	String nome;
	
	public void andar(){
		if(idade<10){
			System.out.println("Andei 10 passos!");
		}
		else
			System.out.println("Estou muito velho para andar.");
	}
	
	@Override
	public String toString(){
		String retorno= "";
		retorno= " Eu sou um gato";
		retorno= retorno+ " meu nome eh " +nome;
		retorno= retorno+ " minha raca eh " +raca;
		retorno= retorno+ " eu tenho " +idade + " ano(s)";
		
		return retorno;
	}
}