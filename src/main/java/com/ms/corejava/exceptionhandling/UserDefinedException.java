package com.ms.corejava.exceptionhandling;

import java.util.*;

class UserDefinedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter date and month:");
        int dd = scanner.nextInt();
        int mm = scanner.nextInt();
        scanner.close();
        try {
            if (dd < 1 || dd > 31)
                throw new InvalidDayException();
            if (mm < 1 || mm > 12)
                throw new InvalidMonthException("tata");
        } catch (InvalidDayException e) {
            System.out.println(e);
        } catch (InvalidMonthException e) {
            System.out.println(e.getMessage());
        }

    }
}

class InvalidDayException extends Exception {
    // using OverrideMethod
    @Override
    public String toString() {
        return ("Invalid Day");
    }
}

class InvalidMonthException extends Exception {
    // here we are using super parent exception method
    InvalidMonthException(String message) {
        super(message);
    }
}
