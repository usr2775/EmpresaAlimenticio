# Farm Simulator

El proyecto Farm Simulator simula la el comprtimiento entre granjeros y clientes en un entorno de huerto y restaurante vegano mediante el uso de hilos en Java. La simulación se basa en la concurrencia y la sincronización de hilos para modelar la producción y el consumo de verduras.

## Estructura del Proyecto

- Granjero: Representa a los granjeros que plantan las verduras. Cada granjero tiene un nombre, una cantidad especifica de verdura que debe plantar y acceso a un almacén compartido para depositar las verduras
- Cliente: Simula a los clientes que consumen las verduras del restaurante. Cada cliente tiene un nombre, y se especifica la cantidad de verduras que consumirá. Al igual que los granjeros, los clientes tienen acceso al mismo almacén compartido.
- Almacen: Gestiona el almacenamiento de las verduras producidas por los granjeros. El almacén tiene una capacidad limitada y se comparte entre los productores y consumidores. Implementa métodos para depositar y consumir verduras de manera sincronizada.
- Verduras: Representa las verduras producidas por los granjeros. Cada verdura tiene un tipo, el nombre del granjero que la plantó y un tiempo de crecimiento aleatorio

## Experimento Uno

### Descripción
- Un único productor Paco y un consumidor Faustino
- Paco produce cinco verduras, y Faustino las consume todas

### Resultado
- Paco produce y deposita las verduras en el almacén.
- Faustino consume las verduras del almacén.

- ![image](https://github.com/usr2775/EmpresaAlimenticio/assets/126866083/81df4ae8-cd11-44eb-a979-cfe919d1be84)

## Experimento Dos

### Descripción
- Cambio en los parámetros de tiempo de producción (cortos) en comparación con el tiempo de consumo.

### Resultado
- No se observan cambios significativos en la salida.
- Se producen y consumen verduras de manera similar al experimento uno.
- ![image](https://github.com/usr2775/EmpresaAlimenticio/assets/126866083/9ead5594-761c-4335-994e-a95865e37090)


## Experimento Tres

### Descripción
- Establecimiento de prioridades más altas para los hilos de los productores.

### Resultado
- No se observan cambios notables en la salida en comparación con experimentos anteriores
- ![image](https://github.com/usr2775/EmpresaAlimenticio/assets/126866083/746dff98-9aea-445b-957e-3e51ef5254a1)




