package chiarafais.entities;

import chiarafais.enums.EventoType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("partita_di_calcio")
public class PartitaDiCalcio extends Evento{

    @Column(nullable = false)
    private String squadraDiCasa;
    @Column(nullable = false)
    private String squadraOspite;
    private String squadraVincente;
    @Column(nullable = false)
    private int numeroGolSquadraDiCasa;
    @Column(nullable = false)
    private int numeroGolSquadraOspite;

    public PartitaDiCalcio(){

    };


    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, EventoType tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public int getNumeroGolSquadraDiCasa() {
        return numeroGolSquadraDiCasa;
    }

    public void setNumeroGolSquadraDiCasa(int numeroGolSquadraDiCasa) {
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getNumeroGolSquadraOspite() {
        return numeroGolSquadraOspite;
    }

    public void setNumeroGolSquadraOspite(int numeroGolSquadraOspite) {
        this.numeroGolSquadraOspite = numeroGolSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numeroGolSquadraDiCasa=" + numeroGolSquadraDiCasa +
                ", numeroGolSquadraOspite=" + numeroGolSquadraOspite +
                '}';
    }
}
