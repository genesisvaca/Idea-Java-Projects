import java.time.LocalTime;
import java.util.Scanner;

public class MesozoicEden {
    public static void main (String[] args){
        // Tyrannosaurus Rex
        String breed = "Tyrannosaurus Rex";
        String height = "4 m";      // hip height
        String length = "12 m";     // head to tail
        int weight = 8000;
        String dinoName = "Erick";
        int dinoAgeT = 78;
        String carnivore = "carnivore";
        String herbivore = "herbivore";
        boolean feeding = true;
        Character tyrannosaurusRex = 't';

        // Erick food portion calculator
        int avgFoodDaily = (weight * 5 )/ 100;
        int foodPerFeeding = avgFoodDaily / 2;

        System.out.println("\n\t\tMeet " + dinoName + ",\n\t\ta " + dinoAgeT + "-year-old "+ breed + ".\n\t\tAs a " + carnivore + ", it has a robust weight\n\t\tof " + weight + " kilograms.");

        System.out.println("\n\t/////////////////////////////////////////////");
        System.out.println("\t|\t\t\t" + breed + "\t\t\t(" + tyrannosaurusRex + ")\t|");
        System.out.println("\t/////////////////////////////////////////////");
        System.out.println("\t|\t\tNAME: \t\t\t\t" + dinoName + "\t\t\t|");
        System.out.println("\t|\t\tAGE: \t\t\t\t" + dinoAgeT + "\t\t\t\t|");
        System.out.println("\t|\t\tHEIGHT: \t\t\t" + height + "\t\t\t\t|");
        System.out.println("\t|\t\tLENGTH: \t\t\t" + length + "\t\t\t|");
        System.out.println("\t|\t\tWEIGHT: \t\t\t" + weight + " kg\t\t\t|");
        System.out.println("\t|\t\tDIET: \t\t\t\t" + carnivore + "\t\t|");
        System.out.println("\t/////////////////////////////////////////////");

        System.out.println("\n\tOur " + weight + " kg dinosaur, " + dinoName + " needs to eat " + avgFoodDaily +" kg daily,\n\twhich means we needs to serve " + foodPerFeeding + " kg per feeding.");

        // Brachiosaurus
        breed = "Brachiosaurus";
        height = "12 m";
        length = "25 m";
        weight = 50000;
        dinoName = "Brach";
        int  dinoAgeB = 36;
        Character brachiosaurus = 'b';

        // Brach food portion calculator
        avgFoodDaily = (weight * 5 )/ 100;
        foodPerFeeding = avgFoodDaily / 2;

        System.out.println("\n\t\tMeet " + dinoName + ",\n\t\ta " + dinoAgeB + "-year-old "+ breed + ".\n\t\tAs a " + herbivore + ", it has a robust weight\n\t\tof " + weight + " kilograms.");

        System.out.println("\n\t/////////////////////////////////////////////");
        System.out.println("\t|\t\t\t" + breed + "\t\t\t(" + brachiosaurus + ")\t\t|");
        System.out.println("\t/////////////////////////////////////////////");
        System.out.println("\t|\t\tNAME: \t\t\t\t" + dinoName + "\t\t\t|");
        System.out.println("\t|\t\tAGE: \t\t\t\t" + dinoAgeB + "\t\t\t\t|");
        System.out.println("\t|\t\tHEIGHT: \t\t\t" + height + "\t\t\t|");
        System.out.println("\t|\t\tLENGTH: \t\t\t" + length + "\t\t\t|");
        System.out.println("\t|\t\tWEIGHT: \t\t\t" + weight + " kg\t\t|");
        System.out.println("\t|\t\tDIET: \t\t\t\t" + herbivore + "\t\t|");
        System.out.println("\t/////////////////////////////////////////////");

        System.out.println("\n\tOur " + weight + " kg dinosaur, " + dinoName + " needs to eat " + avgFoodDaily +" kg daily,\n\twhich means we needs to serve " + foodPerFeeding + " kg per feeding.");

        // Age difference calculator
        int ageDifference = dinoAgeT - dinoAgeB;
        System.out.println("\n\tCurious data, our Dinosaurs have a total of " + ageDifference + " years difference within each other.");

        // Total Dinos
        int totalDinos = 47;
        Boolean maxCapacity = totalDinos >= 100;

        System.out.println("\n\t/////////////////////////////////////////////");
        System.out.println("\t|\t\tTotal Dinos in Mesozoic Park\t\t|");
        System.out.println("\t/////////////////////////////////////////////");
        System.out.println("\t|\t\t\t\t\t\t\t\t\t\t" + totalDinos + "\t|");
        System.out.println("\t|\t\t\t\tMax capacity reached: " + maxCapacity + "\t|");
        System.out.println("\t/////////////////////////////////////////////");

        // Park safety calculator
        int parkSafety = 10;
        boolean parkSafetyCalculator = parkSafety >= 9;

        System.out.println("\n\t/////////////////////////////////////////////");
        System.out.println("\t|\t\t\tSafety in Mesozoic Park\t\t\t|");
        System.out.println("\t/////////////////////////////////////////////");
        System.out.println("\t|\t\t\t\t\t\t\t\t\t" + parkSafety+ "/10\t|");
        System.out.println("\t|\t\t\t\t\t\t\tSafety : " + parkSafetyCalculator + "\t|");
        System.out.println("\t/////////////////////////////////////////////");

        // Employee profile
        String employeeName = "Izan";
        int employeeAge = 24;

        System.out.println("\n\t/////////////////////////////////////////////");
        System.out.println("\t|\t\t\t\tEmployee list\t\t\t\t|");
        System.out.println("\t/////////////////////////////////////////////");
        System.out.println("\t|\t\tNAME: \t\t\t\t" + employeeName + "\t\t\t|");
        System.out.println("\t|\t\tAGE: \t\t\t\t" + employeeAge + "\t\t\t\t|");
        System.out.println("\t/////////////////////////////////////////////");

        // Leap year calculator
        int currentYear = 2025;
        boolean leapYearCalculator = (currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0);

        System.out.println("\n\t/////////////////////////////////////////////");
        System.out.println("\t|\t\t\t\t\t"+currentYear+"\t\t\t\t\t|");
        System.out.println("\t/////////////////////////////////////////////");
        System.out.println("\t|\t\t\t\t\t\tLeap year: " + leapYearCalculator + "\t|");
        System.out.println("\t/////////////////////////////////////////////");

        // Conditional Statements
        if(feeding == true){
            System.out.println("Is carnivore.");
        } else {
            System.out.println("Is herbivore.");
        }

        System.out.println("Which dino are you interested in to know more about?");
        System.out.println("1. Tyrannosaurus Rex");
        System.out.println("2. Triceratops");
        System.out.println("3. Velociraptor");
        System.out.println("4. Brachiosaurus");
        System.out.println("5. Stegosaurus");
        Scanner sc = new Scanner(System.in);

        String species = sc.next();

        String housingSIze = "";

        switch (species){
            case "1":
                System.out.println("Care Strategy:\n" +
                        "Requires large territory, frequent meat-based feeding, and secure containment due to high aggression.\n" +
                        "\n" +
                        "Unique Behavior Trait:\n" +
                        "Displays territorial roaring when it senses intruders nearby.\n" +
                        "House: " + housingSIze);
                break;
            case "2":
                System.out.println("Care Strategy:\n" +
                        "Needs open grassland, daily supply of leafy greens, and mud pits to regulate body temperature.\n" +
                        "\n" +
                        "Unique Behavior Trait:\n" +
                        "Uses its horns to play-fight with others in its group during social bonding.\n" +
                        "House: " + housingSIze);
                break;
            case "3":
                System.out.println("Care Strategy:\n" +
                        "Must be kept in packs, requires mental stimulation and frequent obstacle courses to avoid boredom.\n" +
                        "\n" +
                        "Unique Behavior Trait:\n" +
                        "Communicates using a complex set of chirps to coordinate with its group.\n" +
                        "House: " + housingSIze);
                break;

            case "4":
                System.out.println("Care Strategy:\n" +
                        "Requires tall trees for feeding, ample space for movement, and constant water access.\n" +
                        "\n" +
                        "Unique Behavior Trait:\n" +
                        "Emits low-frequency hums that can be felt through the ground when calming its young.\n" +
                        "House: " + housingSIze);
                break;
            case "5":
                System.out.println("Care Strategy:\n" +
                        "Prefers shaded environments, soft ground for walking, and high-fiber vegetation.\n" +
                        "\n" +
                        "Unique Behavior Trait:\n" +
                        "Uses its tail spikes to dig shallow trenches for cooling off in warm weather.\n" +
                        "House: " + housingSIze);
                break;
        }

        int yearsEmployeeExperience = 10;

        if (yearsEmployeeExperience < 10){
            System.out.println(employeeName + " doesn't have enough experience to take care of " + dinoName);
        }

        if (parkSafety <= 7 ){
            System.out.println("¡¡¡WARNING THE SAFETY IN THE PARK IS TOO LOW!!!");
        }

        if (weight > 20000){
            System.out.println("Needs 3 feeds");
        }

        // Switch to show employee duties
        System.out.println("Select your role to know your duties:");
        System.out.println("1. Paleontologist");
        System.out.println("2. Veterinarian");
        System.out.println("3. Security Guard");
        System.out.println("4. Tour Guide");
        System.out.println("1. Maintenance");
        String duties = sc.next();

        switch (duties){
            case "Paleontologist":
                System.out.println("Study dinosaur fossils and monitor species behavior.");
            case "Veterinarian":
                System.out.println("Check dinosaur health and provide medical care.");;
            case "Security Guard":
                System.out.println("Patrol the park and ensure dinosaurs stay in their enclosures.");
            case "Tour Guide":
                System.out.println("Lead visitors through exhibits and provide educational talks.");
            case "Maintenance":
                System.out.println("Repair fences, clean habitats, and maintain facilities.");
            default:
                System.out.println("General park support duties.");
        }

        // Statement that checks if the park is open
        int hour = LocalTime.now().getHour();

        if ( hour >= 10 && hour <= 19){
            System.out.println("The park is open!");
        } else {
            System.out.println("The park is closed!");
        }

    }
}
