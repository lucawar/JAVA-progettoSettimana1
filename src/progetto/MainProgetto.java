package progetto;

import java.util.Scanner;

public class MainProgetto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//ESERCIZIO AUDIO

		System.out.println("Inserisci il titolo dell'audio");
		String titolo = input.nextLine();

		System.out.println("Inserisci il volume dell'audio");
		int volume = Integer.parseInt(input.nextLine());

		System.out.println("Inserisci la durata dell'audio");
		int durata = Integer.parseInt(input.nextLine());

		Audio audio1 = new Audio(titolo, volume, durata);

		audio1.play();

		input.close();

	}

}
