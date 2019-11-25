
class newPatterns{
	 public static void main(String[] args)
	{
		int i,e=5;
		for(i=1;i<=e;i++)
		{
			for(int j=1;j<=e;j++){
				if(i==j)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=e;j++){
				if(i+j==e)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
				

			}
			for(int j=1;j<=e;j++){
				if(j==1)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=e;j++){
				if(i==j)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=e;j++){
				if(i+j==e)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
				
			}
			// for(int j=1;j<=e;j++){
			// 	if(i==1||i==e||j==1||i==3)
			// 		System.out.print("*");
			// 	else{
			// 		System.out.print(" ");
			// 	}
				
			// }

			for(int j=1;j<=e;j++){
				if(j==1||i==1||i==e||i==3)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
				
			}
			System.out.print(" ");
				for(int j=1;j<=e;j++){
				if(j==1||i+j==e||i==1-j||i==1+j)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
				
			}
			
			
			
			System.out.println();
		}


	}
}