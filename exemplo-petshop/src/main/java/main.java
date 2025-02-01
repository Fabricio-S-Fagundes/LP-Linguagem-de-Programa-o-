public class main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Astolfo");
        Pet repete = new Pet("Garfield");

        PetShop petShop1 = new PetShop("Pet Legal", 80.0);
        PetShop petShop2 = new PetShop("Legal's Pet", 60.0);

        System.out.println(pet1);

        petShop1.darBanho(pet1);
        petShop2.darBanho(pet1);

    }
}
