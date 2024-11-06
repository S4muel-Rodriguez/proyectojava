public class ComprobanteRequest {
    private Cliente cliente;
    private List<Linea> lineas;

    // Getters y setters
}

public class Cliente {
    private Long clienteId;
    // Getters y setters
}

public class Linea {
    private int cantidad;
    private Producto producto;
    // Getters y setters
}

public class Producto {
    private Long productoId;
    // Getters y setters
}
