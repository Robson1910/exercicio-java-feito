import java.util.Random;
public class cartas{
 public static void main(String[] args){
	 String[] faces = {"AS","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
	 String [] nipes = {"Espadas","Ouros","Paus","Copas"};
	 Random r = new Random();
	 int indiceFace = r.nextInt(faces.length);
	 String face = faces[indiceFace];
	 int indiceNipe = r.nextInt (nipes.length);
	 String nipe = nipes[indiceNipe];
	 String carta = face + " " + nipe;
    System.out.println(carta);	 
	// Random essa classe permite escolher numeros aleatorios 
 }
}