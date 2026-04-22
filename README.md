# Proyecto de Recuperación: Refactorización y Documentación Java

Este repositorio contiene un proyecto Java refactorizado siguiendo principios de **Clean Code** y documentado profesionalmente. El flujo de trabajo se ha gestionado mediante **Git** utilizando una estructura de ramas para asegurar la estabilidad del código.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java
* **IDE:** Eclipse
* **Control de Versiones:** Git & GitHub
* **Documentación:** Javadoc

## 🔄 Refactorizaciones Aplicadas

Se han aplicado tres técnicas fundamentales para mejorar la calidad del software:

1. **Rename (Renombrado):** Se cambió el nombre de la variable `tamano` por `tamanoArchivoBytes` para mejorar la semántica y legibilidad.
2. **Extract Constant (Extracción de Constante):** Se eliminó el "número mágico" `1048576` y se sustituyó por la constante `TAMANO_MAX_BYTES`.
3. **Extract Method (Extracción de Método):** Se aisló la lógica de cálculo de extensiones en el nuevo método `obtenerExtension()`, cumpliendo con el Principio de Responsabilidad Única.

## 📚 Documentación (Javadoc)
El proyecto incluye documentación técnica generada automáticamente. Se han utilizado etiquetas `@author`, `@version`, `@param` y `@return` para describir la clase `FileManager` y sus funcionalidades. 
*La documentación completa se encuentra en la carpeta `/doc`.*

## 🌿 Flujo de Trabajo (Git)
Se ha seguido un flujo de trabajo basado en ramas:
* **develop:** Rama de desarrollo donde se realizaron los commits de refactorización.
* **master:** Rama principal donde se integró el código final mediante un **Pull Request** y un **Merge** exitoso.
