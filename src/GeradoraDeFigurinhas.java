import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.awt.FontMetrics;

import javax.imageio.ImageIO;


public class GeradoraDeFigurinhas {
    

    public void cria(InputStream inputStream, String nomeArquivo, String texto) throws Exception {

        // leitura da imagem
        // InputStream inputStream = 
        //             new FileInputStream(new File("entrada/filme-maior.jpg"));
        // InputStream inputStream = 
        //                 new URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg")
        //                 .openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original pra novo imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, largura/8);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);

        FontMetrics medidasFonte = graphics.getFontMetrics(fonte);
        int posicaoTextoX = (largura - medidasFonte.stringWidth(texto)) / 2;
        //int posicaoTextoY = novaAltura-(altura/12);
        int posicaoTextoY = altura+(novaAltura/20);


        //int positionX = imagemOriginal.getWidth();
        //int positionY = novaImagem.getHeight();

        
        // escrever uma frase na nova imagem
        graphics.drawString(texto, posicaoTextoX , posicaoTextoY);


        // escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));

    }

}
