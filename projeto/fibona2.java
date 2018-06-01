public class fibona2{	
   public static void main(String[] args){	 
		int a = 0;
		int b = 1;
		System.out.println(a);		
		while (a<10){
	    System.out.println(b);
			b=b+a;// proximo numero
			a=b-a;// atualizar o numero anterior a (soma-a)
		}
	
   }
}