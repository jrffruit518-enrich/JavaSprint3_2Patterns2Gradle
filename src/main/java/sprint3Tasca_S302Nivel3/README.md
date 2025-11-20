# Sprint3Tasca_S302Nivel3 - Patrón Callback: Pasarela de Pago para Tienda de Zapatos
## Descripción - Enunciado del ejercicio
Este proyecto implementa en Java el patrón Callback para simular una pasarela de pago que funciona con diferentes métodos (tarjeta de crédito, PayPal o débito en cuenta) sin conocer sus detalles internos.
La ShoeStore (tienda de zapatos) inicia el pago y entrega el control a la PaymentGateway. Esta sólo reenvía la petición al método de pago seleccionado. Cuando el pago termina (éxito o fallo), el método de pago invoca el callback correspondiente, devolviendo el control a la ShoeStore, que decide qué hacer (enviar los zapatos o cancelar el pedido).
El ejercicio demuestra:

Uso correcto del patrón Callback para devolver el control de forma asíncrona
Desacoplamiento total entre pasarela, métodos de pago y tienda
La tienda implementa PaymentCallback para recibir el resultado
Fácil extensión: añadir nuevos métodos de pago no requiere modificar ni la pasarela ni la tienda

## Tecnologías Utilizadas

Java 8+ (probado hasta Java 23)
JDK estándar (sin dependencias externas)
IDE recomendado: IntelliJ IDEA / VS Code / Eclipse

## Requisitos

Java JDK 8 o superior instalado
IDE o terminal para compilar y ejecutar

Estructura del Proyecto
```
textsprint3Tasca_S302Nivel3/
├── PaymentMethod.java          → Interfaz con pay(amount, callback)
├── PaymentCallback.java        → Interfaz con onPaymentSuccess() y onPaymentFailed()
├── PaymentGateway.java         → Pasarela que sólo delega la petición
├── CreditPay.java              → Implementación: pago con tarjeta
├── PayPal.java                 → Implementación: pago con PayPal
├── BankAccountPay.java         → Implementación: débito en cuenta
├── ShoeStore.java              → Tienda que implementa PaymentCallback
├── PaymentClient.java          → Clase main con demostración
```
## Instalación y Ejecución
Desde terminal
```
javac sprint3Tasca_S302Nivel3/*.java
java sprint3Tasca_S302Nivel3.PaymentClient
```
Desde IDE
Ejecutar directamente la clase PaymentClient.java
Salida esperada
```
The shoe store is processing the purchase.
Pay by paypal
The payment is successful. The goods can be delivered

The shoe store is processing the purchase.
The payment is failed. The goods can't be delivered
```
## Contribuciones
¡Bienvenidas!

Haz fork del repositorio
Crea tu rama: 
```
git checkout -b feature/nuevo-metodo-pago
```
Commit: 
```
git commit -m "Añade Bizum como método de pago"
```
Push y abre un Pull Request