/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2019
 * Created for: ICS4U
 * This program creates an enum of the planets and displays their position
 * from the sun
 *
 ****************************************************************************/

public enum EnumPlanets
{
    MERCURY(0),
    VENUS(1),
    EARTH(2),
    MARS(3),
    JUPITER(4),
    SATURN(5),
    URANUS(6),
    NEPTUNE(7);

    private final int position;
    private EnumPlanets(int position)
    {
        this.position = position;
    }

    public static void main(String[] arg)
    {
        for(EnumPlanets planet: EnumPlanets.values())
        {
            System.out.println(planet+" is " + planet.position + " planet(s) away from the sun.");
        }
    }
}
