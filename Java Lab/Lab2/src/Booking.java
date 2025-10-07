public class Booking {
    private String employeeId;
    private String date;
    private String time;
    private int duration;
    private MeetingRoom room;

    public Booking(String employeeId, String date, String time, int duration, MeetingRoom room) {
        this.employeeId = employeeId;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.room = room;
    }

    public String getDate() {
        return date;
    }

    public String getDetails() {
        return "Employee: " + employeeId + ", Room: " + room.getRoomId() + ", Time: " + time + ", Duration: " + duration;
    }
}
