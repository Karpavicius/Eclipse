package entidades;

public class Test{
	public static void main(String[] args) {
		MsgSender message = new MsgSender();
		
		MessageAdapter MessageAdapter = new MessageAdapter(message);
		
		System.out.println("AdaptadMessage");
		testMessage(MessageAdapter);
		
	}
	
	static void testMessage(MessageAdapter message) {
		message.sendMessageNew("Hello", "DenilsonFBar");
	}
	
}