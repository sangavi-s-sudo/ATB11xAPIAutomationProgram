package ex_07_Payload_management.Class.Tools;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonAnyGetter;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonAnySetter;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;

public class Booking_Dates {

    @JsonProperty("checkin")
    private String checkin;
    @JsonProperty("checkout")
    private String checkout;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("checkin")
    public String getCheckin() {
        return checkin;
    }

    @JsonProperty("checkin")
    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    @JsonProperty("checkout")
    public String getCheckout() {
        return checkout;
    }

    @JsonProperty("checkout")
    public void setCheckout(String checkout) {
        this.checkout = checkout;
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