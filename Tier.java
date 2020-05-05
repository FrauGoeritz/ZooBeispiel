

public abstract class Tier
{
    public abstract String gibLaut();
    public abstract String gibName();
    
    public final void wieMachtDasTier() 
    {
        System.out.println(String.format("%s macht %s", gibName(), gibLaut());
    }
}
