# Hibernate 6 @CheckHQL not recognizing valid static constant in named query

When entity class is annotated with @CheckHQL annotation processor is reporting errors when named query is 
referencing valid static constant.

To reproduce the problem just execute `./gradlew clean build` on UNIX/Linux or `gradlew.bat clean build` on Windows. 

Expected result should be compilation without errors. Two classes should be generated:
`org.hibernate.processor.test.namedquery.Book_`
and
`org.hibernate.processor.test.namedquery.BookQuerries`
with later including field `String QUERY_FIND_GOOD_BOOKS` and method `List<CookBook> findGoodBooks(EntityManager entityManager) `.

However, current implementation is failing with error message:

```
BookQuerries.java:8: error: Could not interpret path expression 'org.hibernate.processor.test.namedquery.Book.GOOD'
                query = "from Book where type = org.hibernate.processor.test.namedquery.Book.GOOD")
                        ^
1 error

```
