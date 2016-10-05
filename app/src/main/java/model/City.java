package model;

/**
 * Created by xiaozhang on 2016/10/5.
 */
public class City {
    private int id;
    private String CityName;
    private String CityCode;
    private int ProvinceId;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getCityName() {

        return CityName;
    }

    public void setCityName(String cityName) {

        this.CityName = cityName;
    }

    public String getCityCode() {

        return CityCode;
    }

    public void setCityCode(String cityCode)
    {
        this.CityCode = cityCode;
    }

    public int getProvinceId()
    {
        return ProvinceId;
    }

    public void setProvinceId(int provinceId) {
        this.ProvinceId = provinceId;
    }
}
