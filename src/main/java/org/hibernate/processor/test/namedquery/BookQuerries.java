package org.hibernate.processor.test.namedquery;

import org.hibernate.annotations.processing.CheckHQL;

import jakarta.persistence.NamedQuery;

@NamedQuery(name = "#findGoodBooks",
		query = "from Book where type = org.hibernate.processor.test.namedquery.Book.GOOD")
@CheckHQL
public interface BookQuerries {
}
