public class Launcher {
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.out.println("Aucun argument entr�. "
					+ "Tapez -help pour acc�der � la documentation");
			System.exit(0);
		}
		
		switch(args[0])
		{
			case "-compress":
				new ZipCompressor(args);
				break;
			case "-decompress":
				new ZipDecompressor(args[1]);
				break;
			case "-help":
				afficherAide();
				break;
			default:
				System.out.println("Argument invalide. "
						+ "Tapez -help pour acc�der � la documentation");
				break;
		}
	}
	
	private static void afficherAide() {
		System.out.println("----------- Java ZipTool - Aide -----------");
		System.out.println("Arguments possibles :");
		System.out.println("- compress nomDeLarchive nomDuFichier1 [nomDuFichier2] [etc]");
		System.out.println("	Compresse les fichiers sp�cifi�s dans l'archive sp�cifi�e");
		System.out.println("- decompress nomDeLarchive");
		System.out.println("	D�compresse l'archive sp�cifi�e dans le dossier courant");
		System.out.println("- help");
		System.out.println("	Affiche le manuel du programme");
	}
	
	
}
