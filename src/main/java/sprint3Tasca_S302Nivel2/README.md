# Sprint3Tasca_S302Nivel2 - Patrón Observer: Gestión de Cambios en Bolsa

## Descripción - Enunciado del ejercicio

Este proyecto implementa en Java un sistema de notificación de cambios en la bolsa utilizando el patrón de diseño **Observer**.  
La aplicación permite que un **Broker (Observable / Subject)** notifique a múltiples agencias o firmas de bolsa (**Observers**) cuando el estado de la bolsa cambia (sube o baja) o cuando se actualiza el índice de acciones.

El sistema permite:

- **Push y Pull**:
    - **Push**: El Subject envía directamente los datos a los Observers.
    - **Pull**: El Observer consulta los datos del Subject según necesite.

- **Múltiples Observers**: Se pueden registrar varias agencias o firmas de bolsa que reaccionan de manera independiente a los cambios.

- **Encapsulación**: La clase `Broker` gestiona la lista de Observers y el envío de notificaciones, ocultando los detalles internos.

- **Flexibilidad**: Se pueden añadir nuevas agencias u Observers fácilmente, sin modificar la lógica del Broker.

El ejercicio demuestra:

- Implementación del patrón Observer paso a paso.
- Diferencias entre los métodos Push y Pull.
- Uso de interfaces y encapsulación en Java.

---

## Tecnologías Utilizadas

- Java 8+ (compatible hasta Java 23)
- JDK estándar (sin dependencias externas)
- IDE recomendado: IntelliJ IDEA / VS Code / Eclipse (opcional)

---

## Requisitos

- Tener instalado Java JDK 8 o superior
- IDE o terminal para compilar y ejecutar Java

---

## Estructura del Proyecto

sprint3Tasca_S302Nivel2/
├── StockState.java → Enum de estados de la bolsa (UP, DOWN)
├── Subject.java → Interfaz del Subject (Observable)
├── Observer.java → Interfaz del Observer con métodos push y pull
├── Broker.java → Implementación del Subject, gestiona Observers
├── StockAgency.java → Observer que implementa push
├── BrokerageFirm.java → Observer que implementa pull
├── stockClient.java → Clase principal con main() – punto de entrada

yaml
Copiar código

---

## Instalación

Clona o descarga el proyecto:

```
git clone <tu-repo-url>
cd JavaSprint3_2Patterns2

```
Abre en tu IDE o usa la terminal.

## Ejecución
Opción 1: Desde terminal

```
javac sprint3Tasca_S302Nivel2/*.java
java sprint3Tasca_S302Nivel2.stockClient

```
Opción 2: En IDE

Ejecuta directamente la clase stockClient.java.

Uso del Sistema
Crear instancias de Observers (StockAgency, BrokerageFirm).

Crear instancia del Broker (Subject) y registrar los Observers.

Cambiar datos del Broker con setData(StockState, stockIndex).

Los Observers reciben la notificación según el método push o pull que implementen.

Ejemplo de uso en stockClient.java:

```
Observer observerPush = new StockAgency();
Observer observerPull = new BrokerageFirm();

Broker broker = new Broker(StockState.DOWN, 3500);

broker.register(observerPush);
broker.register(observerPull);

broker.setData(StockState.UP, 4100);

```
Salida esperada:


```
StockAgency : The stock state is UP
StockAgency : The stock index now is 4100

BrokerageFirm : The stock index now is 4100

```
## ontribuciones
¡Bienvenidas! Sigue estos pasos:

Haz un fork del proyecto.

Crea una rama para tu mejora:


```
git checkout -b feature/nueva-agencia

```
Realiza tus cambios y haz commit:

```
git commit -m "Añade un nuevo Observer"

```
Haz push y Pull Request.