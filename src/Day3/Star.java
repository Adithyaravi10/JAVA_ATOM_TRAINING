import java.util.Scanner;
class Star {
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.print("Enter the number of stars:");
int n = scn.nextInt();
for(int i = 1; i<=n; i++){
for(int j = n-1; j<n; j++) {
System.out.print(" *  ");
}
System.out.print(" *  \n");

}
}
}