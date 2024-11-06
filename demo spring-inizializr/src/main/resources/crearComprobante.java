@PostMapping
public ResponseEntity<?> crearComprobante(@RequestBody ComprobanteRequest request) {
    try {
        // Lógica para crear el comprobante
        return ResponseEntity.ok("Comprobante creado exitosamente"); // Código 200
    } catch (DataConflictException e) {
        // Si hay un conflicto, por ejemplo, un comprobante ya existente con ese ID
        return ResponseEntity.status(HttpStatus.CONFLICT).body("No se pudo crear el comprobante debido a un conflicto"); // Código 409
    }
}
