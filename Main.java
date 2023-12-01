class Main {
  public static void main(String[] args) {
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
