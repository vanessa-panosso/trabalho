package classeabstrata;

public class FormaA extends DesenhoAbstrato {
	public static int size = 8;
	@Override
	protected String getNome() {
		return "a";
	}

	@Override
	protected void desenhar() {
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
