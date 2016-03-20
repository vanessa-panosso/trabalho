package interfaces;

public class FormaH implements Desenho {
	public static int size=10;

	@Override
	public void desenha() {
		System.out.println("h)\n\n");
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(i==0||i==(size-1)||i==j|| i+j==size){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
