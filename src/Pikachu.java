
public class Pikachu extends Pokemon
{  
   public Pikachu(){
       super(35, 15, 30, 90, "bob");
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

   @Override
   public String toString(){
       return "Pikachu:" + this.getHp() + " " + this.getAttack();
   }
}
