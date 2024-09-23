
public class Bulbasaur extends Pokemon
{
   public Bulbasaur(){
       super(45, 49, 49, 45, "harold");
   } //Health, Attack, Speed, Defense

    int canAttack = 0;

    //Attack Types
    public void attack(Pokemon anyPoorPokemon){
        System.out.println(getName() + " attacks " + anyPoorPokemon.getName() + "!");
        int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
        if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
        if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
            canAttack++;
            if(canAttack > 1) {
                int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
                if (resultingHp > 0) {
                    anyPoorPokemon.setHp(resultingHp);
                }
                if (resultingHp <= 0) {
                    anyPoorPokemon.setHp(0);
                }
            }
        }
        System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
    }
}
