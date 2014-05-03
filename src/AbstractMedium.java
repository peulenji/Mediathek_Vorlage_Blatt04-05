public abstract class AbstractMedium
{
    protected String _titel;
    protected String _kommentar;

    /**
     * @param titel
     *            den titel des Mediums
     * @param kommentar
     *            kommentar zum Medium
     * @require titel != null
     * @require kommentar != null
     * 
     */
    protected AbstractMedium(String titel, String kommentar)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";

        _titel = titel;
        _kommentar = kommentar;

    }

    public String getTitel()
    {
        return _titel;
    }

    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        
        _titel = titel;
    }

    public String getKommentar()
    {
        return _kommentar;
    }

    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }
    
   public String getFormatiertenString()
   {
       return ":\n" + "    " + "Titel: " + _titel
               + "\n" + "    " + "Kommentar: " + _kommentar + "\n" + "    ";
   }
  
  

}
