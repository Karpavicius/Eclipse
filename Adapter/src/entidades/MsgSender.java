package entidades;

public class MsgSender implements IMsgSender{

	@Override
	public void sendMessage(String msg, String source, String destiny) {
		System.out.println("Message send.");
	}
}
