package classeabstrata;

 class FormaI extends DesenhoAbstrato {
	public static int size = 10;

	@Override
	protected String getNome() {
		return "i";
	}

	@Override
	protected void desenhar() {
		for (int i=0; i<size; i++){
			for (int j=0;j<size; j++){
				if(i==0 || i==(size-1)){
					System.out.print("*");
				} else {
					if (j==0 || j==(size-1)){
						System.out.print("*");
					}else {
						if(i==j|| j+i==(size-1)){
							System.out.print("*");
						}else {	
						System.out.print(" ");
						}
					}
				}
			}
			System.out.print("\n");
		}
	}

}
