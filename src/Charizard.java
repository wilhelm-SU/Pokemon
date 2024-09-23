
public class Charizard extends Pokemon
{
   public Charizard(){
       super(78, 22, 78, 100, "jimmy");
   } //Health, Attack, Defense, Speed

    int canAttackHp = 0;

    //Attack Types
    public void attack(Pokemon anyPoorPokemon){
        System.out.println(getName() + " attacks " + anyPoorPokemon.getName() + " for " + this.getAttack() +" damage!");
        int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
        if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
        if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
            canAttackHp++;
            if(canAttackHp > 1) {
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
        System.out.println(anyPoorPokemon.getName() + "'s DF: " + anyPoorPokemon.getDefense());

    }
}
