public class WagesGenerator
{
    public double calculateWages(double weekly, double commissionsPercent, double comAmount ) throws WagesExceptionHandler
    {
        double wages = weekly + (comAmount * commissionsPercent);
        if(weekly == 200 && commissionsPercent == 0.09 && comAmount > 0)
        {
            System.out.println("Weekly Wages Are: " + wages);
            return wages;
        }
        else if (weekly < 200 && commissionsPercent == 0.09 && comAmount > 0)
        {
            throw new WagesExceptionHandler("Incorrect Values: Please make sure weekly is 200, comissions percent is 0.09 and comAmount is greater than 0");
        }
        else if (weekly == 200 && commissionsPercent < 0.09 && comAmount > 0)
        {
            throw new WagesExceptionHandler("Incorrect Values: Please make sure weekly is 200, comissions percent is 0.09 and comAmount is greater than 0");
        }
        else if (weekly > 200 && commissionsPercent == 0.09 && comAmount > 0)
        {
            throw new WagesExceptionHandler("Incorrect Values: Please make sure weekly is 200, comissions percent is 0.09 and comAmount is greater than 0");
        }
        else if (weekly == 200 && commissionsPercent > 0.09 && comAmount > 0)
        {
            throw new WagesExceptionHandler("Incorrect Values: Please make sure weekly is 200, comissions percent is 0.09 and comAmount is greater than 0");
        }
        else
        {
            throw new WagesExceptionHandler("Incorrect Values: Please make sure weekly is 200, comissions percent is 0.09 and comAmount is greater than 0");
        }

       /* return wages;*/
    }
}
