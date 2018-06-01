import java.util.ArrayList;
public class foraprimorado{
     public static void main(String[] args){
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i=0; i<10; i++){
		     list.add(i+1); // (0 - 9) passa para (1 - 10)
		}    			
	        for(Integer numero : list){
				System.out.println(numero);  
			}	  	
    }
}