package Entidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;

public class Criptografia {
	  
	  public static final String ALGORITHM = "RSA";

	  public static final String PATH_CHAVE_PRIVADA = "C:/keys/private.key";

	  public static final String PATH_CHAVE_PUBLICA = "C:/keys/public.key";
	  
	  public static void geraChave() {
		  
	    try {
	    	
	      final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(ALGORITHM);
	      keyGen.initialize(1024);
	      final KeyPair key = keyGen.generateKeyPair();
	  
	      File chavePrivadaFile = new File(PATH_CHAVE_PRIVADA);
	      File chavePublicaFile = new File(PATH_CHAVE_PUBLICA);
	  
	      if (chavePrivadaFile.getParentFile() != null) {
	        chavePrivadaFile.getParentFile().mkdirs();
	      }
	       
	      chavePrivadaFile.createNewFile();
	  
	      if (chavePublicaFile.getParentFile() != null) {
	        chavePublicaFile.getParentFile().mkdirs();
	      }
	       
	      chavePublicaFile.createNewFile();
	  
	      ObjectOutputStream chavePublicaOS = new ObjectOutputStream(
	          new FileOutputStream(chavePublicaFile));
	      chavePublicaOS.writeObject(key.getPublic());
	      chavePublicaOS.close();
	  
	      ObjectOutputStream chavePrivadaOS = new ObjectOutputStream(
	          new FileOutputStream(chavePrivadaFile));
	      chavePrivadaOS.writeObject(key.getPrivate());
	      chavePrivadaOS.close();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	  
	  public static boolean verificaSeExisteChavesNoSO() {
	  
	    File chavePrivada = new File(PATH_CHAVE_PRIVADA);
	    File chavePublica = new File(PATH_CHAVE_PUBLICA);
	  
	    if (chavePrivada.exists() && chavePublica.exists()) {
	      return true;
	    }
	     
	    return false;
	  }

	  public static byte[] criptografa(String texto, PublicKey chave) {
		  
	    byte[] cipherText = null;
	     
	    try {
	    	
	      final Cipher cipher = Cipher.getInstance(ALGORITHM);
	      cipher.init(Cipher.ENCRYPT_MODE, chave);
	      cipherText = cipher.doFinal(texto.getBytes());
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	     
	    return cipherText;
	  }

	  public static String decriptografa(byte[] texto, PrivateKey chave) {
		  
	    byte[] dectyptedText = null;
	     
	    try {
	    	
	      final Cipher cipher = Cipher.getInstance(ALGORITHM);
	      cipher.init(Cipher.DECRYPT_MODE, chave);
	      dectyptedText = cipher.doFinal(texto);
	  
	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }
	  
	    return new String(dectyptedText);
	  }

	  public static void main(String[] args) {
	  
	    try {
	  
	      if (!verificaSeExisteChavesNoSO()) {
	        geraChave();
	      }
	  
	      final String msgOriginal = "Deni é o melhor professor!";
	      ObjectInputStream inputStream = null;
	  
	      inputStream = new ObjectInputStream(new FileInputStream(PATH_CHAVE_PUBLICA));
	      final PublicKey chavePublica = (PublicKey) inputStream.readObject();
	      final byte[] textoCriptografado = criptografa(msgOriginal, chavePublica);
	  
	      inputStream = new ObjectInputStream(new FileInputStream(PATH_CHAVE_PRIVADA));
	      final PrivateKey chavePrivada = (PrivateKey) inputStream.readObject();
	      final String textoPuro = decriptografa(textoCriptografado, chavePrivada);

	      System.out.println("Mensagem Original: " + msgOriginal);
	      System.out.println("Mensagem Criptografada: " +textoCriptografado.toString());
	      System.out.println("Mensagem Decriptografada: " + textoPuro);
	  
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	}