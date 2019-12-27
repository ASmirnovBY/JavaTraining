package by.smirnov.oop.apphospital.view.impl;

import by.smirnov.oop.apphospital.view.View;
import by.smirnov.oop.apphospital.view.command.RequestCommand;

import java.util.Scanner;

public class ConsoleView implements View {
    private final RequestProvider provider = new RequestProvider();

    private Scanner in;

    public ConsoleView(Scanner scanner) {
        this.in = scanner;
    }

    @Override
    public String sendRequest() {
        String request = in.nextLine();
        RequestCommand requestCommand = provider.getRequestCommand(request);
        return requestCommand.buildRequest(request, in);
    }

    @Override
    public void printResponse(String response) {
        System.out.println(response);
    }

    @Override
    public void printMenu() {
        System.out.println("If you want see all Patients input --- all_patient");
        System.out.println("If you want add  new Patient input --- add_patient");
        System.out.println("If you want find Patient by Diagnosis input --- by_diagnosis");
        System.out.println("If you want find Patient by Cart input --- by_cart");
        System.out.println("If you want find Patient by Phone input --- by_phone");
        System.out.println("If you want exit input --- exit");
    }



}
