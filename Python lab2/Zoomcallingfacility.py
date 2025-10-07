from datetime import date, time, datetime, timedelta
from typing import List, Dict


class MeetingRoom:
    def __init__(self, room_id: str, capacity: int, floor_location: str):
        self.room_id = room_id
        self.capacity = capacity
        self.floor_location = floor_location

    def display_info(self):
        return f"Room ID: {self.room_id}, Capacity: {self.capacity}, Floor: {self.floor_location}"


# Subclass for Zoom-enabled meeting rooms
class ZoomMeetingRoom(MeetingRoom):
    def __init__(self, room_id: str, capacity: int, floor_location: str, zoom_device_id: str, zoom_account_id: str):
        super().__init__(room_id, capacity, floor_location)
        self.zoom_device_id = zoom_device_id
        self.zoom_account_id = zoom_account_id

    def display_info(self):
        base_info = super().display_info()
        return f"{base_info}, Zoom Device ID: {self.zoom_device_id}, Zoom Account ID: {self.zoom_account_id}"


# Booking class to represent a reservation
class Booking:
    def __init__(self, employee_id: str, meeting_room: MeetingRoom, meeting_date: date, meeting_time: time, duration: int):
        self.employee_id = employee_id
        self.meeting_room = meeting_room
        self.meeting_date = meeting_date
        self.meeting_time = meeting_time
        self.duration = duration

    def display_booking(self):
        return (
            f"Booking for Room: {self.meeting_room.room_id} by Employee: {self.employee_id}\n"
            f"Date: {self.meeting_date}, Time: {self.meeting_time}, Duration: {self.duration} minutes"
        )

    def get_start_datetime(self) -> datetime:
        return datetime.combine(self.meeting_date, self.meeting_time)

    def get_end_datetime(self) -> datetime:
        return self.get_start_datetime() + timedelta(minutes=self.duration)


# Manager class to handle all bookings
class BookingManager:
    def __init__(self):
        self.bookings: Dict[date, List[Booking]] = {}

    def add_booking(self, booking: Booking) -> bool:
        if not self.is_room_available(
            booking.meeting_room.room_id,
            booking.meeting_date,
            booking.meeting_time,
            booking.duration
        ):
            print(f" Room {booking.meeting_room.room_id} is not available at {booking.meeting_time}")
            return False

        self.bookings.setdefault(booking.meeting_date, []).append(booking)
        print(f" Booking added for Room {booking.meeting_room.room_id} at {booking.meeting_time}")
        return True

    def get_bookings_by_date(self, target_date: date) -> List[Booking]:
        return self.bookings.get(target_date, [])

    def is_room_available(self, room_id: str, meeting_date: date, meeting_time: time, duration: int) -> bool:
        start = datetime.combine(meeting_date, meeting_time)
        end = start + timedelta(minutes=duration)

        for booking in self.bookings.get(meeting_date, []):
            if booking.meeting_room.room_id == room_id:
                # Check for time overlap
                if not (end <= booking.get_start_datetime() or start >= booking.get_end_datetime()):
                    return False
        return True



if __name__ == "__main__":
    # Create meeting rooms
    room1 = MeetingRoom("MR101", 10, "1st Floor")
    room2 = ZoomMeetingRoom("MR102", 8, "2nd Floor", "ZD123", "ZA456")

    # Create booking manager
    manager = BookingManager()

    # Book a room
    booking1 = Booking("EMP001", room1, date(2025, 10, 8), time(10, 0), 60)
    manager.add_booking(booking1)

    # Try to double-book same room (overlaps with previous booking)
    booking2 = Booking("EMP002", room1, date(2025, 10, 8), time(10, 30), 30)
    manager.add_booking(booking2)  # Should be rejected

    # Book another room that is available
    booking3 = Booking("EMP003", room2, date(2025, 10, 8), time(11, 0), 45)
    manager.add_booking(booking3)

    # Get and display all bookings on a specific date
    print("\n Bookings for 2025-10-08:")
    bookings = manager.get_bookings_by_date(date(2025, 10, 8))
    for b in bookings:
        print("-" * 40)
        print(b.display_booking())
