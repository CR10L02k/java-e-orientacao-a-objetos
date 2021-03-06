package br.com.bytebank.banco.test.util;

import java.util.ArrayList;


import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();

		Conta cc = new ContaCorrente(22, 22);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		boolean igual;
		
		igual = cc2.equals(cc);
		
		System.out.println(igual);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}	
		
	}
}
