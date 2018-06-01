public class autoboxing{
  public static void main (String[] args){
	  
	  // aula de AutoBoxing
	  Integer x = 555;
	  x++; // desempacota incrementa e reempacota
	  System.out.println(x);
	  // x.intValue();
	  
	  Boolean v = new Boolean ("true");
	  if(v){
		  System.out.println(v);
	  }
  }
}