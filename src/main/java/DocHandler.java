public class DocHandler {

    private IPrinter printer;

    public void handle(String doc) {
        printer.print(doc);
    }

    public DocHandler() {
        ToConsolePrinter toConsolePrinter = new ToConsolePrinter();
        this.printer = toConsolePrinter;
    }

    public IPrinter getPrinter() {
        return printer;
    }

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }
}
