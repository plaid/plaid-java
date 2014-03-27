plaid-java
==========

Java bindings for the Plaid API (https://www.plaid.com/docs)

## Basic Usage

```java
        
        // Add Amex user, get 30 days of transactions
        
        PlaidUserClient plaidUserClient = PlaidClients.developmentUserClient("test_id", "test_secret")
        Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
        TransactionsResponse response = plaidUserClient.addUser(testCredentials, "amex", "test@test.com", null);

        List<Transaction> transactions = response.getTransactions();
        
        
        // Get all Categories
        
        PlaidPublicClient plaidPublicClient = PlaidClients.testPublicClient();
        CategoriesResponse categoriesResponse = plaidPublicClient.getAllCategories();
        
        List<Category> categories = categoriesResponse.getCategories();
```

