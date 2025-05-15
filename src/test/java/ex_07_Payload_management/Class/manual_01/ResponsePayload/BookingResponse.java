package ex_07_Payload_management.Class.manual_01.ResponsePayload;

import ex_07_Payload_management.Class.manual_01.RequestPayload.Booking;

public class BookingResponse {

    private Integer bookingid;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    private Booking booking;
}
