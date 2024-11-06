@RestController
@RequestMapping("/comprobantes")
public class ComprobanteController {

    @PostMapping
    public ResponseEntity<?> crearComprobante(@RequestBody ComprobanteRequest request) {
        // Aquí procesas el request. Puedes extraer `clienteId`, `cantidad`, `productoId`, etc.

        // Ejemplo simple de lógica
        Long clienteId = request.getCliente().getClienteId();
        for (Linea linea : request.getLineas()) {
            int cantidad = linea.getCantidad();
            Long productoId = linea.getProducto().getProductoId();
            // Aquí, puedes manejar la lógica de negocio con `clienteId`, `cantidad`, y `productoId`
        }

        // Retorna una respuesta adecuada
        return ResponseEntity.ok("Comprobante creado exitosamente");
    }
}
