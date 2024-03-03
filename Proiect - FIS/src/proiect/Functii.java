package proiect;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;

public class Functii {
	
	public static void Salvare_fisier_tot(ArrayList<Colet_clasa> colete) throws FileNotFoundException {
		PrintStream writer = new PrintStream("Colete.txt");
		String str1, str2, str3;
		for (int i = 0; i < colete.size(); i++)
		{
			if (colete.get(i).getData_de_pornire() == null)
				str1 = null;
			else
				str1 = String.valueOf(colete.get(i).getData_de_pornire().get(Calendar.HOUR_OF_DAY) + "/" + colete.get(i).getData_de_pornire().get(Calendar.MINUTE) +  "/" + 
						colete.get(i).getData_de_pornire().get(Calendar.DAY_OF_MONTH)+ "/" + colete.get(i).getData_de_pornire().get(Calendar.MONTH) +  "/" + 
						colete.get(i).getData_de_pornire().get(Calendar.YEAR));
			if (colete.get(i).getData_de_sosire() == null)
				str2 = null;
			else
				str2 = String.valueOf(colete.get(i).getData_de_sosire().get(Calendar.HOUR_OF_DAY) + "/" + 
						colete.get(i).getData_de_sosire().get(Calendar.MINUTE) +  "/" + colete.get(i).getData_de_sosire().get(Calendar.DAY_OF_MONTH) + "/" + 
						colete.get(i).getData_de_sosire().get(Calendar.MONTH) +  "/" + colete.get(i).getData_de_sosire().get(Calendar.YEAR));
			if (colete.get(i).getData_limita() == null)
				str3 = null;
			else
				str3 = String.valueOf(colete.get(i).getData_limita().get(Calendar.DAY_OF_MONTH) + "/" + colete.get(i).getData_limita().get(Calendar.MONTH) +  "/" + 
						colete.get(i).getData_limita().get(Calendar.YEAR));
			writer.print("\n" + colete.get(i).getNume_expeditor() + ";" + colete.get(i).getPrenume_expeditor() + ";" + colete.get(i).getNr_telefon_expeditor() + ";" + 
					colete.get(i).getAdresa_expeditor() + ";" + colete.get(i).getOras_expeditor() + ";" + colete.get(i).getNume_destinatar() + ";" + 
					colete.get(i).getPrenume_destinatar() + ";" + colete.get(i).getNr_telefon_destinatar() + ";" + colete.get(i).getAdresa_destinatar() +
					";" + colete.get(i).getOras_destinatie() + ";" + colete.get(i).getStatus() + ";" + colete.get(i).getGreutate() + ";" + 
					colete.get(i).getCategorie() + ";" +  colete.get(i).getTimp() + ";" + colete.get(i).getDistanta() + ";" + colete.get(i).getPret() +
					";"+ colete.get(i).getClient() + ";" + colete.get(i).getNume_colet() + ";"+ colete.get(i).getCod() + ";" + colete.get(i).getRuta() +
					";" + str1 + ";" + str2 + ";" + str3 + ";" + colete.get(i).getPret_suplimentar() + ";" + colete.get(i).getLocatie());
		}
		writer.close();
	}

}
