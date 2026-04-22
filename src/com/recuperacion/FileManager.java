package com.recuperacion;

import java.io.File;

/**
 * Clase encargada de la gestión y procesamiento de archivos.
 * @author Tu Nombre
 * @version 1.0
 */
public class FileManager {

    private static final int TAMANO_MAX_BYTES = 1024 * 1024;

    /**
     * Procesa los archivos de una lista validando su tamaño y extensión.
     */
	public void procesarArchivo(String ruta) {
        File archivo = new File(ruta);
        if (archivo.exists()) {
            System.out.println("Archivo encontrado: " + archivo.getName());
            long tamanoArchivoBytes = archivo.length();
            System.out.println("Tamaño: " + tamanoArchivoBytes + " bytes");
            
            if (tamanoArchivoBytes > TAMANO_MAX_BYTES) {
                System.out.println("Archivo grande, comprimiendo...");
            }
            
            String extension = obtenerExtension(ruta);
            System.out.println("Extensión: " + extension);
        }
    }

	/**
     * Extrae la extensión de un archivo a partir de su nombre.
     * @param nombreArchivo Nombre completo del fichero (ej: "foto.jpg")
     * @return La extensión del archivo después del punto en minúsculas.
     */
	private String obtenerExtension(String ruta) {
		String extension = "";
		int posicionPunto = ruta.lastIndexOf('.');
		if (posicionPunto > 0) {
		    extension = ruta.substring(posicionPunto + 1);
		}
		return extension;
	}
}
//Fin de la clase FileManager