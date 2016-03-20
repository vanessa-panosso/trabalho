package interfaces;

 class FormaM implements Desenho {
	 public static int SIZE = 8;
	@Override
	public void desenha() {
		
		System.out.println("\n\nm)\n\n");
		
		for (int linha = 1; linha <= SIZE; linha++) {
			for (int col = 1; col <= SIZE; col++) {
				if (col > linha) {
					System.out.print(" ");
				} else {
					System.out.print(col + " ");
				}
			}
			System.out.print("\n");
		}
	}

}
