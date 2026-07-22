# Implementación de un sistema de gestión de pedidos con principios de código limpio

El equipo de desarrollo de una empresa de e-commerce necesita implementar un sistema de gestión de pedidos que cumpla con los principios de código limpio y eficiente. El sistema debe permitir la creación, modificación y cancelación de pedidos, así como el seguimiento del estado de los mismos. El objetivo es garantizar que el código sea legible, mantenible y escalable.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | aplicación de código limpio y eficiente |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-5 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del dominio y reglas de negocio

**Objetivo:** Entender las reglas de negocio y los requisitos funcionales del sistema de gestión de pedidos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica las entidades clave del dominio (pedidos, productos, clientes, etc.) y sus relaciones.
- Especifica las reglas de negocio que deben cumplirse al crear, modificar y cancelar pedidos.
- Define los estados posibles de un pedido y las transiciones entre ellos.

**Entregable:** Documento que describe el dominio, las reglas de negocio y los estados de los pedidos.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en los invariantes del dominio que deben mantenerse en todo momento.
- Considera cómo se relacionan las entidades y cómo fluye la información entre ellas.

</details>

### Fase 2: Diseño y estructuración del código

**Objetivo:** Aplicar principios de código limpio para estructurar y organizar el código del sistema de gestión de pedidos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Organiza el código en paquetes y clases siguiendo el principio de responsabilidad única (SRP).
- Aplica el principio de segregación de interfaces (ISP) para definir interfaces claras y específicas.
- Utiliza patrones de diseño adecuados para resolver problemas comunes del dominio.

**Entregable:** Estructura de paquetes y clases que sigue los principios de código limpio.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que cada clase debe tener una única razón para cambiar.
- Las interfaces deben ser pequeñas y específicas para evitar dependencias innecesarias.

</details>

### Fase 3: Implementación de funcionalidades básicas

**Objetivo:** Implementar las funcionalidades básicas del sistema de gestión de pedidos siguiendo los principios de código limpio.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Implementa la creación de pedidos, asegurando que se cumplan las reglas de negocio definidas.
- Implementa la modificación de pedidos, permitiendo cambios en los productos y cantidades.
- Implementa la cancelación de pedidos, asegurando que se mantengan los invariantes del dominio.

**Entregable:** Código funcional que implementa las funcionalidades básicas del sistema de gestión de pedidos.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda aplicar los principios de código limpio en cada parte del código que implementes.
- Considera cómo manejar los errores y excepciones de manera coherente y limpia.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Cuáles son las entidades clave del dominio de gestión de pedidos?
- **paraQueSirve**: ¿Cuáles son las reglas de negocio que deben cumplirse al crear un pedido?
- **comoSeUsa**: ¿Cómo aplicas el principio de responsabilidad única en la estructuración del código?
- **erroresComunes**: ¿Cómo manejas los errores y excepciones en el código?
- **queDecisionesImplica**: ¿Qué patrones de diseño utilizas para resolver problemas comunes del dominio?

## Criterios de Evaluacion

- Identificación correcta de las entidades clave del dominio.
- Definición clara de las reglas de negocio.
- Aplicación de los principios de código limpio en la estructuración del código.
- Implementación funcional de las funcionalidades básicas del sistema.
- Manejo coherente y limpio de errores y excepciones.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
