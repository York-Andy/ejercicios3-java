package empresa;

import java.time.LocalDate;

public final class TrabajoPintura extends Servicio {

    private String edificaion;
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(double superficie, double precioPintura, String trabajador, LocalDate fechaInicio, String cliente) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    @Override
    public double costeMaterial() {
        return (superficie / 7.8) * precioPintura;
    }

    @Override
    public double costeManoObra() {
        return (superficie / 10) * 9.5;
    }

    @Override
    public double costeTotal() {
        if (superficie < 50) {
            return (costeManoObra() + costeMaterial()) + costeAdicional();
        } else {
            return costeManoObra() + costeMaterial();
        }
    }

    public double costeAdicional(){
        if (superficie < 50) {
        return (costeManoObra() + costeMaterial()) * 0.15;
        } else {
            return 0.0;            
        }
    }
    
    @Override
    public String detalleServicio() {
       return "TRABAJO DE PINTURA" +
               "Cliente: " + cliente +
               "Fecha de inicio: " + fechaInicio +
               "---------------------------------"+
               "Pintor: "+ trabajador +
               "Coste Material...."+costeMaterial()+
               "Coste Mano Obra."+costeManoObra()+
               "Coste Adicional.."+costeAdicional()+
               "TOTAL: ........."+costeTotal()+
               "------------------------------------";               
    }

    public String getEdificaion() {
        return edificaion;
    }

    public void setEdificaion(String edificaion) {
        this.edificaion = edificaion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

}
