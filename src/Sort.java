import java.util.Scanner;


public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int [] x= new int[5];
		
for(int i=0;i<5;i++){
			
			x[i]=s.nextInt();
		}
		for (int i=0;i<5;i++){
			for(int j=0;j<5;j++){
			if(x[i]<x[j]){
				int temp=x[i];
				x[i]=x[j];
				x[j]=temp;
				
			}	
				
			}
			
		}
		for(int i=0;i<5;i++){
			System.out.println(x[i]);
			
		}

	}

}
