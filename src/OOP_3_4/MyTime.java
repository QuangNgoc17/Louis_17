package OOP_3_4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Giờ, phút hoặc giây không hợp lệ!");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Giờ không hợp lệ!");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Phút không hợp lệ!");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Giây không hợp lệ!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (second < 59) {
            second++;
        } else {
            second = 0;
            if (minute < 59) {
                minute++;
            } else {
                minute = 0;
                if (hour < 23) {
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute < 59) {
            minute++;
        } else {
            minute = 0;
            if (hour < 23) {
                hour++;
            } else {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour < 23) {
            hour++;
        } else {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second > 0) {
            second--;
        } else {
            second = 59;
            if (minute > 0) {
                minute--;
            } else {
                minute = 59;
                if (hour > 0) {
                    hour--;
                } else {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute > 0) {
            minute--;
        } else {
            minute = 59;
            if (hour > 0) {
                hour--;
            } else {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour > 0) {
            hour--;
        } else {
            hour = 23;
        }
        return this;
    }
}
