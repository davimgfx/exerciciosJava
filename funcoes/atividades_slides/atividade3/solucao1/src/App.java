public class Main {

  public static void main(String[] args) {
    classificacao(3);
  }

  public static void classificacao(int idade){
      if(idade >=5 && idade <=7){
        System.out.println("Infantil A");
      }
      else if (idade >=8 && idade <=10){
        System.out.println("Infantil B");
      }
      else if (idade >=11 && idade <=13){
        System.out.println("Juvenil A");
      }
      else if (idade >=14 && idade <=17){
        System.out.println("Juvenil B");
      }
      else if (idade >18){
        System.out.println("Senior");
      }
      else{
        System.out.println("IDADE NÃO CADASTRADA");
      }
  }
}