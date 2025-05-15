package ex_07_Payload_management.Class.Tools;
// There is a tool called https://www.jsonschema2pojo.org/ here we can generate the pojos
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonAnyGetter;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonAnySetter;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;

public class Booking {

    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("totalprice")
    private Integer totalprice;
    @JsonProperty("depositpaid")
    private Boolean depositpaid;
    @JsonProperty("Booking_Dates")
    private Booking_Dates Booking_Dates;
    @JsonProperty("additionalneeds")
    private String additionalneeds;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("totalprice")
    public Integer getTotalprice() {
        return totalprice;
    }

    @JsonProperty("totalprice")
    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    @JsonProperty("depositpaid")
    public Boolean getDepositpaid() {
        return depositpaid;
    }

    @JsonProperty("depositpaid")
    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    @JsonProperty("Booking_Dates")
    public Booking_Dates getBooking_Dates() {
        return Booking_Dates;
    }

    @JsonProperty("Booking_Dates")
    public void setBooking_Dates(Booking_Dates Booking_Dates) {
        this.Booking_Dates = Booking_Dates;
    }

    @JsonProperty("additionalneeds")
    public String getAdditionalneeds() {
        return additionalneeds;
    }

    @JsonProperty("additionalneeds")
    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
