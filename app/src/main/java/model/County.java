package model;

/**
 * Created by xiaozhang on 2016/10/5.
 */
public class County {
    private int id;
    private String CountyName;
    private String CountyCode;
    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        this.CountyName = countyName;
    }

    public String getCountyCode() {
        return CountyCode;
    }

    public void setCountyCode(String countyCode) {
        this.CountyCode = countyCode;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        this.CityId = cityId;
    }
}
