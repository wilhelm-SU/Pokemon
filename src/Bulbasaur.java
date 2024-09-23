
public class Bulbasaur extends Pokemon
{
   public Bulbasaur(){
       super(45, 49, 49, 45, "harold");
   } //Health, Attack, Speed, Defense
    
   //Attack Types
   public void leafSpray(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses leafSpray on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
   
   public void vineWhip(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses vineWhip on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
   
   public void bite(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses bite on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
   
   public void waterGun(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses waterGun on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
}
