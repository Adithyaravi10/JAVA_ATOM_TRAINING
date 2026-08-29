class PowerCalc {
public static int Pc(int n) {
int result = 1;
for (int i = 0; i < n; i++) {
result = result * 2;
}
return result;
}
public static void main(String[] args) {
int n = 5; 
int value = Pc(n);
System.out.println("2**" + n + " = " + value);
}
}