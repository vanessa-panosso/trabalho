package classeabstrata;

class FormaE extends DesenhoAbstrato {
	public static int SIZE = 10;
	@Override
	protected String getNome() {
		return "e";
	}

	@Override
	protected void desenhar() {
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
