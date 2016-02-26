public class Cachorro{
	
	String raca;
	String porte;
	int idade;
	String nome;
	
	public void latir(){
		if(porte.equals("pequeno")){
			System.out.println("Au! Au!");
		}
		else if(porte.equals("medio")){
			System.out.println("Wolf! Wolf!");
		}
		else if(porte.equals("grande")){
			System.out.println("Auwolf! Auwolf!");
		}
		else{
			System.out.println("Porte invalido!");
			
		}
			
	}
	
	public void andar(){
		if(idade<15){
			System.out.println("Andei 10 passos!");
		}
		else
			System.out.println("Estou muito velho para andar.");
	}
	
	@Override
	public String toString(){
		String retorno= "";
		retorno= " Eu sou um cachorro";
		retorno= retorno+ " meu nome eh " +nome;
		retorno= retorno+ " minha raca eh " +raca;
		retorno= retorno+ " meu porte eh " +porte;
		retorno= retorno+ " eu tenho " +idade + " ano(s)";
		
		return retorno;
	}
}