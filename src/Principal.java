
public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = consulta.buscaMoneda("USD","PEN");
        System.out.println(moneda);
    }
}
