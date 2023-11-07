package empresa;

import java.time.LocalDate;

public final class RevisionAlarma extends Servicio {

    private int numAlarmas;

    public RevisionAlarma(int numAlarmas, LocalDate fechaInicio, String cliente) {
        super("Revisor Especialista Contraincendios", fechaInicio, cliente);
        this.numAlarmas = numAlarmas;
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (numAlarmas / 3) * 40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        return "REVISION PERIODICA ALARMAS CONTRAINCENDIOS"
                + "Cliente: " + cliente
                + "Fecha revision: " + fechaInicio
                + "--------------------------------------------------------------------"
                + "TOTAL: ......." + costeTotal()
                + "--------------------------------------------------------------------";
    }

    public int getNumAlarmas() {
        return numAlarmas;
    }

    public void setNumAlarmas(int numAlarmas) {
        this.numAlarmas = numAlarmas;
    }

}
