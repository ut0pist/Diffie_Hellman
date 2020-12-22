import java.awt.*;

public class Channel {
    private int g = 0, p = 0;
    private final User user1, user2;


    public Channel (User user1, User user2){

        this.user1 = user1;
        this.user2 = user2;

        setRandomNbs();
    }

    private void setRandomNbs(){
        randomNumber randomNumber = new randomNumber();

        p = randomNumber.getPrimeNumber(500);
        g = randomNumber.getRandomNumberInRange(1, 10);

        user1.getChannelValues(g, p);
        user2.getChannelValues(g, p);

        exchangeKeys();
    }

    public void exchangeKeys(){
        user1.setCommonKey(user2.getPublicKey());
        user2.setCommonKey(user1.getPublicKey());

        System.out.println("Установка связи:");
        System.out.println("p = "+ p +"; g = "+ g +"; Приватный ключ 1-го пользователя = "+ user1.getPrivateKey() +"; Приватный ключ 2-го пользователя = "+ user2.getPrivateKey());
        System.out.println("Общий ключ 1-го пользователя = " + user1.getCommonKey());
        System.out.println("Общий ключ 2-го пользователя = " + user2.getCommonKey());
        System.out.println();

    }
}
