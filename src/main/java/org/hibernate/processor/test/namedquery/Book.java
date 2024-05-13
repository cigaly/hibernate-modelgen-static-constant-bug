package org.hibernate.processor.test.namedquery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    public static final int GOOD = 1;
    public static final int BAD = 2;
    public static final int UGLY = 3;

    @Id String isbn;
    String title;
    String text;
    int type = GOOD;
}
