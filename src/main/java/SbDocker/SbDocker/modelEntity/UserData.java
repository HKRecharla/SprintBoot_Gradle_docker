package SbDocker.SbDocker.modelEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {

    @JsonProperty(value = "name",required = false)
    private String name = null;


    @JsonProperty(value = "age",required = false)
    private Integer age = null;

    @JsonProperty(value = "place",required = false)
    private String place = null;

    @JsonProperty(value = "phone_number",required = false)
    private String phone_number = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
