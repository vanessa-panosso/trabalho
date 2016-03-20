package classeabstrata;

 class FormaC extends DesenhoAbstrato {
	public static int size = 10;

	@Override
	protected String getNome() {
		return "c";
	}

	
	@Override
	protected void desenhar (){
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				if (i<=j){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
	}

}
