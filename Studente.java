import java.io.IoException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Studente{
  private final String nome;
  private final String cognome;
  private final String matricola;
  private final int annoNascita;

public Studente (String nome, String cognome, String matricola, int annoNascita){
  this.nome = nome;
  this.cognome = cognome;
  this.matricola = matricola;
  this.annoNascita = annoNascita;
}
  //converte  in una riga csv ";" , "matricola";"nome","cognome" ,"anno"
public String tocsv(){
  return String.join("," matricola, nome, cognome, Integer.toString(annoNascita));

  public static void main (String[] args) throws IOExceptio{
    Scanner sc=new Scanner(System.in);
    Path csv= Path.of ("studenti.csv");

  System.out.println("Inserisci studenti. Digita 'exit' per terminare");
    while (true){
      System.out.print("Nome (o 'exit' per uscire): ");
      String nome = sc.nextLine().trim();
      if(nome.equalsIgnoreCase("exit")) break;

      System.out.print("Cognome:");
      string cognome = sc.nextLine().trim();

      System.out.print("Matricola: ");
      String matricola = sc.nextLine().trim();

      System.out.print("Anno nascita: ");
      String annoImput = sc. nextLine().trim();
      int anno;
      try{
        anno= Integer.parseInt(annoInmput);
      }catch (NumberFormatException e)
        {
          System.out.println("Anno non valido, riprova.\n");
          continue;
        }
