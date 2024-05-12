package pokemon;

public class PokemonTUI {
	 public static void main(String[] args) {

	        //Crear Pokemon "Bloom" (LvL 60, Vida, 150, Atac 7, Defensa 5, Nick "HojitasPaco")
	        Pokemon Bloom  = new Pokemon("Bloom", 60, 150, 7, 5, 4, 0, "HojitasPaco");

	        //Crear Pokemon "Chimchar" (LvL 50, Vida, 100, Atac 10, Defensa 7)
	        Pokemon Chimchar = new Pokemon("Chimchar", 50, 100, 10, 7, 0, 1);

	        /*Round1*/

	        //Bloom checkea su status
	        Bloom.checkStatus();
	        //Bloom Envenena a Chimchar
	        Chimchar.setStatus(1);

	        //Chimcha checkea su status
	        Chimchar.checkStatus();
	        //Chimcha ataca a Bloom
	        Bloom.takeDamage(Chimchar);

	        /*Round2*/

	        //Bloom checkea su status
	        Bloom.checkStatus();
	        //Bloom ataca a Chimchar
	        Chimchar.takeDamage(Bloom);

	        //Chimcha checkea su status
	        Chimchar.checkStatus();
	        //Chimcha ataca a Bloom
	        Bloom.setStatus(2);

	        /*Round3*/

	        //Bloom checkea su status
	        Bloom.checkStatus();
	        //Bloom ataca a Chimchar
	        Chimchar.takeDamage(Bloom);

	        //Chimcha checkea su status
	        Chimchar.checkStatus();
	        //Chimcha ataca a Bloom
	        Bloom.takeDamage(Chimchar);


	        // Mostra la vida de Bloom i de Chimchar per pantalla.
	        System.out.println(Bloom.getName() + ": "+Bloom.getLife() );
	        System.out.println(Chimchar.getName() + ": "+Chimchar.getLife() );
	    }
	}
