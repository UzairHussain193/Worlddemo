import java.lang.reflect.Array;
import java.util.ArrayList;
class World{
    private String cname;
    private ArrayList<Country>listofCountries=new ArrayList<Country>();
    private double size;        // area of continent
    public void setCname(String cname){
        this.cname=cname;
    }
    public String getCname(){
        return cname;
    }
    void setSize(double size){
        this.size=size;
    }
    double getSize(){
        return size;
    }
    public ArrayList<Country>getListofCountries(){
        return listofCountries;
    }
    public void setListofCountries(ArrayList<Country>listofCountries){
        this.listofCountries=listofCountries;
    }
}       // end of continent class
class Country{
    String conname;
    City capital;
    ArrayList<City>listofCity=new ArrayList<City>();
    double size;
    Country(String conname,String[] listofCities,double[] population,double size){
        this.conname=conname;
        for(int i=0;i<listofCities.length;i++){
            City temp=new City();
            temp.setCityname(listofCities[i]);
            temp.setPopulation(population[i]);
            listofCity.add(temp);
        }   //loop ends
        this.size= size;
        capital=new City();
    }   //constructor ends
static class City{
        String cityname;
        double population;
        void setCityname(String c){
            cityname=c;
        }
        public String toString(){
            return cityname + " " + population;
        }
        void setPopulation(double population){
            this.population=population;
        }
        String getCityname(){
            return cityname;
        }
        double getPopulation(){
            return population;
        }
}           /// city ends
    void displayCities(){
        for(int i=0;i<listofCity.size();i++){
            System.out.println("City : "+listofCity.get(i).getCityname()+"  with population : " +
                                    listofCity.get(i).getPopulation());
        }/// loop ends
    }////display ends
}////country ends

public class Worlddemo{
    public static void main(String[] args){
        String[] cities = {"ISLAMABAD","HYDERABAD","KARACHI"};
        double[] pop ={45000,120000,5490000};
        Country c = new Country("Pakistan",cities,pop,4567545);
        c.displayCities();

    }
}








