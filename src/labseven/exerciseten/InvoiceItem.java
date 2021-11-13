package labseven.exerciseten;

import java.io.Serializable;

public class InvoiceItem implements Serializable
{
    private String itemDescription;
    private int itemQuantity;
    private double itemsTotal;

    public InvoiceItem(String itemDescription, int itemQuantity, double itemsTotal)
    {
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.itemsTotal = itemsTotal;
    }// End of constructor

    public String getItemDescription()
    {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }

    public int getItemQuantity()
    {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity)
    {
        this.itemQuantity = itemQuantity;
    }

    public double getItemsTotal()
    {
        return itemsTotal;
    }

    public void setItemsTotal(double itemsTotal)
    {
        this.itemsTotal = itemsTotal;
    }

    @Override
    public String toString()
    {
        return "Invoice{" +
            "itemDescription='" + itemDescription + '\'' +
            ", itemQuantity=" + itemQuantity +
            ", itemsTotal=" + itemsTotal +
            '}';
    } // End of toString() method
} // End of InvoiceItem class
