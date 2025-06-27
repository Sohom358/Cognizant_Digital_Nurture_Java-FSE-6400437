BEGIN
   FOR loan IN (
      SELECT customer_id, due_date 
      FROM CUSTOMERS
      WHERE due_date <= SYSDATE + 30
   ) LOOP
      DBMS_OUTPUT.PUT_LINE('Reminder: Loan due for Customer ID ' || loan.customer_id || ' on ' || loan.due_date);
   END LOOP;
END;
