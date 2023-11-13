package clienteServidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor {

	
	public void iniciarServidor() throws IOException {

		DatagramSocket servidor = abrirServidor(1024, 65535);

		gerenciaComunicacao(servidor);
	}

	private void gerenciaComunicacao(DatagramSocket servidor) throws IOException {

		while (true) {

			byte[] mensagem = new byte[256];
			DatagramPacket pacote = new DatagramPacket(mensagem, mensagem.length);
			servidor.receive(pacote);
		}
	}

	private DatagramSocket abrirServidor(int portaInicial, int maiorPortaPossivel) throws IOException {

		while (portaInicial <= maiorPortaPossivel) {

			try {

				DatagramSocket servidor = new DatagramSocket(portaInicial);
				System.out.println("Servidor aberto na porta " + portaInicial);
				return servidor;
			} catch (IOException excecao) {

				portaInicial++;
				if (portaInicial == maiorPortaPossivel) {
					throw excecao;
				}
			}
		}
		return null;
	}
}
