package com.tu_proyecto.controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comprobantes")
public class ComprobanteController {

    @PostMapping
    public ResponseEntity<?> crearComprobante(@RequestBody ComprobanteRequest request) {
        // Aquí procesas el request
        Long clienteId = request.getCliente().getClienteId();
        for (Linea linea : request.getLineas()) {
            int cantidad = linea.getCantidad();
            Long productoId = linea.getProducto().getProductoId();
            // Aquí manejas la lógica con `clienteId`, `cantidad`, y `productoId`
        }
        return ResponseEntity.ok("Comprobante creado exitosamente");
    }
}
