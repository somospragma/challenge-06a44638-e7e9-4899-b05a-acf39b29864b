# Implementación de Código Limpio en un Sistema de Gestión de Cuentas

El sistema de gestión de cuentas de una entidad financiera necesita mejorar la calidad de su código para asegurar mantenibilidad y escalabilidad. El objetivo es aplicar principios de código limpio como KISS, SOLID, YAGNI y DRY para refactorizar un módulo existente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Aplicación de Código limpio y eficiente |
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

### Fase 1: Análisis del Código Existente

**Objetivo:** Identificar áreas del código que violan los principios de código limpio.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Revisa el código fuente del módulo de gestión de cuentas.
- Identifica las partes que no siguen los principios de código limpio.

**Entregable:** Informe con áreas identificadas y razones.

<details>
<summary>Pistas de conocimiento</summary>

- Busca acoplamientos innecesarios entre clases.
- Identifica clases con responsabilidades múltiples.

</details>

### Fase 2: Refactorización del Código

**Objetivo:** Aplicar principios de código limpio para refactorizar el módulo de gestión de cuentas.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Aplica los principios KISS, SOLID, YAGNI y DRY para refactorizar el código.
- Asegura que el código refactorizado sea más limpio y eficiente.

**Entregable:** Código refactorizado siguiendo los principios de código limpio.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza clases más pequeñas y enfocadas.
- Evita acoplamientos innecesarios entre clases.

</details>

### Fase 3: Validación del Código Refactorizado

**Objetivo:** Verificar que el código refactorizado cumple con los principios de código limpio y funciona correctamente.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Escribe pruebas unitarias para validar el código refactorizado.
- Asegura que el código refactorizado no introduce nuevos errores.

**Entregable:** Pruebas unitarias que validan el código refactorizado.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza pruebas unitarias para verificar la funcionalidad del código.
- Asegura que las pruebas cubran todos los casos de uso del módulo.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el principio KISS y cómo se aplica en el código refactorizado?
- **paraQueSirve**: ¿Para qué sirve el principio SOLID en el contexto de este reto?
- **comoSeUsa**: ¿Cómo se usa el principio YAGNI para evitar funcionalidad innecesaria en el código?
- **erroresComunes**: ¿Cuáles son los errores comunes al aplicar el principio DRY en el código?
- **queDecisionesImplica**: ¿Qué decisiones implica la aplicación del principio DRY en el código refactorizado?

## Criterios de Evaluacion

- Identificación de áreas del código que violan los principios de código limpio.
- Aplicación de los principios KISS, SOLID, YAGNI y DRY en el código refactorizado.
- Escritura de pruebas unitarias que validan el código refactorizado.
- Toma de decisiones basadas en los principios de código limpio y justificación de las mismas.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
