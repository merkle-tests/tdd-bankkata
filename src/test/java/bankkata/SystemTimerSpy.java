package bankkata;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;

public class SystemTimerSpy implements SystemTimer {

    private Queue<LocalDate> dates = new LinkedList<>();

    public SystemTimerSpy() {

        this.dates.offer(LocalDate.of(2015, 12, 24));
        this.dates.offer(LocalDate.of(2016, 8, 23));

    }

    public LocalDate getDate() {
        return dates.poll();
    }
}
