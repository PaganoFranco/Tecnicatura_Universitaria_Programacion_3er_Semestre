
package enumeraciones;


public enum Continentes {
    AFRICA(53, "1.2 Billones"),
    EUROPA(45, "1.1 Billones"),
    ASIA(44, "1.9 Billones"),
    AMERICA(34, "150.2 Millones"),
    OCEANIA(14, "5 mil");
    
    private final int paises;
    private final String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Meotodo Get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
    
}
