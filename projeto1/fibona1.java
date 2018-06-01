public class fibona1{	
   public static void main(String[] args){	 
		int a = 0,b = 1,c,i;				
		System.out.println(a);
		System.out.println(b);
		for(i=0;i<10;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
	
   }
} }