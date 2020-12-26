import java.math.BigInteger;

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
        privateKey = randomNumber.getRandomNumberInRange(2, 1_000_000);
        this.g = g;
        this.p = p;

        BigInteger bigPublicKey;
        BigInteger bigG = new BigInteger(Integer.toString(g));
        BigInteger bigPrivateKey = new BigInteger(Integer.toString(privateKey));
        BigInteger bigP = new BigInteger(Integer.toString(p));
        bigPublicKey = bigG.modPow(bigPrivateKey, bigP);

        publicKey = bigPublicKey.intValue();
    }

    public int getPublicKey() {
        return publicKey;
    }

    public void setCommonKey(int publicKeyUser2) {
        BigInteger bigCommonKey;
        BigInteger bigPublicKeyUser2 = new BigInteger(Integer.toString(publicKeyUser2));
        BigInteger bigPrivateKey = new BigInteger(Integer.toString(privateKey));
        BigInteger bigP = new BigInteger(Integer.toString(p));
        bigCommonKey = bigPublicKeyUser2.modPow(bigPrivateKey, bigP);

        commonKey = bigCommonKey.intValue();
    }
}
