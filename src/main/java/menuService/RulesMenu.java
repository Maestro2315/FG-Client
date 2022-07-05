package menuService;

import messege.InputMessageService;
import messege.fileService.TextReader;

import java.io.IOException;
import java.util.Scanner;

public class RulesMenu {

    InputMessageService start = new InputMessageService();
    /**
     * Метод меню правил с вариантами возврата в начальное меню
     * и выходом из игры
     * */
    public void showRules() throws IOException {

        TextReader textReader = new TextReader();
        textReader.TextReaderFile();

        Scanner sc = new Scanner(System.in);

        InputMessageService exit = new InputMessageService();
        ExitMenu exitMenu = new ExitMenu();

        exit.print("\n Для того чтобы покинуть игру введите 1.");
        start.print("Чтобы вернуться назад в меню нажмите 2.");

        int userStepInRulesMenu = sc.nextInt(); //можно в некст лайн..
        //TODO некст инт обернуть в рай кетч
        if (userStepInRulesMenu == 1) {
            exitMenu.exit();
        }
        backToStartMenu(userStepInRulesMenu);
    }
    /**
     * Метод выхода из меню правил в начальное меню
     * */
    private void backToStartMenu(int command){
        start.print("Чтобы вернуться назад в меню нажмите 2)");
        if (command == 2) {
            SimpleStartMenu startMenu = new SimpleStartMenu();
            startMenu.runMainMenu();
        }
    }

//   private void textRules() {
//        try {
//            new InputMessageService().print(new TextReader().TextReaderFile());
//        } catch (IOException e) {
//            new InputMessageService().print(e.getMessage());
//        }
//    }

}
