package com.masters.coding.lesson.model;

import com.masters.coding.student.model.Student;
import com.masters.coding.teacher.model.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

//Adnotacje
@Entity /*
Adnotacja @Entityto adnotacja JPA (Java Persistence API), która służy do oznaczania klasy jako jednostki JPA. Mówi frameworkowi JPA, że ta klasa powinna być odwzorowana na tabelę bazy danych.
Kiedy JPA odwzorowuje jednostkę na tabelę bazy danych, tworzy tabelę o takiej samej nazwie jak klasa jednostki i mapuje pola klasy jednostki na kolumny w tabeli. Pola klasy encji są również używane do tworzenia klucza podstawowego tabeli.
Adnotacja @Entityjest również używana przez JPA podczas wykonywania operacji CRUD (Create, Read, Update, Delete) na jednostce. Na przykład, gdy JPA utrwala jednostkę, używa @Entityadnotacji do określenia tabeli, do której jednostka powinna zostać wstawiona. Kiedy JPA pobiera jednostkę, używa @Entityadnotacji do określenia tabeli, z której jednostka powinna zostać pobrana.
Jeśli chcesz oznaczyć klasę jako jednostkę JPA, powinieneś użyć tej adnotacji. Framework JPA automatycznie rozpozna tę klasę jako jednostkę i spróbuje zmapować ją do tabeli bazy danych o tej samej nazwie.
*/
@Getter
@Setter
public class Lesson {
    @Id /*
Adnotacja @Idsłuży do oznaczenia pola jako klucza podstawowego encji w aplikacji JPA (Java Persistence API). Służy do wskazania, że ​​pole jest unikalnym identyfikatorem jednostki i będzie używane jako klucz podstawowy w tabeli bazy danych odpowiadającej jednostce.
Klucz podstawowy służy jako unikalny identyfikator dla każdego wiersza w tabeli i służy do identyfikowania i pobierania określonych wierszy z tabeli. Służy również do zachowania integralności danych poprzez zapewnienie, że każdy wiersz w tabeli ma unikalny identyfikator.
Gdy framework JPA odwzorowuje jednostkę na tabelę bazy danych, używa pola oznaczonego @Idadnotacją jako klucza podstawowego tabeli. JPA używa również tej adnotacji do określenia strategii generowania klucza podstawowego.
Ponadto @Idadnotacja służy do poinformowania JPA, że to pole jest unikalnym identyfikatorem jednostki, pomaga JPA zachować, pobrać, zaktualizować i usunąć jednostkę za pomocą tego klucza.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*
Adnotacja @GeneratedValuejest używana w JPA (Java Persistence API) do określenia, że ​​wartość pola powinna być generowana przez dostawcę trwałości. Atrybut tej strategyadnotacji służy do określenia stosowanej strategii generowania.
@GeneratedValue(strategy = GenerationType.IDENTITY)służy do wskazania, że ​​wartość klucza podstawowego powinna być generowana przez kolumnę tożsamości bazy danych. Ta strategia informuje dostawcę JPA, że baza danych będzie odpowiedzialna za generowanie unikalnych wartości dla pola klucza podstawowego. Zwykle odbywa się to poprzez automatyczne zwiększanie przez bazę danych wartości pola klucza podstawowego dla każdego nowego wiersza wstawianego do tabeli.
Strategia IDENTITYjest używana, gdy wartość klucza podstawowego jest generowana przez bazę danych i jest zwykle używana z bazami danych obsługującymi kolumny z automatycznym przyrostem, takimi jak MySQL, SQL Server i inne.
Należy zauważyć, że @GeneratedValueadnotacja jest często używana w połączeniu z @Idadnotacją używaną do oznaczania pola jako klucza podstawowego encji. Adnotacja @Idsłuży do wskazania, że ​​pole jest unikalnym identyfikatorem jednostki i będzie używane jako klucz podstawowy w tabeli bazy danych odpowiadającej jednostce.
*/
    private Long id;
    @ManyToOne/*
Adnotacja @ManyToOneto adnotacja JPA (Java Persistence API), która służy do oznaczania pola jako relacji wiele do jednego. Wskazuje, że pole jest odwołaniem do innej jednostki i że relacja jest typu wiele do jednego, co oznacza, że ​​może istnieć wiele jednostek bieżącego typu, które odwołują się do pojedynczej jednostki innego typu.
Na przykład w klasie Lekcja @ManyToOneadnotacja jest używana w polach studenti w teachercelu wskazania, że ​​każda Lekcja jest powiązana odpowiednio z jednym Uczniem i jednym Nauczycielem. Oznacza to, że dla każdej lekcji może istnieć wiele instancji lekcji, które mają związek z jednym uczniem i jednym nauczycielem.
Adnotacja @ManyToOnesłuży do tworzenia wielu stron relacji wiele-do-jednego i zazwyczaj jest używana w połączeniu z @OneToManyadnotacją, która służy do tworzenia jednej strony relacji.
Należy zauważyć, że podczas używania @ManyToOneJPA utworzy klucz obcy w tabeli bieżącej klasy, aby odwoływać się do klucza podstawowego drugiej klasy. A także @ManyToOnejest używany, gdy istnieje relacja jeden-do-wielu między dwiema jednostkami.
     */
    @JoinColumn(name = "student_id")/*
Adnotacja @JoinColumnjest używana w JPA (Java Persistence API) do określenia kolumny, która ma być użyta w tabeli podmiotu, który jest właścicielem relacji, aby połączyć się z tabelą podmiotu powiązanego. Jest używany w połączeniu z adnotacjami @ManyToOnei w @OneToManycelu określenia kolumny, która powinna być używana do łączenia tabel.
Na przykład w klasie Lekcja @JoinColumn(name = "student_id")adnotacja jest używana w studentpolu do określenia student_idkolumny jako kolumny, której należy użyć do połączenia tabeli Lekcja z tabelą Student. Oznacza to, że student_idkolumna w tabeli lekcji będzie kluczem obcym, który odwołuje się do klucza podstawowego tabeli Student.
Określając nameatrybut @JoinColumnadnotacji, można dostosować nazwę kolumny używanej do łączenia tabel. Jeśli nameatrybut nie zostanie określony, JPA użyje nazwy pola jako nazwy kolumny łączenia.
Warto wspomnieć, że @JoinColumnsłuży do określenia kolumn po stronie właściciela relacji, dla drugiej strony relacji mappedByatrybut jest używany w adnotacji @OneToManylub .@ManyToOne
     */
    private Student student;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    private LocalDateTime dateTime;

}