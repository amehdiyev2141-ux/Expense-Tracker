package com.example.expensetracker.controller;

import com.example.expensetracker.dto.CategorySummaryResponse;
import com.example.expensetracker.dto.ExpenseRequest;
import com.example.expensetracker.dto.ExpenseResponse;
import com.example.expensetracker.service.ExpenseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    // CREATE
    @PostMapping
    public ExpenseResponse createExpense(
            @Valid @RequestBody ExpenseRequest request) {

        return expenseService.createExpense(request);
    }

    // READ ALL
    @GetMapping
    public List<ExpenseResponse> getAllExpenses() {

        return expenseService.getAllExpenses();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ExpenseResponse getExpenseById(
            @PathVariable Long id) {

        return expenseService.getExpenseById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ExpenseResponse updateExpense(
            @PathVariable Long id,
            @RequestBody ExpenseRequest request) {

        return expenseService.updateExpense(id, request);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteExpense(
            @PathVariable Long id) {

        expenseService.deleteExpense(id);
    }

    @GetMapping("/summary")
    public BigDecimal getTotalamount() {
        return expenseService.getTotalAmount();
    }
    @GetMapping("/summary/category")
    public List<CategorySummaryResponse> getAmountByCategory() {
        return expenseService.getAmountByCategory();
    }
    }
