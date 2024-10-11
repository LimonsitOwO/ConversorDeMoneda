# Conversor de Monedas

Este es un programa de conversión de monedas desarrollado en Java 17, que utiliza la biblioteca Gson para manejar el formato JSON. Permite a los usuarios convertir entre varias monedas utilizando tasas de cambio en tiempo real.

## Características

- Conversión entre diferentes monedas, incluyendo:
  - Peso argentino (ARS)
  - Boliviano (BOB)
  - Real brasileño (BRL)
  - Peso chileno (CLP)
  - Peso colombiano (COP)
  - Dólar estadounidense (USD)
- Interfaz de línea de comandos fácil de usar.
- Obtiene tasas de cambio de la API de ExchangeRate-API.

## Requisitos

- Java 17 o superior.
- Dependencia de Gson.

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/conversor-monedas.git
   cd conversor-monedas
   ```

2. Asegúrate de que tienes las dependencias necesarias. Si utilizas Maven, agrega la siguiente dependencia en tu archivo `pom.xml`:
   ```xml
   <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.8.9</version>
   </dependency>
   ```

## Uso

1. Compila y ejecuta el programa:
   ```bash
   javac Main.java ExchangeRate.java ExchangeRateRecord.java
   java Main
   ```

2. Sigue las instrucciones en la consola para seleccionar la moneda base y la moneda de destino.

## Ejemplo de uso

Al ejecutar el programa, se presentará un menú donde puedes seleccionar la moneda base. Luego, podrás seleccionar la moneda de destino para ver la tasa de conversión actual.

```plaintext
**********************************************
1 - ARS - Peso argentino
2 - BOB - Boliviano boliviano
3 - BRL - Real brasileño
4 - CLP - Peso chileno
5 - COP - Peso colombiano
6 - USD - Dólar estadounidense
9 - Salir
Seleccione la moneda base: 1
Seleccione la moneda de destino: 6
1 ARS = 0.0025 USD
```
