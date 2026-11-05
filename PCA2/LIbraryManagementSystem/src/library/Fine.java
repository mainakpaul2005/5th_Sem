package library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class Fine {
    public static final long DAILY_RATE = 5;

    private final long overdueDays;

    public Fine(LocalDate dueDate, LocalDate returnDate) {
        if (dueDate == null || returnDate == null) {
            throw new IllegalArgumentException("Due date and return date are required");
        }
        overdueDays = Math.max(0, ChronoUnit.DAYS.between(dueDate, returnDate));
    }

    public long getOverdueDays() {
        return overdueDays;
    }

    public long getAmount() {
        return overdueDays * DAILY_RATE;
    }
}
