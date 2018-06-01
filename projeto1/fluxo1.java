public class fluxo1{
  public static void main(String[] args){
	  System.out.println("break");
	  for (int i=0; i<10; i++){
		  if(i==5){
			  break; // parar o loop 
		  }
		  System.out.println(i);
	  }
	  System.out.println();
	  System.out.println("continue");
	  for (int i=0; i<10; i++){
		  if(i==5){
			  continue; // vai pular um numero do loop 
		  }
		  System.out.println(i);
	  }
	  System.out.println();
	  System.out.println("Rotulo");
	  System.out.println();
	  
	  
	        boolean[][] matrix = {
		    {false,true,false,false,false},
		    {false,false,false,false,false}
	       };
	     busca: // rotulo para utilizar break e o continue e parar os dois for
	     for(int a=0;a<matrix.length;a++){
		  System.out.print("A ");
			for(int b=0;b<matrix[a].length;b++){
				if(matrix[a][b]){
			     System.out.print("true ");
				 break busca;
				}
			 System.out.print("B ");
			 
		    }  
		 }
	  
	  
	  
	  
  }

}