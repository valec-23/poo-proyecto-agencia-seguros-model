public class ChatbotSoporte {
    private int idChatbot;
    private String nombreBot;
    private String idioma;
    private boolean estado;
    private String nivelIA;

    public ChatbotSoporte() {
    }

    public ChatbotSoporte(int idChatbot, String nombreBot, String idioma, boolean estado, String nivelIA) {
        this.idChatbot = idChatbot;
        this.nombreBot = nombreBot;
        this.idioma = idioma;
        this.estado = estado;
        this.nivelIA = nivelIA;
    }

    public int getIdChatbot() {
        return idChatbot;
    }

    public void setIdChatbot(int idChatbot) {
        this.idChatbot = idChatbot;
    }

    public String getNombreBot() {
        return nombreBot;
    }

    public void setNombreBot(String nombreBot) {
        this.nombreBot = nombreBot;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNivelIA() {
        return nivelIA;
    }

    public void setNivelIA(String nivelIA) {
        this.nivelIA = nivelIA;
    }

    public String responderConsulta() {
        return "";
    }

    public void generarTicket() {
        System.out.println("Ejecutando generarTicket");
    }

    public void escalarAsesor() {
        System.out.println("Ejecutando escalarAsesor");
    }
}
