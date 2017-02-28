package db;

import org.litepal.crud.DataSupport;

/**
 * Created by SEELE on 2017/2/28.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
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

    public void setId(int id) {
        this.id = id;
    }

    private int cityCode;
}
