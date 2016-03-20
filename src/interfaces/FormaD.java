package interfaces;

 class FormaD implements Desenho {
	public static int size = 10;

	@Override
	public void desenha() {
		System.out.println("d)\n\n");
		for(int i=0; i<size; i++){
			for (int j=size; j>=0; j--){
				if (j<i){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
