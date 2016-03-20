package interfaces;

class FormaE implements Desenho {
	public static int SIZE = 10;
	@Override
	public void desenha() {
		System.out.println("e)\n\n");
		for (int i=0; i<SIZE; i++){
			for (int j=0; j< SIZE; j++){
				if (i==0 || i==(SIZE-1)){
					System.out.print("*");
				}else{
					if (j==0 ||j == SIZE -1){
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
			}	
		}
		System.out.print("\n");
	}

	}

}
