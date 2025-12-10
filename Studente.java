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
