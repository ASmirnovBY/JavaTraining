package by.smirnov.task2.view.command;

import java.util.Scanner;

public class CalculateTour implements RequestCommand {
    @Override
    public String buildRequest(String input, Scanner in) {
        String request = input + RequestCommand.requestDelimetr;
        System.out.println("Input tour id , example 1");
        String tourId = in.nextLine();
        System.out.println("Input transport id : 1-Bus; 2-Plane; 3-Ship , example 1");
        String transportId = in.nextLine();
        System.out.println("Input food id : 1-All; 2-Halal; 3-Kosher; 4-Vegan; 5-No , example 1");
        String foodId = in.nextLine();
        System.out.println("Input days :");
        String days = in.nextLine();
        return request + tourId +"," + transportId + "," + foodId + "," + days + requestDelimetr;
    }
}
