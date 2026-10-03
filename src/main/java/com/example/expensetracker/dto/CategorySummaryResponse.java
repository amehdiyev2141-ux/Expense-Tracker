package com.example.expensetracker.dto;

import com.example.expensetracker.entity.Category;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CategorySummaryResponse {

    private Category category;
    private BigDecimal amount;

    public CategorySummaryResponse(Category category, BigDecimal amount) {
        this.category = category;
        this.amount = amount;
    }
}