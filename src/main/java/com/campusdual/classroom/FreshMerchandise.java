package com.campusdual.classroom;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private Date expirationDate = new Date();

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity,Date expirationDate){
        super(name,uniqueId,responsibleId,zone,area,shelf,quantity);
        this.setExpirationDate(expirationDate);
    }

    //GETTERS

    public Date getExpirationDate(){
        return this.expirationDate;
    }

    public String getFormattedDate(Date expirationDate){
        return this.sdf.format(expirationDate);
    }

    //SETTERS

    public void setExpirationDate(Date expirationDate){
        this.expirationDate = expirationDate;
    }

    //MÉTODOS EXTRA

    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n-----------DATOS DE LA MERCANCÍA------------");
        builder.append("\nLocalizacion: " + this.getLocation());
        builder.append("\nCaducidad: " + this.getFormattedDate(this.getExpirationDate()));
        builder.append("\n--------------------------------------------");
        return builder.toString();
    }
}
