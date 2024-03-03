package proiect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Algoritmul_lui_Dijkstra {

	public static String[] Parcurs(String Oras_expeditor, String Oras_destinatie) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("Rute.txt"));
		String str = reader.readLine();
		String[] str1;
		String[] graf_chei = str.split(" ");

		int i, j, N = graf_chei.length;
		double[] D = new double[N];
		int[] D1 = new int[N];
		String[] T = new String[N];
		double[][][] graf_distanta_timp = new double[N][N][2];
        //int[][] graf_timp = new int[N][N];
        String[][] graf_categorie = new String[N][N];
        String[][] graf_orar = new String[N][N];
		double[] min1 = new double[2];
		int poz1 = 0, poz2 = 0;
		ArrayList<String> T1 = new ArrayList<String>();

		for(i = 0; i < N; i++)
		{
			str = reader.readLine();
			str1 = str.split(" ");
			for(j = 0; j < N; j++)
			{
				graf_distanta_timp[i][j][0] = Double.parseDouble(str1[j]);
			}
		}
		reader.readLine();
		for(i = 0; i < N; i++)
		{
			str = reader.readLine();
			str1 = str.split(" ");
			for(j = 0; j < N; j++)
			{
				graf_distanta_timp[i][j][1] = Integer.parseInt(str1[j]);
			}
		}
		reader.readLine();
		for(i = 0; i < N; i++)
		{
			str = reader.readLine();
			graf_categorie[i] = str.split(" ");
		}
		reader.readLine();
		for(i = 0; i < N; i++)
		{
			str = reader.readLine();
			graf_orar[i] = str.split(" ");
		}
		
		for (i = 0; i < graf_chei.length; i++)
		{
			if (graf_chei[i].equals(Oras_expeditor))
				poz1 = i;
			if (graf_chei[i].equals(Oras_destinatie))
				poz2 = i;
		}
		for (i = 0; i < N; i++)
		{
			T[i] = graf_chei[poz1];
			if (graf_distanta_timp[poz1][i][0] > 0)
			{
				D[i] = graf_distanta_timp[poz1][i][0];
				D1[i] = (int) graf_distanta_timp[poz1][i][1];
			}
			else
			{
				D[i] = Integer.MAX_VALUE;
				D1[i] = Integer.MAX_VALUE;
			}
		}
		D[poz1] = 0;
		D1[poz1] = 0;
		for (j = 0; j < N - 1; j++)
		{
			min1[0] = Integer.MAX_VALUE;
			min1[1] = 0;
			for (i = 0; i < N; i++)
			{
				if (D[i] > 0)
				{
					if (min1[0] > D[i])
					{
						min1[0] = D[i]; 
						min1[1] = i;
					}
				}
			}
			for (i = 0; i < N; i++) 
			{
				if (graf_distanta_timp[(int) min1[1]][i][0] > 0)
					if (D[i] > (D[(int) min1[1]] + graf_distanta_timp[(int) min1[1]][i][0]))
					{
						D[i] = D[(int) min1[1]] + graf_distanta_timp[(int) min1[1]][i][0];
						D1[i] = (int) (D1[(int) min1[1]] + graf_distanta_timp[(int) min1[1]][i][1]);
						T[i] = graf_chei[(int) min1[1]];
					}
			}
			D[(int) min1[1]] = -D[(int) min1[1]];
		}
		
		for (i = 0; i < N; i++)
		{
			if (D[i] != Integer.MAX_VALUE && D[i] != 0)
				D[i] = -D[i];
		}	
		String[] ruta_info = new String[5];
		int poz3 = poz2;
		int poz4 = poz3;
		T1.add(Oras_destinatie);
		for (i = 0; i < N; i++)
		{
			if (!(T[poz3].equals(Oras_expeditor)))
			{
				T1.add(T[poz3]);
				poz4 = poz3;
				for (j = 0; j < N; j++)
				{
					if(graf_chei[j].equals(T[poz4]))
						poz3 = j;
				}
			}
		}
		if (!(Oras_destinatie.equals(Oras_expeditor)))
			T1.add(Oras_expeditor);
		str = "";
		for (i = T1.size(); i > 0; i--)
		{
			str += T1.get(i - 1) + " ";
		}
		ruta_info[0] = str;
		ruta_info[1] = String.valueOf(D[poz2]);
		ruta_info[2] = String.valueOf(D1[poz2]);
		ruta_info[3] = String.valueOf(graf_categorie[poz1][poz2]);
		ruta_info[4] = String.valueOf(graf_orar[poz1][poz2]);
		return ruta_info;
	}
	
	public static void main(String[]args) throws IOException {
		String[] ruta = Parcurs("Timisoara", "Oradea");
		for (int i = 0; i < ruta.length; i++)
		{
			System.out.println(ruta[i]);
		}
	}
}
