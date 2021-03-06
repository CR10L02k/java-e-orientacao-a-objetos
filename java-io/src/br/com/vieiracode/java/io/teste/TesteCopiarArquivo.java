package br.com.vieiracode.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	private String primeiroArquivo;
	private String segundoArquivo;

	public static void main(String[] args) throws IOException {

		TesteCopiarArquivo testeCopiarArquivo = new TesteCopiarArquivo();

		testeCopiarArquivo.setPrimeiroArquivo("lorem-2.txt");
		testeCopiarArquivo.setSegundoArquivo("lorem-copia.txt");
	
		/**
		 * Teclado
		 */

//		InputStream fis = new FileInputStream(testeCopiarArquivo.getArquivo1());
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		/**
		 * Console
		 */

		OutputStream fos = new FileOutputStream(testeCopiarArquivo.getSegundoArquivo());
//		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		System.out.print("\n - Escreva algo: \n\n ");

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {

			bw.write(linha);
			bw.newLine();
			linha = br.readLine();

		}

		br.close();
		bw.close();

	}

	public String getPrimeiroArquivo() {
		return primeiroArquivo;
	}

	public void setPrimeiroArquivo(String primeiroArquivo) {
		this.primeiroArquivo = primeiroArquivo;
	}

	public String getSegundoArquivo() {
		return segundoArquivo;
	}

	public void setSegundoArquivo(String segundoArquivo) {
		this.segundoArquivo = segundoArquivo;
	}



}