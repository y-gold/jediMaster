package starWars;

public abstract class Jedi extends SerVivo{

	Jedi(int data, String nom, String sex, String esp, String epoch, String loc) {
		super(data, nom, sex, esp, epoch, loc);
	}
	
	public void descricao() {
		System.out.println("Na ordem Jedi deve-se " + 
				"evoluir  o  percentual  de  paz  interna  e  podem  ou  nao  ter  como  poderes  telepatia, " + 
				"telecinese  e  persuasao.   Conforme  seu  estagio  de  treinamento  um  Jedi  podem  ser " + 
				"Youngling, Padawan, Cavaleiro ou Mestre.");
	}
}
