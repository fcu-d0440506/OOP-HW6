
public class player 
{
	public String name;
	public pokemon [] monster;
	public int level = 1;
	public static void main(String[] args) {
		
	}
	public  player(String n)
	{
		name =  n;
	}
	public void setPokemon(pokemon ...m1)
	{
		monster = m1;
	}
	public void getpokemon()
	{
		for(pokemon aElm: monster) {
	        System.out.println(aElm.get_cp()+"\n"+aElm.get_name()+"\n"+aElm.get_type());
	      }
	}
	public String get_name()
	{
		return name;
	}
	public void level_up()
	{
		level = level+1;
	}
}
