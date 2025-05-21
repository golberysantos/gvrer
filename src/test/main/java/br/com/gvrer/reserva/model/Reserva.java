package br.com.gvrer.reserva.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("reserva")
public class Reserva {
	@Id
	private long reservaid;
	private String datareserva;
	private String horarioreserva;
	private long mesa_mesaid;
	private long horariodisponivel_horarioid;
	public long getReservaid() {
		return reservaid;
	}
	public void setReservaid(long reservaid) {
		this.reservaid = reservaid;
	}
	public String getDatareserva() {
		return datareserva;
	}
	public void setDatareserva(String datareserva) {
		this.datareserva = datareserva;
	}
	public String getHorarioreserva() {
		return horarioreserva;
	}
	public void setHorarioreserva(String horarioreserva) {
		this.horarioreserva = horarioreserva;
	}
	public long getMesa_mesaid() {
		return mesa_mesaid;
	}
	public void setMesa_mesaid(long mesa_mesaid) {
		this.mesa_mesaid = mesa_mesaid;
	}
	public long getHorariodisponivel_horarioid() {
		return horariodisponivel_horarioid;
	}
	public void setHorariodisponivel_horarioid(long horariodisponivel_horarioid) {
		this.horariodisponivel_horarioid = horariodisponivel_horarioid;
	}
	
}
