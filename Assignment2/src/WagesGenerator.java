public class WagesGenerator
{
    public double calculateWages(double weekly, double commissionsPercent, double comAmount )
    {
        double wages = weekly + (comAmount * commissionsPercent);
        if(weekly == 200 && commissionsPercent == 0.09 && comAmount > 0)
        {
            return wages;
        }
        else if (weekly < 200 && commissionsPercent == 0.09 && comAmount > 0)
        {

        }
        else if (weekly == 200 && commissionsPercent < 0.09 && comAmount > 0)
        {

        }
        else if (weekly > 200 && commissionsPercent == 0.09 && comAmount > 0)
        {

        }
        else if (weekly == 200 && commissionsPercent > 0.09 && comAmount > 0)
        {

        }
        else
        {

        }

        return wages;
    }
}
