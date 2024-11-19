// Abstract Product Interface will be used to produce the output as the valuyes are diifenret
interface Tops {
    String getDescription();
}

interface Pants {
    String getDescription();
}

interface Shoes {
    String getDescription();
}

class ProfessionalTops implements Tops {
    public String getDescription() { return "Professional Top"; }
}

class CasualTops implements Tops {
    public String getDescription() { return "Casual Top"; }
}

class PartyTops implements Tops {
    public String getDescription() { return "Party Top"; }
}


