//
//  Class editor:  Raley
//  Date created:  1/6/2025
//  General description: Makes a country object.
//

public class Country
{ 
  // add private instance variables for the name, capital, language, and image file.
  private String name = "";
  private String capital = "";
  private String language = "";
  private String image = "";
  // add constructors

  // Precondition: An arry with at least 4 slots.
  // Postcondition: Allows user to fill in data on country
  public Country(String[] data)
  {
    name = data[0];
    capital = data[1];
    language = data[2];
    image = data[3];
  }

  // Write accessor/get methods for each instance variable that returns it.

  // Precondition: None
  // Postcondition: Allows user to get name of country
  public String getName()
  {
    return name;
  }

  // Precondition: None
  // Postcondition: Allows user to get capital of country
  public String getCapital()
  {
    return capital;
  }

  // Precondition: None
  // Postcondition: Allows user to get language of country
  public String getLanguage()
  {
    return language;
  }

  // Precondition: None
  // Postcondition: Allows user to get image of country
  public String getImage()
  {
    return image;
  }


  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 
  // Precondition: None
  // Postcondition: Allows user to get the toString of country
  public String toString()
  {
    return (name + "'s capital is " + capital + ". Its primary language is " + language + ".");
  }


}



