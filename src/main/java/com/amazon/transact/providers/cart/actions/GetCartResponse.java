package com.amazon.transact.providers.cart.actions;

import com.amazon.transact.providers.cart.structures.CartItem;
import com.amazon.transact.providers.cart.structures.CartState;

import java.util.List;

public class GetCartResponse {
    private String cartId;
    private List<CartItem> items;
    private String createdOn;
    private String modifiedOn;
    private int totalItems;
    private int totalUniqueItems;
    private CartState state;
    private String merchantId;
    private String accountId;
    private String userId;
    private float totalAmount;
    private float subTotal;
    private float discount;
    private String currency;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getTotalUniqueItems() {
        return totalUniqueItems;
    }

    public void setTotalUniqueItems(int totalUniqueItems) {
        this.totalUniqueItems = totalUniqueItems;
    }

    public CartState getState() {
        return state;
    }

    public void setState(CartState state) {
        this.state = state;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

