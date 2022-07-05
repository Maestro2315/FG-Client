package messege;


public class InputMessageService implements MessageService {
    /**
     * Метод для упрощенного написания текста
     * */
    @Override
    public void print(String text){
        System.out.println(text);
    }

}
