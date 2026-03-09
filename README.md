# Proyecto de Pruebas Automatizadas con Serenity BDD y Cucumber

Este proyecto contiene un conjunto de pruebas de UI automatizadas para el sitio web de
demostración [SauceDemo](https://www.saucedemo.com/). Las pruebas han sido desarrolladas utilizando **Serenity BDD** con
**Cucumber** y cubren las funcionalidades de inicio de sesión y la gestión del carrito de compras.

## 1. Prerrequisitos

Antes de ejecutar las pruebas, asegúrate de tener instalado y configurado lo siguiente en tu sistema:

- **Java 17**: El proyecto está configurado para usar Java 17.
- **Apache Maven**: Se utiliza para la gestión de dependencias y la ejecución de las pruebas.
- **Navegador Web**: Chrome o Firefox, ya que Serenity WebDriver los gestionará automáticamente.

### Variables de Entorno

- `JAVA_HOME`: Debe apuntar al directorio de instalación de tu JDK 17.
- `M2_HOME`: Debe apuntar al directorio de instalación de Maven.

Asegúrate de que las carpetas `bin` de Java y Maven estén incluidas en la variable `Path` de tu sistema operativo.

## 2. Ejecución de las Pruebas

Todas las pruebas se ejecutan desde la línea de comandos, ubicándote en la raíz del proyecto. El comando principal es
`mvn clean verify`, que utiliza el plugin `maven-failsafe-plugin` para ejecutar las pruebas de integración.

### Ejecutar un conjunto de pruebas por Tags

Para ejecutar las pruebas, puedes usar la propiedad `serenity.tags` para filtrar los escenarios por las etiquetas
definidas en los archivos `.feature`.

**Ejecutar los escenarios de Login:**
El runner principal está configurado para ejecutar los escenarios de Login por defecto.

```bash
mvn clean verify
```

O explícitamente:

```bash
mvn clean verify -Dserenity.tags="@Login"
```

**Ejecutar un caso de prueba específico:**
Si deseas ejecutar un único caso de prueba, puedes hacerlo especificando su etiqueta única. Por ejemplo, para ejecutar
solo el login válido (`@credencialValido`):

```bash
mvn clean verify -Dserenity.tags="@credencialValido"
```

**Ejecutar un grupo de escenarios:**
Puedes combinar etiquetas para una ejecución más específica.

- **Por tipo de escenario (OR):** Para ejecutar tanto los escenarios de credenciales válidas como inválidas.

  ```bash
  # La coma actúa como un "O" lógico
  mvn clean verify -Dserenity.tags="@credencialValido,@credencialInvalido"
  ```

- **Combinando etiquetas (AND):** Para ejecutar los "happy paths" del endpoint de Login.

  ```bash
  # La sintaxis "and" permite combinar etiquetas
  mvn clean verify -Dserenity.tags="@regresion and @Login and @happypath"
  ```

## 3. Reportes de Ejecución

Al finalizar la ejecución, Serenity BDD genera automáticamente un reporte de pruebas detallado y navegable en formato
HTML.

Puedes encontrar el reporte principal en la siguiente ruta relativa desde la raíz del proyecto:

**`target/site/serenity/index.html`**

Para visualizarlo, simplemente abre ese archivo en tu navegador web preferido. El reporte "Living Documentation"
incluye:

- Resumen de resultados de las pruebas y requisitos.
- Detalle paso a paso de cada escenario ejecutado.
- Capturas de pantalla (screenshots) para cada paso de la prueba, lo que facilita la depuración.
- Tiempos de ejecución y desglose de resultados.
