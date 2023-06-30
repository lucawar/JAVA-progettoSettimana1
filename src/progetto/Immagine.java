package progetto;

public class Immagine extends Multimedia implements InterfaceLuminosita, InterfaceImmagine {

	private int luminositaImg;

	public Immagine(String titolo, int luminositaImg) {
		super(titolo);
		this.luminositaImg = 0;
	}

	@Override
	public void aumentaLuminosita() {

		luminositaImg++;

	}

	@Override
	public void diminuisciLuminosita() {

		if (luminositaImg > 0) {
			luminositaImg--;
		}

	}

	@Override
	public void show() {

		String asterischi = "*".repeat(luminositaImg);
		System.out.println(titolo + asterischi);
	}
}
