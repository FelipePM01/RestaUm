package resta_um;

public class Peca {
	private Tabuleiro tab;
	private String posicao;
	public Peca(Tabuleiro tab,String posicao) {
		this.tab=tab;
		this.posicao=posicao;
	}
	public void mover(String destino) {
		tab.setPosition(destino, this);
		tab.setPosition(posicao, null);
		if(destino.charAt(0)==posicao.charAt(0)) {
			tab.setPosition(""+(char)(destino.charAt(0))+(char)((destino.charAt(1)+posicao.charAt(1))/2),null);
		}
		else {
			tab.setPosition(""+(char)((destino.charAt(0)+posicao.charAt(0))/2)+""+(char)(destino.charAt(1)),null);
		}
		
	}
}
