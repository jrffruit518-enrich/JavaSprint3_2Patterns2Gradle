# 📄 Descripción
Este proyecto contiene los ejercicios de Java correspondientes a Nivel 1 dentro del módulo JavaSprint3_2Patterns2.

## Nivel 1: carpeta sprint3Tasca_S302Nivel1
Implementa un sistema de construcción de pizzas personalizadas utilizando el patrón Builder, que permite crear pizzas con tamaño, tipo de masa y combinaciones de toppings predefinidos y adicionales.


## Nivel 2: carpeta sprint3Tasca_S302Nivel2 - Patrón Observer: Gestión de Cambios en Bolsa
Implementa un sistema de notificación de cambios en la bolsa utilizando el patrón Observer, que permite que un Broker notifique a múltiples agencias o firmas de bolsa (Observers) sobre cambios en el estado de la bolsa y el índice de acciones, soportando métodos push y pull.

## Nivel 3: carpeta sprint3Tasca_S302Nivel3 - Patrón Callback: Pasarela de Pago para Tienda de Zapatos
Implementa una pasarela de pago desacoplada utilizando el patrón Callback. La tienda de zapatos (ShoeStore) delega el procesamiento del pago a una PaymentGateway sin conocer los detalles del método seleccionado (tarjeta de crédito, PayPal o débito en cuenta). Cada método de pago invoca directamente el callback correspondiente (onPaymentSuccess / onPaymentFailed) en la propia tienda, devolviendo el control de forma asíncrona y permitiendo que sea la ShoeStore quien reaccione al resultado del pago (enviar los zapatos o cancelar el pedido). Demuestra un uso limpio y realista del patrón Callback con total desacoplamiento y fácil extensibilidad.


Cada tipo de pizza tiene su propio Builder (por ejemplo, HawaiianPizzaBuilder, VeggiePizzaBuilder) con receta base.

La clase MestrePizzer actúa como Director, gestionando la construcción paso a paso.

Se permite añadir toppings extras, acumular ingredientes entre pizzas o reiniciar los extras con clearBuilder().

Este ejercicio demuestra el uso de Builder, encapsulación, flexibilidad para extender nuevas recetas y buenas prácticas de Java.