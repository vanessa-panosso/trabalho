package classeabstrata;

class FormaF extends DesenhoAbstrato {
	public static int size = 10;

	@Override
	protected String getNome() {
		
		return "f";
	}

	@Override
	protected void desenhar() {
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				if (i==0 || i==(size-1)){
					System.out.print("*");
				}else{
					if (i==j){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}

}
