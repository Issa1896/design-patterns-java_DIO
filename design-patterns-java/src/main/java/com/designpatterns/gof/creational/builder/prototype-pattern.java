// Pacote para o padrão Prototype
package com.designpatterns.gof.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Exemplo do Padrão Prototype implementando protótipos de documentos
 */

// Interface Prototype
interface DocumentPrototype extends Cloneable {
    DocumentPrototype clone();
    void setContent(String content);
    String getContent();
    void print();
}

// Implementação concreta do Prototype - Documento de Texto
class TextDocument implements DocumentPrototype {
    private String content;
    private String fontName;
    private int fontSize;

    public TextDocument() {
        this.fontName = "Arial";
        this.fontSize = 12;
    }

    public TextDocument(String fontName, int fontSize) {
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    @Override
    public DocumentPrototype clone() {
        TextDocument clone = null;
        try {
            clone = (TextDocument) super.clone();
            // Cópia profunda para objetos mutáveis, se necessário
            // Aqui estamos lidando apenas com tipos primitivos e String (imutável)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public void print() {
        System.out.println("--- Documento de Texto ---");
        System.out.println("Fonte: " + fontName + ", Tamanho: " + fontSize);
        System.out.println("Conteúdo: " + content);
    }
}

// Outra implementação concreta - Documento PDF
class PDFDocument implements DocumentPrototype {
    private String content;
    private boolean secured;
    private int pdfVersion;

    public PDFDocument() {
        this.secured = false;
        this.pdfVersion = 7; // PDF 1.7
    }

    public PDFDocument(boolean secured, int pdfVersion) {
        this.secured = secured;
        this.pdfVersion = pdfVersion;
    }

    @Override
    public DocumentPrototype clone() {
        PDFDocument clone = null;
        try {
            clone = (PDFDocument) super.clone();
            // Cópia profunda para objetos mutáveis, se necessário
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setSecured(boolean secured) {
        this.secured = secured;
    }

    public boolean isSecured() {
        return secured;
    }

    public void setPdfVersion(int pdfVersion) {
        this.pdfVersion = pdfVersion;
    }

    public int getPdfVersion() {
        return pdfVersion;
    }

    @Override
    public void print() {
        System.out.println("--- Documento PDF ---");
        System.out.println("Versão: 1." + pdfVersion + ", Seguro: " + secured);
        System.out.println("Conteúdo: " + content);
    }
}

// Registry de protótipos (opcional, mas útil)
class DocumentPrototypeRegistry {
    private static Map<String, DocumentPrototype> prototypes = new HashMap<>();

    static {
        // Inicializa o registro com protótipos padrão
        prototypes.put("text", new TextDocument());
        prototypes.put("pdf", new PDFDocument());
        
        // Protótipos especializados
        prototypes.put("report-text", new TextDocument("Times New Roman", 14));
        
        PDFDocument securedPdf = new PDFDocument(true, 8);
        prototypes.put("secured-pdf", securedPdf);
    }

    public static DocumentPrototype getPrototype(String type) {
        return prototypes.get(type).clone();
    }

    public static void addPrototype(String type, DocumentPrototype prototype) {
        prototypes.put(type, prototype);
    }
}

// Cliente / Demo
public class PrototypePatternDemo {
    public static void main(String[] args) {
        System.out.println("Criando documentos a partir de protótipos:");
        
        // Obtém um documento de texto do registro
        DocumentPrototype textDoc = DocumentPrototypeRegistry.getPrototype("text");
        textDoc.setContent("Este é um documento de texto padrão.");
        textDoc.print();
        
        // Obtém um documento de relatório (texto com fonte específica)
        DocumentPrototype reportDoc = DocumentPrototypeRegistry.getPrototype("report-text");
        reportDoc.setContent("Este é um relatório com formatação especial.");
        TextDocument reportTextDoc = (TextDocument) reportDoc;
        System.out.println("Fonte do relatório: " + reportTextDoc.getFontName());
        reportDoc.print();
        
        // Obtém um PDF seguro
        DocumentPrototype securedPdfDoc = DocumentPrototypeRegistry.getPrototype("secured-pdf");
        securedPdfDoc.setContent("Este é um documento PDF seguro.");
        PDFDocument securedPdf = (PDFDocument) securedPdfDoc;
        System.out.println("O PDF é seguro: " + securedPdf.isSecured());
        securedPdfDoc.print();
        
        // Criando um novo protótipo personalizado
        TextDocument customTextTemplate = new TextDocument("Calibri", 10);
        DocumentPrototypeRegistry.addPrototype("memo-text", customTextTemplate);
        
        // Usando o novo protótipo
        DocumentPrototype memoDoc = DocumentPrototypeRegistry.getPrototype("memo-text");
        memoDoc.setContent("Este é um memorando usando o novo protótipo.");
        memoDoc.print();
    }
}
