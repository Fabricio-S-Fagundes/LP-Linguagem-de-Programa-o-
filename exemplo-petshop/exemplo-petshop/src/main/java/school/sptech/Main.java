package school.sptech;

public class Main {

  public static void main(String[] args) {

    Pet pet = new Pet("Astolfo");
    Pet repet = new Pet("Garfield");

    PetShop petShop1 = new PetShop("Pet Legal", 80.0);
    PetShop petShop2 = new PetShop("Legal's Pet", 60.0);

    System.out.println(pet);

    petShop1.darBanho(pet);
    petShop2.darBanho(pet);

    petShop2.darBanho(repet, 0.10);

    System.out.println(pet);
    System.out.println(repet);

    System.out.println(petShop1);
    System.out.println(petShop2);
  }
}