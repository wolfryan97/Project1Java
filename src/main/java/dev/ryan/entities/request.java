package dev.ryan.entities;

public class request {
    int req_id;
    int emp_id;
    double req_amount;
    String req_desc;
    String req_date;
    boolean approved;
    String mgr_message;
    boolean reviewed;

    public request(int req_id, int emp_id, double req_amount, String req_desc, String req_date, boolean approved, String mgr_message, boolean reviewed) {
        this.req_id = req_id;
        this.emp_id = emp_id;
        this.req_amount = req_amount;
        this.req_desc = req_desc;
        this.req_date = req_date;
        this.approved = approved;
        this.mgr_message = mgr_message;
        this.reviewed = reviewed;
    }

    public int getReq_id() {
        return req_id;
    }

    public void setReq_id(int req_id) {
        this.req_id = req_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getReq_amount() {
        return req_amount;
    }

    public void setReq_amount(double req_amount) {
        this.req_amount = req_amount;
    }

    public String getReq_desc() {
        return req_desc;
    }

    public void setReq_desc(String req_desc) {
        this.req_desc = req_desc;
    }

    public String getReq_date() {
        return req_date;
    }

    public void setReq_date(String req_date) {
        this.req_date = req_date;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getMgr_message() {
        return mgr_message;
    }

    public void setMgr_message(String mgr_message) {
        this.mgr_message = mgr_message;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) {
        this.reviewed = reviewed;
    }

    @Override
    public String toString() {
        return "request{" +
                "req_id=" + req_id +
                ", emp_id=" + emp_id +
                ", req_amount=" + req_amount +
                ", req_desc='" + req_desc + '\'' +
                ", req_date='" + req_date + '\'' +
                ", approved=" + approved +
                ", mgr_message='" + mgr_message + '\'' +
                ", reviewed=" + reviewed +
                '}';
    }
}
