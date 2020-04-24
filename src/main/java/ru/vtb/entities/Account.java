package ru.vtb.entities;

public class Account {
    private String design_url;
    private float transactions_total_amount;
    private float tariff_avg_month_balance;
    private float type;
    private String closing_date;
    private float partial_withdraw_available;
    private float refill_available;
    private float blocked_amount;
    private String scheme_id;
    private String pan;
    private String account_id;
    private String title_small;
    private String title;
    private float balance;
    private String currency;
    private boolean isSalary;


    public String getDesign_url() {
        return design_url;
    }

    public float getTransactions_total_amount() {
        return transactions_total_amount;
    }

    public float getTariff_avg_month_balance() {
        return tariff_avg_month_balance;
    }

    public float getType() {
        return type;
    }

    public String getClosing_date() {
        return closing_date;
    }

    public float getPartial_withdraw_available() {
        return partial_withdraw_available;
    }

    public float getRefill_available() {
        return refill_available;
    }

    public float getBlocked_amount() {
        return blocked_amount;
    }

    public String getScheme_id() {
        return scheme_id;
    }

    public String getPan() {
        return pan;
    }

    public String getAccount_id() {
        return account_id;
    }

    public String getTitle_small() {
        return title_small;
    }

    public String getTitle() {
        return title;
    }

    public float getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean getIsSalary() {
        return isSalary;
    }


    public void setDesign_url(String design_url) {
        this.design_url = design_url;
    }

    public void setTransactions_total_amount(float transactions_total_amount) {
        this.transactions_total_amount = transactions_total_amount;
    }

    public void setTariff_avg_month_balance(float tariff_avg_month_balance) {
        this.tariff_avg_month_balance = tariff_avg_month_balance;
    }

    public void setType(float type) {
        this.type = type;
    }

    public void setClosing_date(String closing_date) {
        this.closing_date = closing_date;
    }

    public void setPartial_withdraw_available(float partial_withdraw_available) {
        this.partial_withdraw_available = partial_withdraw_available;
    }

    public void setRefill_available(float refill_available) {
        this.refill_available = refill_available;
    }

    public void setBlocked_amount(float blocked_amount) {
        this.blocked_amount = blocked_amount;
    }

    public void setScheme_id(String scheme_id) {
        this.scheme_id = scheme_id;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public void setTitle_small(String title_small) {
        this.title_small = title_small;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setIsSalary(boolean isSalary) {
        this.isSalary = isSalary;
    }

    @Override
    public String toString() {
        return "Account{" +
                "design_url='" + design_url + '\'' +
                ", transactions_total_amount=" + transactions_total_amount +
                ", tariff_avg_month_balance=" + tariff_avg_month_balance +
                ", type=" + type +
                ", closing_date='" + closing_date + '\'' +
                ", partial_withdraw_available=" + partial_withdraw_available +
                ", refill_available=" + refill_available +
                ", blocked_amount=" + blocked_amount +
                ", scheme_id='" + scheme_id + '\'' +
                ", pan='" + pan + '\'' +
                ", account_id=" + account_id +
                ", title_small='" + title_small + '\'' +
                ", title='" + title + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", isSalary=" + isSalary +
                '}';
    }
}

