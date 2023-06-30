package progetto;

public class Video extends Multimedia implements InterfaceRiproduzione, InterfaceLuminosita {

	private int volume;
	private int luminosita;
	private int durata;

	public Video(String titolo, int volume, int luminosita, int durata) {
		super(titolo);
	}

	@Override
	public void play() {

	}

	@Override
	public void abbassaVolume() {

	}

	@Override
	public void alzaVolume() {

	}

	@Override
	public void aumentaLuminosita() {

	}

	@Override
	public void diminuisciLuminosita() {

	}
}
