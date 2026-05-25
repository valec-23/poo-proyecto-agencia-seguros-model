import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCodigoCliente("CLI-001");
        cliente.setTipoCliente("Natural");
        cliente.setFechaRegistro(LocalDate.now());

        Agente agente = new Agente();
        agente.setCodigoAgente("AG-001");
        agente.setSucursal("Sucursal Centro");

        Seguro seguro = new Seguro();
        seguro.setNombreSeguro("Seguro general");
        seguro.setTipoSeguro("General");

        Poliza poliza = new Poliza();
        poliza.setIdPoliza(1);
        poliza.setNumeroPoliza("POL-001");
        poliza.setFechaInicio(LocalDate.now());
        poliza.setFechaFin(LocalDate.now().plusYears(1));
        poliza.setEstadoPoliza("Activa");

        Reclamo reclamo = new Reclamo();
        reclamo.setIdReclamo(1);
        reclamo.setNumeroReclamo("REC-001");
        reclamo.setFechaReclamo(LocalDate.now());
        poliza.getReclamoList().add(reclamo);

        System.out.println("Cliente: " + cliente.getCodigoCliente());
        System.out.println("Agente: " + agente.getCodigoAgente());
        System.out.println("Seguro: " + seguro.getNombreSeguro());
        System.out.println("Poliza: " + poliza.getNumeroPoliza());
        System.out.println("Reclamo: " + reclamo.getNumeroReclamo());

        poliza.calcularPrima();
        reclamo.detectarFraude();
    }
}
