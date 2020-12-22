public class User {
    private int privateKey, g, p, publicKey, commonKey;

    User() {

    }

    public int getPrivateKey() {
        return privateKey;
    }

    public int getCommonKey() {
        return commonKey;
    }

    public void getChannelValues(int g, int p) {
        randomNumber randomNumber = new randomNumber();
        privateKey = randomNumber.getRandomNumberInRange(1, 10);
        this.g = g;
        this.p = p;

        publicKey = (int) Math.pow(g, privateKey) % p;
    }

    public int getPublicKey() {
        return publicKey;
    }

    public void setCommonKey(int publicKeyUser2) {
        commonKey = (int) Math.pow(publicKeyUser2, privateKey) % p;
    }
}
