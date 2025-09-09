import javax.crypto.Cipher;
import javax.crypto.spec.SecretkeySpecs;
import java.util.Base64;
public class SimpleAES{
public static void main(String[]args)throws Exception{
String Key="1234567890123456";
string message="Hello AES!";
ScreatKeySpecs secretKey=new SecretKeySpecs(key.getBytes(),"AES");
cipher cipher=Cipher.getinstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.ENCRYPT_MODE,secretKey);
string encrypted=Base64.getEncoder().encodeTostring(cipher.doFinal(message.getBytes()));
cipher.init(Cipher.DECRYPT_MODE,secretKey);
string decrypted=new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)));
system.out.println("Encrypted:"+encrypted);
system.out.println("Decrypted:"+decrypted);
}
}
