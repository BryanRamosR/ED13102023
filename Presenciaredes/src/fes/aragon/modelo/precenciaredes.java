/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.aragon.modelo;
/**
 *
 * @author Usuario
 */
public class precenciaredes {
	private String redSocial;
	private String concepto;
	private String year;
	private String enero;
	private String febrero;
	private String marzo;
	private String abril;
	private String mayo;
	private String junio;
	private String julio;
	private String agosto;
	private String septiembre;
	private String octubre;
	private String noviembre;
	private String diciembre;
	public precenciaredes(String redSocial, String concepto, String year, String enero, String febrero, String marzo,
			String abril, String mayo, String junio, String julio, String agosto, String septiembre, String octubre,
			String noviembre, String diciembre) {
		super();
		this.redSocial = redSocial;
		this.concepto = concepto;
		this.year = year;
		this.enero = enero;
		this.febrero = febrero;
		this.marzo = marzo;
		this.abril = abril;
		this.mayo = mayo;
		this.junio = junio;
		this.julio = julio;
		this.agosto = agosto;
		this.septiembre = septiembre;
		this.octubre = octubre;
		this.noviembre = noviembre;
		this.diciembre = diciembre;
	}
	public String getRedSocial() {
		return redSocial;
	}
	public String getConcepto() {
		return concepto;
	}
	public String getYear() {
		return year;
	}
	public String getEnero() {
		return enero;
	}
	public String getFebrero() {
		return febrero;
	}
	public String getMarzo() {
		return marzo;
	}
	public String getAbril() {
		return abril;
	}
	public String getMayo() {
		return mayo;
	}
	public String getJunio() {
		return junio;
	}
	public String getJulio() {
		return julio;
	}
	public String getAgosto() {
		return agosto;
	}
	public String getSeptiembre() {
		return septiembre;
	}
	public String getOctubre() {
		return octubre;
	}
	public String getNoviembre() {
		return noviembre;
	}
	public String getDiciembre() {
		return diciembre;
	}
	@Override
	public String toString() {
		return "precenciaredes [redSocial=" + redSocial + ", concepto=" + concepto + ", year=" + year + ", enero="
				+ enero + ", febrero=" + febrero + ", marzo=" + marzo + ", abril=" + abril + ", mayo=" + mayo
				+ ", junio=" + junio + ", julio=" + julio + ", agosto=" + agosto + ", septiembre=" + septiembre
				+ ", octubre=" + octubre + ", noviembre=" + noviembre + ", diciembre=" + diciembre + "]";
	}
	
	
}
