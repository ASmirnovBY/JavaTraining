package by.smirnov.oop.apphospital.controller;

import by.smirnov.oop.apphospital.controller.command.Command;
import by.smirnov.oop.apphospital.controller.command.CommandName;
import by.smirnov.oop.apphospital.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> commands = new HashMap();

    CommandProvider() {
        commands.put(CommandName.ADD_PATIENT, new AddPatient());
        commands.put(CommandName.ALL_PATIENT, new AllPatient());
        commands.put(CommandName.BY_DIAGNOSIS, new FindByDiagnosis());
        commands.put(CommandName.BY_CART, new FindByCart());
        commands.put(CommandName.BY_PHONE, new FindByTelephone());
        commands.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = commands.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = commands.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
