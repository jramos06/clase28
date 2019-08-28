package com.senati.mediateca;


import java.util.HashSet;
import java.util.Set;


public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio socio1 = new Socio();
		socio1.id=100;
		socio1.nombre="Jorge Antonio";
		socio1.apellido="Luque Chambi";
		socio1.distrito="Los Olivos";
		
		Socio socio2 = new Socio();
		socio2.id=102;
		socio2.nombre="Esther";
		socio2.apellido="Aquino Olivares";
		socio2.distrito="Bellavista";
		
		
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		
		Socio socio3 = new Socio(103,"Alicia","Gomez Avalos","Comas");
		
		
		System.out.println(socio3.toString());
		
		
		
		Libro libro1 = new Libro(11,"Matalache","Alvaro Vargas Llosa",50f,300,123);
		Libro libro2= new Libro(12,"100 años de soledad", "Mario Vargas Ll.",120,500,123);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		Cintaaudio audio1 =new Cintaaudio(10,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintaaudio audio2 =new Cintaaudio(11,"Mix", "Josimar", 50, "Miraflores", 7);
		System.out.println(audio1);
		System.out.println(audio2);
		
		
		Cintavideo video1 = new Cintavideo(1, "Rapidos y Furiosos", "Tondero", 10,"Vin Diesel", 1000);
		System.out.println(video1);
		
		
		System.out.println("Lista de socios");
		Socio soc1 = new Socio(104,"Jorge","Luque","Los olivos");
		Socio soc2 = new Socio(105,"Maria", "Luna","Comas");
		Socio soc3 = new Socio(105,"Gerardo", "Luque","00003");
		Socio soc4 = new Socio(106,"Alex", "Lopez","00004");
		Socio soc5 = new Socio(107,"Alex", "Lopez","00004");
		
		Set <Socio> sociosInscritos = new HashSet<Socio>();
		
		sociosInscritos.add(soc1);
		sociosInscritos.add(soc2);
		sociosInscritos.add(soc3);
		sociosInscritos.add(soc4);
		sociosInscritos.add(soc5);
		
		for (Socio socio : sociosInscritos) {
			System.out.println(socio.id + " " + socio.nombre + " " + socio.apellido +" "+ socio.distrito);
		}
		
		
		System.out.println("Lista de Audios");
		Cintaaudio aud1 = new Cintaaudio(10,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintaaudio aud2 = new Cintaaudio(11,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintaaudio aud3 = new Cintaaudio(12,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintaaudio aud4 = new Cintaaudio(13,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintaaudio aud5 = new Cintaaudio(14 ,"Musica variada", "Jose RB", 30, "Comas", 10);
		
		Set <Cintaaudio> audiosGrabados = new HashSet<Cintaaudio>();
		
		audiosGrabados.add(aud1);
		audiosGrabados.add(aud2);
		audiosGrabados.add(aud3);
		audiosGrabados.add(aud4);
		audiosGrabados.add(aud5);
		
		for (Cintaaudio audio : audiosGrabados) {
			System.out.println(audio.id + " " + audio.titulo + " " + audio.autor +" "+ audio.precio +" "+ audio.lugar+" "+ audio.duracion);
		}
		
		
		System.out.println("Lista de Videos");
		Cintavideo vid1 = new Cintavideo(10,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintavideo vid2 = new Cintavideo(11,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintavideo vid3 = new Cintavideo(12,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintavideo vid4 = new Cintavideo(13,"Musica variada", "Jose RB", 30, "Comas", 10);
		Cintavideo vid5 = new Cintavideo(14 ,"Musica variada", "Jose RB", 30, "Comas", 10);
		
		Set <Cintavideo> VideosGrabados = new HashSet<Cintavideo>();
		
		VideosGrabados.add(vid1);
		VideosGrabados.add(vid2);
		VideosGrabados.add(vid3);
		VideosGrabados.add(vid4);
		VideosGrabados.add(vid5);
		
		for (Cintavideo video : VideosGrabados) {
			System.out.println(video.id + " " + video.titulo + " " + video.autor +" "+ video.precio +" "+ video.actores+" "+ video.duracion);
		}
		
		
		System.out.println("Lista de Libros");
		Libro lib1 = new Libro(11,"Matalache","Alvaro Vargas Llosa",50f,300,123);
		Libro lib2 = new Libro(11,"Matalache","Alvaro Vargas Llosa",50f,300,123);
		Libro lib3 = new Libro(12,"100 años de soledad", "Mario Vargas Ll.",120,500,123);
		Libro lib4 = new Libro(12,"100 años de soledad", "Mario Vargas Ll.",120,500,123);
		Libro lib5 = new Libro(12,"100 años de soledad", "Mario Vargas Ll.",120,500,123);
		
		Set <Libro> libros = new HashSet<Libro>();
		
		libros.add(lib1);
		libros.add(lib2);
		libros.add(lib3);
		libros.add(lib4);
		libros.add(lib5);
		
		byte contador=0;
		float preciototal=0f;
		
		for (Libro libro : libros) {
			System.out.println(libro.id + " " + libro.titulo + " " + libro.autor +" "+ libro.precio +" "+ libro.nropagina+" "+ libro.nroisbn);
			contador++;
			preciototal = preciototal + libro.precio;
			
		}
		System.out.println("Lbros prestados" + contador);
		System.out.println("Monto auctualizado" + preciototal);
	}

}
