package com.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Maturita student1;
	Maturita student2;

	student1 = new Maturita("Jan Novak", LocalDate.of(1991, 05, 06), "4A", 5, 2, 3, 1,"prosel", "neprosel");
	student2 = new Maturita ("Petr Pesek", LocalDate.of(1990, 05, 06), "3A", 1, 2, 3, 1, "prosel", "neprosel");

		System.out.println(student1.getName());
		System.out.println(student1.getDateOfBirth());
		System.out.println(student1.getSchoolCLass());
		System.out.println(student1.getChemistry());
		System.out.println(student1.getHistory());
		System.out.println(student1.getMathematic());
		System.out.println(student1.getLanguage());

		System.out.println(student2.getName());
		System.out.println(student2.getDateOfBirth());
		System.out.println(student2.getSchoolCLass());
		System.out.println(student2.getChemistry());
		System.out.println(student2.getHistory());
		System.out.println(student2.getMathematic());
		System.out.println(student2.getLanguage());

    }
}
