
public class Charizard extends Pokemon
{
   public Charizard(){
       super(78, 84, 78, 100, "jimmy");
   } //Health, Attack, Defense, Speed
   
   //Attack Types
   public void fireBall(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses fireBall on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());

   }
   
   public void flameThrower(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses flameThrower on " + anyPoorPokemon.getName() + "!");
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
   }
   
   public void bite(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses bite on " + anyPoorPokemon.getName() + "!");
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
   }
   
   public void fireTail(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses fireTail on " + anyPoorPokemon.getName() + "!");
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
   }
}
