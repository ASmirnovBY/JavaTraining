package by.smirnov.branching.taskseson.controller;

public class Runner {

    /*
        private static final String WINTER = "Winter";
        private static final String SPRING = "Spring";
        private static final String SUMMER = "Summer";
        private static final String FALL = "Fall";


        public static void main(String[] args) {
            int month = -1;
            String rez;
            switch (month) {
                case 12:
                case 1:
                case 2:
                      rez = WINTER;
                      break;
                case 3:
                case 4:
                case 5:
                       rez = SPRING;
                       break;
                case 6:
                case 7:
                case 8:
                    rez = SUMMER;
                    break;
                case 9:
                case 10:
                case 11:
                    rez = FALL;
                    break;
                default:
                    throw new IllegalArgumentException("NMonth number is  "
                            + "incorrect! ");
            }

            System.out.println(rez);

        }
    */
    public static void main(String[] args) {
        int month = 2;
        String rez;
        switch (month) {
            case 12:
            case 1:
            case 2:
                rez = Season.WINTER.getSeasonText();
                break;
            case 3:
            case 4:
            case 5:
                rez = Season.SPRING.getSeasonText();
                break;
            case 6:
            case 7:
            case 8:
                rez = Season.SUMMER.getSeasonText();
                break;
            case 9:
            case 10:
            case 11:
                rez = Season.FALL.getSeasonText();
                break;
            default:
                throw new IllegalArgumentException("NMonth number is  "
                        + "incorrect! ");
        }
        System.out.println(rez);

        System.out.println(sign(-1));
        System.out.println(sign(1));
        System.out.println(sign(0));
    }

    private static int sign(int x) {
        return (x < 0) ? -1 : ((x > 0) ? 1 : 0);
        //Тоже самое Integer.compare(x, 0);
    }
}
