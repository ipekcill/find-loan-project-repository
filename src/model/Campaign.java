package model;

import enums.SectorType;

import java.time.LocalDate;

public class Campaign {
    private String title;
    private String content;
    private LocalDate dueDate;

    private SectorType sectorType;

    private CreditCard creditCard;

    public Campaign(String title, String content, LocalDate dueDate, SectorType sectorType) {
        this.title = title;
        this.content = content;
        this.dueDate = dueDate;

        this.sectorType = sectorType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public SectorType getSectorType() {
        return sectorType;
    }

    public void setSectorType(SectorType sectorType) {
        this.sectorType = sectorType;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }


}
