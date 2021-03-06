package br.com.vieiracode.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um arquivo.

		String arquivo = "lorem.txt";

		InputStream fis = new FileInputStream(arquivo);
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		System.out.println("\n Arquivo: " + arquivo + "\n");

		while (linha != null) {

			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();

	}

}