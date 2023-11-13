package entidades;

public class MessageAdapter implements IMsgSenderNew{
	MsgSender mesage;
	
	public MessageAdapter(MsgSender mesage) {
		this.mesage = mesage;
	}
	
	@Override
	public void sendMessageNew(String msg, String destiny) {
		System.out.println("Message send with the new method.");
	}
}