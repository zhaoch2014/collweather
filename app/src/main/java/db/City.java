package db;

import org.litepal.crud.DataSupport;

/**
 * Created by SEELE on 2017/2/28.
 */

public class City extends DataSupport {


    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;



    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }



    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode() {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public void getCityCode(int id) {
    }



}
