
public class Piplup extends Pokemon
{
   public Piplup(){
       super(53, 51, 53, 40, "lily");
   } //Health, Attack, Defense, Speed

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
