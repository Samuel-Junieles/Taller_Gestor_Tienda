# Sistema de Gestión de Inventario para una Tienda

## Cómo Ejecutar el Programa

1. **Prerrequisitos:**
   - Debes tener instalado el (JDK) en tu sistema.
   - Un IDE como IntelliJ IDEA.

2. **Clonar el Repositorio:**

   git clone https://github.com/Samuel-Junieles/Taller_Gestor_Tienda.git
  
3. **Compilar y Ejecutar:**

   - Abre una terminal y navega a la carpeta que contiene los archivos fuente.
   - Compila el archivo principal: javac Principal/Tienda.java

4. **Interacción con el Programa:**

   - El programa presenta un menú en la consola que permite realizar varias operaciones de gestión de inventario.

# Funcionalidades Implementadas

1. **Clase Producto Atributos:**

 - ID: Identificador único del producto.
 - Nombre: Nombre del producto.
 - Precio: Precio del producto.
 - cantidadEnInventario: Cantidad disponible en el inventario.
Métodos:

Getters y setters para los atributos.
mostrarInformacion(): Muestra la información detallada del producto.

2. **Clase Perecedero (Extends Producto) Atributos Adicionales:**

 - fechaDeCaducidad: Fecha de caducidad del producto.
 - temperaturaDeAlmacenamiento: Temperatura de almacenamiento recomendada.
Métodos:

Getters y setters para los atributos adicionales.
Sobrescribe mostrarInformacion() para incluir la fecha de caducidad y la temperatura de almacenamiento.

3. **Clase NoPerecedero (Extends Producto) Atributos Adicionales:**

 - MesDeGarantia: Meses de garantía del producto.
Métodos:

Getters y setters para el atributo adicional.
Sobrescribe mostrarInformacion() para incluir la garantía del producto.

4. **Clase GestorInventario Atributos:**

 - productos: Lista de productos en el inventario.

 - inventarioTemporal: Arreglo para almacenar productos eliminados temporalmente.

 - indiceInventario: Índice para el arreglo de inventario temporal.

**Métodos:**

   - AgregarProducto(Producto producto): Agrega un producto al inventario.

   - BuscarProducto(int ID): Busca un producto por su ID y lo retorna.

   - GenerarInforme(): Genera un informe detallado de todos los productos en el inventario.

   - EliminarProducto(int ID): Elimina un producto del inventario y lo guarda en el inventario temporal.

   - ModificarProducto(int ID, Producto nuevoProducto): Modifica un producto existente en el inventario.

5. **Clase Tienda (Clase Principal):**

Método main para ejecutar el programa.

Muestra un menú de opciones:
1. Agregar Producto
2. Modificar Producto
3. Eliminar Producto
4. Buscar Producto por ID
5. Generar Informe de Productos
6. Salir

# Aplicación de los Principios de Poo en este proyecto!

**1. Encapsulación:**

La encapsulación se utiliza para ocultar el estado interno de los objetos y exponer solo las funcionalidades necesarias a través de métodos públicos. En el proyecto:

Clases Producto, Perecedero y NoPerecedero: Los atributos como ID, Nombre, Precio, cantidadEnInventario están privados, y se accede a ellos a través de métodos getters y setters. Esto asegura que el estado de los objetos solo pueda ser modificado de manera controlada.
Método mostrarInformacion(): Permite a las clases derivadas como Perecedero y NoPerecedero mostrar la información de manera adecuada, sin exponer directamente los atributos.

**2. Herencia:**

La herencia permite crear nuevas clases basadas en clases existentes, promoviendo la reutilización de código. En el proyecto:

Clase Producto: Es la clase base que define los atributos y métodos comunes para todos los tipos de productos.
Clases Perecedero y NoPerecedero: Heredan de Producto y añaden atributos específicos (fechaDeCaducidad y temperaturaDeAlmacenamiento para Perecedero; MesDeGarantia para NoPerecedero). Esto evita la duplicación de código y permite extender la funcionalidad de la clase base.

**3. Polimorfismo:**

El polimorfismo permite a las clases derivadas proporcionar una implementación específica de métodos que ya están definidos en su clase base. En el proyecto:

Método mostrarInformacion(): En la clase base Producto y las clases derivadas Perecedero y NoPerecedero, este método se sobrescribe para proporcionar una implementación específica que muestra la información relevante de acuerdo con el tipo de producto. Esto permite tratar a todos los productos de manera uniforme a través de referencias de tipo Producto, mientras se accede a la información específica del tipo de producto.

**4. Abstracción:**

La abstracción permite simplificar la complejidad ocultando los detalles de implementación y mostrando solo las funcionalidades esenciales. En el proyecto:

Clase GestorInventario: Encapsula la lógica de gestión del inventario, como agregar, buscar, eliminar y modificar productos. Los usuarios del GestorInventario interactúan con estos métodos sin preocuparse por los detalles internos de cómo se manejan los productos.
Interacción con Producto: A través de métodos como AgregarProducto y BuscarProducto, se facilita la manipulación de productos sin necesidad de conocer los detalles internos de cada tipo de producto.

# Contribuyentes
By Samuel Junieles (Samuel-Junieles)
