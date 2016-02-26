public class PetShop{
	public static void main (String args[]){
		Cachorro dog = new Cachorro();
		dog.nome="Jade";
		dog.raca="vira lata";
		dog.porte="medio";
		dog.idade=2;
		System.out.println(dog.toString());
		dog.latir();
		dog.andar();
		
		Cachorro dogi = new Cachorro();
		dogi.nome="Rex";
		dogi.raca="boxer";
		dogi.porte="grande";
		dogi.idade=20;
		System.out.println(dogi.toString());
		dogi.latir();
		dogi.andar();
		
		Gato cat = new Gato();
		cat.nome="Mia";
		cat.raca="siames";
		cat.idade=11;
		System.out.println(cat.toString());
		cat.andar();
	}
}