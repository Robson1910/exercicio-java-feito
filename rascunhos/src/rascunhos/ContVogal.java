package rascunhos;

import java.util.Scanner;

class ContB {
public static char toUpper(char c){
if (c >= 'a' && c <= 'z'){
c = (char) (c - 32);
}
return c;
}
public static boolean isB (char c){
c = toUpper(c);
return (c == 'b' || c == 'B');
}


public static int contB (String s){
int resp = 0;
for (int i = 0; i < s.length(); i++){
if (isB(s.charAt(i)) == true){
resp++;
}
}
return resp;
}
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int B = contB(s);
System.out.println("Numero de vogais: " + B);
}
}