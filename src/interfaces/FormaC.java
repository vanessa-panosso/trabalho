package interfaces;

class FormaC implements Desenho {

public static int size = 10;

@Override
public void desenha (){
	System.out.println("c)\n\n");
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
