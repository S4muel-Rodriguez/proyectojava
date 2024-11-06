1. Clona el repositorio de GitHub.
2. Importa el proyecto en IntelliJ IDEA.
3. Ejecuta el proyecto desde la clase principal de Spring Boot.
   Si usas H2, confirma que el archivo `data.sql` se carga automáticamente cuando inicias la aplicación. Esto inicializa la base de datos con datos básicos.


## Proyecto ToDoList - Comprobante API

### Descripción
Este proyecto permite la gestión de comprobantes para clientes...

### Instalación y Ejecución
1. Clona el repositorio.
2. Importa en IntelliJ IDEA.
3. Ejecuta la clase principal de Spring Boot...

### Pruebas
Para probar el endpoint, usa Postman:
1. Endpoint: `POST /comprobantes`
2. Body (JSON):
```json
{
  "cliente": {
    "clienteId": 1
  },
  "lineas": [
    {
      "cantidad": 1,
      "producto": {
        "productoId": 1
      }
    }
  ]
}



### 4. Resolución del problema de precio de producto en comprobantes

Para que la modificación del precio de un producto no afecte comprobantes previos, guarda el precio en el comprobante cuando se crea:

   - En la entidad `Linea`, agrega un atributo `precioUnitario`.
   - Al crear un `Comprobante`, guarda el precio actual del producto en `precioUnitario` de cada línea.

```java
@Entity
public class Linea {
    private int cantidad;
    private Long productoId;
    private Double precioUnitario; // Guarda el precio del producto al momento del comprobante

    // Constructor, getters y setters
}
