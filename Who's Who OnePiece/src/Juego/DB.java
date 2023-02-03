package Juego;

import java.io.File;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class DB {

	//Crear la base de datos.
	public DB() {

		//Instanciar todos los personajes.
		Personajes Luffy = new Personajes("LUFFY", true, true, false, true, false, true);
		Personajes Zoro = new Personajes("ZORO", true, false, true, true, true, true);
		Personajes Nami = new Personajes("NAMI", true, false, true, false, true, false);
		Personajes Robin = new Personajes("ROBIN", true, true, false, false, false, false);
		Personajes Franky = new Personajes("FRANKY", false, false, true, true, true, false);
		Personajes Sanji = new Personajes("SANJI", true, false, false, true, true, true);
		Personajes Ussop = new Personajes("USSOP", true, false, true, true, true, false);
		Personajes Chopper = new Personajes("CHOPPER", false, true, false, true, false, false);
		Personajes Jimbei = new Personajes("JIMBEI", false, false, false, true, true, true);

		//Abrir un archivo para la base de datos
		File f = new File("Personajes.db4o");
		
		//Borra el archivo para que no se acumulen infinitamente.
		f.delete();

		//Crea el contenedor de la base de datos a partir del archivo anterior y su ruta absoluta.
		ObjectContainer db = Db4oEmbedded.openFile(f.getAbsolutePath());

		//Almacena todos los personajes instanciados.
		db.store(Luffy);
		db.store(Zoro);
		db.store(Nami);
		db.store(Robin);
		db.store(Franky);
		db.store(Sanji);
		db.store(Ussop);
		db.store(Chopper);
		db.store(Jimbei);

		//Después de operar, cierra la base de datos.
		db.close();
	}

	//Método personalizado para obtener un personaje aleatorio a partir de la consulta a la base de datos.
	public static Object getRandom() {
		
		File f = new File("Personajes.db4o");
		ObjectContainer db = Db4oEmbedded.openFile(f.getAbsolutePath());
		Personajes p = new Personajes(); //Consulta por ejemplo sin parámetros para obtener todos los personajes.
		ObjectSet<Personajes> result = db.queryByExample(p);
		
		/* La consulta en db4o devuelve un ObjectSet que es una colección de objetos que no pueden repetirse pero no están ordenados.
		   Al no estar ordenados no podía escoger una posición aleatoria así que se me ocurrió transformarlo en array y poder escoger una posición aleatoria. */
		
		Object[] X = result.toArray(); //Creamos el array de objetos "X" y lo igualamos al resultado de la consulta con el método .toArray.
		
		db.close(); //Después de operar cerramos la base de datos.
		
		return X[(int) (Math.random() * X.length)]; //Devuelve un objeto del array "X" en una posición aleatoria.
	}
}