package progetto;

import java.util.Scanner;

public class MainProgetto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Multimedia[] elementi = new Multimedia[5];

		for (int i = 0; i < elementi.length; i++) {
			System.out.println("Inserisci il titolo dell'elemento multimediale " + (i + 1) + ":");
			String titolo = input.nextLine();
			System.out.println("Inserisci il tipo:");
			System.out.println("1 = Audio, 2 = Video, 3 = Immagine");
			int fileMultimediale = Integer.parseInt(input.nextLine());

			switch (fileMultimediale) {
			case 1:
				System.out.println("Inserisci il volume dell'AUDIO");
				int volumeAudio = Integer.parseInt(input.nextLine());
				System.out.println("Inserisci la durata dell'AUDIO");
				int durataAudio = Integer.parseInt(input.nextLine());
				elementi[i] = new Audio(titolo, volumeAudio, durataAudio);
				break;

			case 2:
				System.out.println("Inserisci il volume del VIDEO");
				int volumeVideo = Integer.parseInt(input.nextLine());
				System.out.println("Inserisci la durata del VIDEO");
				int durataVideo = Integer.parseInt(input.nextLine());
				System.out.println("Inserisci la luminosità del VIDEO");
				int luminositaVideo = Integer.parseInt(input.nextLine());
				elementi[i] = new Video(titolo, volumeVideo, durataVideo, luminositaVideo);
				break;

			case 3:
				System.out.println("Inserisci la luminosità dell'IMMAGINE");
				int luminositaImg = Integer.parseInt(input.nextLine());
				elementi[i] = new Immagine(titolo, luminositaImg);
				break;

			default:
				System.out.println("Scelta non valida");
				i--;
				break;
			}

		}

		int decisione;
		do {
			System.out
					.println("Scegli un elemento multimediale da eseguire (1-" + elementi.length + ") o 0 per uscire:");
			decisione = Integer.parseInt(input.nextLine());

			if (decisione >= 1 && decisione <= elementi.length) {
				Multimedia elemento = elementi[decisione - 1];
				if (elemento instanceof InterfaceRiproduzione) {
					((InterfaceRiproduzione) elemento).play();
				} else if (elemento instanceof InterfaceImmagine) {
					((InterfaceImmagine) elemento).show();
				}

				System.out.println("Esegui le seguenti istruzioni per continuare:");
				System.out.println("1 = Aumenta luminosità");
				System.out.println("2 = Abbassa luminosità");
				System.out.println("3 = Aumenta volume");
				System.out.println("4 = Abbassa volume");
				System.out.println("5 = Esci");
				int opzione = Integer.parseInt(input.nextLine());
				switch (opzione) {
				case 1:
					if (elemento instanceof Video) {
						((Video) elemento).aumentaLuminosita();
					} else if (elemento instanceof Immagine) {
						((Immagine) elemento).aumentaLuminosita();
					}
					break;
				case 2:
					if (elemento instanceof Video) {
						((Video) elemento).diminuisciLuminosita();
					} else if (elemento instanceof Immagine) {
						((Immagine) elemento).diminuisciLuminosita();
					}
					break;
				case 3:
					if (elemento instanceof Video) {
						((Video) elemento).alzaVolume();
					} else if (elemento instanceof Audio) {
						((Audio) elemento).alzaVolume();
					}
					break;
				case 4:
					if (elemento instanceof Video) {
						((Video) elemento).abbassaVolume();
					} else if (elemento instanceof Audio) {
						((Audio) elemento).abbassaVolume();
					}
					break;
				case 5:
					break;
				default:
					System.out.println("ERRORE. Riprova.");
					break;
				}
			} else if (decisione != 0) {
				System.out.println("Scelta non valida. Inserisci un valore valido.");
			}
		} while (decisione != 0);

		input.close();
	}
}