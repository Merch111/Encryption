class Main {
  public static void main(String[] args) {
    String parolaChiave;
    System.out.println("Inserisci la parola chiave: ");
    try{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    parolaChiave = keyboard.readLine();
    } catch(IOException) {
      System.err-println("Errore nell'inserimento dati");
    }
    
    
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");

    
  Matrice m = new Matrice ("TPSIT");
  Vigenere v = new Vigenere(0,12,0,12,m);
  Thread t = new Thread(v);
  Thread t1 = new Thread(v);
  Thread t2 = new Thread(v);
  Threaf t3 = new Thread(v);
  t.start();
  t1.start();
  t2.start();
  t3.start();
  m.printMatrix();
  }
}
