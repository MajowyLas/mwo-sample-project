package model;

//import java.sql.Date;

public class PitStop {

    int session_key;
    int meeting_key;
    String date;
    int driver_number;
    float pit_duration;
    int lap_number;

    public PitStop() {
    }

    public int getSession_key() {
        return session_key;
    }

    public void setSession_key(int session_key) {
        this.session_key = session_key;
    }

    public int getMeeting_key() {
        return meeting_key;
    }

    public void setMeeting_key(int meeting_key) {
        this.meeting_key = meeting_key;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDriver_number() {
        return driver_number;
    }

    public void setDriver_number(int driver_number) {
        this.driver_number = driver_number;
    }

    public float getPit_duration() {
        return pit_duration;
    }

    public void setPit_duration(float pit_duration) {
        this.pit_duration = pit_duration;
    }

    public int getLap_number() {
        return lap_number;
    }

    public void setLap_number(int lap_number) {
        this.lap_number = lap_number;
    }
}
