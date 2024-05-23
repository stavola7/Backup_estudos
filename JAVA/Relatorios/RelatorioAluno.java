package Senai1.Aula.relatorio;

import Senai1.Aula.entidade.Aluno;
import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

import java.io.ByteArrayOutputStream;

public class RelatorioAluno {

    // fonte padrao
    protected static Font FONT_NORMAL = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.UNDEFINED);
    //fonte negrito
    protected static Font FONT_NEGRITO = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
    protected static Integer ALINHAR_CENTRO = Element.ALIGN_CENTER;
    protected static Integer JUSTIFICADA = Element.ALIGN_JUSTIFIED;

    private Aluno aluno;

    public RelatorioAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public byte[] gerarPdf() throws Exception{
        try {
            Document documento = new Document(PageSize.A4);
            documento.setMargins(60,60,20,20);
            documento.addCreationDate();

            //toda vez que abrir o documento, vai gerar espaço na memoria para criar o pdf
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            PdfWriter.getInstance(documento, stream);
            documento.open();

            Paragraph paragraph = new Paragraph();
            paragraph.setAlignment(ALINHAR_CENTRO);
            paragraph.setFont(FONT_NORMAL);
                                            //busca o nome do aluno na entidade aluno
            paragraph.add("Prezado Aluno" + aluno.getNomeAluno());
            paragraph.add("Seja bem vindo");
            paragraph.setSpacingAfter(25);  // seta um espaço apos a escrita (espaço para nao ficar junto as frases)

            Paragraph titulo = new Paragraph();
            titulo.setAlignment(ALINHAR_CENTRO);
            titulo.setFont(FONT_NORMAL);
            titulo.add("Turma 309B");
            titulo.setSpacingAfter(25);

            Paragraph dadosAluno = new Paragraph();
            dadosAluno.setAlignment(JUSTIFICADA);
            dadosAluno.setFont(FONT_NORMAL);
            dadosAluno.add("Aluno: ");
            //dadosAluno.add("Aluno: " + aluno.getNomeAluno() + ", da Turma 309B, nascido em" + aluno.getDataNascimento());

            Phrase nomeComData = new Phrase(aluno.getNomeAluno() + " - " + aluno.getDataNascimento(), FONT_NEGRITO);
            dadosAluno.add(nomeComData);

            LineSeparator line = new LineSeparator();
            dadosAluno.add(line);

            documento.add(paragraph);
            documento.add(titulo);
            documento.add(dadosAluno);

            documento.close();
            return stream.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
