package progetto;

public class Video extends Multimedia implements InterfaceRiproduzione, InterfaceLuminosita {

	private int volumeVideo;
	private int luminositaVideo;
	private int durataVideo;

	public Video(String titolo, int volume, int luminosita, int durata) {
		super(titolo);
		this.volumeVideo = volume;
		this.luminositaVideo = luminosita;
		this.durataVideo = durata;
	}

	@Override
	public void play() {
		for (int i = 0; i < durataVideo; i++) {
			String puntiInterrogativi = "?".repeat(volumeVideo);
			String asterischi = "*".repeat(luminositaVideo);
			System.out.println(titolo + puntiInterrogativi + asterischi);
		}

	}

	@Override
	public void abbassaVolume() {

		if (volumeVideo > 0) {
			volumeVideo--;
		}

	}

	@Override
	public void alzaVolume() {

		volumeVideo++;

	}

	@Override
	public void aumentaLuminosita() {

		luminositaVideo++;
	}

	@Override
	public void diminuisciLuminosita() {

		if (luminositaVideo > 0) {
			luminositaVideo--;
		}
	}
}
