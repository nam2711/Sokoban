public class Launcher {
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.out.println("Aucun argument entré. "
					+ "Tapez -help pour accéder à la documentation");
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
						+ "Tapez -help pour accéder à la documentation");
				break;
		}
	}
	
	private static void afficherAide() {
		System.out.println("----------- Java ZipTool - Aide -----------");
		System.out.println("Arguments possibles :");
		System.out.println("- compress nomDeLarchive nomDuFichier1 [nomDuFichier2] [etc]");
		System.out.println("	Compresse les fichiers spécifiés dans l'archive spécifiée");
		System.out.println("- decompress nomDeLarchive");
		System.out.println("	Décompresse l'archive spécifiée dans le dossier courant");
		System.out.println("- help");
		System.out.println("	Affiche le manuel du programme");
	}
	
	
}
