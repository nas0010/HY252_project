package model.card;

/**
 * This class creates a new Phoenix Card
 * @version 1.0
 * @author dxanthak - mountanton
 */
public class Phoenix extends SpecialCard 
{
    private int value;

    /**
     * <b>constructor</b>: Constructs a new instance of Phoenix and via the
     * parent class SpecialCard sets with the command super,
     * value=-1,points=0 and its type=Phoenix
     */
    public Phoenix()
    {
        super(15,-25,"Phoenix");
        this.value=15;
    }
  
}

