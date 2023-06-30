package progetto;

public class Audio extends Multimedia implements InterfaceRiproduzione {

	private int volumeAudio;
	private int durataAudio;

	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volumeAudio = volume;
		this.durataAudio = durata;
	}

	@Override
	public void play() {
		for (int i = 0; i < durataAudio; i++) {
			String puntiEsclamativi = "!".repeat(volumeAudio);
			System.out.println(titolo + puntiEsclamativi);
		}
	}

	@Override
	public void abbassaVolume() {

		if (volumeAudio > 0) {
			volumeAudio--;
		}
	}

	@Override
	public void alzaVolume() {

		volumeAudio++;
	}

}
