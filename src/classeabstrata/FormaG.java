package classeabstrata;

public class FormaG extends DesenhoAbstrato {

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	public static int size = 10;

	@Override
	protected void desenhar() {
		for(int i=0; i<size; i++){
			for (int j=size; j>=0; j--){
				if (i==0 || i==(size-1)){
					System.out.print("*");
				}else {
					if (j==i){
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
