package resta_um;

public class Tabuleiro {
	private Peca[][] tab=new Peca[7][7];
	private Peca vazio=new Peca(this,"A1");
	public Tabuleiro() {
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if((i<2 && (j<2 || j>4)) || (i>4 && (j<2 || j>4))) {
					tab[i][j]=vazio;
				}
				else {
					if(i==3 && j==3) {
						tab[i][j]=null;
					}
					else {
						tab[i][j]=new Peca(this , (String.valueOf((char)(j + 'a' )))+(7-i));
					}
				}
			}
		}
	}
	public void mover(String origem,String destino) {
		if(tab[6-(int)(origem.charAt(1)-'1')][(int)(origem.charAt(0)-'a')]!=null && tab[6-(int)(origem.charAt(1)-'1')][(int)(origem.charAt(0)-'a')]!=vazio && tab[6-(int)(destino.charAt(1)-'1')][(int)(destino.charAt(0)-'a')]) {
			if((int)(origem.charAt(0)-destino.charAt(0))==2||(int)(origem.charAt(0)-destino.charAt(0))==2) {
				String medio;
				if(destino.charAt(0)==origem.charAt(0)) {
					medio=""+(char)(destino.charAt(0))+(char)((destino.charAt(1)+origem.charAt(1))/2);
					
				}
				else {
					medio=""+(char)((destino.charAt(0)+origem.charAt(0))/2)+""+(char)(destino.charAt(1))
				}
				if(tab[6-(int)(medio.charAt(1)-'1')][(int)(medio.charAt(0)-'a')]!=null && tab[6-(int)(medio.charAt(1)-'1')][(int)(medio.charAt(0)-'a')]!=vazio)
				tab[6-(int)(origem.charAt(1)-'1')][(int)(origem.charAt(0)-'a')].mover(destino);
			}
			
		}
	}
	void setPosition(String posicao,Peca id) {
		tab[6-(int)(posicao.charAt(1)-'1')][(int)(posicao.charAt(0)-'a')]=id;
	}
	void imprimir() {
		for(int i=0;i<7;i++) {
			System.out.print((7-i)+" ");
			for(int j=0;j<7;j++) {
				if(tab[i][j]==vazio) {
					System.out.print("  ");
				}
				else {
					if(tab[i][j]==null) {
						System.out.print("- ");
					}
					else {
						System.out.print("P ");
					}
					
				}
			}
			System.out.println("");
		}
		System.out.println("  a b c d e f g");
	}
}
