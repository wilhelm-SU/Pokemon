
public class TestingObjectClass
{
   public static void main(String[] args){
    
       Pikachu pk = new Pikachu();
       
       System.out.println( pk );
       
       double sum = 0;
       for(int i = 0; i < 10; i++){
           sum = sum + .1;
           System.out.println(sum);
       }
       
       int result = 100000;
       System.out.println(result * result);
       
    }
}
