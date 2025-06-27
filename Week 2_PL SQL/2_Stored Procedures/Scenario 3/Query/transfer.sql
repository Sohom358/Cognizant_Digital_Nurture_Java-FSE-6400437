CREATE OR REPLACE PROCEDURE TransferFunds(
   from_acc IN NUMBER,
   to_acc IN NUMBER,
   amt IN NUMBER
) IS
   from_bal NUMBER;
BEGIN
   SELECT balance INTO from_bal
   FROM accounts
   WHERE account_id = from_acc;

   IF from_bal >= amt THEN
      UPDATE accounts
      SET balance = balance - amt
      WHERE account_id = from_acc;

      UPDATE accounts
      SET balance = balance + amt
      WHERE account_id = to_acc;

      COMMIT;
   ELSE
      DBMS_OUTPUT.PUT_LINE('Insufficient balance...');
   END IF;
EXCEPTION
   WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('Error:' || SQLERRM);
END;
