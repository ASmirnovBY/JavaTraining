package by.smirnov.oop.apphospital.runner.app;

import by.smirnov.oop.apphospital.controller.Controller;
import by.smirnov.oop.apphospital.view.View;
import by.smirnov.oop.apphospital.view.impl.ConsoleView;

import java.util.Scanner;

public class HospitalApp {
   private final Scanner in = new Scanner(System.in);
   private final View view;
   private final Controller controller;

   public HospitalApp() {
       System.out.println("Welcome to Hospital application");
       view = new ConsoleView(in);
       controller = new Controller();
   }

   public void startProgramm() {
      view.printMenu();
       while (true) {
          String request = view.sendRequest();
          String response = controller.executeTask(request);
          view.printResponse(response);
       }
   }
}
