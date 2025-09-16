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
    }
}
