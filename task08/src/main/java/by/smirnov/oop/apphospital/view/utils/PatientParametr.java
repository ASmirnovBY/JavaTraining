package by.smirnov.oop.apphospital.view.utils;

public enum PatientParametr {
    ID("Input id:",
            "Incorrect input id, example id = 123",
            "^[1-9]{1,10}"),

    FIRST_NAME("Input First name:",
            "Incorrect input first name, example : Alex",
            "^[A-Z]{1}[a-z]{2,14}"),

    LAST_NAME("Input Last name:",
            "Incorrect input last name, example : Smirnov",
            "^[A-Z]{1}[a-z]{2,14}"),

    PATRANOMIC("Input Patranomic:",
            "Incorrect input patranomic, example : Borisovich",
            "^[A-Z]{1}[a-z]{2,14}"),

    ADDRESS("Input address example Kalinina.h4.r6 :",
            "Incorrect input address, example : Kalinina.h4.r6",
            "^[A-Z]{1}[a-z]{4,10}[.]{1}[h]{1}[1-9]{1,5}[.]{1}[r]{1}[1-9]{1,6}$"),

    NUMBER("Input telephone number:",
            "Incorrect input telephone, example : 3303333",
            "^[1-9]{1}\\d{6}"),

    CART_NUMBER("Input cart number:",
            "Incorrect input cart number, example : 123",
            "^[1-9]{1,10}"),

    DIAGNOSIS("Input diagnosis:",
            "Incorrect input diagnosis, example : Flu",
            "^[A-Z]{1}[a-z]{2,14}");

    private String InputMessage;
    private String incorrectMessage;
    private String reg;

    PatientParametr(String inputMessage, String incorrectMessage, String reg) {
        InputMessage = inputMessage;
        this.incorrectMessage = incorrectMessage;
        this.reg = reg;
    }

    public String getInputMessage() {
        return InputMessage;
    }

    public String getIncorrectMessage() {
        return incorrectMessage;
    }

    public String getReg() {
        return reg;
    }
}
