package proiect;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

enum Categorie_speciala {
	Niciuna,
	Fragil,
	Pretios,
	Periculos
}

enum Status {
	In_proces,
	Aprobare,
	Achitat,
	In_tranzit_direct,
	In_asteptare_destinatar,
	Timp_prelungit,
	Timp_prelungit_achitat,
	In_tranzit_retur,
	Retur_achitare,
	In_asteptare_expeditor,
	Transmis,
	Respins,
	Refuz
}

public class Colet_clasa {
	private String Nume_expeditor;
	private String Prenume_expeditor;
	private String Nr_telefon_expeditor;
	private String Adresa_expeditor;
	private String Oras_expeditor;
	private String Nume_destinatar;
	private String Prenume_destinatar;
	private String Nr_telefon_destinatar;
	private String Adresa_destinatar;
	private String Oras_destinatie;
	private Status Status;
	private double Greutate;	
	private Categorie_speciala Categorie;
	private int Timp;
	private double Distanta;
	private int Pret;
	private String Client;
	private String Nume_colet;
	private String Cod;
	private String Ruta;
	private Calendar Data_de_pornire;
	private Calendar Data_de_sosire;
	private Calendar Data_limita;
	private int Pret_suplimentar;
	private String Locatie;
	
	public Colet_clasa() {}
	public Colet_clasa(String Nume_expeditor, String Prenume_expeditor, String Nr_telefon_expeditor, String Adresa_expeditor, String Oras_expeditor,
			String Nume_destinatar, String Prenume_destinatar, String Nr_telefon_destinatar, String Adresa_destinatar, String Oras_destinatie,
			Status Status, double Greutate, Categorie_speciala Categorie, int Timp, double Distanta, int Pret, String Client, String Nume_colet, 
			String Cod, String Ruta, Calendar Data_de_pornire, Calendar Data_de_sosire, Calendar Data_limita, int Pret_suplimentar, String Locatie)
	{
		this.Nume_expeditor = Nume_expeditor;
		this.Prenume_expeditor = Prenume_expeditor;
		this.Nr_telefon_expeditor = Nr_telefon_expeditor;
		this.Adresa_expeditor = Adresa_expeditor;
		this.Oras_expeditor = Oras_expeditor;
		this.Nume_destinatar = Nume_destinatar;
		this.Prenume_destinatar = Prenume_destinatar;
		this.Nr_telefon_destinatar = Nr_telefon_destinatar;
		this.Adresa_destinatar = Adresa_destinatar;
		this.Oras_destinatie = Oras_destinatie;
		this.Status = Status;
		this.Greutate = Greutate;
		this.Categorie = Categorie;	
		this.Timp = Timp;
		this.Distanta = Distanta;
		this.Pret = Pret;
		this.Client = Client;
		this.Nume_colet = Nume_colet;
		this.Cod = Cod;
		this.Ruta = Ruta;
		this.Data_de_pornire = Data_de_pornire;
		this.Data_de_sosire = Data_de_sosire;
		this.Data_limita = Data_limita;
		this.Pret_suplimentar = Pret_suplimentar;
		this.Locatie = Locatie;
	}

	public void Salvare_fisier() throws IOException {
		FileWriter fw = new FileWriter("Colete.txt", true);
		String str1, str2, str3;
		if (Data_de_pornire == null)
			str1 = null;
		else
			str1 = String.valueOf(Data_de_pornire.get(Calendar.HOUR_OF_DAY) + "/" + Data_de_pornire.get(Calendar.MINUTE) +  "/" + 
			Data_de_pornire.get(Calendar.DAY_OF_MONTH) + "/" + Data_de_pornire.get(Calendar.MONTH) +  "/" + 
			Data_de_pornire.get(Calendar.YEAR));
		if (Data_de_sosire == null)
			str2 = null;
		else
			str2 = String.valueOf(Data_de_sosire.get(Calendar.HOUR_OF_DAY) + "/" + 
					Data_de_sosire.get(Calendar.MINUTE) +  "/" + Data_de_sosire.get(Calendar.DAY_OF_MONTH) + "/" + 
					Data_de_sosire.get(Calendar.MONTH) +  "/" + Data_de_sosire.get(Calendar.YEAR));
		if (Data_limita == null)
			str3 = null;
		else
			str3 = String.valueOf(Data_limita.get(Calendar.DAY_OF_MONTH) + "/" + Data_limita.get(Calendar.MONTH) +  "/" + 
					Data_limita.get(Calendar.YEAR));
		fw.write("\n" + Nume_expeditor + ";" + Prenume_expeditor + ";" + Nr_telefon_expeditor + ";" + Adresa_expeditor + ";" + Oras_expeditor + ";" + 
				Nume_destinatar + ";" + Prenume_destinatar + ";" + Nr_telefon_destinatar + ";" + Adresa_destinatar + ";" + Oras_destinatie + ";" + 
				Status + ";" + Greutate + ";" + Categorie + ";" +  Timp + ";" + Distanta + ";" + Pret + ";"+ Client + ";" + Nume_colet + ";"+ Cod + ";" +
				Ruta + ";" + str1 + ";" + str2 + ";" + str3 + ";" + Pret_suplimentar + ";" + Locatie);
		fw.close();
	}
	
	public String getNume_expeditor() {
		return Nume_expeditor;
	}
	public String getPrenume_expeditor() {
		return Prenume_expeditor;
	}
	public String getNr_telefon_expeditor() {
		return Nr_telefon_expeditor;
	}
	public String getAdresa_expeditor() {
		return Adresa_expeditor;
	}
	public String getOras_expeditor() {
		return Oras_expeditor;
	}
	public String getNume_destinatar() {
		return Nume_destinatar;
	}
	public String getPrenume_destinatar() {
		return Prenume_destinatar;
	}
	public String getNr_telefon_destinatar() {
		return Nr_telefon_destinatar;
	}
	public String getAdresa_destinatar() {
		return Adresa_destinatar;
	}
	public String getOras_destinatie() {
		return Oras_destinatie;
	}
	public String getCod() {
		return Cod;
	}
	public String getClient() {
		return Client;
	}
	public Status getStatus() {
		return Status;
	}
	public double getGreutate() {
		return Greutate;
	}
	public Categorie_speciala getCategorie() {
		return Categorie;
	}
	public int getTimp() {
		return Timp;
	}
	public double getDistanta() {
		return Distanta;
	}
	public int getPret() {
		return Pret;
	}
	public String getNume_colet() {
		return Nume_colet;
	}
	public String getRuta() {
		return Ruta;
	}
	public Calendar getData_de_pornire() {
		return Data_de_pornire;
	}
	public Calendar getData_de_sosire() {
		return Data_de_sosire;
	}
	public Calendar getData_limita() {
		return Data_limita;
	}
	public int getPret_suplimentar() {
		return Pret_suplimentar;
	}
	public String getLocatie() {
		return Locatie;
	}
	
	public void setStatus(Status status) {
		Status = status;
	}
	public void setGreutate(double greutate) {
		Greutate = greutate;
	}
	public void setCategorie(Categorie_speciala categorie) {
		Categorie = categorie;
	}
	public void setTimp(int timp) {
		Timp = timp;
	}
	public void setDistanta(double distanta) {
		Distanta = distanta;
	}
	public void setPret(int pret) {
		Pret = pret;
	}
	public void setCod(String cod) {
		Cod = cod;
	}
	public void setRuta(String ruta) {
		Ruta = ruta;
	}
	public void setData_de_pornire(Calendar data_de_pornire) {
		Data_de_pornire = data_de_pornire;
	}
	public void setData_de_sosire(Calendar data_de_sosire) {
		Data_de_sosire = data_de_sosire;
	}
	public void setData_limita(Calendar data_limita) {
		Data_limita = data_limita;
	}
	public void setPret_suplimentar(int pret_suplimentar) {
		Pret_suplimentar = pret_suplimentar;
	}
	public void setLocatie(String locatie) {
		Locatie = locatie;
	}
	
}