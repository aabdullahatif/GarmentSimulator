package org.example;

import org.example.factories.GarmentFactory;
import org.example.factories.ProfessionalFactory;
import org.example.factories.CasualFactory;
import org.example.factories.PartyFactory;
import org.example.products.Tops;
import org.example.products.Pants;
import org.example.products.Shoes;

public class GarmentSimulator {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No style type specified. Defaulting to 'professional'.");
            args = new String[]{"professional"};
        }

        GarmentFactory factory;
        try {
            factory = getFactory(args[0]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        Tops tops = factory.createTops();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();
        System.out.println("Created " + tops.getDescription() + ", " + pants.getDescription() + ", " + shoes.getDescription());
    }

    private static GarmentFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "professional": return new ProfessionalFactory();
            case "casual": return new CasualFactory();
            case "party": return new PartyFactory();
            default: throw new IllegalArgumentException("Unknown factory type: " + type);
        }
    }
}
