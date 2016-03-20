package classeabstrata;

 class FormaD extends DesenhoAbstrato {
	public static int size = 10;

	@Override
	protected String getNome() {
		return "d";
	}

	@Override
	protected void desenhar() {
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
