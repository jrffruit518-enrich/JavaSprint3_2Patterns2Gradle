# Sprint3Tasca_S302Nivel1 - Patrón Builder: Gestión de Pizzas Personalizadas
## Descripción - Enunciado del ejercicio

Este proyecto implementa en Java un gestor de pizzas personalizadas utilizando el patrón de diseño Builder.
La aplicación permite crear pizzas con distintos tamaños, tipos de masa y combinaciones de ingredientes, manteniendo la flexibilidad de añadir extras y respetando recetas predefinidas según el tipo de pizza.

El sistema permite:

Builder y Director: Cada tipo de pizza tiene su propio Builder que establece la receta base y el Director (MestrePizzer) se encarga de construir pizzas con tamaño, masa y extras adicionales.

Recetas predefinidas: Cada Builder incluye ingredientes fijos (por ejemplo, HawaiianPizzaBuilder con jamón, piña y queso).

Extras personalizables: El cliente puede añadir toppings adicionales en cada pizza.

Gestión acumulativa o reinicio de toppings: El cliente puede optar por acumular toppings en varias pizzas o limpiar los extras con clearBuilder().

Encapsulación: La clase MestrePizzer oculta los detalles del Builder, ofreciendo un punto de control seguro para construir pizzas.

El ejercicio demuestra:

Uso correcto del patrón Builder para construir objetos complejos paso a paso.

Encapsulación y diseño orientado a objetos.

Flexibilidad para añadir nuevos tipos de pizza con mínima modificación del código.

Gestión de toppings predefinidos y extras opcionales de manera controlada.

## Tecnologías Utilizadas

Java 8+ (compatible hasta Java 23)

JDK estándar (sin dependencias externas)

IDE recomendado: IntelliJ IDEA / VS Code / Eclipse (opcional)

## Requisitos

Tener instalado Java JDK 8 o superior

IDE o terminal para compilar y ejecutar Java
```
Estructura del Proyecto
sprint3Tasca_S302Nivel2/
├── Dough.java                → Enum de tipos de masa
├── Toppings.java             → Enum de ingredientes
├── Pizza.java                → Clase principal de Pizza
├── Builder/
│   ├── PizzaBuilder.java     → Interfaz Builder
│   ├── HawaiianPizzaBuilder.java → Builder concreto para pizza hawaiana
│   ├── VeggiePizzaBuilder.java   → Builder concreto para pizza vegetariana
├── MestrePizzer.java         → Director que gestiona la construcción de pizzas
├── Client.java               → Clase principal con main() – punto de entrada
```
## Instalación

Clona o descarga el proyecto:
```
git clone https://github.com/jrffruit518-enrich/JavaSprint3_2Patterns2.git
cd JavaSprint3_2Patterns2
```

Abre en tu IDE o usa la terminal.

## Ejecución

Opción 1: Desde terminal
```
javac sprint3Tasca_S302Nivel2/*.java sprint3Tasca_S302Nivel2/Builder/*.java
java sprint3Tasca_S302Nivel2.Client
```

Opción 2: En IDE

Ejecuta directamente la clase Client.java.

Uso del Sistema

Se crean objetos MestrePizzer con un Builder concreto (por ejemplo, HawaiianPizzaBuilder).

El cliente puede construir pizzas de distinto tamaño y tipo de masa, añadiendo toppings opcionales.

Se puede limpiar los toppings adicionales con clearBuilder() antes de crear nuevas pizzas si se desea.

Se pueden construir múltiples pizzas reutilizando el mismo Builder para acumular extras, o cambiar de Builder para otro tipo de pizza.

Ejemplo de uso en Client.java:
```
HawaiianPizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
MestrePizzer mestre = new MestrePizzer(hawaiianBuilder);

Pizza pizza = mestre.buildPizza(15, Dough.THICK, Toppings.CHEESE);
Pizza pizza1 = mestre.buildPizza(18, Dough.THIN, Toppings.HAM);
mestre.clearBuilder();
Pizza pizza2 = mestre.buildPizza(21, Dough.HAND_TOSSED, Toppings.OLIVES, Toppings.MUSHROOMS);
```
## Contribuciones

¡Bienvenidas! Sigue estos pasos:

Haz un fork del proyecto

Crea una rama para tu mejora:
```
git checkout -b feature/nueva-pizza
```

Realiza tus cambios y haz commit:
```
git commit -m "Añade soporte para Pizza BBQ"
```

Haz push y Pull Request.