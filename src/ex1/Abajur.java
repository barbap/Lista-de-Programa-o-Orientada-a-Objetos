package ex1;

public class Abajur {
	private int voltagem;
	private Lampada lampada;
	private boolean estaLigado;
	
	
	public Abajur(int voltagem) {
		super();
		this.voltagem = voltagem;
	}
	
	
	
	public Abajur(int voltagem, Lampada lampada, boolean estaLigado) {
		super();
		this.voltagem = voltagem;
		this.lampada = lampada;
		this.estaLigado = estaLigado;
	}



	public int getVoltagem() {
		return voltagem;
	}



	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}



	public Lampada getLampada() {
		return lampada;
	}



	public void setLampada(Lampada lampada) {
		this.lampada = lampada;
	}


	public void trocarLampada (Lampada lampada) {
		if (estaLigado == false) {
			if (lampada.getVoltagem() == voltagem) {
				this.lampada = lampada;
			} else {
				System.out.println("Lampada de voltagem diferente!!");
			}
		} else {
			System.out.println("Desligue o abajur");
		}
		
	}
	public void removerLampada () {
		lampada = null;
	}
	
	public void ligar (Lampada lampada){
		if (lampada!=null && lampada.getVoltagem()==this.voltagem) {
		estaLigado = true;
		System.out.println("Lampada de cor " + lampada.getCor() + " está ligada "  );
		} else {
			System.out.println("Lampada não pode ligar");
		}
	}
	public void desligar (boolean estaLigado) {
		this.estaLigado = estaLigado;
	}
}
