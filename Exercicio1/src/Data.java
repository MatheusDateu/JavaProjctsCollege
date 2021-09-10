public class Data {
        int dia;
        int mes;
        int ano;
        String formatada;

        public String formatar() {
                this.formatada = dia + "/" + mes + "/" + ano;
                return formatada;
        }
}
