package myteam.com.model;

public class Detail {
    private int IdDetails_Image;
    private String nameDetails;
    private String Time_Details;
    private int BackgroundDetails;
    private String MoTa;

    public Detail(int idDetails_Image, String nameDetails, String time_Details, int backgroundDetails,String mota) {
        IdDetails_Image = idDetails_Image;
        this.nameDetails = nameDetails;
        Time_Details = time_Details;
        BackgroundDetails = backgroundDetails;
        MoTa = mota;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getIdDetails_Image() {
        return IdDetails_Image;
    }

    public void setIdDetails_Image(int idDetails_Image) {
        IdDetails_Image = idDetails_Image;
    }

    public String getNameDetails() {
        return nameDetails;
    }

    public void setNameDetails(String nameDetails) {
        this.nameDetails = nameDetails;
    }

    public String getTime_Details() {
        return Time_Details;
    }

    public void setTime_Details(String time_Details) {
        Time_Details = time_Details;
    }


    public int getBackgroundDetails() {
        return BackgroundDetails;
    }

    public void setBackgroundDetails(int backgroundDetails) {
        BackgroundDetails = backgroundDetails;
    }
}
