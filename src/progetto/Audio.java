package progetto;

public class Audio extends Multimedia implements InterfaceRiproduzione {

	private int volume;
	private int durata;

	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
	}

	@Override
	public void play() {
		for (int i = 0; i < durata; i++) {
			String puntiEsclamativi = "!".repeat(volume);
			System.out.println(titolo + puntiEsclamativi);
		}
	}

	@Override
	public void abbassaVolume() {

		if (volume > 0) {
			volume--;
		}
	}

	@Override
	public void alzaVolume() {

		volume++;
	}

}
