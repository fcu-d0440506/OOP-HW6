
public class main 
{
	public static void main(String[] args) 
	{
		player player1 = new player("player one");
		pokemon pk1 = new pokemon("Bulbasaur", PokemonType.grass, 123);
		pokemon pk2 = new pokemon("Charmander", PokemonType.fire, 456);
		pokemon pk3 = new pokemon("psyduck", PokemonType.water, 91);
		pokemon [] pkms1 = {pk1,pk2,pk3};
		player1.setPokemon(pkms1);

		
	    player player2 = new player("Player Two");
	    pokemon pkm21 = new pokemon("Seel", PokemonType.water, 432);
	    pokemon pkm22 = new pokemon("Gyarados", PokemonType.water, 987);
	    pokemon pkm23 = new pokemon("Horsea", PokemonType.water, 91);
	    pokemon[] pkms2 = { pkm21, pkm22, pkm23 };
	    player2.setPokemon(pkms2);
	    
	    System.out.print(GYM.fight(player1,player2).get_name()+" win ");
	    GYM.fight(player1,player2).level_up();
	}
}
