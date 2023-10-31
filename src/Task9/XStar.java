package Task9;


public class XStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,n,input;
input=3;
System.out.println("The number of rows is defined as "+input);
System.out.print(" The Star pattern : " );
n=input*2-1;
for(i=1;i<=n;i++) {
	for(j=1;j<=n;j++) {
		if(j==i || j==n-i+1)
			System.out.print("X");
		System.out.print(" ");
	}
	System.out.println();
}
	}
}
			
	





