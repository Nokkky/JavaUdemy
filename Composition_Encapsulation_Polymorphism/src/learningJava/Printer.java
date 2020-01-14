package learningJava;

public class Printer {
    /** Printer
     * -- tonerLevel, numberOfPages, duplexPrinter
     * -- fillUpToner()
     * -- increaseNumberOfPagesPrinted()
     * -- **/
    private double tonerLevel ;
    private int pagesPrinted ;
    private boolean duplexPrinter ;

    public Printer(){
        this(100, false);
    }

    public Printer(double tonerLevel, boolean duplexPrinter){
        this(tonerLevel, 0, duplexPrinter);
    }

    public Printer(double tonerLevel, int numberOfPages, boolean duplexPrinter){
        if(tonerLevel >=0 && tonerLevel < 100){
            this.tonerLevel = tonerLevel;
        }
        if(numberOfPages >= 0){
            this.pagesPrinted = numberOfPages;
        }
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(double increaseRate){
        if (increaseRate > 0 && increaseRate <= 100){
            if (tonerLevel + increaseRate <= 100 && tonerLevel + increaseRate > 0){
                tonerLevel = tonerLevel + increaseRate;
            }
            if (tonerLevel + increaseRate > 100){
                tonerLevel = 100;
            }
        }else{
            tonerLevel = -1;
        }

    }

    public void pagesPrinted(int pages){
        if(pages >= 0 && duplexPrinter){
            pagesPrinted = pagesPrinted + pages / 2 + pages % 2;
        }
        if(pages >= 0 && !duplexPrinter){
            pagesPrinted = pagesPrinted + pages;
        }

    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
