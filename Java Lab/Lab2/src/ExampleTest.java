public class ExampleTest {
    public static void main(String[] args) {
        MeetingRoom r1 = new MeetingRoom("MR101", 10, 1);
        ZoomMeetingRoom r2 = new ZoomMeetingRoom("MR102", 8, 2, "ZD123", "zoom@company.com");

        Booking b1 = new Booking("E001", "2025-09-26", "10:00", 2, r1);
        Booking b2 = new Booking("E002", "2025-09-26", "11:00", 1, r2);

        BookingManager manager = new BookingManager();
        manager.addBooking(b1);
        manager.addBooking(b2);

        manager.getBookingsByDate("2025-09-26");
    }
}
