package aplication;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Quantos funciorios vc irá registrar? ");
		int n = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= n; i++) {

			System.out.println("Funcionario #" + i + ":");

			System.out.println("Id: ");
			int id = scan.nextInt();
			scan.nextLine();

			System.out.println("Name: ");
			String name = scan.nextLine();

			System.out.println("Salary: ");
			double salary = scan.nextDouble();

			list.add(new Employee(id, name, salary));

		}

		System.out.println();
		System.out.println("Informe o id do funcionari que terá aumento de salario: ");
		int id = scan.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("Funcionario NÃO Existe!!!");
			
		} else {
			System.out.println("Informe o Percentual: ");
			double percentage = scan.nextDouble();
			emp.increaseSalary(percentage);
		}
			

		scan.close();

		System.out.println();
		System.out.println("Lista de Empregados.");

		for (Employee lista : list) {

			System.out.println(lista);
		}

	}

}
