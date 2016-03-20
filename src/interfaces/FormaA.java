package interfaces;

 class FormaA implements Desenho {
	public static int size = 10;

	@Override
	public void desenha() {
		System.out.println("a)\n\n");
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				if (j<=i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}	

	}

}
