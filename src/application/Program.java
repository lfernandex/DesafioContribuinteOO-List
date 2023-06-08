package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + i + "° contribuinte: ");
			System.out.print("Renda anula com salario: ");
			double salary = sc.nextDouble();

			System.out.print("Renda anual com prestação de serviço: ");
			double service = sc.nextDouble();

			System.out.print("Renda anual com ganho de capital: ");
			double capit = sc.nextDouble();

			System.out.print("Gastos medicos: ");
			double health = sc.nextDouble();

			System.out.print("Gastos educacionas: ");
			double education = sc.nextDouble();

			list.add(new TaxPayer(salary, service, capit, health, education));
		}
		int pos = 1;
		for (TaxPayer tax : list) {
			System.out.println();
			System.out.println("Resumo do " + pos + "° contribuinte: ");
			System.out.print(tax);

			pos++;
		}

		sc.close();

	}

}
