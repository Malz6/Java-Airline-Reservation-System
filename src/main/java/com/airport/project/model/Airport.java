package com.airport.project.model;

public class Airport {
private String Flight_id;
private String Flight_name;
private String Src;
private String Dest;
private String Time;
private String Seat;
private String sql;

public String getFlight_id() {
return Flight_id;
}
public void setFlight_id(String FNO) {
Flight_id=FNO;
}
public String getFlight_name() {
return Flight_name;
}
public void setFlight_name(String Fname) {
Flight_name=Fname;
}
public String getSrc() {
return Src;
}
public void setSrc(String Source) {
Src=Source;
}
public String getDest() {
return Dest;
}
public void setDest(String Destination) {
Dest=Destination;
}
public String getTime() {
return Time;
}
public void setTime(String Tm) {
Time=Tm;
}
public String getSeat() {
return Seat;
}
public void setSeat(String SNO) {
Seat=SNO;
}

@Override
public String toString() {
return "airport_details [Flight_id:" + Flight_id + ", Flight_name:" + Flight_name + ", Source:" + Src + ", Destination:" + Dest + ",Time:" + Time + ",Total no of seats: " + Seat + " ]";
}
public String getSql() {
return sql;
}
public void setSql(String sql) {
this.sql = sql;
}
}