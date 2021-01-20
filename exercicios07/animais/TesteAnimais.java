package exercicios07.animais;

public class TesteAnimais {
	public static void main(String args[]) {
//		Animal animal = new Animal();
//		Bovino bovino = new Bovino();
//		Peixe peixe = new Peixe();
		
		Animal[] animais = new Animal[7];
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		Bovino b1 = new Bovino();
		Bovino b2 = new Bovino();
		Bovino b3 = new Bovino();
		
		Peixe p1 = new Peixe();
		Peixe p2 = new Peixe();
		
		animais[0] = a1;
		animais[1] = a2;
		animais[2] = b1;
		animais[3] = b2;
		animais[4] = b3;
		animais[5] = p1;
		animais[6] = p2;
		
		for (int i = 0; i < animais.length; i++) {
			if (animais[i] instanceof Bovino) {
				System.out.println("Bovino.");
			} else if (animais[i] instanceof Peixe){
				System.out.println("Peixe");
			} else if (animais[i] instanceof Animal) {
				System.out.println("Animal.");
			}
			
		}
		
		/*
		Animal a = new Bovino();
		((Bovino) a).setProducaoLeite(5);
		
		animal.setEspecie("Homo sapiens");
		System.out.println(animal.getEspecie());
		
		bovino.setEspecie("Bos taurus");
		bovino.setProducaoLeite(10);
		
		System.out.println(bovino.getEspecie());
		System.out.println(bovino.getProducaoLeite() + " litros");
		
		peixe.setEspecie("Pseudoliparis swirei");
		peixe.setProfundidade(7966);
		
		System.out.println(peixe.getEspecie());
		System.out.println(peixe.getProfundidade() + " metros");
		*/
		
	}
}
