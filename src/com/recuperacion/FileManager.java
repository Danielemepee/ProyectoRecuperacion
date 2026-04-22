package com.recuperacion;

import java.io.File;

public class FileManager {

    private static final int TAMANO_MAX_BYTES = 1024 * 1024;

	public void procesarArchivo(String ruta) {
        File archivo = new File(ruta);
        if (archivo.exists()) {
            System.out.println("Archivo encontrado: " + archivo.getName());
            long tamano = archivo.length();
            System.out.println("Tamaño: " + tamano + " bytes");
            
            if (tamano > TAMANO_MAX_BYTES) {
                System.out.println("Archivo grande, comprimiendo...");
            }
            
            String extension = "";
            int posicionPunto = ruta.lastIndexOf('.');
            if (posicionPunto > 0) {
                extension = ruta.substring(posicionPunto + 1);
            }
            System.out.println("Extensión: " + extension);
        }
    }
}